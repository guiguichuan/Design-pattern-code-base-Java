package factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        IFactory huaweiFactory = new HuaweiFactory();
        IFactory dellFactory = new DellFactory();
        huaweiFactory.makeComputer();
        huaweiFactory.makePhone();
        dellFactory.makeComputer();
        dellFactory.makePhone();
    }
}
