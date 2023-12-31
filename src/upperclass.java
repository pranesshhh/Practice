public class upperclass {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("abcd");
        for(int i=0;i<=a.length();i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                int b=(int)a.length()-32;
                a.setCharAt(i,(char)b);

            }
        }
        System.out.println("Uppercase : "+a);
    }
}
