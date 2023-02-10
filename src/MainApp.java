public class MainApp {
    public static void main(String[] args) {
        int firstNumber = 93949;
        int secondNumber = 983;
        int thirdNumber = 1;
        int fourthNumber = 22;

        //Check if (1st + 2nd) = even number
        if (((firstNumber + secondNumber) % 2 == 0) && ((thirdNumber + fourthNumber) % 2 == 0)) {
            System.out.println("All numbers are even");
        } else {
            System.out.println("One or both numbers are odd");
        }

    }
}
