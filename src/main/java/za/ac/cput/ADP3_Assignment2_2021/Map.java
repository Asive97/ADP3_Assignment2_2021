package za.ac.cput.ADP3_Assignment2_2021;
/*
 * Asive Madladla 217068332
 */
public class Map{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Map{" +
                "name='" + name + '\'' +
                '}';
    }
}