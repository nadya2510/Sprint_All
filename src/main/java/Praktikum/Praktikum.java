package Praktikum;

public class Praktikum {

    public static void main(String[] args) {
        String name = " ТимотиШаламе";

        Account account = new Account(name);
        if (account.checkNameToEmboss()) {
            System.out.println("На банковской карте можно напечатать данные владельца");
        } else {
            System.out.println("На банковской карте нельзя напечатать данные владельца");
        }
    }

}