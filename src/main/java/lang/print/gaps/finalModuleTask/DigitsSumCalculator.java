package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int one = number % 10;
        int two = number % 100 / 10;
        int three = number % 1000 / 100;
        int four = number % 10000 / 1000;

        int result = one + two + three + four;
        System.out.println(result);
    }

}
