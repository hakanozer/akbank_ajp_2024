package db;

import java.util.List;

public class MainDB {
    public static void main(String[] args) {

        CustomerDB customerDB = new CustomerDB();
        //int insertStatus = customerDB.customerInsert("Ayşe", "ayse@mail.com", "12345");
        //System.out.println(insertStatus);

        int deleteStatus = customerDB.deleteCustomer(3);
        System.out.println("deleteStatus : " + deleteStatus);

        List<Customer> list = customerDB.allCustomer();
        for (Customer item : list) {
            System.out.println(item.getName() + " - " + item.getEmail() );
        }

    }
}
