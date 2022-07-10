package factory.method;

public class DellFactory implements IcomputerFactory{
    @Override
    public IComputer makeComputer() {
        return new DellComputer();
    }
}
