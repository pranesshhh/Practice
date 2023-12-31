
class demo{
   float rank;

    int rollno;
    public demo(float f,int r){
        this.rank=f;
        this.rollno=r;

    }

    public void display(){
        System.out.println(+rank);
        System.out.println(+rollno);

    }
    static class maindemo extends demo{
        double strength;
        public maindemo(float f,int r,double s){
            super(f,r);
            this.strength=s;
        }
        public void display(){
            System.out.println(+rank);
            System.out.println(+rollno);
            System.out.println(+strength);
        }
    }
}



public class overriddingdemo {
    public static void main(String[] args) {
        demo.maindemo o=new demo.maindemo(11f,11,55);
        o.display();


    }
}
