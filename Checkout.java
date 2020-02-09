package hyj_assignment4;

import java.util.Vector;

public class Checkout {
    Vector<DessertItem> itemList;
    DessertShoppe dessertShoppe=new DessertShoppe();

    public Checkout() {
        itemList = new Vector<DessertItem>();
    }

    public void enterItem(DessertItem item) {
        itemList.add(item);
    }

    public int numberOfItem() {
        return itemList.size();
    }

    public void clear() {
        itemList.clear();
    }

    public int totalCost() {

        int totalCost=0;
        for (DessertItem item : itemList) {
            totalCost = (int) (totalCost + item.getCost());
        }
        return totalCost;
    }

    public int totalTax() {
        int totalTax=0;
        for (DessertItem item : itemList) {
            totalTax = (int)(totalTax + item.getTax());
        }
        return totalTax;

    }
    public String toString() {

        String receipt=(String.format("     "+dessertShoppe.getStoreName())+"\n     --------------------\n");
        for(DessertItem item:itemList) {
            receipt=receipt+item.toString()+"\n";
        }
        receipt=receipt+String.format("%-25.25s", "Tax")
                +dessertShoppe.cents2dollarsAndCents(totalTax())
                +"\n"+String.format("%-25.25s", "Total Cost")
                +dessertShoppe.cents2dollarsAndCents(totalCost()+totalTax());
        return receipt;
    }
}
