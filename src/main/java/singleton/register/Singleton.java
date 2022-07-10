package singleton.register;


/**
 * 登记式单例模式
 * 线程安全
 * 这种方法可以达到双检锁一样的功效，但实现更简单
 * 这种方式可以适用于静态域的情况下。双检锁可以再实例域小阳台延迟初始化的时候用
 * 这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程
 * */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
