public class pattern29 {
    public static void main(String[] args) {
		int no=1;
		int sp=5;
		for(int i=1; i<5; i++)
		{
		    for(int j=1; j<=no; j++)
		    {
		        System.out.print(j+" ");
		    }
		    for(int j=1; j<=sp; j++)
		    {
		        System.out.print("  ");
		    }
		    if(i==4)
		    {
		        no--;
		    }
		     for(int j=no; j>=1; j--)
		    {
		        
		        System.out.print(j+" ");
		    }
		    no++;
		    sp-=2;
		    System.out.println();
		}
	} 
}
/*
 
1           1 
1 2       2 1 
1 2 3   3 2 1
1 2 3 4 3 2 1

 */