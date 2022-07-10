package factory.method;

public class HuaweiFactory implements IcomputerFactory{
    @Override
    public IComputer makeComputer() {
        return new HuaweiComputer();
    }
}
