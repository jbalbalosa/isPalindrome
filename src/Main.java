public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome !");

        System.out.println("The number is Palindrome: " + isPalindrome(-1221));
        System.out.println("The number is Palindrome: " + isPalindrome(707));
        System.out.println("The number is Palindrome: " + isPalindrome(11212));

    }

    public static boolean isPalindrome(int number){

        int originalNumber = number;
        int reversedNumber = 0;
        int lastDigit = 0;

        while(number != 0){
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 +lastDigit;
            number /= 10;
        }

        return (reversedNumber == originalNumber);
    }
}
