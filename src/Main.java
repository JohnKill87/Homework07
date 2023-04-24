public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int salary = 0;
        int mounth = 0;
        while (salary < 2_459_000) {
            mounth = mounth + 1;
            salary = salary + 15_000;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + salary + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int n = 0;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        } System.out.println();
        for (n = 10; n >= 1; n--) {
            System.out.print(n + " ");
        }
            System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int peopleInTheCountry = 12_000_000;
        int peopleBorn = 17;
        int peopleDeath = 8;
        for (int n = 5; n <= 10; n++){
            peopleBorn = peopleInTheCountry / peopleBorn;
            peopleInTheCountry = peopleInTheCountry + peopleBorn - peopleDeath;
            System.out.println("Год " + n + " ,численость население составляет " + peopleInTheCountry);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int mounth = 0;
        while (salary < 12_000_000) {
            mounth = mounth + 1;
            salary = salary + salary / 7;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + salary + " рублей");
            }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        for (int n = 1; salary < 12_000_000; n++) {
            salary = salary + salary / 7;
            if (n % 6 == 0) {
                System.out.println("Месяц " + n + ", сумма накоплений равна " + salary + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int percent = 7;
        int mount = 1;
        int years = 9;
        while (mount < years * 12){
            salary += salary * percent / 100;
            if (mount % 6 == 0) {
                System.out.println(String.format("Месяц %s, сумма накоплений составляет %s", mount, salary));
            }
            mount++;
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        int dayInMount = 31;
        int dayInWeek = 7;
        for (int n = friday; n < dayInMount; n += dayInWeek){
            System.out.println(String.format("Сегодня пятница, %s-е число. Необходимо подготовить отчет", n));
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int cometWillArrive = 79;
        int cometLastArrive = 200;
        int cometNextArrive = 100;
        int currentYear = 2023;
        for (int n = currentYear - cometLastArrive; n < currentYear + cometNextArrive; n++) {
            if (n % cometWillArrive == 0) {
                System.out.println(n);
            }
        }
    }
}