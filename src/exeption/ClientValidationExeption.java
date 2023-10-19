package exeption;

import ua.opu.oop.internet_topnet.Client;
import ua.opu.oop.internet_topnet.Program;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientValidationExeption extends RuntimeException{
    public ClientValidationExeption(String message){super("Клієнт виконує недоступну операцію : "+message); }


    public void UseClassClient(){
        Program program = new Program();
        System.out.println("Введіть номер тарифу який хочете вибрати");
        Scanner in = new Scanner(System.in);
        int idNumber = in.nextInt();
        try {
            if (idNumber < 0 || idNumber > program.AllTarif.length) {
            }
             throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }

    }

}
