package ua.opu.oop.internet_topnet;

import java.util.Scanner;

/**
 * @author DarkCatty
 * @version 0.1.11
 */
public abstract class Member {
    public String fullName;
    public String sign;
    public int numberPhone;

    /**
     * Метод що підверджує складання контракту.
     */
    public void singContract() {
        Scanner signCheck = new Scanner(System.in);
        String signature;
        do {
            signature = signCheck.next();
            System.out.println("Поставив підпис");
        } while (signature != sign);
    }
}
