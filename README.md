# LoyaltyPoints
EE TDD Workshop 2023

[Reference](https://gist.github.com/DhavalDalal/277465e43c01460d6ff3030ae6462d8e)

# Loyalty Points (Java)

* Create a Java Project - you can name it LoyaltyPoints.
* Copy ```PointsCalculatorTest.java``` under package ```loyaltyPoints``` within ```src/test/java```
* Copy ```Tier.java```, ```PrivilegeService.java```, ```PointsCalculator.java``` and ```Customer.java``` under package ```loyaltyPoints``` within ```src/main/java```
* Add JUnit4 or JUnit5 Jar to the classpath.
* Run the tests to get a green bar.


An airline has following rules for calculating bonus amount for loyalty points for a loyalty based on which tier they are in:

* If a loyalty is in Platinum tier, add 50% more points above regular points.
* If a loyalty is in Gold tier, add 30% more points above regular points.
* If a loyalty is in Silver tier, add 15% more points above regular points.
* If a loyalty is in Blue tier, then there are no bonus points, just regular points.
* Spending INR 100 earns a regular point.
