package factory.easy;

public class DellComputer implements IComputer{
    @Override
    public void make() {
        System.out.println("生产了戴尔电脑");
    }
}
