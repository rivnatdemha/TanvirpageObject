package com.ta.pageobject.db;
import java.sql.*;


public class DBConnection {
    public static void main(String[] args)
    {
        Connection conn =null;
        String url = "jdbc:mysql://localhost:3306/";
        String driver ="com.mysql.jdbc.Driver";
        String dbName = "test";
        String username="root";
        String password = "root";

        //connect to DB
        //fire queries
        // disconnect
        try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,username,password);
            System.out.println(conn.isClosed());
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from employees");
            //st.executeUpdate() to run insert or update command
            while(rs.next())
            {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("place"));
                System.out.println(rs.getInt("age"));
            }
            System.out.println("================================================================================================");
            // to use conditional statement
            PreparedStatement pstm = conn.prepareStatement("select * from employees where place =? and age=?");
            pstm.setString(1,"jamaica");
            pstm.setInt(2,30);
            rs = pstm.executeQuery();
            //pstm.executeUpdate(); for delete or update
            while(rs.next())
            {
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("place"));
                System.out.println(rs.getInt("age"));
            }

            //store procudure
           // CallableStatement cstmt = conn.prepareCall("{call getTestData(?,?,?,?)}");
          //  cstmt.registerOutParameter(1, Types.DECIMAL);
          //  cstmt.setString(1,"jamaica");
          //  cstmt.executeUpdate();
          //  double d = cstmt.getDouble(1);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            try {
                if((conn!=null) && (!conn.isClosed()))
                {
                    conn.close();
                    System.out.println(conn.isClosed());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
