package factory.method;

public class HuaweiComputer implements IComputer {

    public HuaweiComputer() {
        make();
    }

    @Override
    public void make() {
        System.out.println("生产了华为电脑");
    }
}
