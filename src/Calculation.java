import java.util.Scanner;
import java.util.Arrays;

public class Calculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] allNumbers = {}, tempArr = {};
        int number = 0, pos = 0;



        while (!scanner.hasNext("q")){
            number = scanner.nextInt();


            tempArr = Arrays.copyOf(tempArr, tempArr.length + 1);
            tempArr[pos] = number;

            allNumbers = Arrays.copyOf(tempArr, tempArr.length);
            pos++;
        }
        System.out.println(Arrays.toString(allNumbers));
        Arrays.sort(allNumbers);
        System.out.println("Highest Number:" + allNumbers[allNumbers.length -1]);

    }
}
