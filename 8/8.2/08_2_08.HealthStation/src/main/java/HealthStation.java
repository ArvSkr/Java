
public class HealthStation {
    private int weighingsCount = 0;


    public int weigh(Person person) {
        weighingsCount++;  // Increment the number of weighings
        return person.getWeight();  // Return the weight of the person
    }


    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);  // Increase the person's weight by 1
    }


    public int weighings() {
        return weighingsCount;  // Return the number of weighings
    }

}
