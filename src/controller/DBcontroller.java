package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Users;

public class DBcontroller {

    private static DBhandler db = new DBhandler();

    public static Users getEmailUsers(String email) {
        Users user = new Users();

        try {
            db.connect();
            String query1 = "SELECT * FROM users WHERE Email ='" + email + "'";
            Statement stmt1 = db.con.createStatement();
            ResultSet rs1 = stmt1.executeQuery(query1);

            if (rs1.next()) {
                do {
                    user.getPassword();
                } while (rs1.next());

            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        db.disconnect();
        return user;
    }
}