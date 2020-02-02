package hyj_assignment3;

class testMood {
    public static void main(String[] args){
        PsyOb psyOb=new PsyOb();
        HappyOb happyOb= new HappyOb();
        SadOb sadOb= new SadOb();
        psyOb.examine(happyOb);
        psyOb.observe(happyOb);
        psyOb.examine(sadOb);
        psyOb.observe(sadOb);
    }
}
