public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int min = 1_000_000;
        int max = -1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + max + " рублей");
    }
    public static void task3() {
        int[] arr = generateRandomArray();
        float middle = 0;
        for (int j : arr) {
            middle = middle + j;
        }
        middle = middle/30;
        System.out.println("Средняя сумма трат за месяц составила "+middle+" рублей");
    }
}

