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

    int allProfit = 0;

    private void contractList(){};

    /** Загальна кількість кліентів
     * @return заглаьна кількість кількість клієнтів
     */
    public void showCountClient(){
        Scanner scanCount = new Scanner(System.in);
        System.out.println("Кількість клієнтів: " + countClient);
    }
    public void showCountConnectData(){

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
        System.out.println("Загальна вартість пакетів: " + tariffs.length);
    }

    /** Найбільша кількість клієнтів в одному будинку
     */
    public void maxCountClientHouse(){};

    /** День, на який заплановано найбільше число підключень
     */
    public void dayPlanMaxCountConnect(){

    }
}
