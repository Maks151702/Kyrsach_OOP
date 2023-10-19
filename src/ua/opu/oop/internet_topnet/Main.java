package ua.opu.oop.internet_topnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Program topnetProgram = new Program();
        Scanner scanner = new Scanner(System.in);

        int function;
        int exit;

        do {
            printMenu();
            function = scanner.nextInt();

            switch (function) {
                case 1:
                    topnetProgram.showCountClient();
                    break;
                case 2:
                    topnetProgram.showCountConnectData();
                    break;
                case 3:
                    topnetProgram.allStonksConnect();
                    break;
                case 4:
                    topnetProgram.countPackage();
                    break;
                case 5:
                    topnetProgram.maxCountClientHouse();
                    break;
                case 6:
                    topnetProgram.dayPlanMaxCountConnect();
                    break;
                case 7:
                    topnetProgram.Registration();
                    break;
                case 8:
                    topnetProgram.checkStreet();
                    break;
                default:
                    System.out.println("Немає такої функції");
                    break;
            }

            System.out.println("Для виходу введіть 1, для продовження натисніть іншу клавішу:");
            exit = scanner.nextInt();
        } while (exit != 1);

        System.out.println("Вихід із системи");
    }

    private static void printMenu() {
        System.out.println("Оберіть функцію:");
        System.out.println("1) Кількість клієнтів");
        System.out.println("2) Кількість підключень на певну дату");
        System.out.println("3) Загальна вартість підключень");
        System.out.println("4) Кількість підключень на окремі пакети");
        System.out.println("5) Найбільша кількість клієнтів в одному будинку");
        System.out.println("6) День, на який заплановано найбільше число підключень");
        System.out.println("7) Регістрація:");
        System.out.println("8) Перевірка вулиці:");
    }
}
