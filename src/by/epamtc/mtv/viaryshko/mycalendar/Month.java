package by.epamtc.mtv.viaryshko.mycalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Month {

    private SimpleDateFormat formatter;
    private Calendar calendar;
    private Year year;
    private int month;
    private int weekDay;
    private int firstDayOfWeek;

    public Month(Year year, int month) {

        this.year = year;
        this.month = month;
        this.calendar = new GregorianCalendar(year.getYear(), month, 1);
        this.weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        this.firstDayOfWeek = calendar.getFirstDayOfWeek();

    }

    public void printNameOfMonth() {

        formatter = new SimpleDateFormat("MMMM");
        System.out.printf("%15s", "");
        System.out.println(formatter.format(calendar.getTime()));
    }

    public void printWeekDays() {

        formatter = new SimpleDateFormat("E");

        while (weekDay != firstDayOfWeek) {
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        }
        do {
            System.out.print("   " + formatter.format(calendar.getTime()));
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        } while (weekDay != firstDayOfWeek);
        System.out.println();

    }

    public void printAllDays() {

        calendar = new GregorianCalendar(year.getYear(), month, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        boolean flag = true;
        do {
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int temp = calendar.get(Calendar.DAY_OF_WEEK);
            if (flag) {
                switch (temp) {
                    case 1:
                        System.out.printf("%30s", "");
                        flag = false;
                        break;

                    case 2:
                        flag = false;
                        break;
                    case 3:
                        System.out.printf("%5s", "");
                        flag = false;
                        break;
                    case 4:
                        System.out.printf("%10s", "");
                        flag = false;
                        break;
                    case 5:
                        System.out.printf("%15s", "");
                        flag = false;
                        break;
                    case 6:
                        System.out.printf("%20s", "");
                        flag = false;
                        break;
                    case 7:
                        System.out.printf("%25s", "");
                        flag = false;

                        break;
                }

            }

            System.out.printf("%4d", day);
            System.out.print(" ");
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            weekDay = calendar.get(Calendar.DAY_OF_WEEK);
            if (weekDay == firstDayOfWeek) {
                System.out.println();
            }
        }
        while (calendar.get(Calendar.MONTH) == month);
        if (weekDay != firstDayOfWeek) {
            System.out.println();
        }

    }


    public void printMonth() {
        printNameOfMonth();
        printWeekDays();
        printAllDays();


    }
}

