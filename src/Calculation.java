import java.util.Scanner;
import java.util.Arrays;

public class Calculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] allNumbers = {};
        int[] temp = {0};
        int number = 0;
        int pos = 0;
        int count = 1;
        int idx = 0;

        /*while (!scanner.hasNext("q")) {
            number = scanner.nextInt();

            allNumbers = Arrays.copyOf(allNumbers, allNumbers.length + 1);
            allNumbers[pos] = number;

            pos++;
        }*/

        while (!scanner.hasNext("q")) {
            number = scanner.nextInt();
            allNumbers = new int[count];

            for (int i = 0; i < allNumbers.length - 1; i++) {
                allNumbers[i] = temp[i];
            }
            allNumbers[pos] = number;
            temp = allNumbers;


            count++;
            pos++;
        }

        System.out.println(Arrays.toString(allNumbers));

        int highest = 0;

        for (int curNumber : allNumbers) {
            if (curNumber > highest) {
                highest = curNumber;
            }
        }

        System.out.println("Highest Number:" + highest);

    }
}