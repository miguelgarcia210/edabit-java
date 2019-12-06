package ex_0_very_easy;

public class ConvertMinutesIntoSeconds {
    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static void main(String[] args) {
        System.out.println(convert(6));
        System.out.println(convert(4));
        System.out.println(convert(8));
        System.out.println(convert(60));
    }
}
