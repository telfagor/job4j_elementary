package loop;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int standartPrice = 10;
        int overTimeHourPrice = 15;
        int normalHours = 0;
        int weekDaysOverTime = 0;
        int normalHoursWeekend = 0;
        int overTimeWeekend = 0;

        for (int i = 0; i < hours.length - 1; i++) {
            if (hours[i] >= 0 && hours[i] <= 8) {
                normalHours += hours[i];
            } else {
                weekDaysOverTime += hours[i] - 8;
            }
        }

        if (hours[5] >= 0 && hours[5] <= 8 && hours[6] >= 0 && hours[6] <= 8) {
            normalHoursWeekend = hours[5] + hours[6];
        }

        if (hours[5] > 8) {
            overTimeWeekend = hours[5] - 8;
        }

        if (hours[6] > 8) {
            overTimeWeekend += hours[6] - 8;
        }

        return normalHours * standartPrice + weekDaysOverTime * overTimeHourPrice
                + normalHoursWeekend * (2 * standartPrice) + overTimeWeekend * (2 * overTimeHourPrice);
    }
}
