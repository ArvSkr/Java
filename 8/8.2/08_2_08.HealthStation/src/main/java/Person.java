/*
 *  Do not change the behavior of this class
 */

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    // Constructor
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for weight
    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }
}
