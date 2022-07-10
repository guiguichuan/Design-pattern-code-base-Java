package singleton.ordinary;

public class Client {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("singleton1 与 singleton2 是相同的实例");
        } else {
            System.out.println("singleton1 与 singleton2 是不同的实例");
        }
    }
}
