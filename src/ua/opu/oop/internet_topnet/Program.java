package ua.opu.oop.internet_topnet;

import exeption.ClientValidationExeption;

import java.lang.ref.Cleaner;
import java.util.Scanner;
/**
 * @author DarkCatty
 * @version 0.0.7
 */
public class Program implements Cloneable {
    /**
     * @param countClient кількість клієнтів
     */
    public String programName="TopNet";
    public  int[] stonks = new int[]{120,350,124,360,340};
    public String AllTarif[] = new String[]{"Econom","Standart","Gaming"};
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
            allProfit =+ stonks[i];
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
        String listOfAddresses[] = new String[]{"Konoxa", "Train", "Mountain", "World"};
        int people = 0;
        int max = 0;
        String listOfAddressesClient[] = new String[]{client1.address, client2.address, client3.address, client4.address, client5.address};
        for (int i = 0; i < listOfAddresses.length; i++) {
            for (String j : listOfAddressesClient) {
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

    public void HasCodeBro(){
        Object a= new Object();
        System.out.println(a.hashCode());
    }
    @Override
    public Program clone() throws CloneNotSupportedException {
        return (Program) super.clone();
    }
     public int monthConnect;
     private Client Cli;
    public  void ErrorMan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Оберіть бажающий місяць для підключення від 1 до 12");
        monthConnect = scan.nextInt();
        int Month[]= new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        try {
            if(monthConnect<0 || monthConnect>Month.length){
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            ClientValidationExeption clientValidationExeption = new ClientValidationExeption(e.getMessage());
            System.err.println(clientValidationExeption.getMessage());
            System.err.println("Сталася помилка ArrayIndexOutOfBoundsException: "+e.getMessage());
            System.err.println("Коректні межі масиву: від 0 до "+e.getMessage());
            System.err.println("Некоректний індекс: "+monthConnect);
        }

        try {
            Cli.OpenTicket();
        }catch (NullPointerException e) {
            System.err.println("Відсутній объект "+Cli);
        }
    }
}//Program
