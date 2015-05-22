public class TowerOfHanoi
	{
	public static void main (String[] args)
		{
		int n = 22;  //instantiates a variable to be used for number of Disks in the Tower
		String StepsToSolution;//will contain solution to tower
		StepsToSolution = hanoi(n, 1, 3);//CALLS hanoi method
		System.out.println(StepsToSolution);
		}
	
   public static String hanoi(int nDisks, int fromPeg, int toPeg)//nDisks is number of disks. fromPeg is the peg the disk is on. toPeg is the disks location. 
	   {
	   int helpPeg;//helpPeg is used to tell what peg receives the next disk.
	   String Sol1, Sol2, myStep, mySol;

	   if ( nDisks == 1 )
		   {
		   return fromPeg + " -> " + toPeg + "\n";//Base Case
		   }
	   
	   else
		   {
		   helpPeg = 6 - fromPeg - toPeg;
		   Sol1 = hanoi(nDisks-1, fromPeg, helpPeg);
		   myStep = fromPeg + " -> " + toPeg + "\n";
		   Sol2 = hanoi(nDisks-1, helpPeg, toPeg);

		   mySol = Sol1 + myStep + Sol2;

		   return mySol;
		   }
	   }
	}
