/*Q1. Write a Java code snippet that comprises a Car class and a CarTester class. The Car class 
should define private fields for make and model, along with a parameterized constructor and 
getter/setter methods for these attributes. In the CarTester class, instantiate two instances of 
the Car class: myCar1 with a specified make and model, and myCar2 with null values. After 
instantiation, the CarTester class should retrieve and print the initial make and model of both 
cars. Then, it should set new values for myCar2 using setter methods and print the updated 
make and model.*/


class car{
    private String model;
    private int make;

    car(String model,int make){
        this.model=model;
        this.make=make;
    }
    public void setModel(String models){
        model=models;
    }
    public String getModel(){
        return model;
    }
    public void setMake(int maked){
        make=maked;
    }
    public int getMake(){
        return make;
    }
}
public class C1 {
    public static void main(String[] args) {
        car mycar1=new car("jeeta",20);
        System.out.println("Model of mycar1 is "+mycar1.getModel());
        System.out.println("Number of mycar1 made is "+mycar1.getMake());
        car mycar2=new car(null,0);
        mycar2.setModel("BMW");
        mycar2.setMake(100);
        System.out.println("Model of mycar2 is "+mycar2.getModel());
        System.out.println("Number of mycar2 made is "+mycar2.getMake());
    }
}


/*output
Model of mycar1 is jeeta
Number of mycar1 made is 20
Model of mycar2 is BMW
Number of mycar2 made is 100*/