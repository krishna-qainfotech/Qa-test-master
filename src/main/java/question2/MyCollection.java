package question2;

/**
 * Please implement Dynamic Array Interface
 * 
 * @author
 *
 */
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private String[] numArray;
	private int arraySize;
	public int copy_of_arraySize;
	public int index=0;
	int i=0;
	Boolean check=false;
	//private int  arraySize[]; 
	
	public MyCollection(int arraySize){
		arraySize = this.arraySize;
		copy_of_arraySize=arraySize;
		numArray = new String[arraySize];
	}

	public int search(String searchingNum) {
		for(i=0;i<arraySize;i++) {
			if(numArray[arraySize]==searchingNum){
				if(arraySize!=copy_of_arraySize-1) {
				return arraySize;
			}
				else{
					doubleCapacity();
				}
				}
		}return -1;}

	public boolean add(String numberToAdd) {
		for(i=0;i<=arraySize-1;i++) {
			if(numArray[arraySize]==numberToAdd) {
			 return	check=false;
			}
		}
		if(check==true) {
			numArray[index]=numberToAdd;
			index++;
		}
		return false;
	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub

	}

	public boolean remove(String numberToRemove) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] rotate(int n) {
		// TODO Auto-generated method stub
		return null;
	}

}
