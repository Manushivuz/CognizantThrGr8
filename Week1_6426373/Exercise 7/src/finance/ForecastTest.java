package finance;

public class ForecastTest {
    public static void main(String[] args) {
        double principal = 10000; // ₹10,000
        double annualGrowthRate = 0.08; // 8%
        int forecastYears = 5;

        double futureValue = ForecastCalculator.predictValue(principal, annualGrowthRate, forecastYears);
        System.out.printf("Predicted Future Value (Recursion): ₹%.2f%n", futureValue);

        double optimizedValue = ForecastCalculator.predictTailRecursive(principal, annualGrowthRate, forecastYears);
        System.out.printf("Predicted Future Value (Tail Recursion): ₹%.2f%n", optimizedValue);
    }
}
