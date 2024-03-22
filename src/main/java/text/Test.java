package text;

public class Test {

    public static final Integer t = 1;


    public static void main(String[] args) {
        X x = new X();
        x.setId(1L);
//        L l = L.builder().t(t.equals(x.getT())?0:x.getT()).build();
        L l = new L();
        Integer o = 0;
        final Integer integer = t.equals(x.getT()) ? o : x.getT();
        final int i1 = t.equals(x.getT()) ? 0 : x.getT();
//        final int i =
                
//        l.setT(i);



    }


}
