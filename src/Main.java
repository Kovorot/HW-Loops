public class Main {

    public static void main(String[] args) {

        //region Циклы - задание 1
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
                        System.out.println(y + " год является високосным");
                    }
                } else {
                    System.out.println(y + " год является високосным");
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
        //endregion

        //region Циклы - задание 2
        //Задача 1
        double sum = 0;
        int months = 0;
        int targetSum = 2_459_000;
        double interestOfDeposit = (double) 12 / 100;
        int sumAcc = 15000;

        while (sum < targetSum) {
            sum += sumAcc;
            sum += (sum * interestOfDeposit);
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

        //Задача 2
        int i = 0;
        int upperBound = 10;
        int lowerBound = 0;

        while (i < upperBound) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (;i > lowerBound; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //Задача 3
        int currentCountryPopulation = 12_000_000;
        byte birthRatePer1000 = 17;
        byte mortalityPer1000 = 8;
        byte period = 10;
        short peopleCountDivider = 1000;

        for (int y = 1; y <= period; y++) {
            int countPoints = currentCountryPopulation / peopleCountDivider; //Люди не могут быть дробью, поэтому округлим
            int newborns = countPoints * birthRatePer1000;
            int dead = countPoints * mortalityPer1000;
            currentCountryPopulation += (newborns - dead);
            System.out.println("Год " + y + ", численность населения составляет " + currentCountryPopulation);
        }
        System.out.println();

        //Задача 4
        sum = 15000;
        months = 0;
        interestOfDeposit = (double) 7 / 100;
        targetSum = 12_000_000;

        while (sum < targetSum) {
            sum += (sum * interestOfDeposit);
            months++;
            System.out.println("Месясц - " + months + ", сумма накоплений " + sum);
        }
        System.out.println();

        //Задача 5
        sum = 15000;
        months = 0;
        byte monthPeriod = 6;

        while (sum < targetSum) {
            sum += (sum * interestOfDeposit);
            months++;

            if (months % monthPeriod == 0) {
                System.out.println("Месясц - " + months + ", сумма накоплений " + sum);
            }
        }
        System.out.println();

        //Задача 7
        int nextFriday = 3;
        int day = 0;
        int daysInMonth = 31;
        byte daysInWeek = 7;

        while (day <= daysInMonth) {
            day++;

            if (day == nextFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                nextFriday += daysInWeek;
            }
        }
        System.out.println();

        //Задача 8
        int year = 0;
        int cometArrivalPeriod = 79;
        int currentYear = 2024;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;

        while (year <= yearAfter) {
            year += cometArrivalPeriod;

            if (year >= yearBefore) {
                System.out.println(year);

                if (year > currentYear) {
                    break;
                }
            }
        }
        //endregion
    }
}
