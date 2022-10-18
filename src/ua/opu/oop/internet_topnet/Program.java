package ua.opu.oop.internet_topnet;

import java.util.Scanner;

/**
 * @author DarkCatty
 * @version 0.0.7
 */
public class Program {
    public String programName="TopNet";
    public  int  countClient = 1702;
    public  int[] stonks = new int[10];

    int allProfit = 0;
    private void contractList(){};
    public void showCountClient(){
        Scanner scanCount = new Scanner(System.in);
        System.out.println("Кількість клієнтів: " + countClient);
    }
    public void showCountConnectData(){

    }

    public void allStonksConnect(){
        for(int i=1;i<=stonks.length;i++){
            allProfit =+ stonks[i];
        }
        System.out.println("Загальна вартість підключень: " + allProfit);
    }

    public void countPackage(){
        int[] tariffs= new int[10];
        int manyTarif=tariffs.length;
       // return manyTarif;
    }

    public void maxCountClientHouse(){};

    public void dayPlanMaxCountConnect(){};
}
