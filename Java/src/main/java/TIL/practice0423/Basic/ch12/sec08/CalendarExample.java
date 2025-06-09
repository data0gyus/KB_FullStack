package TIL.practice0423.Basic.ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        int amPm = c.get(Calendar.AM_PM);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        String sw = null;
        switch (week) {
            case Calendar.MONDAY: sw = " 월"; break;
            case Calendar.TUESDAY: sw = " 화"; break;
            case Calendar.WEDNESDAY: sw = " 수"; break;
            case Calendar.THURSDAY: sw = " 목"; break;
            case Calendar.FRIDAY: sw = " 금"; break;
            case Calendar.SATURDAY: sw = " 토"; break;
            default: sw = " 일";
        }
        String AMPM = null;
        if(amPm == Calendar.AM) {
            AMPM = "오전";
        } else{
            AMPM = "오후";
        }

        System.out.println(year + "년 " + month + "월 " + day + "일" );
        System.out.println(sw + "요일 " + AMPM );
        System.out.println(hour + "시 " + minute + "분 " + second + " 초");
    }
}
