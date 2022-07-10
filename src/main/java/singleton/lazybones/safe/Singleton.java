package singleton.lazybones.safe;


/**
 * 懒汉式线程安全
 * 第一次调用才初始化，避免内存浪费
 * 使用了sychronized加锁 影响效率
 * */
public class Singleton {

    private static Singleton instance;

    private Singleton() {};

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
