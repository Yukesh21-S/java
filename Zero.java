import java.util.*;
class Zero
{
	public static void main(String[] args) {
	    
	   Scanner sc=new Scanner(System.in);
	   
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   
	   var f=false;
	   for(int i=x;i<=y;i++)
	   {
	       String s=String.valueOf(i);
	       
	       if(s.contains("0"))
	       {
	           System.out.print(s+" ");
	           f=true;
	       }
	   }
	   if(!f)
	   System.out.print("-1");
	}
}