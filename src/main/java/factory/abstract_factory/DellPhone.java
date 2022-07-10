package factory.abstract_factory;

public class DellPhone implements IPhone{

    public DellPhone() {
        make();
    }

    @Override
    public void make() {
        System.out.println("生产了戴尔手机");
    }
}
