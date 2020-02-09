package hyj_assignment4;

class Sundae extends IceCream {
    String toppingName;
    double toppingPrice;

    public Sundae(String name,int price,String toppingName,int toppingPrice) {
        super(name,price);
        this.toppingName=toppingName;
        this.toppingPrice=toppingPrice;
    }

    @Override
    public String getName(){
        return (toppingName+" with "+name);
    }
    public double getCost(){
        cost=price+toppingPrice;
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
