import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //Task1
        Random rnd = new Random();
        switch (rnd.nextInt(1, 8)) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Weekend");
        }

        //Task2
        int ameba = 1;
        System.out.println("0H " + ameba);
        for (int i = 3; i <= 24; i += 3) {
            ameba = ameba * 2;
            System.out.println(i + "H " + ameba);
        }

        //Task3
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0) {
            System.out.println("Pos");
        } else if (a < 0) {
            System.out.println("Neg");
        } else {
            System.out.println("Zero");
        }

        System.out.println(Integer.toString(a).length() + "digits");

        //Task4
        System.out.println("Enter a month");
        int month = scan.nextInt();
        System.out.println("Enter a day");
        int day = scan.nextInt();
        String sign;

        switch (month) {
            case 1 -> {
                if (day <= 20)
                    sign = "Capricorn";
                else
                    sign = "Aquarius";
            }
            case 2 -> {
                if (day <= 19)
                    sign = "Aquarius";
                else
                    sign = "Pisces";
            }
            case 3 -> {
                if (day <= 20)
                    sign = "Pisces";
                else
                    sign = "Aries";
            }
            case 4 -> {
                if (day <= 20)
                    sign = "Aries";
                else
                    sign = "Taurus";
            }
            case 5 -> {
                if (day <= 21)
                    sign = "Taurus";
                else
                    sign = "Gemini";
            }
            case 6 -> {

                if (day <= 21)
                    sign = "Gemini";
                else
                    sign = "Cancer";
            }
            case 7 -> {
                if (day <= 22)
                    sign = "Cancer";
                else
                    sign = "Leo";
            }
            case 8 -> {
                if (day <= 21)
                    sign = "Leo";
                else
                    sign = "Virgo";
            }
            case 9 -> {
                if (day <= 23)
                    sign = "Virgo";
                else
                    sign = "Libra";
            }
            case 10 -> {
                if (day <= 23)
                    sign = "Libra";
                else
                    sign = "Scorpio";
            }
            case 11 -> {
                if (day <= 22)
                    sign = "Scorpio";
                else
                    sign = "Sagittarius";
            }
            case 12 -> {
                if (day <= 22)
                    sign = "Sagittarius";
                else
                    sign = "Capricorn";
            }
            default -> sign = "Something wet wrong";
        }
        System.out.println(sign);

        //Task5
        int n;
        while (true) {
            n = scan.nextInt();
            if (n > 0) break;
            System.out.println("Please enter positive number!");
        }

        int[] arr = rnd.ints(n, 1, 1000).toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(operation(n));

        System.out.println(calculateCountOfOddElementsInMatrix(arr));

        countDevs(14);

        foobar(15);

        printPrimeNumbers();
    }

    private static int operation(int number) {
        if (number < 0) return number - 2;
        if (number > 0) return number + 1;
        number = 10;
        return number;
    }

    private static int calculateCountOfOddElementsInMatrix(int[] arr){
        return Arrays.stream(arr).filter(x->x%2!=0).toArray().length;
    }

    public static void countDevs(int count){
        String dev;
        switch (count % 10) {
            case 1 -> dev = "Programmist";
            case 2,3,4 -> dev = "Programmista";
            default -> dev = "Programmistov";
        }
        System.out.println(count + " " + dev);
    }

    public static void foobar(int number) {
        String out = "";
        if (number % 3 == 0) out+="foo";
        if (number % 5 == 0) out+="bar";
        System.out.println(out);
    }

    public static void printPrimeNumbers(){
        for (int i = 2; i < 1000; i++) {
            if (isPrimeNumber(i)) System.out.println(i);
        }
    }

    private static boolean isPrimeNumber(int num) {
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
