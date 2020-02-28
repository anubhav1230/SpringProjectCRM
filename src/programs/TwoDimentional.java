package programs;

public class TwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = {2,5,7,9};
		int y[] = {11,22,33,44};
		int [][] result = {x,y};
		for(int i=0; i<result.length; i++)
		{
		    for(int j=0; j<result[1].length; j++)
		        System.out.print(result[i][j]+ " ");
		    System.out.println();
		}
	}

}
