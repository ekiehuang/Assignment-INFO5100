package hyj_assignment4;

class IceCream extends DessertItem {

    public IceCream(String name,int price){
        super(name);
        this.price=price;
    }
    @Override
    public String getName(){
        return name;
    }
    public double getCost(){
        cost=price;
        return cost;
    }
    public double getTax(){
        tax=cost*dessertShoppe.getTaxRate();
        return tax;
    }
    public String toString(){
        return(String.format("%-25.25s",name)+String.format("%5.2f",cost/100));
    }
}
