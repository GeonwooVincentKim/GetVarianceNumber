import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);

            out.print(arr[i] + " ");
        }

        out.println();
        int sum = sumArray(arr);
        out.println(sum);

        double average = average(sum, arr.length);
        out.println(average);

        double varianceTotal = varianceTotal(arr, average);
        out.println(varianceTotal);

        double variance = variance(varianceTotal, arr.length);
        out.println(variance);

        double standardDeviation = standardDeviation(variance);
        out.println(standardDeviation);
    }

    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int sum, int length) {
        return Double.valueOf(sum) / length;
    }

    public static double varianceTotal(int[] arr, double average) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += (arr[i] - average) * (arr[i] - average);
        }

        return total;
    }

    public static double variance(double total, int length) {
        return Double.parseDouble(String.format("%.2f", total / length));
    }

    public static double standardDeviation(double variance) {
        return Double.parseDouble(String.format("%.2f", Math.sqrt(variance)));
    }
}