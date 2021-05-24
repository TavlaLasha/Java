package gau;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java2021";
        try {
            Connection con = DriverManager.getConnection(url, "root", "");
            String query = "select * from users";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("pn"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
