package hyj_assignment4;

class Candy extends DessertItem{
    double weight;
    public Candy(String name,double weight, int price){
        super(name);
        this.weight=weight;
        this.price=price;
    }
    @Override
    public String getName(){
        return name;
    }
    public double getCost(){
        cost=weight*price;
        return cost;
    }
    public double getTax(){
        tax=cost*dessertShoppe.getTaxRate();
        return tax;
    }
    public String toString(){
        return(weight+" lbs. @"+(price/100)+" /lb."+"\n"+String.format("%-25.25s",name)+String.format("%5.2f",cost/100));
    }
}

