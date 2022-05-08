public class Homework {
    public static void main(String[] args) {
        printLiterals();
        System.out.println("Sum: " + sum(3, 4));
        System.out.println("Max: " + max(4, 3));
        System.out.println("Hypotenuse: " + calculateHypotenuse(4, 3));
    }
  
    private static void printLiterals() {
        System.out.println("Boolean: " + true);
        System.out.println("String: " + "Hello");
        System.out.println("Char: " + 'A');
        System.out.println("2: " + 0b10110);
        System.out.println("8: " + 021);
        System.out.println("10: " + 5);
        System.out.println("16: " + 0x20);
        System.out.println("Float: " + 1.23f);
        System.out.println("Double: " + 15.84d);
    }
  
    private static int sum(int a, int b) {
        double s =  Double.sum(a,b);
        if (s > Integer.MAX_VALUE|| s < Integer.MIN_VALUE) {
            return -1;
        }
         else {
            return Integer.sum(a, b);
        }
    }

    public static int max(int a, int b) {
        return Integer.max(a, b);
    }

    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}

