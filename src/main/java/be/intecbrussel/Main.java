package be.intecbrussel;

import be.intecbrussel.model.Account;
import be.intecbrussel.service.AccountService;

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
        AccountService accountService = new AccountService();
//        accountService.addAccount(username, password);
////        accountService.deleteAccount(username);
//        System.out.println(accountService.getAccount("lionel"));

        List<Account> accounts = accountService.getAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }


    }
}