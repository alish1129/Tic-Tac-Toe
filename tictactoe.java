import java.util.*;
public class Assignment1Dhamala {

	static int draw=0;
	static int winplayer1=0;
	static int winplayer2=0;
	//Main Method
	public static void main(String[]args) {
		String array[][]=new String [3][3];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				array[i][j]="*";
			}
		}
		int z=0;
		outputScreen(array,z);

	}
	// Setting up the environment
	public static void outputScreen(String array[][],int z) {
		System.out.println(array[0][0]+" | "+array[0][1]+" | "+array[0][2]);
		System.out.println("----------");
		System.out.println(array[1][0]+" | "+array[1][1]+" | "+array[1][2]);
		System.out.println("----------");
		System.out.println(array[2][0]+" | "+array[2][1]+" | "+array[2][2]);
		if(array[0][0]=="X"&&array[0][1]=="X"&&array[0][2]=="X"
				||array[1][0]=="X"&&array[1][1]=="X"&&array[1][2]=="X"
				||array[2][0]=="X"&&array[2][1]=="X"&&array[2][2]=="X"
				||array[0][0]=="X"&&array[1][0]=="X"&&array[2][0]=="X"
				||array[0][2]=="X"&&array[1][2]=="X"&&array[2][2]=="X"
				||array[0][0]=="X"&&array[1][1]=="X"&&array[2][2]=="X"
				||array[2][0]=="X"&&array[1][1]=="X"&&array[0][2]=="X"
				||array[0][1]=="X"&&array[1][1]=="X"&&array[2][1]=="X"){
			System.out.println("player one wins");
			winplayer2++;
			System.out.println(winplayer2);
			Scanner input= new Scanner(System.in);
			System.out.println("Do you want to play(Y/N)");
			String word=input.next();			
			yesorno(word);
			input.close();
		}
		else if	(array[0][0]=="O"&&array[0][1]=="O"&&array[0][2]=="O"
				||array[1][0]=="O"&&array[1][1]=="O"&&array[1][2]=="O"
				||array[2][0]=="O"&&array[2][1]=="O"&&array[2][2]=="O"
				||array[0][0]=="O"&&array[1][0]=="O"&&array[2][0]=="O"
				||array[0][2]=="O"&&array[1][2]=="O"&&array[2][2]=="O"
				||array[0][0]=="O"&&array[1][1]=="O"&&array[2][2]=="O"
				||array[2][0]=="O"&&array[1][1]=="O"&&array[0][2]=="O"
				||array[0][1]=="O"&&array[1][1]=="O"&&array[2][1]=="O"){

			System.out.println("Player 2 wins");
			winplayer1++;
			System.out.println(winplayer1);
			Scanner input= new Scanner(System.in);
			System.out.println("Do you want to play again(Y/N)");
			String word=input.next();			
			yesorno(word);
			input.close();
		}	
		else if(array[0][0]!=""&& array[0][1]!=""&&array[0][2]!="*"
				&&array[1][0]!=""&& array[1][1]!=""&&array[1][2]!="*"
				&&array[2][0]!=""&& array[2][1]!=""&&array[2][2]!="*"
				&&array[0][0]!=""&& array[1][0]!=""&&array[2][0]!="*"
				&&array[0][2]!=""&& array[1][2]!=""&&array[2][2]!="*"
				&&array[0][0]!=""&& array[1][1]!=""&&array[2][2]!="*"
				&&array[2][0]!=""&& array[1][1]!=""&&array[0][2]!="*"
				&&array[0][1]!=""&& array[1][1]!=""&&array[2][1]!="*"){



			System.out.println("Draw");
			draw++;
			Scanner input= new Scanner(System.in);
			System.out.println("Do you want to play again(Y/N)");
			String word=input.next();			
			yesorno(word);
			input.close();

		}
		//Taking the Input
		else{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the row of your next move ");
			int length = input.nextInt();
			System.out.println("Enter the columb of your next move");
			int width = input.nextInt();
			z++;
			test(length,width,array,z);
			input.close();
		}
	}
	
	public static void test(int length,int width,String array[][],int z){
		if (array[length-1][width-1]=="*" && z%2!=0) 
			array[length-1][width-1]="X";
		else if(array[length-1][width-1]=="*"&& z%2==0)
			array[length-1][width-1]="O";
		else {
			System.out.println("Please try again");
			z--;
		}
		outputScreen(array,z);	
	}
	// Final Result
	public static void yesorno(String word) {
		switch(word) {
		case"Y":main(null);
		break;
		case "N":System.out.println("THE FINAL RESULT IS");
		System.out.println("Player one wins "+ winplayer2 +" times " + " Player two wins "+ winplayer1 +" times "+ " Number of Draws "+ draw);
		System.exit(0);
		break;

		}

	}
}