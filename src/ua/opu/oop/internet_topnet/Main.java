package ua.opu.oop.internet_topnet;

import java.util.Scanner;

public class Main {
    public static  void  Main(String[] args){
        Program program = new Program();
        Scanner scan = new Scanner(System.in);
        System.out.print("Оберіть функцію: ");
        System.out.print("1)Кількість клієнтів");
        System.out.print("2)Кількість підключень на певну дату");
        System.out.print("3)Загальна вартість підключень");
        System.out.print("4)Кількість різних пакетів");
        System.out.print("5)Найбільша кількість клієнтів в одному будинку");
        System.out.print("6)День, на який заплановано найбільше число підключень");
    }
}
