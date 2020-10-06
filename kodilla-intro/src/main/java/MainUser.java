public class MainUser {
    //psvm - utworzenie metody main
    // operatory przypisania: = , += , -= , *=, /=
    public static void main(String[] args) {
//        int[] tablicaLiczb = {1,2,3,4,5,6};
//
//        int suma = 0;
//        for (int i = 0; i < tablicaLiczb.length; i++) {
//            suma += tablicaLiczb[i]; // to jest to samo co suma = suma + tablicaLiczb[i]
//        }
//        System.out.println(suma);

//        tablicaLiczb[0] = 1;
//
//        String[] tabStrings = new String[5];
//        tabStrings[0] = "Pies";
//        User user = new User("Ada", 123);
//        user.getAge();
        User user1 = new User("Aga", 12);
        User user2 = new User("Iga", 40);
        User user3 = new User("Max", 60);

        User[] usersArray = {user1, user2, user3, new User("Ola", 25), new User("Ala", 30)};
//        usersArray[0] = new User("Ola", 13);
//        usersArray[1] = new User("Jan", 17);
//        usersArray[2] = new User("Ada", 40);
//        usersArray[3] = user3;


        for (int i = 0; i < usersArray.length; i++) {
            System.out.println(usersArray[i].getName());
            System.out.println(usersArray[i].getAge());
        }

        int suma = 0;
        for (int i = 0; i < usersArray.length; i++) {
            suma += usersArray[i].getAge();
        }
        int averageAge = suma / usersArray.length;
        System.out.println(averageAge);

        System.out.println("Ludzie poniżej średniej wieku");

        for (int i = 0; i < usersArray.length; i++) {
            if (usersArray[i].getAge() < averageAge) {
                System.out.println(usersArray[i].getName());
            }
        }


    }
}
