package db;

public class MainDB {
    public static void main(String[] args) {

        DB db = new DB();

        db.connect();
        db.close();


    }
}
