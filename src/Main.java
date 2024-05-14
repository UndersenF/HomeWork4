public class Main {
    public static void main(String[] args) {
        //Task 1

        int age = 16;
        if (age >= 18) {
            System.out.println("Возраст 18 или больше");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        //Task 2
        System.out.println();

        int temperature = 6;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

//        Task3
        System.out.println();

        int speedLimit = 60;
        int carSpeed = 30;

        if (carSpeed > speedLimit) {
            System.out.println("Скорость превышена. Притормози!");
        }
        else if (carSpeed < speedLimit) {
            System.out.println("Скорость нормальная. Педаль в пол!");
        }

//        Task4
        System.out.println();

        int humanAge = 28;

        if (humanAge > 2 && humanAge < 6) {
            System.out.printf("Если возраст человека равен %S то ему пора в Детский Сад\n", humanAge);
        }
        else if (humanAge > 7 && humanAge < 17) {
            System.out.printf("Если возраст человека равен %S то ему пора в Школу\n", humanAge);
        }
        else if (humanAge > 18 && humanAge < 24) {
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
        int countOfStandingPassengers = 41;
        int emptyPlaces = sizeOfWagon - countOfSittingPassengers - countOfStandingPassengers;
        sitingPlaces -= countOfSittingPassengers;
        standingPlaces -= countOfStandingPassengers;

        if (emptyPlaces == 0) {
            System.out.println("Вагон забит свободных мест нет");
        }
        else if (emptyPlaces != 0 ) {
            System.out.printf("В вагоне остались свободные места. %s сидячих и %s стоячих\n", sitingPlaces, standingPlaces);
        }

//        task7
        System.out.println();

        int one = 0;
        int two = 1;
        int three = 19;

        if (one > two && one >three) {
            System.out.println(one + " самое большое число!");
        }
        else if (two > one && two > three) {
            System.out.println(two + " самое большое число!");
        }
        else if (three > one && three > two) {
            System.out.println(three + " самое большое число!");
        }

    }
}