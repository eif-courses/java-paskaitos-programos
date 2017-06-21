package lombok.library;


import lombok.Data;

/**
 * Created by Marius on 6/21/2017.
 */
@Data
public class Main {
    public static void main(String[] args) {
       Animal animal = new Animal("Hello", 12,"jjjj");
        System.out.println(animal);

    }
}
