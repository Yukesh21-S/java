import java.util.*;

class ROMAN{
    
    static public void main(String aa[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        String s=Fun(n);
        System.out.print(s);
    }
    private static String Fun(int n)
    {
        String sy[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int a[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length;i++)
        {
            while(n>=a[i]){
                
                n-=a[i];
                b.append(sy[i]);
            }
        }
        return b.toString();
    }
}