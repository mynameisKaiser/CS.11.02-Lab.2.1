public class Main {

    // 1. add
    public static int add(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }
    // 2. add
    public static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return (add(firstNumber, add(secondNumber, add(thirdNumber, fourthNumber))));
    }
    // 3. morningGreeting
    public static String morningGreeting(String userName) {
        System.out.println("早上好"+userName+"!");
        return userName;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String userName) {
        System.out.println("下午好"+userName+"!");
        return userName;
    }
    // 5. triple
    public static String triple(String tripleWord) {
        String triple = (tripleWord+tripleWord+tripleWord);
        System.out.println(triple);
        return triple;
    }
    // 6. half
    public static double half(double a) {
        System.out.println(a/2);
        return a/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a) {
        System.out.println((int)(a+0.5));
        return a+0.5;
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a) {
        System.out.println((int)(a-0.5));
        return a-0.5;
    }
}
