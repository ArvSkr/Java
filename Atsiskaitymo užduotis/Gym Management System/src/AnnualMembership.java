public class AnnualMembership extends Membership {
    private double cost;

    public AnnualMembership(int membershipId, int memberId) {
        super(membershipId, memberId);
        this.cost = 0.0;
        getCost();
    }

    @Override
    void getCost() {
        cost = 300;
    }


    @Override
    public String toString() {
        return "AnnualMembership, Cost: " + cost + ", Duration: " + " 12 months";
    }


}
