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








    }
}