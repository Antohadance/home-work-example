package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte apple = 110;
        System.out.println(apple);
        short kg = 1000;
        System.out.println(kg);
        int dollars = 2563023;
        System.out.println(dollars);
        long molecules = 2000000000;
        System.out.println(molecules);

        float f = 4.54f;
        System.out.println(f);
        double d = -123.223;
        System.out.println(d);
        double WeightOfFirstBoxer = 78.2;
        double WeightOfSecondBoxer = 82.7;
        double totalWeight = WeightOfFirstBoxer + WeightOfSecondBoxer;
        System.out.println("Общий вес двух бойцов равен " + totalWeight + " кг ");
        double difference = WeightOfSecondBoxer - WeightOfFirstBoxer;
        System.out.println("Разница веса между бойцами состовляет " + difference + " кг ");

        int banana = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;
        banana = banana * 5;
        System.out.println(banana);
        milk = milk * 2;
        System.out.println(milk);
        icecream = icecream * 2;
        System.out.println(icecream);
        egg = egg * 4;
        System.out.println(egg);
        int breakfast = banana + milk + icecream + egg;
        System.out.println("Общий вес спорт-завтрака составляет " + breakfast + " грамм ");
        double weightInKilograms = breakfast * 0.001;
        System.out.println("Общий вес спорт-завтрака составляет " + weightInKilograms + " кг ");

        int needToReset = 7;
        int dumpPerDay1 = 250;
        int dumpPerDay2 = 500;
        needToReset = needToReset * 1000;
        System.out.println("Спортсмену нужно сбросить " + needToReset + " грамм ");
        int bestCase = needToReset / dumpPerDay2;
        System.out.println("Чтобы добится быстрого результата спортсмену понадобится " + bestCase + " дней ");
        int atWorst = needToReset / dumpPerDay1;
        System.out.println("Чтобы добится долгого результата спортсмену понадобится " + atWorst + " дней ");
        int sumOfDays = bestCase + atWorst;
        int averageResult = sumOfDays / 2;
        System.out.println("Чтобы добится среднего результата спортсмену понадобится " + averageResult + " день ");

        double salaryMaria = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double oldAnnualSalaryMaria = salaryMaria * 12;
        System.out.println("Старая годовая зарпата Маши составляет " + oldAnnualSalaryMaria + " рублей ");
        salaryMaria = salaryMaria * 1.10;
        System.out.println("В месяц Маша будет получать " + salaryMaria + " рублей");
        double newAnnualSalaryMaria = salaryMaria * 12;
        System.out.println("Новая годовая зарпата Маши составляет " + newAnnualSalaryMaria + " рублей ");
        double annualIncomeMaria = newAnnualSalaryMaria - oldAnnualSalaryMaria;
        System.out.println("Маша теперь получает " + salaryMaria + " рублей " + "Годовой доход вырос на " + annualIncomeMaria + " рублей" );
        double oldAnnualSalaryDenis = salaryDenis * 12;
        System.out.println("Старая годовая зарпата Дениса составляет " + oldAnnualSalaryDenis + " рублей ");
        salaryDenis = salaryDenis * 1.10;
        System.out.println("В месяц Денис будет получать " + salaryDenis + " рублей");
        double newAnnualSalaryDenis = salaryDenis * 12;
        System.out.println("Новая годовая зарпата Дениса составляет " + newAnnualSalaryDenis + " рублей ");
        double annualIncomeDenis = newAnnualSalaryDenis - oldAnnualSalaryDenis;
        System.out.println("Денис теперь получает " + salaryDenis + " рублей " + "Годовой доход вырос на " + annualIncomeDenis + " рублей" );
        double oldAnnualSalaryKristina = salaryKristina * 12;
        System.out.println("Старая годовая зарпата Кристины составляет " + oldAnnualSalaryKristina + " рублей ");
        salaryKristina = salaryKristina * 1.10;
        System.out.println("В месяц Кристина будет получать " + salaryKristina + " рублей");
        double newAnnualSalaryKristina = salaryKristina * 12;
        System.out.println("Новая годовая зарпата Кристины составляет " + newAnnualSalaryKristina + " рублей ");
        double annualIncomeKristina = newAnnualSalaryKristina - oldAnnualSalaryKristina;
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей " + "Годовой доход вырос на " + annualIncomeKristina + " рублей" );


    }
}
