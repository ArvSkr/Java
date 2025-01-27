public class MonthlyMembership extends Membership {
    private int duration;
    private double cost;

    public MonthlyMembership(int membershipId, int memberId, int duration) {
        super(membershipId, memberId);
        this.duration = duration;
        this.cost = 0.0;
        getCost();

    }


    @Override
    void getCost() {
        cost += (double) duration * 30;

    }

    @Override
    public String toString() {

        return "MonthlyMembership, Cost: " + cost + ", Duration: " + duration + " months";
    }
}
