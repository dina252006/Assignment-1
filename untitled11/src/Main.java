//Problem 1.
//You are given a number “n” and an array of “n” elements, write the function that returns minimum of them.

/*
import java.util.Scanner;

public class Main {

    public static int findMinimumRecursive(int[] arr, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return arr[startIndex];
        }

        int midIndex = (startIndex + endIndex) / 2;

        int minFirstHalf = findMinimumRecursive(arr, startIndex, midIndex);
        int minSecondHalf = findMinimumRecursive(arr, midIndex + 1, endIndex);

        return Math.min(minFirstHalf, minSecondHalf);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = findMinimumRecursive(numbers, 0, numbers.length - 1);
        System.out.println("The minimum element is: " + min);

        scanner.close();
    }
}
*/




//Problem 2.
//You are given a number “n” and an array of “n” elements, write the function that returns average of them.

/*
import java.util.Scanner;

public class Main {
    public static int sumArrayElements(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return sumArrayElements(arr, n - 1) + arr[n - 1];
    }

    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) return 0;
        int totalSum = sumArrayElements(arr, n);
        return (double) totalSum / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        double average = calculateAverage(numbers, n);
        System.out.println("The average of the elements is: " + average);

        scanner.close();
    }
}
*/




//Problem 3.
//You are given a number “n”, write the function for checking whether“n” is prime.

/*
import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Composite");
        }

        scanner.close();
    }
}
*/




//Problem 4.
//You are given a number “n”, write the program using recursion for finding “n!”

/*
import java.util.Scanner;

public class Main {
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int n = scanner.nextInt();

        long result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);

        scanner.close();
    }
}
*/




//Problem 5.
//You are given a number “n”, write the function for finding n-th elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.

/*
import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacci(n));
        scanner.close();
    }
}
*/




//Problem 6.
//You are given numbers “a” and “n”, write the function that returns “an”.

/*
import java.util.Scanner;

public class Main {
    public static long power(int a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;
        long halfPower = power(a, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return a * halfPower * halfPower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        System.out.println(a + " raised to the power " + n + " is: " + power(a, n));
        scanner.close();
    }
}
*/




//Problem 7.
//You are given a string consisting of M distinct symbols. Print all the permutations (all possible variants) of the symbols of this string.

/*
import java.util.Scanner;

public class Main {
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void generatePermutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }
        for (int i = currentIndex; i < chars.length; i++) {
            swap(chars, currentIndex, i);
            generatePermutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with distinct symbols: ");
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        System.out.println("All permutations of the given string:");
        generatePermutations(chars, 0);
    }
}
*/




//Problem 8.
//You are given a string “s”, write the function for checking whether “s” is all consists of digits.

/*
import java.util.Scanner;

public class Main {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
*/




//Problem 9.
//binomial coefficient

/*
import java.util.Scanner;

public class Main {

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n and k: ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
}
*/




//Problem 10.
//You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm)

/*
import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));

        scanner.close();
    }
}
*/