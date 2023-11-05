package Zad8;

class Warning {
    private static final String message = "Watch out! Warning here!";
    private static int executeCount = 0;

    public static void showWarning() {
        System.out.println(message);
        executeCount++;
        System.out.println("Total Warning executions: " + executeCount);
    }
}
