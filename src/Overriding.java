    class A{   //first we create A class
    int x=10;    //initialize veriable in class A
    public void disp() //create method in class A 
            
    {
    System.out.println("fisrt method result is\t"+x); //output in method of class A
    }//close method bracket
    }//close bracket of class A
    
    class B extends A // override the class A
            //extends ka mtlb ha agr B class ko run kry gy tw class A overrite ho jayge 
    { 
        int y=20;  //initialize veriable for class B 
    
    
        @Override
    public void disp()//create method in class B ye override wali class ha
    {
     
    System.out.println("the result of second method is\t"+y); //output in class B
    }
    }
//now we create main method of program 
public class Overriding {
    public static void main(String []args)
    {
    //B obj=new B();
    A obj=new A(); 
    obj.disp();
    
    //A for first class and B for override class 
    }
    
}
