package inheritance;




/**
 * Created by Marius on 6/21/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Employee petras= new EngineerJanitor("Inzinierius ir vadybininkas");
        Employee jonas = new Manager("Vadybininkas");
        Employee kazys = new EngineerJanitor("Inzinierius ir vadybininkas");

        Person [] persons = new Person[]{petras, jonas, kazys};

        for (Person p: persons) {
            System.out.println(p.getName());
        }


    }
}
