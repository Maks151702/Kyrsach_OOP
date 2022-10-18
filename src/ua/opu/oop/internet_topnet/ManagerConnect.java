package ua.opu.oop.internet_topnet;
import java.util.Scanner;
/**
 * @author DarkCatty
 * @version 0.2.9
 */
public class ManagerConnect extends Member {
    public String providerName;
    public  String signature;
    protected  String signatureM = "allStar";

    /**
     * Метод що створює контракт
     */
    public void createContract(){};
    /**
     * Метод що видаляє контракт
     */
    public void deleteContract(){};
    /**
     * Метод вітворює дзвінок клієнта/менеджера
     */
    public void call(){};
    /**
     * Метод що підверджує складання контракту зі сторони провайдеру
     */
    public void singContract(){
        Scanner sign = new Scanner(System.in);
        do{
            String signature =  sign.next();
            System.out.println("Поставив підпис");
        }while (signatureM==signature);
    }

    public void checkAddress(){
    }
}
