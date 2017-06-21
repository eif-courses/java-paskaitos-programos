package lombok.library;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

/**
 * Created by Marius on 6/21/2017.
 */

public @Data class Animal {

    @Setter(AccessLevel.PROTECTED) private String name;
    private int age;
    private String address;

    public Animal(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
