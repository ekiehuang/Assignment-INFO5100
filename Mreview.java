package hyj_assignment6;

import java.util.ArrayList;

import static java.lang.String.format;


interface Comparable<Mreview>{
    public abstract int compareTo(Mreview obj);
}


public class Mreview extends Object implements Comparable<Mreview>{
    private String title = "";
    private ArrayList<Integer> ratings;
    public Mreview(String ttl){
        this.title = ttl;
        ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl, int firstRating){
        this.title = ttl;
        ratings = new ArrayList<Integer>();
        ratings.add(firstRating);
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        double aveRating;
        double sum = 0.0;
        for(int r: ratings){
            sum = sum + r;
        }
        aveRating = sum / numRatings();
        return aveRating;
    }
    public int numRatings(){
        int size = ratings.size();
        return size;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public int compareTo(Mreview obj) {
        return title.compareTo(obj.getTitle());
    }

    @Override
    public boolean equals(Object obj){
        Mreview m = (Mreview) obj;
        return getTitle().equals(m.getTitle());
    }

    @Override
    public String toString(){
        String result = getTitle() + ", average "+String.format("%5.2f",aveRating()) +" out of "
                                   + numRatings() +" ratings";
        return result;

}


}
