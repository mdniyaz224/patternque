public class pattern4 {
   public static void main(String[] args) {
    int st=5;
    int sp=0;
    for(int i=1; i<=5; i++)
    {
        
        for(int k=1; k<=sp; k++)
        {
            System.out.print(" ");
        }
        
        for(int j=1; j<=st; j++)
        {
            System.out.print("*");
        }
       
        st--;
        sp++;
        System.out.println("");
    }
   } 
}

/*
 *****
 ****
  ***
   **
    *
 */