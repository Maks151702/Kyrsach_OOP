package ua.opu.oop.internet_topnet;
/**
 * @author DarkCatty
 * @version 0.2.11
 */
import  java.util.Scanner;
public class Client extends Member {
    /**
     * @param address клієнт живе за цією адресою
     */
    public String address;
    public  String data;
    public Client(String fullname, String address, int numberPhone,String data){
        this.fullName=fullname;
        this.address=address;
        this.numberPhone=numberPhone;
        this.data=data;
    }

    /**
     * Метод який создає заявку на підключення
     */
    public void OpenTicket(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a name: ");
        System.out.println("Input a phone: ");
        System.out.println("Input a address: ");
        fullName = scan.next();
        numberPhone = scan.nextInt();
        address = scan.next();
    }

    /**
     * Метод що підверджує підписання контракту зі сторони клієнта
     */
    public void singContract() {
        Scanner signCheck = new Scanner(System.in);
        String signature;
        do {
            signature = signCheck.next();
            System.out.println("Поставив підпис");
        } while (signature != sign);
    }

    /**
     *Метод що підверджує підписання контракту зі сторони клієнта
     * @return повертає обранний таріф у контракт.
     */
    public void chooseTarif(){
        Scanner tarifCheck = new Scanner(System.in);
        String nameTarif;
        int speedInet;
        int[] tariffs= new int[10];
        System.out.println("Оберіть 1 із 3 тарифів");
        int choise = tarifCheck.nextInt();
            switch (choise){
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
        //return nameTarif;
    }
}
