class a{
int a ;
int b;
a()
{
a=5;
b=5;
    System.out.println("simple constructor\t"+a+b);


}
a(int x,int y)
{

System.out.println("parameterized constructor for int type \t"+x+y);

}

a(double x,double y)
{

System.out.println("parameterized constructor for double type\t"+x+y);

}
a(String x,String y)
{

System.out.println("parameterized constructor for string type \t"+x+y);

}

a(int a,double b,String c)
{
System.out.println("parameterizes constructor for int "+a+"\tdouble"+" " +b+" \tand string"+" "+c);

}





}
public class Pc {
    public static void main(String[]ar)
    {
    
    a obj=new a(); //simple constructor
    a obj1=new a(5,5); //for int type constructor
    a obj2=new a(1000.100,2000.200); //for double type constructor

    a obj3=new a("Hassan\t","Arshad"); //for string type constructor
    a obj4=new a(1,5.5,"Hassan"); //for int ,double and string 


       
    
    }
}
