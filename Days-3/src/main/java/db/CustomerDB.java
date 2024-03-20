package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDB {

    public CustomerDB(){
        String sqlCustomer = "create table if not exists customer\n" +
                "(\n" +
                "    cid      INTEGER auto_increment,\n" +
                "    name     varchar(255),\n" +
                "    email    varchar(255),\n" +
                "    password varchar(20),\n" +
                "    constraint customer_pk\n" +
                "        primary key (cid)\n" +
                ");";
        DB db = new DB();
        try {
            Statement st = db.connect().createStatement();
            st.execute(sqlCustomer);
        }catch (Exception ex) {
            System.err.println("Customer Table Create Error :" + ex);
        }finally {
            db.close();
        }
    }


    public int customerInsert(String name, String email, String password) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "insert into customer values(default, ?, ?, ?)";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, email);
            pre.setString(3, password);
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("customerInsert error:" + ex);
        }finally {
            db.close();
        }
        return status;
    }


    public List<Customer> allCustomer() {
        List<Customer> ls = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from customer";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Customer c = new Customer(cid, name, email, password);
                ls.add(c);
            }
        }catch (Exception ex) {
            System.err.println("allCustomer error: " + ex);
        }finally {
            db.close();
        }
        return ls;
    }


    public int deleteCustomer(int cid) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "delete from customer where cid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, cid);
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("deleteCustomer error: " + ex);
        }finally {
            db.close();
        }
        return status;
    }


}
