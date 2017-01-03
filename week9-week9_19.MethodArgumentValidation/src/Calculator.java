public class Calculator {

    public int multiplication(int fromInteger) {
        if (fromInteger <0) {
            throw new IllegalArgumentException("The parameter should be greater than or equal to 0");
        }
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }
        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if (setSize > subsetSize) {
            throw new IllegalArgumentException("The parameters are not negative and the size of " +
                                                "a subset is smaller than the set's size");
        }
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}