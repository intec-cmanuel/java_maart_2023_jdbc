package be.intecbrussel.repository;

import be.intecbrussel.config.MySQLConfig;
import be.intecbrussel.model.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    public void addAccount(Account account) {
        String query = String.format("INSERT INTO account (username, password) VALUES ('%s', '%s')",
                account.getUsername(), account.getPassword());

        try (Connection connection = MySQLConfig.getConnection();) {

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Account getAccount(String username) {

        String query = "SELECT * FROM account WHERE username = '" + username + "'";

        try (Connection connection = MySQLConfig.getConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                String dbUsername = resultSet.getString("username");
                String password = resultSet.getString("password");
                Account account = new Account(dbUsername, password);
                return account;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Account> getAllAccounts() {
        String query = "SELECT * FROM account";

        List<Account> accounts = new ArrayList<>();

        try (Connection connection = MySQLConfig.getConnection()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String dbUsername = resultSet.getString("username");
                String password = resultSet.getString("password");
                Account account = new Account(dbUsername, password);
                accounts.add(account);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accounts;
    }

    public void deleteAccount(String username) {
        String query = "DELETE FROM account WHERE username = '" + username + "'";

        try (Connection connection = MySQLConfig.getConnection()) {

            Statement statement = connection.createStatement();
            System.out.println(query);

            statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

















