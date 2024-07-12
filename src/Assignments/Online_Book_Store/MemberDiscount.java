package Assignments.Online_Book_Store;

public class MemberDiscount implements Discount{
    @Override
    public double applyDiscount(double price) {
        return price * 0.90;
    }
}
