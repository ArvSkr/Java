
class Pet {
    private String name;
    private String breed;

    // Constructor
    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // toString method for the Pet class (optional but useful)
    @Override
    public String toString() {
        return name + " (" + breed + ")";
    }
}
