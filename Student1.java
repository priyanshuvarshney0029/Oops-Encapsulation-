package Final_OOps;

public class Student1 {
	
   private int rollno;
   private String name;
   private double per;
   
   
   // setter (to initialize the data member)...
   public void Setter(int rol,String s,double percent) {
	   if(rol<=0) {
		   System.out.println("Roll no can't be negative");
	   }
	   else {
		   rollno=rol;
	   }
	   name=s;
	   per=percent;
   }
   // getter to get the value.......
   
   public void get() {
	   System.out.println("Rollno"+rollno);
	   System.out.println("Name is="+name);
	   System.out.println("Percentage:"+per);
   }
}
