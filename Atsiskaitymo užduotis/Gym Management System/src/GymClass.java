import java.util.ArrayList;


public class GymClass {
    private String className;
    private String schedule;
    private ArrayList<String> enrolledMembers;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<>();
    }

    public void enroll(Member member) {
        enrolledMembers.add(member.getName());
    }


    @Override
    public String toString() {
        String members = String.join(", ", enrolledMembers);
        if (members.isEmpty()) {
            return className + " (" + schedule + ")";
        } else {
            return className + " (" + schedule + "): " + members;
        }
    }
}