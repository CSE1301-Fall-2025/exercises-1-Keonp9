package module3._1basics;

public class E04ParallelArrays {
	
	//Exercise 4: Can you print out Mateo's score?
	//Can you change Sofia's score to 97 using an assignment statement in the code? 
	//Can you change the arrays so that they have 6 elements and add your name and score and print them out? 
	public static void main(String[] args) {
		// declare, create, initialize arrays
		int[ ] highScores = {99,98,98,88,68,90};
		String[ ] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia","Keon"};
		highScores[4] = 97;
		int index = 0;
		// Print corresponding names and scores
		while (index <=5) {
			System.out.println(names[index] + " has a score of " + highScores[index]);
			index++;
		}
	}
}

