package kata1_base;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Kata1_v0 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(2001, 1, 8);
        Person person = new Person ("koçak", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
