package ua.opu.oop.internet_topnet;

public class ListAddress {
    /**
     * массив great_streat зберігає вулиці на яких можно підключитись на мережі
     */
    public String great_streat[]=new String[]{"World","Konoxa","Mountain","Train"};
    /**
     * Перевірка вулиці яку ввів клієнт на наможливість підключення до мережі
     */
    public boolean street(String client_address) {
        boolean result = false;

            for (int i = 0; i < great_streat.length; i++) {

                if (great_streat[i].equals(client_address)) {
                    result = true;
                    System.out.println("На вулиці "+client_address+" є можливість підключитись до мережі");
                    break;
                }
            }
           if(result==false){
               System.out.println("На вулиці "+client_address+" немає можливісті підключитись до мережі");
            }
        return  result;
    }
}