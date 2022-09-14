package db.WLT;

import java.sql.*;
import java.util.Scanner;


public class DataBase {
    public static class dataBase {
        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "admin";

        protected String dlid = null;
        protected String pswrd = null;
        protected String name = null;
        protected String surname = null;
        //protected boolean existingUser;


    }


    public static void driverReg(Connection conn, String dlid, String pswrd, String name, String surname) throws SQLException {
        String sql = "INSERT INTO drivers(dlid,password,name,surname) VALUES (?,?,?,?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, Integer.parseInt(dlid));
        statement.setString(2, pswrd);
        statement.setString(3, name);
        statement.setString(4, surname);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Congratulations! You have been registered");
            System.out.println("Welcome onboard! Wish you plenty trips and come back to check your trips information!");
        } else {
            System.out.println("Something was wrong");
        }
    }

    /*public class void User(){
        User = dlid;
        existingUser = dlid;
        User existingUser = new user();
    }*/
    public static void userLogIn() {
        String dlid = null;
        String pswrd = null;
        //String userExistingIngDB;


        Scanner scanner = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java31", "root", "admin")) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM drivers");
            System.out.println("Connected!");
            do {
                System.out.println("Enter driver`s license number");
                String newdlid = scanner.nextLine().trim();
                //existingUser.setnewdlid(dlid);
                System.out.println("Enter password");
                String newpswrd = scanner.nextLine();
            } while (checkdlidAndPswrd(conn,dlid,pswrd)!=1);

        } catch (SQLException e) {
            System.out.println("No connection" + e);
        }


    }
    public static int checkdlidAndPswrd(Connection conn, String dlid, String pswrd) throws SQLException {

        String sql = "SELECT COUNT (*) FROM drivers WHERE dlid = ? AND pswrd = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.valueOf(dlid));
        preparedStatement.setString(2, pswrd);
        ResultSet resultSet = preparedStatement.executeQuery();
        int count = 0;
        if (resultSet.next()) {
            count = resultSet.getInt(1);
            if (count == 1) {
                System.out.println(dlid + ", driver`s license number existing!");
            } else if (count != 1) {
                System.out.println("Login or password were entered incorrectly. Please try again");
            }
        }
        return count; //return boolean
    }


}
