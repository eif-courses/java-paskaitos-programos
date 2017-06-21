package composition.inhirentance;

import java.util.Arrays;

/**
 * Created by Marius on 6/21/2017.
 */
public class Person{
    private String name;
    private Role[] roles;

    public Person(String name, Role[] roles) {
        this.name = name;
        this.roles = roles;
    }
    public Role[] getRoles() {
        return roles;
    }
    public void setRoles(Role[] roles) {
        this.roles = roles;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", roles=" + Arrays.toString(roles) +
                '}';
    }
}
