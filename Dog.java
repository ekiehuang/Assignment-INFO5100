package hyj_assignment6;

public class Dog extends Pet implements Boardable {
    int startDate = 20170101;
    int endDate = 20191001;
    int boardDate;
    private String size;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Spot", "Susan", "White ", "Medium");
        dog.setSex(2);
        System.out.println(dog.toString());
    }

    String getSize() {
        return size;
    }

    public void setBoardStart(int month, int day, int year) {
        startDate = year * 10000 + month * 100 + day;
    }

    public void setBoardEnd(int month, int day, int year) {
        endDate = year * 10000 + month * 100 + day;
    }

    public boolean boarding(int month, int day, int year) {
        boardDate = year * 10000 + month * 100 + day;
        boolean b = false;
        if ((boardDate >= startDate) && (boardDate <= endDate)) {
            b = true;
        }
        return b;
    }

    @Override
    public String toString() {
        return "Dog:\n" + getPetName() + " owned by " + getOwnerName()
                + "\nColor: " + getColor() + "\nSex: " + getSex()
                + "\nSize: " + getSize() + "\nWithin the date range? " + boarding(01, 01, 2016);
    }
}

