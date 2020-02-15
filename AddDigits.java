package hyj_assignment5;

import java.util.Scanner;

class AddDigits {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        String input;
        AddDigits addDigits = new AddDigits();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a non-negative integer number: ");
            num = scanner.nextInt();
            if (num > 0) {
                sum = addDigits.getSum(num);
                while (sum > 9) {
                    sum = addDigits.getSum(sum);
                }
                System.out.println("The result of adding all digits of this number is " + sum
                        +"\nPress Y to continue");
            } else {
                System.out.println("Wrong input! Press Y to continue");
            }
            input = scanner.next();
        }
        while (input.charAt(0)==('Y')||input.charAt(0)==('y'));
    }
    public int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            int a = num % 10;
            num = (num - a) / 10;
            sum = sum + a;
        }
        return sum;
    }
}





