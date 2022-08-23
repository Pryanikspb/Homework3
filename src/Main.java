public class Main {
    public static void main(String[] args) {

        //Задание 1
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        int clientDeviceYear = 2016;
        boolean oldDevice = clientDeviceYear < 2015;
        boolean newDevice = clientDeviceYear >= 2015;

        if (clientOS == 0 && newDevice) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && oldDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1 && newDevice) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } if (clientOS == 1 && oldDevice) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке»");
            }
        }

        //Задание 3

        int year = 2000;
        int leap = 4;
        int leap100 = 100;
        int leap400 = 400;
        int checkLeap = year % leap;
        int checkLeap100 = year % leap100;
        int checkLeap400 = year % leap400;

        if (checkLeap400 == 0) {
            System.out.println(year + " год является високосным.");
        }
        if (checkLeap100 == 0 && checkLeap400 !=0) {
            System.out.println(year + " год не является високосным.");
        } else {
            if (checkLeap == 0 && checkLeap100 !=0) {
                System.out.println(year + " год является високосным.");
            } if (checkLeap != 0) {
                System.out.println(year + " год не является високосным.");
            }
        }

        //Задание 4

        int deliveryDistance = 20;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
         if (deliveryDistance > 20 && deliveryDistance <=60) {
            System.out.println("Потребуется дней: 2");
        } else {
             if (deliveryDistance >60 && deliveryDistance <100) {
                 System.out.println("Потребуется дней: 3");
             } if (deliveryDistance >= 100){
                 System.out.println("Доставка не осуществляется");
             }
        }

         //Задание 5

        int monthNumber = 8;

         switch (monthNumber) {
             case 1:
             case 2:
                 System.out.println("Зимний месяц");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Весенний месяц");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Летний месяц");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Осенний месяц");
                 break;
             case 12:
                 System.out.println("Зимний месяц");
                 break;
             default:
                 System.out.println("Такого месяца не существует");
         }
    }
}