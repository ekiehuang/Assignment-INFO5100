package hyj_assignment6;

public class Cat extends Pet implements Boardable {
    int startDate = 20180101;
    int endDate = 20200101;
    int boardDate;
    private String hairLength;

    public Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "Bob", "Black ", "Short");
        cat.setSex(2);
        System.out.println(cat.toString());
    }

    String getHairLength() {
        return hairLength;
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
        if ((boardDate >= startDate) & (boardDate <= endDate)) {
            b = true;
        }
        return b;
    }

    @Override
    public String toString() {
        return "Cat:\n" + getPetName() + " owned by " + getOwnerName()
                + "\nColor: " + getColor() + "\nSex: " + getSex()
                + "\nHair: " + getHairLength() + "\nWithin the date range? " + boarding(01, 01, 2020);
    }
}


