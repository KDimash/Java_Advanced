package Database;

import java.sql.*;

public class Students implements Read,Select {

    @Override
    public void read() {
        String SQL_SELECT="SELECT * FROM students";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1972");
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT)){
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                System.out.println("===================================");
                System.out.println("|| "+resultSet.getInt("stu_id")+ " || "+resultSet.getString("stu_name")+" || "+resultSet.getString("stu_phone")+" || ");
            }
            System.out.println("===================================");
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }


    @Override
    public void select(int id) {
        String SQL_SELECT="SELECT * FROM students WHERE stu_id= (?)";
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1972");
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT)){
            stmt.setInt(1,id);
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                System.out.println("===================================");
                System.out.println("|| "+resultSet.getInt("stu_id")+ " || "+resultSet.getString("stu_name")+" || "+resultSet.getString("stu_phone")+" || ");
            }
            System.out.println("===================================");
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
