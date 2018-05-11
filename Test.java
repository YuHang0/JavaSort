package main;

public class Test {

    public static boolean isShuffled(Object[] a,Object[] b){
        final int al=a.length,bl=b.length;
        if (al!=bl) return false;
        boolean[] c=new boolean[al];
        for(int i=0;i<al;i++){
            boolean find=false;
            for(int j=0;j<al;j++){
                if(a[i].equals(b[j])&&!c[j]) {
                    find = true;
                    c[j] = true;
                    break;
                }
            }
            if(!find) return false;
        }
        return true;
    }

}
