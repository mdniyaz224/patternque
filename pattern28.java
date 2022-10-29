import java.util.*;
public class pattern28 {
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int st=1;
            int sp=n/2;
            int val=1;
            for(int i=1; i<=n; i++)
            { 
                int nval=val;
                for(int j=1; j<=sp; j++)
                {
                    System.out.print(" ");
                }
                for(int j=1; j<=st; j++)
                {
                    System.out.print(nval);
                    if(j<=nval/2)
                    {
                        nval++; 
                    }
                   else{
                       nval--; 
                   }
                }
                if(i<=n/2)
                {
                    st+=2;
                    sp--;
                    val++;
                }
                else{
                    st-=2;
                    sp++;
                    val--;
                }
                System.out.println("");
                sc.close();
            }
    }
}

/*
 

   1
  232
 34543
4567654
 34543
  232
   1


 */