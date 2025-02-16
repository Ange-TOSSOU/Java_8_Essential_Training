package custom_class;

public class Dog {

    private String name = "";
    private String breed = "";
    private double weight = 0;
    private String color = "";

    public Dog() {}

    public Dog(String name, String breed, double weight, String color) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
