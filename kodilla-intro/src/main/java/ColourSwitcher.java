import java.util.Scanner;

public class ColourSwitcher {
//    private static final String CZARNY = "C";
//    private static final String POMARANCZOWY = "P";
//    private static final String BIALY= "B";
//    private static final String ZIELONY = "Z";



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą listerę oczekiwanego koloru.");
        String chosenColour = scanner.nextLine();
        System.out.println(ColourSwitcher.giveChosenColour(Colours.CZARNY));
    }

    public static String giveChosenColour(Colours chosenColour) {

        String colour;
//
//        if(Colours.ZIELONY.ordinal()[firstColourLetter] ==)

        switch (chosenColour) {
            case CZARNY:
                colour = "czarny";
                break;
            case POMARANCZOWY:
                colour = "pomarańczowy";
                break;
            case BIALY:
                colour = "biały";
                break;
            case ZIELONY:
                colour = "zielony";
                break;
//            case "N":
//                colour = "niebieski";
//                break;
//            case "F":
//                colour = "fioletowy";
//                break;
//            case "R":
//                colour = "rozowy";
//                break;
            default:
                colour = "Nie ma takiego koloru";
        }
        return colour;
    }
}
