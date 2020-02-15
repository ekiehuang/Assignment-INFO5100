package hyj_assignment5;

import java.util.Scanner;

class NonRepeatChar {
    public static void main (String [] args) {
        System.out.println("Please enter a string: ");
        int index=-1;
        Scanner scanner = new Scanner(System.in);
        String arr = scanner.nextLine();
        char[] words = arr.toCharArray();
        for (int i=0; i<arr.length(); i++){
            for (int k=i+1; k<arr.length(); k++){
                if (words[i] == words[k]){
                    index = i;
                    break;
                }
            }
            if (index != -1){
                break;
            }
        }
        System.out.println("The index of the first non-repeating character is "+ index);
    }
}
