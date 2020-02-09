package hyj_assignment4;

class Cookie extends DessertItem{
    int number;
    public Cookie(String name,int number, int price){
        super(name);
        this.number=number;
        this.price=price;
    }
    @Override
    public String getName(){
        return name;
    }
    public double getCost(){
        cost=number*price/12;
        return cost;
    }
    public double getTax(){
        tax=cost*dessertShoppe.getTaxRate();
        return tax;
    }
    public String toString(){
        return(number+" @ "+(price/100)+" /dz."+"\n"+String.format("%-25.25s",name)+String.format("%5.2f",cost/100));
    }
}
