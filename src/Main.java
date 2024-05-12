public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1:");
        int intVariableType = 2_000_000;
        byte byteVariableType = 100;
        short shortVariableType = 32_000;
        long longVariableType = 123_456L;
        float floatVariableType = 123.0f;
        double doubleVariableType = 123_456.0d;
        System.out.println("Значение переменной intVariableType с типом int равно " + intVariableType);
        System.out.println("Значение переменной byteVariableType с типом byte равно " + byteVariableType);
        System.out.println("Значение переменной shortVariableType с типом short равно " + shortVariableType);
        System.out.println("Значение переменной longVariableType с типом long равно " + longVariableType);
        System.out.println("Значение переменной floatVariableType с типом float равно " + floatVariableType);
        System.out.println("Значение переменной doubleVariableType с типом double равно " + doubleVariableType);
        System.out.println();

        // Task 2
        System.out.println("Task 2:");
        float firstValue = 27.12F;
        long secondValue = 987_678_965_549L;
        float thirdValue = 2.786F;
        short fourthValue = 569;
        short fifthValue = -159;
        short sixthValue = 27_897;
        byte seventhValue = 67;
        System.out.println("Значение переменной firstValue равно " + firstValue);
        System.out.println("Значение переменной secondValue равно " + secondValue);
        System.out.println("Значение переменной thirdValue равно " + thirdValue);
        System.out.println("Значение переменной fourthValue равно " + fourthValue);
        System.out.println("Значение переменной fifthValue равно " + fifthValue);
        System.out.println("Значение переменной sixthValue равно " + sixthValue);
        System.out.println("Значение переменной seventhValue равно " + seventhValue);
        System.out.println();

        // Task 3
        System.out.println("Task 3:");
        int studentsOfLyudmilaPavlovnaAmount = 23;
        int studentsOfAnnaSergeevnaAmount = 27;
        int studentsOfEkaterinaAndreevnaAmount = 30;
        int listAllAmount = 480;
        int listPerOneStudent = listAllAmount / ( studentsOfLyudmilaPavlovnaAmount + studentsOfAnnaSergeevnaAmount + studentsOfEkaterinaAndreevnaAmount);
        System.out.println("На каждого ученика рассчитано " + listPerOneStudent + " листов бумаги");
        System.out.println();

        // Task 4
        System.out.println("Task 4:");
        //int machinePerformancePerMinute;
        int machinePerformanceFor2MinuteAmount = 16;
        int machinePerformanceFor2MinuteTime = 2;
        int machinePerformanceFor20MinuteTime = 20;
        int machinePerformanceFor1DayTime = 1440;
        int machinePerformanceFor3DaysTime = 1440 * 3;
        int machinePerformanceFor1MonthTime = 1440 * 31;
        int machinePerformancePerMinute = machinePerformanceFor2MinuteAmount / machinePerformanceFor2MinuteTime;
        int machinePerformanceFor20MinuteAmount = machinePerformanceFor20MinuteTime * machinePerformancePerMinute;
        int machinePerformanceFor1DayAmount = machinePerformanceFor1DayTime * machinePerformancePerMinute;
        int machinePerformanceFor3DaysAmount = machinePerformanceFor3DaysTime * machinePerformancePerMinute;
        int machinePerformanceFor1MonthAmount = machinePerformanceFor1MonthTime * machinePerformancePerMinute;
        System.out.printf("За %s минут машина произвела %s штук бутылок\n", machinePerformanceFor20MinuteTime, machinePerformanceFor20MinuteAmount);
        System.out.printf("За %s день машина произвела %s штук бутылок\n", machinePerformanceFor1DayTime / 1440, machinePerformanceFor1DayAmount);
        System.out.printf("За %s дня машина произвела %s штук бутылок\n", machinePerformanceFor3DaysTime / 1440, machinePerformanceFor3DaysAmount);
        System.out.printf("За %s день машина произвела %s штук бутылок\n", machinePerformanceFor1MonthTime / 1440, machinePerformanceFor1MonthAmount);
        System.out.println();

        // Task 5
        System.out.println("Task 5:");
        int canNeededAll = 120;
        int canWhiteSpendPerClass = 2;
        int canBrownSpendPerClass = 4;
        int classAmount = canNeededAll / (canWhiteSpendPerClass + canBrownSpendPerClass);
        int canWhiteNeeded = canWhiteSpendPerClass * classAmount;
        int canBrownNeeded = canBrownSpendPerClass * classAmount;
        System.out.printf("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски\n", classAmount, canWhiteNeeded, canBrownNeeded);
        System.out.println();

        // Task 6
        System.out.println("Task 6:");
        int bananasGramWeight = 5 * 80;
        int milkGramWeight = 200 / 100 * 105;
        int iceCreamGramWeight = 2 * 100;
        int eggsRawGramWeight = 4 * 70;
        int togetherGramWeight = bananasGramWeight + milkGramWeight + iceCreamGramWeight + eggsRawGramWeight;
        float togetherKilosWeight = (float)togetherGramWeight / 1000;
        System.out.printf("Вес завтрака равен %s грамма (%s килограмма)\n", togetherGramWeight, togetherKilosWeight);
        System.out.println();

        // Task 7
        System.out.println("Task 7:");
        int goalDecreaseWeightKilos = 7;
        int variantFirstDecreaseWeightGram = 250;
        int variantSecondDecreaseWeightGram = 500;
        int achievingGoalFirstVariantForDays = goalDecreaseWeightKilos * 1000 / variantFirstDecreaseWeightGram;
        int achievingGoalSecondVariantForDays = goalDecreaseWeightKilos * 1000 / variantSecondDecreaseWeightGram;
        int achievingGoalAverageVariantForDays = (achievingGoalFirstVariantForDays + achievingGoalSecondVariantForDays) / 2;
        System.out.printf("Для похудения в среднем понадобится %s день. Для быстрой стратегии - %s дней, для медленной стратегии %s дней\n", achievingGoalAverageVariantForDays, achievingGoalFirstVariantForDays, achievingGoalSecondVariantForDays);
        System.out.println();

        // Task 8
        System.out.println("Task 8:");
        float salaryMonthlyMasha = 67_760F;
        float salaryMonthlyDenis = 83_690F;
        float salaryMonthlyKristina = 76_230F;
        int salaryIncreasePercent = 10;
        float salaryAnnualIncreaseMasha = ( salaryMonthlyMasha / 100 * salaryIncreasePercent) * 12;
        float salaryAnnualAfterIncreaseMasha = salaryMonthlyMasha * 12 + salaryAnnualIncreaseMasha;
        float salaryAnnualIncreaseDenis = ( salaryMonthlyDenis / 100 * salaryIncreasePercent) * 12;
        float salaryAnnualAfterIncreaseDenis = salaryMonthlyDenis * 12 + salaryAnnualIncreaseDenis;
        float salaryAnnualIncreaseKristina = ( salaryMonthlyKristina / 100 * salaryIncreasePercent) * 12;
        float salaryAnnualAfterIncreaseKristina = salaryMonthlyKristina * 12 + salaryAnnualIncreaseKristina;
        System.out.printf("Маша теперь получает %s рублей. Годовой доход вырос на %s рублей\n", salaryAnnualAfterIncreaseMasha, salaryAnnualIncreaseMasha);
        System.out.printf("Денис теперь получает %s рублей. Годовой доход вырос на %s рублей\n", salaryAnnualAfterIncreaseDenis, salaryAnnualIncreaseDenis);
        System.out.printf("Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей\n", salaryAnnualAfterIncreaseKristina, salaryAnnualIncreaseKristina);
    }
}