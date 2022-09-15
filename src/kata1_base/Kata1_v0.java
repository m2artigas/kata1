package kata1_base;

import java.util.Date;

public class Kata1_v0 {

    public static void main(String[] args) {
	// borrar comentarios al final
        Person person = new Person ("koçak", new Date(101, 0, 8));
        // a partir de 1900, 2011 101, meses entre 0 y 12, días iguales
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
