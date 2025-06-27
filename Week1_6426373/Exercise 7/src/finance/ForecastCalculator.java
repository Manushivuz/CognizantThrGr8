package finance;

public class ForecastCalculator {

    public static double predictValue(double currentAmount, double rate, int years) {
        if (years == 0) {
            return currentAmount;
        }
        return predictValue(currentAmount * (1 + rate), rate, years - 1);
    }

    public static double predictTailRecursive(double amount, double rate, int years) {
        return helper(amount, rate, years);
    }

    private static double helper(double acc, double rate, int yearsLeft) {
        if (yearsLeft == 0) {
            return acc;
        }
        return helper(acc * (1 + rate), rate, yearsLeft - 1);
    }
}
