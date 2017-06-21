package composition.inhirentance;

import composition.inhirentance.*;

import java.util.Arrays;

/**
 * Created by Marius on 6/21/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Person petras = new Person("Petras", new Role[]{new Manager("Vadybininkas"),
                new Janitor("Namu valdytojas")});
        Person jonas = new Person("Jonas", new Role[]{new Manager("Vadybininkas")});
        Person kazys = new Person("Kazys", new Role[]{new Manager("Vadybininkas"),
                new Engineer("Inzinierius")});

        Person[] persons = new Person[]{petras, jonas, kazys};

        System.err.println("ROLIŲ SĄRAŠAS");

        Thread.sleep(100);

        for (Person p : persons) {
            System.out.println(Arrays.toString(p.getRoles()));
        }

    }
}
