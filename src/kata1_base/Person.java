package kata1_base;


import java.time.*;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthdate(){
        return birthdate;
    }

    public int getAge(){
        LocalDate today = LocalDate.now();
        return (Period.between(this.birthdate, today).getYears());
    }

}
