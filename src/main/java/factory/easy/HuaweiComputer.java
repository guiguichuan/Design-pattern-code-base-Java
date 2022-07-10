package factory.easy;

public class HuaweiComputer implements IComputer{
    @Override
    public void make() {
        System.out.println("生产了华为电脑");
    }
}
