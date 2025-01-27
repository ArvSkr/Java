import java.util.ArrayList;
import java.util.HashMap;

public class Gym {
    private HashMap<Integer, Member> members;
    private ArrayList<Membership> memberships;
    private ArrayList<GymClass> gymClasses;

    public Gym() {
        members = new HashMap<>();
        memberships = new ArrayList<>();
        gymClasses = new ArrayList<>();
    }

    public void addMember(int Id, String name, int age) {
        Member member = new Member(Id, name, age);
        members.put(Id, member);
    }

    public void printMembers() {
        System.out.println("Members: ");
        members.values().forEach(member ->
                System.out.println(member.getId() + ": "
                        + member.getName()
                        + ", Age: " + member.getAge()));


    }

    public void assignMembership(Membership membership) {
        memberships.add(membership);
    }

    public void printMembership() {
        System.out.println("Memberships:");
        memberships.forEach(System.out::println);
    }

    public void addGymClass(String className, String schedule) {
        GymClass gymClass = new GymClass(className, schedule);
        gymClasses.add(gymClass);
    }

    public void enrollMemberInClass(int memberId, String className) {
        Member member = members.get(memberId);
        GymClass gymClass = gymClasses.stream().filter(gc -> gc.toString().contains(className)).findFirst().orElse(null);

        if (member != null && gymClass != null) {
            gymClass.enroll(member);
        } else if (member != null) {
            System.out.println("Class not found.");
        } else if (gymClass != null) {
            System.out.println("Member Id not found.");

        } else {
            System.out.println("Class not found.");
            System.out.println("Member Id not found.");
        }
    }

    public void printClassEnrollments() {
        System.out.println("Class Enrollments:");
        gymClasses.forEach(System.out::println);
    }
}