package ua.opu.oop.internet_topnet;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * @author DarkCatty
 * @version 0.0.7
 */
public class Program implements InterfaceObject {
    /**
     * @param countClient кількість клієнтів
     */
    public String programName="TopNet";
    public  int[] stonks = new int[]{120,350,124,360,340};
    public String AllTarif[] = new String[]{"Econom","Standart","Gaming"};
    ArrayList<String> address = new ArrayList<>();


    Client client1 = new Client("Chubar M.","World",0663231723,"22.10","Standart",34);
    Client client2 = new Client("Camado T.","Mountain",0673244566,"22.10","Standart",23);
    Client client3 = new Client("Akaza M.","Train",0355452273,"24.06","Gaming",11);
    Client client4 = new Client("Namikaza M.","Konoxa",0546772273,"13.05","Econom",15);
    Client client5 = new Client("Uchiha I.","Konoxa",0226334233,"10.03","Gaming",1);
    int allProfit = 0;

    ManagerConnect manager1 = new ManagerConnect(10,8,5,7,2,14);

    private void contractList(){};

    /** Загальна кількість кліентів
     * @return заглаьна кількість кількість клієнтів
     */
    public void showCountClient(){
        String AllClient[] = new String[]{client1.fullName,client2.fullName,client3.fullName,client4.fullName,client5.fullName};
        System.out.println("Кількість клієнтів: " + AllClient.length);
    }
    public void showCountConnectData(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть дату(10.03): ");
        String data = in.nextLine();
        int zbig=0;
        String listOfData[] = new String[]{client1.data,client2.data, client3.data, client4.data, client5.data};
        String listOfAddressesClient[] = new String[]{client1.address, client2.address, client3.address, client4.address, client5.address};
        for (int i=0;i<listOfAddressesClient.length;i++){
            if(data.equals(listOfData[i])){
                zbig ++;
                System.out.println(zbig + ") Підлкючення на вулиці " + listOfAddressesClient[i]);
            }
        }System.out.println("Кількість клієнтів з обраною датою: "+zbig);
    }
    /** Загальна вартість підключень
     * @return заглаьна вартість підключень
     */
    public void allStonksConnect(){

        for(int i=0;i<stonks.length;i++){
            allProfit = allProfit + stonks[i];
        }
        System.out.println("Загальна вартість підключень: " + allProfit);
    }

    /** Кількість підключень на окремі пакети
     */
    public void countPackage(){
        int connect = 0;
        System.out.println("Загальна кількість пакетів: " + AllTarif.length);
        System.out.println("Кількість підключень на окремі пакети:");
        String AllClientTarif[] = new String[]{client1.tarif,client2.tarif,client3.tarif,client4.tarif,client5.tarif};
        for (int i = 0; i < AllTarif.length; i++) {
            for (String j : AllClientTarif) {
                if (AllTarif[i].equals(j)) {
                    connect++;
                }
            }
            System.out.println("Кількість підключень з пакетом "+AllTarif[i]+": "+ connect);
            connect = 0;
        }
    }

    /** Найбільша кількість клієнтів в одному будинку
     */
    public void maxCountClientHouse() {
        address.add(client1.address);
        address.add(client2.address);
        address.add(client3.address);
        address.add(client4.address);
        address.add(client5.address);
        String listOfAddresses[] = new String[]{"Konoxa", "Train", "Mountain", "World"};
        int people = 0;
        int max = 0;
        for (int i = 0; i < listOfAddresses.length; i++) {
            for (String j : address) {
                if (listOfAddresses[i].equals(j)) {
                    people++;
                }
            }
                if (max <= people) {
                max = people;
            }
            people = 0;
        }System.out.println("Найбільша кількість клієнтів в одному будинку: " + max);
    }
    /** День, на який заплановано найбільше число підключень
     */
    public void dayPlanMaxCountConnect() {
        int niceDay = 0;
        int Schedule[] = new int[]{manager1.monday, manager1.tuesday, manager1.wednesday, manager1.thursday, manager1.friday, manager1.sunday};
        for (int i = 0; i < Schedule.length; i++) {
            if (Schedule[i] > niceDay) {
                niceDay = Schedule[i];
            }
        }
        System.out.println("День, на який заплановано найбільше число підключень: " + niceDay);
    }

    public void Registration(){
        Client bro = new Client();
        bro.OpenTicket();
    }

    public  void  checkStreet(){
        ListAddress list_address = new ListAddress();
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть назву вулиці: ");
        String client_address=in.next();
        list_address.street(client_address);


    }
    @Override
    public void ObjectInterface() {
        String name;
        System.out.println("Введіть Призвище та Им'я клієнта у форматі(Ivanov D.):");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        if(name.equals(client1.fullName)){
            System.out.println("Знайден клієнт по вашему запиту:");
            System.out.println("Призвище та ім'я: "+client1.fullName);
            System.out.println("Адреса: "+client1.address);
            System.out.println("Номер телефону: "+client1.numberPhone);
            System.out.println("Дата підключення"+client1.data);
            System.out.println("Призвище та ім'я: "+client1.tarif);
            System.out.println("Id клієнта: "+client1.id);
        } else if(name.equals(client2.fullName)){
            System.out.println("Знайден клієнт по вашему запиту:");
            System.out.println("Призвище та ім'я: "+client2.fullName);
            System.out.println("Адреса: "+client2.address);
            System.out.println("Номер телефону: "+client2.numberPhone);
            System.out.println("Дата підключення"+client2.data);
            System.out.println("Призвище та ім'я: "+client2.tarif);
            System.out.println("Id клієнта: "+client2.id);
        } else if(name.equals(client3.fullName)){
            System.out.println("Знайден клієнт по вашему запиту:");
            System.out.println("Призвище та ім'я: "+client3.fullName);
            System.out.println("Адреса: "+client3.address);
            System.out.println("Номер телефону: "+client3.numberPhone);
            System.out.println("Дата підключення"+client3.data);
            System.out.println("Призвище та ім'я: "+client3.tarif);
            System.out.println("Id клієнта: "+client3.id);
        } else if(name.equals(client4.fullName)){
            System.out.println("Знайден клієнт по вашему запиту:");
            System.out.println("Призвище та ім'я: "+client4.fullName);
            System.out.println("Адреса: "+client4.address);
            System.out.println("Номер телефону: "+client4.numberPhone);
            System.out.println("Дата підключення"+client4.data);
            System.out.println("Призвище та ім'я: "+client4.tarif);
            System.out.println("Id клієнта: "+client4.id);
        } else if(name.equals(client5.fullName)){
            System.out.println("Знайден клієнт по вашему запиту:");
            System.out.println("Призвище та ім'я: "+client5.fullName);
            System.out.println("Адреса: "+client5.address);
            System.out.println("Номер телефону: "+client5.numberPhone);
            System.out.println("Дата підключення"+client5.data);
            System.out.println("Призвище та ім'я: "+client5.tarif);
            System.out.println("Id клієнта: "+client5.id);
        }
    }
}//Program
