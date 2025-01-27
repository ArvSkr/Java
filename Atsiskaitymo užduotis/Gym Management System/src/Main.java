public class Main {
    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.addMember(1, "Alice", 30);
        gym.addMember(2, "Bob", 25);
        gym.addMember(3, "Jeff", 30);
        gym.printMembers();
        System.out.println("---");

        gym.assignMembership(new MonthlyMembership(1, 1, 2));
        gym.assignMembership(new AnnualMembership(2, 2));
        gym.assignMembership(new MonthlyMembership(3, 3, 6));
        gym.printMembership();
        System.out.println("---");
        gym.addGymClass("Yoga", "Monday 6 PM");
        gym.addGymClass("Zumba", "Wednesday 7 PM");

        gym.enrollMemberInClass(1, "Yoga");
        gym.enrollMemberInClass(2, "Zumba");
        gym.enrollMemberInClass(3, "Yoga");

        gym.printClassEnrollments();

        
    }
}