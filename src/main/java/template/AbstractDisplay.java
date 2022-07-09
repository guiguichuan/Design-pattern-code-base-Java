package template;

// 抽象类
public abstract class AbstractDisplay {

    /**
     * 交给子类去实现的抽象方法 open()
     * */
    public abstract void open();

    /**
     * 交给子类去实现的抽象方法 print();
     * */
    public abstract void print();

    /**
     * 交给子类去实现的抽象方法 close()
     * */
    public abstract void close();

    /**
     * 抽象类实现的display方法
     * */
    public final void display() {
        open();
        print();
        close();
    }



}
