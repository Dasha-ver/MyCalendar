package by.epamtc.mtv.viaryshko.mycalendar;

public class MyCalendar {

    private int year;
    private int k = 9;

    public MyCalendar(int year) {

        this.year = year;

    }

    protected static int y() {
        return 1;
    }

    public static void h() {

        System.out.print("JR");
    }

    public static void h(int g) {
        System.out.println("gh");
    }

    public static void main(String[] args) {

        Year year1 = new Year(2020);
        PrintCalendar printCalendar = new PrintCalendar(year1);
        printCalendar.print();


    }

}



