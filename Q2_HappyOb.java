package hyj_assignment3;

class HappyOb extends MoodyOb{
    protected String getMood(){
        return "happy";
    }
    public void queryMood(){
        System.out.println("I feel happy today!");
    }
    public void expressFeelings(){
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }
    public String toString(){
        String toString="Subject laughs a lot";
        return toString;
    }
}
