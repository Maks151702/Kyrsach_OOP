package ua.opu.oop.internet_topnet;
/**
 * @author DarkCatty
 * @version 0.2.9
 */
public class ManagerConnect extends Member {
    public String providerName;


    /**
     * Метод що створює контракт
     */
    public void createContract(){};
    /**
     * Метод що видаляє контракт
     */
    public void deleteContract(){};
    /**
     * Метод вітворює дзвінок клієнта/менеджера
     */
    public void call(){};
    /**
     * Метод що підверджує складання контракту зі сторони провайдеру
     */
    public void singContract(){};
}
