package by.epamtc.mtv.viaryshko.mycalendar;

public class PrintCalendar {

    Month monthForPrint;
    private Year year;

    public PrintCalendar(Year year) {

        this.year = year;
    }

    public void print() {

        for (int i = 0; i < 12; i++) {

            monthForPrint = new Month(year, i);
            monthForPrint.printMonth();
            System.out.print("\n\n");
        }


    }


}