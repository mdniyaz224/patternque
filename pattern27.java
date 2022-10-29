import java.util.*;
public class pattern27 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int sp=n/2;
    int st=1;
    int a=1;
    for(int i=1; i<=n; i++)
    { 
        
        for(int j=1; j<=sp; j++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=st; j++)
        {
            System.out.print(a);
        }
        if(i<=n/2)
        {
            sp--;
            st+=2;
            a++;
        }
        else{
            sp++;
            st-=2;
            a--;
        }
        System.out.println("");
    }
   } 
}

/*
 
   1
  222
 33333
4444444
 33333
  222
   1

 */