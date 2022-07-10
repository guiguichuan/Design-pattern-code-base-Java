package factory.easy;

public class ComputerFactory {

    public IComputer makeComputer(String computerType) {
        if ("Dell".equals(computerType)) {
            return new DellComputer();
        } else if ("Huawei".equals(computerType)) {
            return new HuaweiComputer();
        }
        return null;
    }
}
