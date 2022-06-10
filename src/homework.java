import java.time.LocalDate;
public class homework {

    // метод к заданию 1
    public static int year () {
        return 2005;
    }
    // методы к заданию 2
    public static int clientOS () {
        return 0;
    }
    public static int clientDeviceYear (){
        return 2022;
    }
    // метод к заданию 3
    public static int deliveryTime (int distance) {
        int time = 1;
        if (distance > 20 && distance < 60) {
            time += time;
        }
        if (distance > 60 && distance < 100) {
            time = time + 2;
        }
        if (distance > 100) {
            time = time + 3;
        }
        return time;

    }
    public static void main (String[] args) {
        System.out.println("1 задание");
        if (year() % 4 != 0 || year() % 100 == 0 && year() % 400 != 0) {
            System.out.println(year() + " – не високосный год");
        } else {
            System.out.println(year() + " – високосный год");
        }
        System.out.println("2 задание");
        int currentYear = LocalDate.now().getYear();
        if (clientOS() == 0) {
            if (clientDeviceYear() >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS() == 1) {
            if (clientDeviceYear() >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("3 задание");
        int deliveryDistance = 95;
        deliveryTime(deliveryDistance);
        int totalTime = deliveryTime(deliveryDistance);
        System.out.println("Потребуется дней на доставку: " + totalTime);
    }

}
