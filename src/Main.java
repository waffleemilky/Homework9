import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Task 1

        int[] expenditure = new int[5];
        expenditure[0] = 23000;
        expenditure[1] = 32000;
        expenditure[2] = 15000;
        expenditure[3] = 50000;
        expenditure[4] = 7500;
        int sum = 0;
        for (int j : expenditure) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

//        Task 2

        int[] expenditure1 = {12890, 3209, 5329, 9860, 20000};
        int maxExpenditure = Arrays.stream(expenditure1).max().getAsInt();
        int minExpenditure = Arrays.stream(expenditure1).min().getAsInt();
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenditure + " рублей. Максимальная сумма трат за неделю составила " + maxExpenditure + " рублей.");

//        Task 3

        int[] expenditure2 = new int[5];
        expenditure2[0] = 3478;
        expenditure2[1] = 2789;
        expenditure2[2] = 8263;
        expenditure2[3] = 2637;
        expenditure2[4] = 7632;
        float sum2 = 0F;
        for (int k = 0; k < expenditure2.length; k++) {
            sum2 += expenditure2[k];
        }
        float mediumSum = sum2 / expenditure2.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumSum + " рублей");

//        Task 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverseFullName));

    }
}