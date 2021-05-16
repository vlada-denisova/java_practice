import java.util.Scanner;

public class SecondPractice {
    public static int get_number(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число");
            scanner.next();
        }
        return scanner.nextInt();
    }
    public static int check_number(Scanner scanner, String output_string){
        int number;
        do {
            System.out.println(output_string);
            number = get_number(scanner);
            while (number == 0) {
                System.out.print("Число равно нулю, введите корректное число: ");
                number = get_number(scanner);
            }
        } while (number <= 0);
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first_output_string = "Первое число: ";
        String second_output_string = "Второе число: ";
        int first_number = check_number(scanner, first_output_string);
        int second_number = check_number(scanner, second_output_string);
        System.out.print("Результат равен: " + first_number/second_number);
        scanner.close();
    }

}
