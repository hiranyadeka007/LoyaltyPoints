package loyaltyPoints;

public class Loyalty {

    private Tier tier;
    private int points;


    int loyaltyPointsZero(float amountSpent) {
        points+= tier.calculateTotalPoints(amountSpent);
        return points;
    }
}

