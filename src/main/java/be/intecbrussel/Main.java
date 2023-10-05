package be.intecbrussel;

import be.intecbrussel.model.Account;
import be.intecbrussel.service.AccountService;
import be.intecbrussel.service.UserDetailService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Username?");
//        String username = scanner.nextLine();
//        System.out.println("Password?");
//        String password = scanner.nextLine();
//
//        AccountService accountService = new AccountService();
//        accountService.addAccount(username, password);
//        accountService.deleteAccount(username);
//        System.out.println(accountService.getAccount("lionel"));

//        List<Account> accounts = accountService.getAccounts();
//        for (Account account : accounts) {
//            System.out.println(account);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Username?");
        String username = scanner.nextLine();
        System.out.println("Password?");
        String password = scanner.nextLine();

        System.out.println("first name?");
        String firstName = scanner.nextLine();
        System.out.println("last name?");
        String lastName = scanner.nextLine();
        System.out.println("email?");
        String email = scanner.nextLine();

        UserDetailService uds = new UserDetailService();
        uds.addUserDetail(username, password, firstName, lastName, email);

    }
}