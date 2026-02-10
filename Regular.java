package Customer;

public class Regular extends Customer {

    public Regular(String name, double billAmount) {
        super(name, billAmount);
    }

    public boolean isDiscount() {
        return getBillAmount() >= 500; // Return "true" as the result.
    }

    @Override
    public double calculateFinaleBill() {
        /*
        if(isDiscount()) {
            return getBillAmount() - (getBillAmount() * 0.05);
        }
        return getBillAmount();
        */
        return isDiscount() ? getBillAmount() - (getBillAmount() * 0.05) : getBillAmount();
    }

    public String toString() {
        return super.toString() +
                (isDiscount() ? "\nYou get discount 5%" : "") +
                "\nTotal price = " + calculateFinaleBill();
    }
}
