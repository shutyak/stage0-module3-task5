package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        float a=(float) toBeDivided/5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        new NumberDivider().divide(9);
    }
}
