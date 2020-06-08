public class LeapYear {
    public static void main(String[] args) {
        String question = "Jaki to rok?";
        String answerP = "Rok przestępny";
        String answerNP = "Rok nie przestępny";
        int year = 40400;

        System.out.println(year);
        System.out.println(question);

        if (year % 4 > 0){
            System.out.println(answerNP);
        } else if (year % 4 == 0 && year%100 > 0) {
            System.out.println(answerP);
        } else if (year % 4 == 0 && year%100 == 0 && year%400 == 0){
                System.out.println(answerP);
        }  else {
            System.out.println(answerNP);
        }

    }
}
