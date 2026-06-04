package generic_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
7.Write a generic method to count the number of elements in a collection that have a specific property (e.g., odd integers, prime numbers, palindromes).
 */
public class CountIf {
    public static <T> int countIf(Collection<T> collection, Predicate<T> condition) {
        int count = 0;
        for (T element : collection) {
            if (condition.test(element)) { // Ստուգում ենք condition-ը
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collection<String> words = Arrays.asList("level", "hello", "racecar", "world", "madam");

        int oddCount =  countIf(numbers, n -> n % 2 != 0);
        System.out.println("Odd numbers: " + oddCount);

        int primeCount = countIf(numbers, n -> isPrime(n));
        System.out.println("Prime  Numbers: " + primeCount);

        int bigCount = countIf(numbers, n -> n > 5);
        System.out.println("big of 5: " + bigCount);

        int palindromeCount = countIf(words, s -> isPalindrome(s));
        System.out.println("Palindrome: " + palindromeCount);



    }

}


