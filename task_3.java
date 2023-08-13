public class task_3 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        swapFirstAndLast(array);

        int sum = array[0] + array[array.length / 2];
        System.out.println("Результат суммы первого и среднего элементов: " + sum);
    }

    public static void swapFirstAndLast(int[] arr) {
        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }
}