public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator  =  new Calculator();
        double area  = calculator.circleArea(10); // odwołanie do r za pomocą obektu
        System.out.println("Area of the Circle with radius 10 equals:" + area);

        double p = Calculator.PI; // owołanie do pola PI przy pomocy klasy
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
