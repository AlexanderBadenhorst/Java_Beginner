package Chap04.Exercises.Page88.B;

public class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    // void getTime() {//this won't work as void means return nothing
    String getTime() {
        return time;
    }

    class ClockTestDrive {
        public static void main(String[] args) {
            Clock c = new Clock();
            c.setTime("1245");
            String tod = c.getTime();
            System.out.println("time: " + tod);
        }
    }
}