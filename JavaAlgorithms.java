package homework.introtojava;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class JavaAlgorithms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        addFirst100Numbers();
        findTheSmallestNumber();
        findTheMaxDigitOfNumber(scanner);
//        checkNumberForPalindrome(scanner);
        findAllPrimesLowerThan(scanner);

        scanner.close();
    }

    /**
     * Add first 100 numbers.
     * The sum of the first 100 integer positive numbers.
     */
    public static void addFirst100Numbers() {
        System.out.println("\n  Exercise number 1:");

        int sum = 0;
        int index;
        for (index = 1; index <= 100; index++) {
            sum += index;
        }
        System.out.println("The sum of the first 100 numbers is: " + sum);
    }

    /**
     * Find the smallest number from a given array of integers.
     */
    public static void findTheSmallestNumber() {
        System.out.println("\n  Exercise number 2:");

        int[] myArray = {13, 26, 4, 81, 42, -59, 15};
        int smallest = myArray[0];
        for(int number : myArray) {
            if(smallest > number) {
                smallest = number;
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);
    }

    /*
    This was my first attempt to solve problem number 3:

    public static void findTheMaxDigitOfNumber(){
        int theNumber = 4692;
        String theNumberAsString = Integer.toString(theNumber);
        int theMaxDigit = Integer.parseInt(String.valueOf(theNumberAsString.charAt(0)));
        for(int i = 1; i < theNumberAsString.length(); i++){
            if(theMaxDigit < Integer.parseInt(String.valueOf(theNumberAsString.charAt(i)))){
                theMaxDigit = Integer.parseInt(String.valueOf(theNumberAsString.charAt(i)));
            }
        }
        System.out.println("The number is: " + theNumber);
        System.out.println("The max digit of the number above is: " + theMaxDigit);
    }
     */

    /**
     * Find the max digit of a number.
     * The function will ask you for an integer number first.
     *
     * @param scanner - it will recieve the user's input
     */
    public static void findTheMaxDigitOfNumber(Scanner scanner){
        System.out.println("\n  Exercise number 3:");

        System.out.println("Enter a number to find its max digit: ");
        int theNumber = scanner.nextInt();

        String theNumberAsString = Integer.toString(theNumber);
        char[] array = theNumberAsString.toCharArray();

        int theMaxDigit = Character.getNumericValue(array[0]);
        for(int i = 1; i < array.length; i++){
            int integerArrayElement = Character.getNumericValue(array[i]);
            if(theMaxDigit < integerArrayElement){
                theMaxDigit = integerArrayElement;
            }
        }
        System.out.println("The max digit of the number above is: " + theMaxDigit);
    }

    /**
     * Check number for palindrome.
     * First you enter a number. Then it is turned into a string and finaly into an array of characters.
     * The array is iterated, and another array receives each character from the end to the start.
     * If the two arrays are equal, the number you entered is read the same from end to start, so it is a palindrome.
     *
     * @param scanner - it will recieve the user's input
     */
    public static void checkNumberForPalindrome(Scanner scanner) {
        System.out.println("\n  Exercise number 4:");

        System.out.println("Enter a number to check if it is a palindrome: ");
        int yourNumber = scanner.nextInt();

        String yourNumberAsString = Integer.toString(yourNumber);
        char[] array = yourNumberAsString.toCharArray();
        char[] reverseArray = new char[array.length];

        /*
        Here I tried to iterate the digits of the number, but backwards.

        for(int i = array.length-1; i >= 0; i--){
            int integerElement = Character.getNumericValue(array[i]);
            System.out.println("caraterul: " + array[i]);
            Arrays.fill(reverseArray, -1, integerElement);
        }
         */
        
        for(int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }

        boolean isPalindrome = Arrays.equals(array, reverseArray);
        if(isPalindrome){
            System.out.println("Your number IS a palindrome.");
        } else {
            System.out.println("Your number is NOT a palindrome.");
        }
    }

    /**
     * Find all prime numbers lower than a given number.
     *
     * @param scanner - it will recieve the user's input
     */
    public static void findAllPrimesLowerThan(Scanner scanner) {
        System.out.println("\n  Exercise number 5:");

        System.out.println("Enter a positive number, bigger than 2, to find all the prime numbers lower than it: ");
        int yourNumber = scanner.nextInt();

        List<Integer> listOfPrimes = new ArrayList<>();


        for(int i = yourNumber - 1; i > 1; i--) {
            int divisors = 0;
            for(int j = i - 1; j > 1; j--) {if(i % j == 0) {
                    divisors++;
                }
            }
            if(divisors == 0) {
                listOfPrimes.add(i);
            }
        }
        System.out.println("numarul de prime este: " + listOfPrimes.size());
        System.out.println("The prime numbers lower than your number are: " + listOfPrimes);
    }
}


