package db.WLT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import static db.WLT.DataBase.driverReg;
import static db.WLT.DataBase.userLogIn;

public class Main {


    public static void main(String[] args) {
        final String dbURL = "jdbc:mysql://localhost:3306/java31";
        final String username = "root";
        final String password = "admin";

        Scanner scanner = new Scanner(System.in);

        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            System.out.println("Welcome!");
            char again = 'y';
            while (again == 'y') {
                System.out.println("Are you our driver(y/n)?");
                char action = scanner.nextLine().charAt(0);
                if (action == 'y') {
                    userLogIn();
                    //method for login


                } else if (action == 'n') {
                    System.out.println("Do you want to start job at us?");
                    System.out.println("Choose 'r' or 'q'");
                    System.out.println("r - register new driver");
                    System.out.println("q - quite");
                    String result = scanner.nextLine();

                    if (result.equals("r")){
                        System.out.println("Enter driver`s license number");
                        int newdlid = Integer.parseInt(scanner.nextLine());

                        System.out.println("Enter password");
                        String newpswrd = scanner.nextLine();

                        System.out.println("Enter name");
                        String newName = scanner.nextLine();

                        System.out.println("Enter your surname");
                        String newSurname = scanner.nextLine();

                        driverReg(conn, String.valueOf(newdlid), newpswrd, newName, newSurname);

                    } else {
                        System.out.println("Good luck!");
                    }
                }

                System.out.println("Do you want to do something more y/n");
                again = scanner.nextLine().charAt(0);
            }

        } catch(Exception e){
            e.printStackTrace();
        }



    }

}
