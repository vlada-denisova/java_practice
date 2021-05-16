import java.util.Arrays;
import java.util.Collections;


public class FirstPractice {
    static int[] numbers = new int[]{-2,7,6,9,23,0};

    public static void count_numbers() {
        int even_numbers_count = 0; //количество четных чисел
        int odd_numbers_count = 0; //количество нечетных чисел
        int zero_count = 0; //количество нолей
        int positive_numbers_count = 0; //количество положительных чисел
        int negative_numbers_count = 0; //количество отрицательных чисел

        for (int i : numbers){
            if (i == 0){
                zero_count +=1;
                break;
            } if (i % 2 == 0){
                even_numbers_count += 1;
            } if (i>0){
                positive_numbers_count +=1;
            } if (i<0){
                negative_numbers_count +=1;
            } if (i % 2 != 0){
                odd_numbers_count +=1;
            }
        }

        System.out.println("Четных чисел - " + even_numbers_count);
        System.out.println("Нечетных чисел - " + odd_numbers_count);
        System.out.println("Отрицательных чисел - " + negative_numbers_count);
        System.out.println("Положительных чисел - " + positive_numbers_count);
        System.out.println("Нулей - " + zero_count);
    }

     public static void sort_collection(){
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
     }
     public static void sort_collection_2(){
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int t = numbers[i]; numbers[i] = numbers[j]; numbers[j] = t; }
        System.out.println(Arrays.toString(numbers));
     }

    public static void main(String[] args){
        count_numbers();
        sort_collection();
        sort_collection_2();
    }
}
