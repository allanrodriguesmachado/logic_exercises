import java.util.Scanner;

public class Main {

    private static double resultAccount(int targetShooting, int swimming, int fencing, int equestrian, int running) {
        var sum = targetShooting + swimming + fencing + equestrian + running;
        return sum / 5;
    }

    public static void main(String[] args) {
        Scanner scIScanner = new Scanner(System.in);
        System.out.printf("%s \n", scIScanner.nextInt());
        System.out.println(resultAccount( scIScanner.nextInt(),
        scIScanner.nextInt(),
        scIScanner.nextInt(),
        scIScanner.nextInt(),
        scIScanner.nextInt()));
    }
}