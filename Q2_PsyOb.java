package hyj_assignment3;

class PsyOb {
    public void examine(MoodyOb moodyOb){
        System.out.println("How do you feel today? ");
        moodyOb.queryMood();
        moodyOb.expressFeelings();
        }
        public void observe(MoodyOb moodyOb){
        System.out.println("Observation:"+moodyOb.toString());
    }
}
