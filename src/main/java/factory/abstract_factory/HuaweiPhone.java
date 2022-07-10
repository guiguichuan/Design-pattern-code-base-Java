package factory.abstract_factory;

public class HuaweiPhone implements IPhone{

    public HuaweiPhone() {
        make();
    }

    @Override
    public void make() {
        System.out.println("生产了华为手机");
    }
}
