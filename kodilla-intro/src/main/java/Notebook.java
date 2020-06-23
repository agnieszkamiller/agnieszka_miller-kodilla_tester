public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year  = year;

    }
    public void checkPrice(){
        if (this.price < 600){
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight(){
        if (this.weight <= 600){
            System.out.println("This notebook is light.");
        } else if (this.weight > 600 && this.weight < 1700){
            System.out.println("This notebook is quite heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear(){
        if (this.year < 2012){
            System.out.println("This notebook is very old.");
        } else if (this.year > 2012 && this.year < 2018){
            System.out.println("This notebook is quite new.");
        } else {
            System.out.println("This notebook is new.");
        }
    }
    public void checkYearPrice(){
        if (this.year < 2005 && this.price < 300 && this.weight > 2500){
            System.out.println("This notebook is cheap, but also very old and heavy.");
        } else if (this.year >=2019 & this.price < 1500){
            System.out.println("This notebook is a good offer. Buy  it now!");
        } else {
            System.out.println("Find online the best notebook for you!");
        }
    }
}
