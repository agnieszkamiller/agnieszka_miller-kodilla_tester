import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        List<Integer> integerList = randomNumbers.drawingNumbers();
        System.out.println(randomNumbers.maxElement(integerList));
        System.out.println(randomNumbers.minElement(integerList));
    }

    public List<Integer> drawingNumbers() {
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();

        int sum = 0;
        int index = 0;
        while (sum <= 5_000) {
            integerList.add(random.nextInt(31));
            sum += integerList.get(index);
            index++;
        }
        System.out.println(sum);
        System.out.println(integerList.toString());

        return integerList;
    }

    public int maxElement(List<Integer> integerList) {
        int max = integerList.get(0);

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) > max) {
                max = integerList.get(i);
            }
        }
        return max;
    }
    public int minElement(List<Integer> integerList) {
        int min = integerList.get(0);

        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < min) {
                min = integerList.get(i);
            }
        }
        return min;
    }


/*    public int metodaJakas() {
        Random random = new Random();
        int sumCzastkowa = 0;
//        int i = 0;
        List<Integer> integerList = new ArrayList<>();
//        do {
//            integerList.add(random.nextInt(10));
//            sum += integerList.get(i);
//            i++;
//        } while (sum < 30);
//        System.out.println(integerList.toString());


        return 0;
    }*/



}
