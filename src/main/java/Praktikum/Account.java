package Praktikum;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean checkOut = false;
        int kolSp = 0;
        System.out.println(name.substring(0, 1));
        System.out.println(name.substring(name.length()-1, name.length()));
        if (name.startsWith(" ")) {
           kolSp = 0;
        } if  (name.endsWith(" ")) {
           kolSp = 0;
        } else {
           kolSp = name.length() - name.replaceAll(" ", "").length();
        }
        System.out.println(kolSp);
        checkOut = ((name.length() > 2) && (name.length() < 20) && (kolSp == 1) );

        return checkOut;

        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */

    }

}