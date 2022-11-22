package ua.opu.oop.internet_topnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws  Exception{
        int function;
        do {
            Program vlad = new Program();
            Program clone = vlad.clone();
            Scanner scan = new Scanner(System.in);
            System.out.println("Оберіть функцію:");
            System.out.println("1)Кількість клієнтів");
            System.out.println("2)Кількість підключень на певну дату");
            System.out.println("3)Загальна вартість підключень");
            System.out.println("4)Кількість підключень на окремі пакети");
            System.out.println("5)Найбільша кількість клієнтів в одному будинку");
            System.out.println("6)День, на який заплановано найбільше число підключень");
            System.out.println("Введіть 69 якщо бажаєте вийти");
            function = scan.nextInt();

            if (function == 1) {
                vlad.showCountClient();
            }

            else if (function == 2) {
                vlad.showCountConnectData();
            }

            else if (1 + 2 == function) {
                vlad.allStonksConnect();
            }

            else if (function == 4) {
                vlad.countPackage();
            }

            else if (function == 5) {
                vlad.maxCountClientHouse();
            }
            else if (function == 6) {
                vlad.dayPlanMaxCountConnect();
            }

            else if (function == 7) {
                vlad.HasCodeBro();
            }

            else if (function == 8) {
                vlad.clone();
            }

            else if (function<=0 || function > 9 && function <69  || function>69) {
                System.out.println("Не має такої функції");
            }
        }
            while (function != 69) ;
        System.out.println("Вихід із системи");
    }
}