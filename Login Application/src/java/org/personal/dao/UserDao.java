package org.personal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.personal.bean.User;
import org.personal.connectionFactory.ConnectionFactory;

public class UserDao {

    private static Connection connection;
    private static PreparedStatement preparedStatement;

    public static User login(User user) {

        try {
            String username = user.getUsername();
            String password = user.getPassword();
            final String QUERY = "select * from user where username='" + username + "' AND password='" + password + "'";
            connection = ConnectionFactory.getConnection();
            preparedStatement = connection.prepareStatement(QUERY);
            ResultSet rs = preparedStatement.executeQuery();
            boolean existingUser = rs.next();

            // if the user does not exist
            if (!existingUser) {
                System.out.println("The user does not exist");
                user.setValid(false);
            } // if the user exists
            else if (existingUser) {
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                System.out.println("Welcome" + firstName + " " + lastName);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setValid(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

}
