import java.util.Random;

public class GenerateNumbers{

	private int count = 0;
	private Random rand_num = new Random();
	public int[] getRandom(int[] array){
		while(count<4){
			int random_number = rand_num.nextInt(8);
			array[count] = random_number;
			count = count + 1;
		}
		return array;


	}
}