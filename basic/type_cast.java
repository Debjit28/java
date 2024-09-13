public class type_cast {
    public static void main(String[]args){
        float fvar=20.34f;
        double dvar=fvar;
        //automatic casting / wide casting
        System.out.println(fvar);
        System.out.println(dvar);
        /*manual casting this causes data loss -narrow casting*/
        long lvar=(long)fvar;
        System.out.println(lvar);
        /*advanced type casting 
         * here the conversion takes place from
         * p->np && np->p
         */
        int a=2;
        String str=String.valueOf(a);
        System.out.println(a+a);
        System.out.println(str+str);
        String mystr="3";
        int num=Integer.parseInt(mystr);
        
    }
    
}
