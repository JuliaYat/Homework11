public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2020;
        determineLeapYear(year);
    }
    public static void determineLeapYear (int year) {
        if ((year % 100) == 0) {
            System.out.println(year + " год- невисокосный год");
        } else if (((year % 4) == 0) || ((year % 400) == 0)){
            System.out.println(year + " год- високосный год");
        } else {
            System.out.println( year + " год- невисокосный год");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2021;;
        selectionVersion(clientOS, clientDeviceYear);
    }
    public static void selectionVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 22;
        determineTheNumberOfDeliveryDays(deliveryDistance);
    }
    public static void determineTheNumberOfDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }
}