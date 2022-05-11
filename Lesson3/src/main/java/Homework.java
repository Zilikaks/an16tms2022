import java.sql.Array;
import java.util.*;
import java.util.stream.Stream;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printAlphabet();
        try {
            System.out.println(isNumberEven(scan.nextInt()));
        }
        catch (Exception ex){
            System.out.println("Incorrect input");
        }
        System.out.println(getMinAbsNumber(Math.abs(scan.nextFloat()),Math.abs(scan.nextFloat()),Math.abs(scan.nextFloat())));

        int hours = getHoursFromSecs(Math.abs(scan.nextInt()));
        switch (hours) {
            case 0 -> System.out.println("Less than an hour left");
            case 1 -> System.out.println("Only 1 hour left");
            default -> System.out.println("Only " + hours + " hours left");
        }

        System.out.println("""
                           boolean byte Short Char Int Long float double
                boolean       -     X     X    X    X    X    X    X
                byte          X     -     NY   Y    NY   NY   NY   NY
                Short         X     Y     -    Y    NY   NY   NY   NY
                Char          X     Y     Y    -    NY   NY   NY   NY
                Char          X     Y     Y    -    NY   NY   NY   NY
                Int           X     Y     Y    Y    -    NY   NY   NY
                Long          X     Y     Y    Y    Y    -    NY   NY
                float         X     Y     Y    Y    Y    Y    -    NY
                double        X     Y     Y    Y    Y    Y    Y    -""".indent(1));

        System.out.println(average(new int[]{1,8,3,72,-6,2}));
        System.out.println(max(new int[]{1,8,3,72,-6,2}));
    }

    private static void printAlphabet(){
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i+" ");
        }
    }

    private static boolean isNumberEven(int a){
        return (a % 2) == 0;
    }

    private static float getMinAbsNumber(float a, float b, float c){
        return Stream.of(a,b,c).min(Float::compare).get();
    }

    public static int getHoursFromSecs(int secs) {
        return 8-secs/60/60;
    }

    public static double average(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    public static int max(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
}
