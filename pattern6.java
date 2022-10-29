public class pattern6 {
    public static void main(String[] args) {
		int sp=0;
		int st=5;
		for(int i=1; i<=5; i++)
		{
		    for(int j=1; j<=sp; j++)
		    {
		        System.out.print(" ");
		    }
		     for(int j=1; j<=st; j++)
		    {
		        System.out.print("* ");
		    }
		    sp++;
		    st--;
		     System.out.println("");
		}
	}
}
