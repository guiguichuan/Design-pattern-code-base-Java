package template;

public class Client {
    public static void main(String[] args) {
        // 生成一个为100的IntegerDisplay实例
        AbstractDisplay display1 = new IntegerDisplay(100);
        // 生成一个为“hello”的StringDisplay实例
        AbstractDisplay display2 = new StringDisplay("hello");
        display1.display();
        display2.display();
    }
}
