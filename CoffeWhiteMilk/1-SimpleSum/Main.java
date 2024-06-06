import java.util.Scanner;

class Main {
    public int sum(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        Scanner myPrint = new Scanner(System.in);
        System.out.println("Digite dois numero");
        int sumOne = myPrint.nextInt();
        int sumTwo = myPrint.nextInt();

        Main value = new Main();

        var a = value.sum(sumOne, sumTwo);

        System.out.println(a);

        myPrint.close();
    }
}