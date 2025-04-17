package practice0416.Adbanced.exam;

public class DatabaseExample {
    public static void main(String[] args) {
        Database db = Database.getInstance();

        db.connect();
        System.out.println("데이터베이스 : " +db.getConnection());
        db.close();

    }
}
