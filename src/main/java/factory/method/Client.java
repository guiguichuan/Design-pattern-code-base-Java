package factory.method;

public class Client {
    public static void main(String[] args) {
        IcomputerFactory dellFactory = new DellFactory();
        IcomputerFactory huaweiFactory = new HuaweiFactory();
        dellFactory.makeComputer();
        huaweiFactory.makeComputer();
    }
}
