package za.ac.cput.ADP3_Assignment2_2021;

public class Collection {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "type='" + type + '\'' +
                '}';
    }
}
