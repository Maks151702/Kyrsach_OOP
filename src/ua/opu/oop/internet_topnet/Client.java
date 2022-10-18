package ua.opu.oop.internet_topnet;
/**
 * @author DarkCatty
 * @version 0.2.11
 */
import  java.util.Scanner;
public class Client extends Member {
    public String address;
    /**
     * Метод який создає заявку на підключення
     */
    public void OpenTicket(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a name: ");
        System.out.print("Input a phone: ");
        System.out.print("Input a address: ");
    }

    /**
     * Метод вітворює дзвінок клієнта/менеджера
     */
    public void call(){};

    /**
     * Метод що підверджує складання контракту зі сторони клієнта
     */
    public void singContract(){};
}
