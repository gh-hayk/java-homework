package lambda_homework;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;


public class LambdaExpressions {
    public static void main(String[] args) {
//1.Write a simple Lambda expression that takes two integers as arguments and returns their sum.
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("1. Sum =" + sum.apply(6, 6));

//2.Write a Lambda expression that takes a list of strings and returns the number of strings that start with the letter 'A'.
        List<String> names = Arrays.asList("Anna", "Bob", "Alice", "Gor");

        long countA = names.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println("2. 'A'-ով սկսվողների քանակ: " + countA);
//3.Write a Lambda expression that takes an array of integers and returns the highest value.
        int[] numbers = {4, 5, 76, 9, 1};

        int max = Arrays.stream(numbers)
        .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("3. Ամենամեծ թիվ: " + max);

//4.Write a Lambda expression that takes a string and returns a new string with all the vowels removed.
        java.util.function.Function<String, String> removeVowels = s -> s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("4. Ձայնավոր-ից հետո: " + removeVowels.apply("Hello World"));

//5.Write a Lambda expression that takes a list of integers and returns a new list with only the even numbers.
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 0);

        List<Integer> evenNumbers = numList.stream()
                .filter(n ->  n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("5. Զույգ թվեր: " + evenNumbers);

//6.Write a Lambda expression that takes a list of strings and sorts them in descending order.
        List<String> words = Arrays.asList("Banana", "Apple", "Cherry", "Date");

        List<String> sortedDesc = words.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("6. Նվազման կարգ: " + sortedDesc);

//7.Write a Lambda expression that takes a list of integers and returns the sum of all the even numbers.
        List<Integer> numList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 10);

        int sumEven = numList2.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);
        System.out.println("7. Զույգ թվերի գումար: " + sumEven);

//8.Write a Lambda expression that takes a list of strings and returns a new list with only the strings that have length greater than 5.
        List<String> wordList = Arrays.asList("Hi", "Hello", "Java", "Programming", "OK", "Lambda");

        List<String> longWords = wordList.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println("8. 5-ից երկար բառեր: " + longWords);
//9.Write a Lambda expression that takes a list of integers and returns a new list with only the numbers greater than 50.
        List<Integer> numList3 = Arrays.asList(10, 55, 30, 75, 45, 100, 50);

        List<Integer> greaterThan50 = numList3.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());
        System.out.println("9. 50-ից մեծ թվեր: " + greaterThan50);
        
//10.Write a Lambda expression that takes a list of strings and returns a new list with only the strings that contain the letter 'e'.
        List<String> wordList2 = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        List<String> containsE = wordList2.stream()
                .filter(s -> s.contains("e"))
                .collect(Collectors.toList());

    }
}
