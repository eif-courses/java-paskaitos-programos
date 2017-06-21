package composition.inhirentance;

/**
 * Created by Marius on 6/21/2017.
 */
public class Role {
    private String name;
    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
