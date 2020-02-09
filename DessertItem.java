package hyj_assignment4;

public abstract class DessertItem {
    protected String name;
    double price;
    double cost;
    double tax;
    DessertShoppe dessertShoppe=new DessertShoppe();
    public DessertItem(String name){
        this.name=name;
    }
    public abstract String getName();
    public abstract double getCost();
    public abstract double getTax();
}
