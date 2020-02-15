package hyj_assignment5;

import java.util.Scanner;

public class Longest {
    public static void main (String[] args) {
        boolean input;
        System.out.println("Please enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int index = 0;
        int ori = 0;
        int diff = 0;
        char[] arr = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            for(int k=1; k<str.length();k++){
                if((arr[i] == arr[k])&((k-i)>diff)){
                    index = k;
                    ori = i;
                    diff = k - i;
                    continue;
                }
            }
        }
        System.out.println("The longest palinodromic substring is ");
        for(int i=ori; i<index+1; i++){
            System.out.print(arr[i]);
        }
    }
}
