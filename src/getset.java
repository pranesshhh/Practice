class ShapeRectangle{
    private int length,width;
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
    void setLength(int l){
        if(l>0)
        length=l;
        else
            length=0;
    }
    void setWidth(int w){
        if(w>0)
        width=w;
        else
            width=0;
    }
    int getarea(){
        int c=length*width;
        return c ;

    }
}


public class getset {
    public static void main(String[] args) {
        ShapeRectangle o=new ShapeRectangle();
        o.setLength(-1);
        o.setWidth(5);
        System.out.println("Length is "+o.getLength());
        System.out.println("Width is "+o.getWidth());
        System.out.println("Area is "+o.getarea());


    }
}
