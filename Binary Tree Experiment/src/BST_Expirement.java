import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BST_Expirement {
	private int[] createArray;
	private int[] randomArray;
	private int[] modifyArray;
	

	public BST_Expirement() {
		createArray = new int[1023];
		for (int i = 0; i < createArray.length; i++) {
			createArray[i] = i;
		}
		randomArray = new int[1023];
		modifyArray = new int[511];
		for(int i = 0; i < modifyArray.length; i++) {
			Random r = new Random();;
			modifyArray[i] = r.nextInt(createArray.length);
		}
		
		
	}

	private void shuffle() {
		ArrayList<Integer> temp = new ArrayList<Integer>();// create an ArrayList so i can use Collections
		for (int i = 0; i < createArray.length; i++) {
			temp.add(createArray[i]);// store data into arrayList
		}
		Collections.shuffle(temp);
		for (int i = 0; i < temp.size(); i++) {
			randomArray[i] = temp.get(i);// stores newly shuffled data into randomArray
		}

	}

}
