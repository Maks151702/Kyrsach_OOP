package ua.opu.oop.internet_topnet;

import java.util.Scanner;
/**
 * @author DarkCatty
 * @version 0.0.7
 */
public class Program {
    /**
     * @param countClient кількість клієнтів
     */
    public String programName="TopNet";
    public  int  countClient = 1702;
    public  int[] stonks = new int[]{120,350,124,360,340};

    Client client1 = new Client("Chubar M.","World",0663231723,"22.10");
    Client client2 = new Client("Camado T.","Mountain",0673244566,"22.10");
    Client client3 = new Client("Akaza M.","Train",0355452273,"24.06");
    Client client4 = new Client("Namikaza M.","Konoxa",0546772273,"13.05");
    Client client5 = new Client("Uchiha I.","Konoxa",0226334233,"10.03");
    int allProfit = 0;

    ManagerConnect manager1 = new ManagerConnect(10,8,5,7,2,14);

    private void contractList(){};

    /** Загальна кількість кліентів
     * @return заглаьна кількість кількість клієнтів
     */
    public void showCountClient(){
        Scanner scanCount = new Scanner(System.in);
        System.out.println("Кількість клієнтів: " + countClient);
    }
    public void showCountConnectData(){

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть дату(10.03): ");
        String address = in.nextLine();
        int zbig=0;
        String listOfData[] = new String[]{client1.data,client2.data, client3.data, client4.data, client5.data};
        for (String i : listOfData){
            if(address.equals(i)){
                zbig ++;
            }
        }System.out.println("кількість клієнтів з обраною адресою: "+zbig);
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

    /** Кількість різних пакетів
     */
    public void countPackage(){
        int[] tariffs= new int[10];
        int manyTarif=tariffs.length;
        System.out.println("Загальна кількість пакетів: " + tariffs.length);
    }

    /** Найбільша кількість клієнтів в одному будинку
     */
    public void maxCountClientHouse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть адресу: ");
        String address = in.nextLine();
        int zbig=0;
        String listOfAddresses[] = new String[]{client1.address,client2.address,client3.address,client4.address,client5.address};
        for (String i : listOfAddresses){
            if(address.equals(i)){
                zbig ++;
            }
        }System.out.println("кількість клієнтів з обраною адресою: "+zbig);
    }

    /** День, на який заплановано найбільше число підключень
     */
    public void dayPlanMaxCountConnect(){
        int niceDay=0;
        int Schedule[] = new int[]{manager1.monday,manager1.tuesday,manager1.wednesday,manager1.thursday,manager1.friday, manager1.sunday};
        for(int i=0;i<Schedule.length;i++){
            if(Schedule[i]>niceDay){
                niceDay=Schedule[i];
            }
        }System.out.println("День, на який заплановано найбільше число підключень: "+niceDay);

    }
}
