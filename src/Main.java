public class Main {

    public static void main(String[] args) {

         //Задача 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 3
        for (int i = 0; i < 18; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //Задача 4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 5
        for (int y = 1904; y <= 2096; y++) {

            if (y % 4 == 0) {

                if (y % 100 == 0) {

                    if (y % 400 == 0) {
                        System.out.println(y);
                    }
                } else {
                    System.out.println(y);
                }
            }
        }
        System.out.println();

        //Задача 6
        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 7
        for (int i = 1; i < 1000; i *= 2) {
            System.out.println(i);
        }
        System.out.println();

        //Задача 8
        int accumulation = 0;
        int accSum = 29000;

        for (int m = 1; m <= 12; m++) {
            accumulation += accSum;
            System.out.println("Месяц - " + m + ", сумма накоплений равна " + accumulation + " рублей");
        }
        System.out.println();

        //Задача 9
        double acc = 0;

        for (int m = 1; m <= 12; m++) {
            //Я понимаю, что дробная часть получается не реалистичной, но проценты есть проценты и целочисленные переменные я бы тут не использовал
            //Я бы взял BigDecimal и использовал setScale(2, RoundingMode.HALF_UP) в последнем месяце, если есть другой способ, прошу поправить меня
            acc += accSum;
            acc += (acc / 100);
            System.out.println("Месяц - " + m + ", сумма накоплений равна " + acc + " рублей");
        }
        System.out.println();

        //Задача 10
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        System.out.println();
    }
}
