package inheritance;

import lombok.Data;

/**
 * Created by Marius on 6/21/2017.
 */
public @Data class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    
}
