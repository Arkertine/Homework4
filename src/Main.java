public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int age = 26;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s, то он совершеннолетний.%n", age);
        } else {
            System.out.printf("Если возраст человека равен %s, то он не достиг совершеннолетия, нужно немного подождать.%n", age);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        int outsideTemperature = 5;
        if (outsideTemperature < 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку.", outsideTemperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки.%n", outsideTemperature);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        int speed = 66;
        if (speed > 60) {
            System.out.printf("Если скорость %s км/ч, то она превышена, придется заплатить штраф.%n", speed);
        } else {
            System.out.printf("Если скорость %s км/ч, то превышения  нет, можно ездить спокойно.%n", speed);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4");
        int currentAge = 7;
        if (currentAge >= 2 && currentAge <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад.%n", currentAge);
        }
        if (currentAge >= 7 && currentAge <= 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу.%n", currentAge);
        }
        if (currentAge >= 18 && currentAge <= 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет.%n", currentAge);
        }
        if (currentAge > 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу.%n", currentAge);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 5");
        int childAge = 7;
        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе.%n", childAge);
        }
        else if (childAge >= 5 && childAge < 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого.%n", childAge);
        }
        else {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождения взрослого.%n", childAge);
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 6");
        int speedWagonCapacity = 102;
        int seatCapacity = 60;
        int position = 102;

        if (position < seatCapacity) {
            System.out.println("Имеется сидячее место.");
        }
        else if (position > seatCapacity && position <= speedWagonCapacity) {
            System.out.println("Имеется только стоячее место.");
        }
        else {
            System.out.println("Вагон уже полностью забит.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 2;

        if (one > two && one > three) {
            System.out.println("Первое число большее.");
        }
        else if (two > three && two > one) {
            System.out.println("Второе число большее.");
        }
        else if (three > one && three > two) {
            System.out.println("Третье число большее.");
        }
        else if (one == two && (one > three || two > three)) {
            System.out.println("Первое и второе числа большие.");
        }
        else if (two == three && (two > one || three > one)) {
            System.out.println("Второе и третье числа большие.");
        }
        else if (one == three && (one > two || three > two)) {
            System.out.println("Первое и третье числа большие.");
        } else if (one == two && two == three && one == three) {
            System.out.println("Первое, второе и третье числа большие.");
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}





