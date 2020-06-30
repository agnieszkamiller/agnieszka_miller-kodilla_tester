import java.util.Scanner;

public class ColourSwitcher<firstLetter> {
    private static final String CZARNY = "C";
    private static final String POMARANCZOWY = "P";
    private static final String BIALY = "B";
    private static final String ZIELONY = "Z";
    private static final String NIEBIESKI = "N";
    private static final String FIOLETOWY = "F";
    private static final String ROZOWY = "R";

    public static void main(String[] args) {
        System.out.println(getFirstLetter());
    }

    public static String getFirstLetter() {
        String firstLetter = null;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Wprowadź pierwszą literę oczekiwanego koloru. Do wyboru masz: C, P, B, Z, N, F, R.");
            firstLetter = scanner.nextLine().trim().toUpperCase();
            if (firstLetter.length() == 1) {
                System.out.println(firstLetter);
                break;
            }
            System.out.println("Nieprawidlowy wybor. Sprobuj jeszcze raz.");
        }

        switch (firstLetter) {
            case "C":
                return "czarny";
            case "P":
                return "pomarańczowy";
            case "B":
                return "biały";
            case "Z":
                return "zielony";
            case "N":
                return "niebieski";
            case "F":
                return "fioletowy";
            case "R":
                return "rozowy";
            default:
                System.out.println("Nie ma takiego koloru");
                return "Nie ma takiego koloru.";
        }
    }
}
