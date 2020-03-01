package hyj_assignment6;

public class M_TestCode {
    public static void main(String[] args) {
        Mreview mreview = new Mreview("Kill Bill",3);
        mreview.addRating(4);
        mreview.addRating(3);
        System.out.println(mreview.toString());
    }

}
