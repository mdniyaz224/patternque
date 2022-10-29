public class pattern3 {
    public static void main(String[] args) {
        int sp=4;
        int st=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=sp; j++)
            {
             System.out.print(" ");
            }
            for(int k=1; k<=st; k++)
            {
             System.out.print("*");
            }
             sp--;
             st++;
             System.out.println("");
        }
    }
}
/*
 
    *
   **
  ***
 ****
*****


 */