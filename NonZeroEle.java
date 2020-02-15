package hyj_assignment5;

import java.util.ArrayList;

public class NonZeroEle {
    public static void main ( String [] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            list.add(i);
        }
        System.out.println("Before adjusting the order: ");
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        for (int k =0; k < list.size(); k++){
            if (list.get(k) == 0){
                list.remove(k);
                list.add(0);
            }
        }
        System.out.println("\nAfter adjusting the order: ");
        for (int j =0; j < list.size(); j++){
        System.out.print(list.get(j));}
    }
}
