class shape{
    float radius,length,breadth;
}
class rectangle extends shape{
    public rectangle(float l,float b){
        length=l;
        breadth=b;
    }
    float rectanglearea(){
        return length*breadth;
    }
}
class square extends shape{
    public square(float l) {
        length = l;
    }
float squarearrea(){
        return length*length;
}
}
class circle extends shape{
    public circle(float r){
        radius=r;
    }
    float circlearea(){
        return 3.14f*(radius*radius);
    }
}




public class Hierarchical {
    public static void main(String[] args) {
        rectangle o=new rectangle(10.5f,20.5f);
        System.out.println(o.rectanglearea());
        square o1=new square(55.5f);
        System.out.println(o1.squarearrea());
        circle o2=new circle(11.1f);
        System.out.println(o2.circlearea());



    }
}
