public class pattern7 {
    public static void main(String[] args) {
        int st=1;
        for(int i=1; i<=9; i++)
           {
               for(int j=1; j<=st; j++)
               {
                   System.out.print("*");
               }
               if(i<=9/2)
               {
                   st++;
               }
               else
               {
                   st--;
               }
               System.out.println("");
           }
        }
}
