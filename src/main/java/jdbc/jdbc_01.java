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
            String sql = "select sname from student where sid = 1";

            Class.forName("org.postgresql.Driver"); //optional line that you can skip it
            Connection con = DriverManager.getConnection(url, uname,pass);
            System.out.println("Connection Established");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(rs.next());  //moves us to the next record - earlier it was at the header
            System.out.println(rs.getString(1));

            //so from here onwards I can try to add some stuff inside this bad boy
            String insertSql = "insert into student values(3, 'Bhavna', 101)";
            Statement st2 = con.createStatement();
            int result = st2.executeUpdate(insertSql);
            System.out.println(result);

            //executeUpdate basically - updates something inside the database
            con.close();
            System.out.println("Connection Closed");


            //now your task is to basically setup - CRUD operations on this little student table present in postgresSQL
            //this should be a task for your learning purposes
            //Was able to implement CRUD pretty easily - there are some steps and class and interfaces you have to learn in JDBC
            //These will automatically as you come across various projects, so ignore those for now brother -
            //Focus on microservices and learning springboot at its finest for now

        }catch(Exception e){
            System.out.println(e);

        }





    }

}
