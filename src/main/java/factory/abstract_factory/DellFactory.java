package factory.abstract_factory;

public class DellFactory implements IFactory{
    @Override
    public IComputer makeComputer() {
        return new DellComputer();
    }

    @Override
    public IPhone makePhone() {
        return new DellPhone();
    }
}
