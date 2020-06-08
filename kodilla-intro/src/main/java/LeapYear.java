public class LeapYear {
    public static void main(String[] args) {
        String question = "Jaki to rok?";
        String answerP = "Rok przestępny";
        String answerNP = "Rok nie przestępny";
        int year = 40400;

        System.out.println(year);
        System.out.println(question);
        boolean leap = isLeapYear(year);
        if (leap){
            System.out.println(answerP);
        }
        else {
            System.out.println(answerNP);
        }

    }
    public static boolean isLeapYear(int year){
        if (year % 4 > 0){
            return false;
        } else if (year % 4 == 0 && year%100 > 0) {
            return true;
        } else if (year % 4 == 0 && year%100 == 0 && year%400 == 0){
            return true;
        }  else {
            return false;
        }
    }
}
