package lang.print.gaps.task5;

public class TimeConvertor {
    public void convert(float minutes) {
        System.out.println(minutes*60);
    }

    public static void main(String[] args) {
        new TimeConvertor().convert(11);
    }
}
