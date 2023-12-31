public class lowerclass {
    public static void main(String[] args) {

        StringBuilder a=new StringBuilder("ABCD");
        for(int i=0;i<=a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90){
                int b=(int)a.length()+32;
                a.setCharAt(i,(char)b);

            }
        }
        System.out.println("Lowercase : "+a);
    }
}
