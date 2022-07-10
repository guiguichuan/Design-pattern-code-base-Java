package factory.abstract_factory;

public class DellComputer implements IComputer {


    public DellComputer() {
        make();
    }

    @Override
    public void make() {
        System.out.println("生产了戴尔电脑");
    }
}
