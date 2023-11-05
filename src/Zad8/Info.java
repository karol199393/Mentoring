package Zad8;

class Info {
    private static final String message = "Listen carefully. We have some information regarding ...";
    private static int executeCount = 0;

    public static void showInfo() {
        System.out.println(message);
        executeCount++;
        System.out.println("Total Info executions: " + executeCount);
    }
}
