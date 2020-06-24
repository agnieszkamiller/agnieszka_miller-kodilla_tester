public class Application {
    private String name;
    private double age;
    private double height;

    //Ctrl + Alt + l - wyrównywanie kodu


    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application newApplication = new Application("Adam", 40.5, 178);
        newApplication.ageAndHeightValidating();
    }

    // Shift + F6 - przenazywanie metod
    public void ageAndHeightValidating() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }

}

//  public static void main(String[] args) {
//     String name = "Adam";
//    double age = 40.5;
//    double height = 178;

//     if (name != null) {
//        if (age > 30 && height > 160) {
//            System.out.println("User is older than 30 and higher then 160cm");
//        } else {
//           System.out.println("User is younger than 30 or lower than 160cm");
//       }
//    }
// }
