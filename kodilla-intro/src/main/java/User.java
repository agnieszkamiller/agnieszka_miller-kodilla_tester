public class User {
    //utworzyć obiekt klasy User
    //stworzyc tablice imiona+ wiek
    //   tablica złożona typu User, każdy obiekt zawiera imię i wiek
    //najpierw średnia wieku wszystkich
    //  dwie pętle, jedna do obliczania średniej, druga do wyświetlania tych poniżej średniej
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String makeAString() {
        return "Name: " + name + ", age: " + age;
    }

    // gettery
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //Alt + Insert - generowanie metod i konstruktora

//TODO: Metoda toString() robi to co makeAString(). Jest ona nadpisywana z klasy Object i jest wywoływana niejawnie przy każdym
// użyciu programu
//    @Override
//    public String toString() {
//        return "User" +
//                " name: " + name +
//                ", age: " + age;
//    }
}
