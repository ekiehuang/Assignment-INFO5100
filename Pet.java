package hyj_assignment6;

public class Pet {
    private String name, ownerName, color;
    protected String sex;


    Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    String getPetName(){
        return name;
    }

    String getOwnerName(){
        return ownerName;
    }

    String getColor(){
        return  color;
    }

    void setSex(int sexID){
        if(sexID == 0){
            sex = "MALE";
        }
        if(sexID == 1){
            sex = "FEMALE";
        }if(sexID == 2){
            sex = "SPAYED";
        }if(sexID == 3){
            sex = "NEUTERED";
        }
    }

    String getSex(){
        return sex;
    }

    public String toString(){
        return getPetName() + " owned by " + getOwnerName() + "\n"
                + "Color: "+ getColor() + "\n"+ "Sex: " + getSex();
    }

    public static void main(String[] args) {
        Pet pet = new Pet("Spot","Mary","Black and White");
        pet.setSex(0);
        System.out.println(pet.toString());
    }

}
