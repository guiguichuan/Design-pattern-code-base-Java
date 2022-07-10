package singleton.register;

public class Client {

    public static void main(String[] args) {
        Singleton singletonA = Singleton.getInstance();
        Singleton singletonB = Singleton.getInstance();
        if (singletonA == singletonB) {
            System.out.println("singletonA 与 singletonB 是相同实例");
        } else {
            System.out.println("singletonA 与 singletonB 是不同实例");
        }
    }
}
