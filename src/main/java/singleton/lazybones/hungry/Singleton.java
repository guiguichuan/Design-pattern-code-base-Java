package singleton.lazybones.hungry;

/**
 * 饿汉式就和名字一样很饿
 * 迫不及待
 * 没有加锁，执行效率高，一般都会使用这种
 * 在类装载的时候就进行了实例化
 * 这个代码和之前的普通版 其实是一样的
 * */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
