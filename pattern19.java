public class pattern19 {
    public static void main(String[] args) {
        int st=5;
        int sp=1;
        for(int i=1; i<=9; i++)
        {
            for(int j=1; j<=sp; j++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=st; j++)
            {
                System.out.print(j+" ");
            }
            if(i<=9/2)
            {
                st--;
                sp++;
            }
            else{
                sp--;
                st++;
            }
            System.out.println("");
        }
    }
}
