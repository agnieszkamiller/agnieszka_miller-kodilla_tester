import javax.swing.*;

public class FirstClass {
    public static void main(String [] args) {
        Notebook notebook = new Notebook(600, 1499, 2020);
        System.out.println(notebook.weight + "dkg, " + notebook.price + "PLN, " + " year of production: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 400, 2001);
        System.out.println(heavyNotebook.weight + "dkg, " + " " + heavyNotebook.price + "PLN, " + " year of production: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1600, 850, 2015);
        System.out.println(oldNotebook.weight + "dkg, " + " " + oldNotebook.price + "PLN, " + " year of production: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkYearPrice();

        Notebook redNotebook = new Notebook(950, 1050, 2007);
        System.out.println(redNotebook.weight + "dkg, " + " " + redNotebook.price + "PLN, " + " year of production: " + redNotebook.year);
        redNotebook.checkPrice();
        redNotebook.checkWeight();
        redNotebook.checkYear();
        redNotebook.checkYearPrice();

        Notebook blueNotebook = new Notebook(2600, 250, 2004);
        System.out.println(blueNotebook.weight + "dkg, " + " " + blueNotebook.price + "PLN, " + " year of production: " + blueNotebook.year);
        blueNotebook.checkPrice();
        blueNotebook.checkWeight();
        blueNotebook.checkYear();
        blueNotebook.checkYearPrice();

        Notebook herNotebook = new Notebook(570, 1699, 2020);
        System.out.println(herNotebook.weight + "dkg, " + " " + herNotebook.price + "PLN, " + " year of production: " + herNotebook.year);
        herNotebook.checkPrice();
        herNotebook.checkWeight();
        herNotebook.checkYear();
        herNotebook.checkYearPrice();

        Notebook hisNotebook = new Notebook(750, 1250, 1918);
        System.out.println(hisNotebook.weight + "dkg, " + " " + hisNotebook.price + "PLN, " + " year of production: " + hisNotebook.year);
        hisNotebook.checkPrice();
        hisNotebook.checkWeight();
        hisNotebook.checkYear();
        hisNotebook.checkYearPrice();

     }
}
