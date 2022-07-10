package singleton.lazybones_unsafe;

/**
 * 懒汉式 线程不安全单例模式实现
 * 多线程情况下不安全，因为没有加锁
 * 严格意义来说不算单例模式
 * */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
