package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month > 8 && month <= 11) {
            System.out.println("Autumn");
        } else if (month == 12 || (month <= 2 && month >0)) {
            System.out.println("Winter");
        } else if ( month <= 5 && month > 0) {
            System.out.println("Spring");
        }else{
            System.out.println("wrong number!");
        }
    }
}
