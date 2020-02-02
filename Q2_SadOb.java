package hyj_assignment3;

class SadOb extends MoodyOb{
    protected String getMood(){
        return "sad";
    }
    public void queryMood(){
        System.out.println("I feel sad today!");
    }
    public void expressFeelings(){
        System.out.println("'wah''boo hoo''weep''sob''weep'");
    }
    public String  toString(){
        String toString="Subject cries a lot";
        return toString;
    }
    }
