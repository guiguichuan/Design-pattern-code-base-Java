package factory.abstract_factory;

public class HuaweiFactory implements IFactory{
    @Override
    public IComputer makeComputer() {
        return new HuaweiComputer();
    }

    @Override
    public IPhone makePhone() {
        return new HuaweiPhone();
    }
}
