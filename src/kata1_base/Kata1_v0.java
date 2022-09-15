package kata1_base;

import java.time.LocalDate;


public class Kata1_v0 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.of(Integer.parseInt("2001"), Integer.parseInt("1"), Integer.parseInt("8"));
        Person person = new Person ("koçak", today);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
