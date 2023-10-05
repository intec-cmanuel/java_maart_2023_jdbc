package be.intecbrussel.repository;

import be.intecbrussel.config.MySQLConfig;
import be.intecbrussel.model.UserDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDetailRepository {
    public void addUserDetail(UserDetail userDetail) {
        String query = "INSERT INTO userdetail (firstName, lastName, email, accountUsername)" +
                "VALUES (?, ?, ?, ?)";

        try (Connection connection = MySQLConfig.getConnection()) {

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, userDetail.getFirstName());
            statement.setString(2, userDetail.getLastName());
            statement.setString(3, userDetail.getEmail());
            statement.setString(4, userDetail.getAccount().getUsername());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
