package loyaltyPoints;

enum Tier {
    PLATINUM(0.5f), GOLD(0.3f), SILVER(0.15f), BLUE(0);
    private static float AMOUNT_PER_POINT = 100.00f;
    private float factor;


   private Tier(float factor) {
        this.factor = factor;
    }
    
    public int calculateTotalPoints(float amountSpent) {
        final float earnedPoints = amountSpent / AMOUNT_PER_POINT;
        return (int)(earnedPoints + factor* earnedPoints);
    }
}