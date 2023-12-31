class mathsoperation{
    public static int multiply(int x,int y){
        return x*y;
    }
    public static float multiply(float x,float y){
        return x*y;
    }
    public static double multiply(float x,double y) {
        return x * y;
    }
    public static float multiply(float x,int y) {
        return x * y;
    }
    }



public class overoadingdemo {
    public static void main(String[] args) {
        System.out.println("1- "+mathsoperation.multiply(10,11));
        System.out.println("2- "+mathsoperation.multiply(10.1f,11.1f));
        System.out.println("3- "+mathsoperation.multiply(11.1f,12.1));
        System.out.println("4- "+mathsoperation.multiply(10.5f,55));
    }

}


