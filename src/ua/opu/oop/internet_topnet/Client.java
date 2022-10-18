package ua.opu.oop.internet_topnet;
/**
 * @author DarkCatty
 * @version 0.2.11
 */
import  java.util.Scanner;
public class Client extends Member {
    public String address;
    public  String signature;
    protected  String signatureС = "";
    /**
     * Метод який создає заявку на підключення
     */
    public void OpenTicket(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a name: ");
        System.out.println("Input a phone: ");
        System.out.println("Input a address: ");
        String name = scan.next();
        String phone = scan.next();
        address = scan.next();
    }

    /**
     * Метод вітворює дзвінок клієнта/менеджера
     */
    public void call(){};

    /**
     * Метод що підверджує складання контракту зі сторони клієнта
     */
    public void singContract(){
        Scanner sign = new Scanner(System.in);
        do{
            String signature =  sign.next();
            System.out.println("Поставив підпис");
        }while (signatureС==signature);
    }
    public void choseTarif(){
        String nameTarif ="sd";
        int speedInet;
        int[] tariffs= new int[10];
        for(int i=1;i<tariffs.length;i++){
            switch (i){
                case(1):
                    speedInet=100;
                    nameTarif = "Стандарт";
                    break;
                case(2):
                    speedInet=200;
                    nameTarif = "Сімейний";
                    break;
                case(3):
                    speedInet=300;
                    nameTarif = "Gaming";
                    break;
            }
        }
        //return nameTarif;
    }
}
