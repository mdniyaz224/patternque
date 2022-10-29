public class pattern9 {
    public static void main(String[] args) {
        int sp=5;
        int st=1;
        for(int i=1; i<=7; i++)
        {
            for(int j=1; j<=sp; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=st; j++)
            {
                System.out.print("* ");
            }
            if(i<=7/2)
            {
                st+=2;
                sp--;
            }
            else{
                st-=2;
                sp++;
            }
            System.out.println();
        }
    }
}
