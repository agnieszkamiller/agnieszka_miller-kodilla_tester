package homework;

public class FizzBuzzNone {

//    public static void main(String[] args) {
//        FizzBuzzNone fizzBuzzNone = new FizzBuzzNone();
//        System.out.println(fizzBuzzNone.getNumber(122));
//    }

    public String getNumber(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return "None";
    }
}
