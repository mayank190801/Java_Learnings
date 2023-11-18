package jdbc;

import javax.xml.transform.Source;
import java.sql.*;

public class jdbc_01 {
    public static void main(String[] args) {

        //So basically we are here learning what is JDBC and how it works to get more sense of real world out there basically
        //So first we have to setup postgres on our setup
        //Few questions - can't we have the database online??? - like mongoDB and stuff
        //Also JDBC is basically a connector between your application and the DBMS

        //SEVEN steps for setting up
        //import packages, load drivers, register driver, create connection, create statement, execute statement and close

        try {
            String url = "jdbc:postgresql://localhost:5432/demo";
            String uname = "postgres";
            String pass = "0000";


            Class.forName("org.postgresql.Driver"); //optional line that you can skip it
            Connection con = DriverManager.getConnection(url, uname,pass);

            //looks pretty cool till now
            //We need to check now
            System.out.println("Connection Established");



        }catch(Exception e){
            System.out.println(e);

        }





    }

}
