package ua.opu.oop.internet_topnet;
/**
 * @author DarkCatty
 * @version 0.2.11
 */
import  java.util.Scanner;
public class Client extends Member{
    /**
     * @param address клієнт живе за цією адресою
     */
    public String address;
    public  String data;
    public  String tarif;
    public int id;
    public Client(String fullname, String address, int numberPhone,String data,String tarif, int id){
        this.fullName=fullname;
        this.address=address;
        this.numberPhone=numberPhone;
        this.data=data;
        this.tarif=tarif;
        this.id=id;
    }

    public Client (Client other){
        this(other.fullName,other.address,other.numberPhone,other.data,other.tarif,other.id);
    }
    public Client(){};

    @Override
    public Client clone() throws CloneNotSupportedException {
        return (Client) super.clone();
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


}
