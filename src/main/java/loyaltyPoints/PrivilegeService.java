package loyaltyPoints;

public class PrivilegeService {

    public int loyaltyPoints(Loyalty loyalty, float amountSpent) {
        return loyalty.loyaltyPointsZero(amountSpent);
    }

    // Other public methods
    // Tier updateTier(Customer customer) {
    // ...
}