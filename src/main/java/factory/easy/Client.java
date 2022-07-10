package factory.easy;

public class Client {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        IComputer dell = computerFactory.makeComputer("Dell");
        IComputer huawei = computerFactory.makeComputer("Huawei");
        dell.make();
        huawei.make();
    }
}
