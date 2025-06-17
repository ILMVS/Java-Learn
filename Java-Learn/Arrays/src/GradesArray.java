import java.util.Arrays;

public class GradesArray {
    public static void main(String[] args) {
        double[] math = {10.0, 9.5, 8.0, 7.5, 6.0, 5.5, 4.0, 3.5, 2.0, 1.5};
        double[] science = {10.0, 9.0, 8.5, 7.0, 6.5, 5.0, 4.5, 3.0, 2.5, 1.0};
        double[] english = {10.0, 9.2, 8.4, 7.6, 6.8, 5.0, 4.2, 3.4, 2.6, 1.8};
        double[] history = {10.0, 9.1, 8.2, 7.3, 6.4, 5.5, 4.6, 3.7, 2.8, 1.9};
        double[] geography = {10.0, 9.3, 8.6, 7.9, 6.2, 5.4, 4.7, 3.1, 2.3, 1.5};

        int mathSum, scienceSum, englishSum, historySum, geographySum;
        mathSum = (int) Arrays.stream(math).sum();
        scienceSum = (int) Arrays.stream(science).sum();
        englishSum = (int) Arrays.stream(english).sum();
        historySum = (int) Arrays.stream(history).sum();
        geographySum = (int) Arrays.stream(geography).sum();
        double mathAvg = mathSum / (double) math.length;
        double scienceAvg = scienceSum / (double) science.length;
        double englishAvg = englishSum / (double) english.length;
        double historyAvg = historySum / (double) history.length;
        double geographyAvg = geographySum / (double) geography.length;

        System.out.println("Math Average: " + mathAvg);
        System.out.println("Science Average: " + scienceAvg);
        System.out.println("English Average: " + englishAvg);
        System.out.println("History Average: " + historyAvg);
        System.out.println("Geography Average: " + geographyAvg);
        //total average
        double totalAvg = (mathAvg + scienceAvg + englishAvg + historyAvg + geographyAvg) / 5;
        System.out.println("Total Average: " + totalAvg);

    }
}
