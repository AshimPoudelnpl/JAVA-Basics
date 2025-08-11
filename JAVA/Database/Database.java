package Database;

import java.sql.*;
public class Database {

    public static void main(String[] args) {
        try {
            //1.Register the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //2.open JDBC connection
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Ashim12345#");
            System.out.println("Connection Created");

            //DDl Query
            Statement stmt=conn.createStatement();
            String sql="";

            //1.Create Table
            // sql="CREATE TABLE students1 (Id INTEGER PRIMARY KEY,name VARCHAR(255) NOT NULL,roll int)";
            // //stmt.executeUpdate();
            // //stmt.executeQuery();
            // stmt.execute(sql);
            // System.out.println("Table Created!");

           // 2.Insert Data
            sql="INSERT INTO students1 VALUES(2,'Shirish',18)";
            stmt.executeUpdate(sql);
            System.out.println("Insertion SuccessFull");
              
            //3.Read Data
            sql="SELECT* FROM students1";
            ResultSet rs=stmt.executeQuery(sql);
            while (rs.next()) {
                int id=rs.getInt("id");
                String name=rs.getString("name");
                System.out.println(id+":"+name);
                
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
