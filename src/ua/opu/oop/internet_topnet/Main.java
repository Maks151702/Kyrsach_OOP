package ua.opu.oop.internet_topnet;

import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){
        int function;
        Program vlad = new Program();
        Scanner scan = new Scanner(System.in);
        System.out.println("Оберіть функцію:");
        System.out.println("1)Кількість клієнтів");
        System.out.println("2)Кількість підключень на певну дату");
        System.out.println("3)Загальна вартість підключень");
        System.out.println("4)Кількість різних пакетів");
        System.out.println("5)Найбільша кількість клієнтів в одному будинку");
        System.out.println("6)День, на який заплановано найбільше число підключень");
        function = scan.nextInt();

        if (function == 4) {
            System.out.println("Кількість різних пакетів: " + );
        }
        if (1 + 2 == function) {
            vlad.allStonksConnect();
        }

        if (function > 6) {
            System.out.println("Не має такої функції");
        }
        System.out.println(function);
        System.out.println("Повертаємося до головного меню");
    }
}
