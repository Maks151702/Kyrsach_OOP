package ua.opu.oop.internet_topnet;
/**
 * @author DarkCatty
 * @version 0.2.11
 */
import java.util.ArrayList;
import  java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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



    public Client(){};
    ArrayList<Client> clientList = new ArrayList<>();


    /**
     * Метод який создає заявку на підключення
     */
    public void OpenTicket(){
        try {
            BufferedReader br = null;
            File file = new File("newFile.txt");
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a name: ");
        fullName = scan.next();
        System.out.println("Input a address: ");
        address = scan.next();
        System.out.println("Input a phone: ");
        numberPhone = scan.nextInt();
        System.out.println("Input a data: ");
        data = scan.next();
        System.out.println("Input a tarif: ");
        tarif=scan.next();
        System.out.println("Input a Id: ");
        id=scan.nextInt();
        pw.println("Name: "+ fullName);
        pw.println("Address: "+ address);
        pw.println("Number phone: "+ numberPhone);
        pw.println("data: "+ data);
        pw.println("Tarif: "+ tarif);
        pw.println("ID: "+ id);
        Client NewClient = (new Client(fullName,address,numberPhone,data,tarif,id));
        clientList.add(NewClient);
        pw.close();
        br = new BufferedReader(new FileReader("newFile.txt"));
        String line;
        while ((line= br.readLine()) != null){
            System.out.println(line);
            }
        }catch (IOException e){
            System.err.println("Error: "+e);
        }
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
