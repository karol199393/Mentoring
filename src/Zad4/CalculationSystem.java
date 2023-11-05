package Zad4;

public class CalculationSystem {
    private Calculator calculator;

    public CalculationSystem(Calculator calculator) {
        this.calculator = calculator;
    }

    public int performSubtraction(int a, int b) {
        return calculator.subtract(a, b);
    }

    public int performAddition(int a, int b) {
        return calculator.add(a, b);
    }

    public int performMultiplication(int a, int b) {
        return calculator.multiply(a, b);
    }

    public double performDivision(int a, int b) {
        return calculator.divide(a, b);
    }

    public static void main(String[] args) {
        // Tworzenie instancji CalculationSystem z anonimową implementacją interfejsu Calculator
        CalculationSystem calculationSystem = new CalculationSystem(new Calculator() {
            @Override
            public int subtract(int a, int b) {
                return a - b;
            }

            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int multiply(int a, int b) {
                return a * b;
            }

            @Override
            public double divide(int a, int b) {
                if (b == 0) {
                    System.out.println("Nie można dzielić przez zero.");
                    return Double.NaN;
                }
                return (double) a / b;
            }
        });

        // Wykorzystanie anonimowej implementacji interfejsu Calculator
        int result1 = calculationSystem.performAddition(5, 3);
        int result2 = calculationSystem.performSubtraction(10, 4);
        int result3 = calculationSystem.performMultiplication(6, 2);
        double result4 = calculationSystem.performDivision(8, 2);

        System.out.println("Wynik dodawania: " + result1);
        System.out.println("Wynik odejmowania: " + result2);
        System.out.println("Wynik mnożenia: " + result3);
        System.out.println("Wynik dzielenia: " + result4);
    }
}
