package uz.devior;

public class Main {

    public static void main(String[] args) {

        MyTime time = new MyTime(23,59,59);

        System.out.println(time);

        System.out.println(time.nextHour());
        System.out.println(time.nextMinute());
        System.out.println(time.nextSecond());

        System.out.println(time.previousHour());
        System.out.println(time.previousMinute());
        System.out.println(time.previousSecond());

//        Errors
//        time.setTime(25,0,0);
//        time.setTime(0,60,0);
//        time.setTime(0,0,60);
//        time.setHour(25);
//        time.setMinute(60);
//        time.setSecond(60);
    }
}
