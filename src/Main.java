public class Main {
    public static void main(String[] args) {
        //Task 1

        int age = 16;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s то он совершеннолетний", age);
        } else {
            System.out.printf("Если возраст человека равен %s то он несовершеннолетний, нужно немного подождать\n", age);
        }

        //Task 2
        System.out.println();

        int temperature = 5;
        if (temperature >= 5) {
            System.out.printf("На улице %s градусов, можно идти без шапки\n", temperature);
        } else if (temperature < 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку\n", temperature);
        }

//        Task3
        System.out.println();

        int speedLimit = 60;
        int carSpeed = 30;

        if (carSpeed > speedLimit) {
            System.out.printf("Скорость равна  %s км/ч это гразит штрафом. Притормози!\n", carSpeed);
        }
        else if (carSpeed <= speedLimit) {
            System.out.printf("Скорость равна  %s км/ч все нормально. Педаль в пол!\n", carSpeed);
        }

//        Task4
        System.out.println();

        int humanAge = 28;

        if (humanAge > 2 && humanAge <= 6) {
            System.out.printf("Если возраст человека равен %S то ему пора в Детский Сад\n", humanAge);
        }
        else if (humanAge >= 7 && humanAge <= 17) {
            System.out.printf("Если возраст человека равен %S то ему пора в Школу\n", humanAge);
        }
        else if (humanAge >= 18 && humanAge <= 24) {
            System.out.printf("Если возраст человека равен %S то ему пора в Универсиете\n", humanAge);
        }
        else if (humanAge > 24) {
            System.out.printf("Если возраст человека равен %S то ему пора на Работу\n", humanAge);
        }

//        Task5
        System.out.println();

        int ageOfChild = 9;

        if (ageOfChild < 5) {
            System.out.printf("Если возраст ребенка равен %s то он не может кататься на атракционе!\n", ageOfChild );
        }
        else if (ageOfChild > 5 && ageOfChild < 14) {
            System.out.printf("Если возраст ребенка равен %s то он  может кататься на атракционе в сопровождениии взрослого\n", ageOfChild );
        }
        else if (ageOfChild > 14) {
            System.out.printf("Если возраст ребенка равен %s то он  может кататься на атаркционе\n", ageOfChild );
        }

//        Task6
        System.out.println();

        int sizeOfWagon = 102;
        int sitingPlaces = 60;
        int standingPlaces = sizeOfWagon - sitingPlaces;

        int countOfSittingPassengers = 60;
        int countOfStandingPassengers = 42;
        int emptyPlaces = sizeOfWagon - countOfSittingPassengers - countOfStandingPassengers;
        sitingPlaces -= countOfSittingPassengers;
        standingPlaces -= countOfStandingPassengers;

        if (emptyPlaces <= 0) {
            System.out.println("Вагон забит свободных мест нет");
        }
        else if (emptyPlaces > 0 ) {  //может быть истинным даже если нет свободных мест???
            System.out.printf("В вагоне остались свободные места. %s сидячих и %s стоячих\n", sitingPlaces, standingPlaces);
        }

//        task7
        System.out.println();

        int one = 10;
        int two = 10;
        int three = 0;

        if (one > two && one >three) {
            System.out.println(one + " самое большое число!");
        }
        else if (two > one && two > three) {
            System.out.println(two + " самое большое число!");
        }
        else if (three > one && three > two) {
            System.out.println(three + " самое большое число!");
        }
        else if (one == two && two > three) {
            System.out.println("Первое и вторе числа имеют максимальное значение " + one );
        }
        else if (two == three && three > one) {
            System.out.println("Второе и третье числа имеют максимальное значение " + two );
        }
        else if (one == three && three > two){
            System.out.println("Первое и третье числа имеют максимальное значение " + one );
        }
        else if (one == two && two == three) {
            System.out.println("Все числа равны!");
        }


    }
}