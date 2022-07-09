package template;

public class StringDisplay extends AbstractDisplay{

    /**
     * 需要显示的字符串
     * */
    private String string;

    /**
     * 以字节为单位计算的字符串长度
     * */
    private int length;

    public StringDisplay(String string) {
        this.string = string;
        this.length = string.getBytes().length;
    }

    /**
     * 划线
     * */
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }
}
