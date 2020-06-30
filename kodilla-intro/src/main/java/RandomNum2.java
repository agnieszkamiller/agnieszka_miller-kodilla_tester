import java.util.Random;

public class RandomNum2 {
    //dwie zmienne min i max
    //czy wylosowana liczba jest mniejsza od obecnie wylosowanej
    //podmieniam w miarę losowania
    //losuje, if sprawdza czy
    //zapamietuje ta wartośc
    //aż do przekroczenia
    // w pętli while zrobić if , max=0, min=30

    //    wstepny pomysł:
//    public int getRandomNumber(int max) {
//        RandomNumbers random = new RandomNumbers();
//        int result = 0;
//        int sum = 0;
//        int max = 5000;
//
//        while (sum <= max) {
////            int temp = random.nextInt(31);
//            sum = sum + temp;
//            result++;
    //  if ...
//        }
//        return result;
//    }

    // || && == !=
    public int[] podajMinIMaxValue() {
        Random random = new Random();
        int liczbaLosowana;
        int suma = 0;
        int max = 0;
        int min = 30;
        do {
            liczbaLosowana = random.nextInt(31);
            if (max < liczbaLosowana) {
                max = liczbaLosowana;
            }
            if (min > liczbaLosowana) {
                min = liczbaLosowana;
            }
            suma += liczbaLosowana;
        } while (suma <= 5000);

        int[] maxAndMin = {max, min};
        return maxAndMin;
    }

    public int podajMax(int liczbaLosowana) {
        int max = 0;

        return max;
    }

    public int podajMin(int liczbaLosowana) {
        int min = 30;

        return min;
    }


    public static void main(String[] args) {
        RandomNum2 nowyObiekt = new RandomNum2();
        int[] maxAndMinElement = nowyObiekt.podajMinIMaxValue();
        System.out.println(maxAndMinElement);
    }


}
