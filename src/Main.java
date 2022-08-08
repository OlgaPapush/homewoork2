public class Main {
    public static void main(String[] args) {


        // Задание 1

        byte eggs = 2;
        short apples = 150;
        int stone = 5;
        long tortle = 100L;
        double powderWeight = 6.3;
        float sugarWeight = 2.5f;
        boolean catisAdult = 2 >= 18;
        char bar = 35;


// Задание 2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double boxerWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров" + boxerWeight);
        double weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров" + weightDifference);


        //Задание 3
        byte bananas = 5;
        long milk = 2;
        byte icecream = 2;
        byte egs = 4;
        byte weightOneBanana = 80;
        byte weightOneMilk = 105;
        byte weightOneIcecream = 100;
        byte weightOneEg = 70;
        int totalWeightBananas = bananas * weightOneBanana;
        System.out.println(" общий вес бабанов" + totalWeightBananas + "гр!");
        long totalWeightMilk  = milk * weightOneMilk;
        System.out.println("Общий вес молока" + totalWeightMilk + "гр!");
        int totalWeightIcecream = icecream * weightOneIcecream;
        System.out.println("Общий вес мороженного" + totalWeightIcecream + "гр!");
        int totalWeightEgs = egs * weightOneEg;
        System.out.println("Общий вес яиц" + totalWeightEgs + "гр!");
        long totalWeightProducts = totalWeightBananas + totalWeightMilk + totalWeightIcecream + totalWeightEgs;
        System.out.println("Общий вес всех продуктов" + totalWeightProducts + "гр!");
        int grPerKg = 1000;
        float weightKg = totalWeightProducts/(float)grPerKg;
        System.out.println("Вес завтрака" + weightKg + "кг");




        //Задание 4

short loseWeight = 7;
        System.out.println("нужно сбросить" + loseWeight + " кг!");
        int a = loseWeight * 1000;
        System.out.println("перевести массу в граммы" + a + "гр!");
        int b = a / 250;
        System.out.println("за сколько дней сбросит вес" + b + "дней");
        int c = a / 500;
        System.out.println("за сколько дней сбросит вес" + c + "дней");


        // Задание 5
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKristina = 76230;
        int increaseZpMasha = 67760 / 100 * 10;
        System.out.println("Зарплата Маши будет увеличена на " + increaseZpMasha + "рублей");
        int increaseZpDenis = 83690 / 100 * 10;
        System.out.println("Зарплата Дениса будет увеличена на " + increaseZpDenis + "рублей");
        int increaseZpKristina = 76230 / 100 * 10;
        System.out.println("Зарплата Кристины будет увеличена на " + increaseZpKristina + "рублей");
        int annualIcomeMasha = 67760 * 12;
        System.out.println("Годовой доход Маши до повышения зп составил" + annualIcomeMasha + "рублей");
        int annualIcomeDenis = 83690 * 12;
        System.out.println("Годовой доход Дениса до повышения зп составил" + annualIcomeDenis + "рублей");
        int annualIcomeKristina = 76230 * 12;
        System.out.println("Годовой доход Кристины до повышения зп составил" + annualIcomeKristina + "рублей");
        int increasedAnnualIcomeMasha = (67760 + 6770) * 12;
        System.out.println("Годовой доход Маши после повышения зп составил" + increasedAnnualIcomeMasha + "рублей");
        int increasedAnnualIcomeDenis = (83690 + 8360) * 12;
        System.out.println("Годовой доход Дениса после повышения зп составил" + increasedAnnualIcomeDenis + "рублей");
        int increasedAnnualIcomeKristina = (76230 + 7620) * 12;
        System.out.println("Годовой доход Кристины после повышения зп составил" + increasedAnnualIcomeKristina + "рублей");
        int differenceIncomeDenis = 1104600 - 1004280;
        System.out.println("Годовой доход Дениса вырос на" + differenceIncomeDenis + "рублей");
        int differenceIncomeKristina = 1006200 - 914760;
        System.out.println("Годовой доход Кристины вырос на" + differenceIncomeKristina + "рублей");











    }
}