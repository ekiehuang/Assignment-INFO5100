package hyj_assignment4;

 class DessertShoppe {
     double taxRate=0.02;
     String storeName="M & M Dessert Shoppe";

     double getTaxRate(){
         return taxRate;
     }
     String getStoreName(){
         return storeName;
     }

    public String cents2dollarsAndCents(int DollarCents){
        String dollar;
        dollar=String.format("%5.2f",DollarCents/100.0);
        return dollar;
    }

}
