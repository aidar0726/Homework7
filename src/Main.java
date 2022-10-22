public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");

        int initialAmount = 0;
        int monthlyDeposit = 15_000;
        int month = 0;

        while(initialAmount < 2_459_000) {

            initialAmount = initialAmount + monthlyDeposit;
            month++;
        }

        System.out.println("Месяц " + month +" сумма накоплений равна " + initialAmount +" рублей");

        //задание 2
        System.out.println("задание 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for(;i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("задание 3");
        //задание 3

        int initialPopulation = 12_000_000;
        int numberBirthsYear1000people = 17;
        int numberDeathsYear1000people = 8;
        int numberOfYears = 10;

        int numberBirthsYear = (numberBirthsYear1000people * initialPopulation) / 1000;
        int numberDeathsYear = (numberDeathsYear1000people * initialPopulation) / 1000;


        for( int c = 1; c <= 10; c++) {
            initialPopulation  = (initialPopulation + numberBirthsYear) - numberDeathsYear;
            System.out.println( "Год " + c +  " , численность населения составляет " + initialPopulation);
        }

        System.out.println("задание 4");
        //задание 4

        int finalAmount = 12_000_000;
        int downPayment = 15_000;
        int depositInterest = 7;
        int savingsWithoutInterest = 0;
        int amountOfInterest = 0;
        int totalAmount = 0;

        for(int a = 1; totalAmount < 120_000_000; a++ ) {

            savingsWithoutInterest = savingsWithoutInterest + downPayment;
            amountOfInterest = savingsWithoutInterest * 7/100;
            totalAmount = savingsWithoutInterest + amountOfInterest;
            System.out.println("Месяц " + a +" сумма накоплений равна " + totalAmount +" рублей");
        }

        System.out.println("задание 5");
        //задание 5
        for(int a = 1; totalAmount < 120_000_000; a++ ) {

            savingsWithoutInterest = savingsWithoutInterest + downPayment;
            amountOfInterest = savingsWithoutInterest * 7/100;
            totalAmount = savingsWithoutInterest + amountOfInterest;
            if(a%6 == 0) {
                System.out.println("Месяц " + a + " сумма накоплений равна " + totalAmount + " рублей");
            }
        }

        System.out.println("задание 6");
        //задание 6

        for(int moths = 1; moths < 108; moths++ ) {

            savingsWithoutInterest = savingsWithoutInterest + downPayment;
            amountOfInterest = savingsWithoutInterest * 7/100;
            totalAmount = savingsWithoutInterest + amountOfInterest;
            if(moths%6 == 0) {
                System.out.println("Месяц " + moths + " сумма накоплений равна " + totalAmount + " рублей");
            }
        }

        System.out.println("задание 7");
        //задание 7

        int  numberDaysMonth = 31;
        int firstFridayNumber = 5;

        for(;firstFridayNumber < 31; firstFridayNumber = firstFridayNumber +7) {
            System.out.println("Сегодня пятница, " + firstFridayNumber + " -е число. Необходимо подготовить отчет.");
        }



        System.out.println("задание 8");
        //задание 8

        int beginningDesiredYear = 1822;
        int endYear = 2122;

        for (int year = 0; year <= endYear; year = year + 79) {
            if (year >= beginningDesiredYear ) {
                System.out.println(year);
            }
        }

        System.out.println("задание 9");
        //задание 9
        int result = 0;
        for(int b = 1; b <= 10; b++) {
            result = 2 * b;
            System.out.println("2*"+ b + " = " + result );
        }
    }
}


