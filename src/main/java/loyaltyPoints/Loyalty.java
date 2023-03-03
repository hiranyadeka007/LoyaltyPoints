package loyaltyPoints;

public class Loyalty {

    // Here we can see abstraction & encaptulation being followed
    private Tier tier;
    private int points;


    int loyaltyPointsZero(float amountSpent) {
        points+= tier.calculateTotalPoints(amountSpent);
        return points;
    }
}

