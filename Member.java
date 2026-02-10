package Customer;

public class Member extends Customer implements Rewardable { // Extends before implements.
    private String member_level;

    public Member(String name, double billAmount, String member_level) {
        super(name, billAmount);
        this.member_level = member_level;
    }

    @Override
    public double calculateFinaleBill() {
        return getBillAmount() - (getBillAmount() * getDiscountRate());
    }

    @Override
    public double getDiscountRate() {
        if(member_level.equalsIgnoreCase("gold")) {
            return 0.15;
        }
        if(member_level.equalsIgnoreCase("premium")) {
            return 0.20;
        }
        return 0;
    }

    @Override
    public int collectPoints() {
        return (int)(calculateFinaleBill() / 100); // Use "(int)()" to convert double to int.
    }

    public String toString() {
        return super.toString() +
                "\nMember level: " + member_level + " (Discount rate " + getDiscountRate() + ")" +
                "\nGet Point: " + collectPoints() +
                "\nTotal price: " + calculateFinaleBill();
    }
}
