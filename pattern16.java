public class pattern16 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                   if(j%2==0)
                   {
                    System.out.print(a);
                   }
                   else{
                    System.out.print(b);
                   }
            }
            System.out.println();
        }
    }
}

/*
10101
10101
10101
10101
10101
 */