public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {42, 15, 30};

        int maxNumber = numbers[0]; // Get the number at the first position

        if (maxNumber > numbers[1]) {
            System.out.println("The maximum number at the first position is: " + maxNumber);
        } else {
            System.out.println("The maximum number at the first position is: " + numbers[1]);
        }
    }
}