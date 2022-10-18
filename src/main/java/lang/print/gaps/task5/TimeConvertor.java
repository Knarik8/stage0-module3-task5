package lang.print.gaps.task5;

public class TimeConvertor {
    public static void convert(float minutes) {
        float result = minutes * 60;
        System.out.println(result);
    }

    public static void main(String[] args){
        convert(1.56F);
    }
}


