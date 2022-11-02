import java.util.ArrayList;
///
///
/**
 * @author Avner , Dor , Matan
 *The department keeps the shared information from both arrays
 */
public class SharedData 
{
	
	private ArrayList<Integer> array = new ArrayList<>(); // Arraylist that save the data
	private boolean [] winArray; // A Boolean array that stores the position of the elements in the sum
	private boolean flag; // A coordination flag between the threads
	private final int b; // The number we want to find
	
	/**
	 * the contractor
	 * @param array Arraylist that save the data
	 * @param b 	The number we want to find
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return the Boolean array  
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray set the Boolean array
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return the saved data array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the number we want to find
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return Returns which thread is in operation
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag set flag to the parameter 
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
