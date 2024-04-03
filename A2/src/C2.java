/*Q2. Design a Java class called Rectangle with private attributes length and width. Include a 
constructor to initialize these attributes, as well as setter and getter methods for each attribute. 
Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a 
main method to create an object of the Rectangle class, set values for its attributes, and display 
the area and perimeter*/


class rectangle{
    private int length;
    private int width;

    rectangle(int l,int w){
        length=l;
        width=w;
    }
    public void setlength(int l){
        length=l;
    }
    public void setwidth(int w){
        width=w;
    }
    public int getlength(){
        return length;
    }
    public int getwidth(){
        return width;
    }
    public int getArea(){
        return getlength()*getwidth();
    }
    public int getPerimeter(){
        return 2*(getlength()+getwidth());
    }
}
public class C2 {
    public static void main(String[] args) {
    rectangle r1=new rectangle(5,4);
        System.out.println("The perimeter of an rectangle is "+r1.getPerimeter());
        System.out.println("The Area of an rectangle is "+r1.getArea());
        r1.setlength(2);
        r1.setwidth(5);
        System.out.println("The perimeter of an rectangle is "+r1.getPerimeter());
        System.out.println("The Area of an rectangle is "+r1.getArea());
    }
}


/*output
The perimeter of an rectangle is 18
The Area of an rectangle is 20
The perimeter of an rectangle is 14
*/