package ua.opu.oop.internet_topnet;
import java.util.Scanner;
/**
 * @author DarkCatty
 * @version 0.2.9
 */
public class ManagerConnect extends Member {
    public int monday;
    public  int tuesday;
    public int  wednesday;
    public  int thursday;
    public  int friday;
    public int sunday;

    public ManagerConnect(int monday, int tuesday, int wednesday, int thursday,int friday,int sunday){
        this.monday=monday;
        this.tuesday=tuesday;
        this.wednesday=wednesday;
        this.thursday=thursday;
        this.friday=friday;
        this.sunday=sunday;
    }

    /**
     * @param programName це назва программи та провайдера
     */
    public String programName="TopNet";

    /**
     * Метод що створює контракт
     */
    public void createContract(){};
    /**
     * Метод що видаляє контракт
     */
    public void deleteContract(){};
    /**
     * Метод що підверджує складання контракту зі сторони провайдеру
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
