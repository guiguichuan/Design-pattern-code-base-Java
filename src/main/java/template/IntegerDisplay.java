package template;

public class IntegerDisplay extends AbstractDisplay{

    /**
     * 属性为一个整数
     * */
    private int integer;

    public IntegerDisplay(int integer) {
        this.integer = integer;
    }

    @Override
    public void open() {
        System.out.print("[ ");
        // 实现了父类的open方法
    }

    @Override
    public void print() {
        System.out.print(integer);
        // 将整数输出
    }

    @Override
    public void close() {
        System.out.println(" ]");
        // 实现父类的close方法
    }
}
