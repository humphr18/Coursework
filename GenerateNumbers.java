import java.util.Random;

public class GenerateNumbers{

	private int count = 0;
	private Random rand_num = new Random(); // new random number variable
	public int[] getRandom(int[] array){
		while(count<4){
			int random_number = (int)Math.floor(Math.random()*(8-1)+1); //sets range
			array[count] = random_number; //adds to array
			count = count + 1;
		}
		return array; 


	}
}