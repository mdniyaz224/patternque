public class pattern17 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
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
1
10
101
1010
10101
 */