package question1;

/**
 * Please implement Dynamic Array Interface 
 * @author 
 *
 */
public class MyCollection implements DynamicArray{
// Uncomment commented section
	
	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private int[] numArray;
	private int arraySize;

	/**
	 * It constructs an empty Collection object with an array capacity specified by the integer
		parameter "arraySize".
	 */
	public MyCollection(int arraySize){
		this.arraySize = arraySize;
		numArray = new int[arraySize];
	}

	public int search(int searchingNum) {
		
		for(int i = 0; i < numArray.length;i++) {
			if(numArray[i] == searchingNum) {
				return numArray.length;
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean add(int numberToAdd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if(search(numberToAdd) == -1) {
			if(numArray.length >= arraySize) {
				for(int i=0; i < numArray.length; i++)
				    if(numArray[i] == 0) {
				        numArray[i] = numberToAdd;
				        break;
				    }
			}
			else {
				doubleCapacity();
				for(int i=0; i < numArray.length; i++)
				    if(numArray[i] == 0) {
				        numArray[i] = numberToAdd;
				        break;
				    }
			}
			flag = true;
		}

		return false;
	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub
		int a = arraySize * 2;
		int[] numArray1 = new int[a];
		for(int i = 0; i < numArray.length;i++) {
			numArray1[i] = numArray[i];
		}
		this.numArray = numArray1;

	}

	public boolean remove(int numberToRemove) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		boolean flag = false;
		if(search(numberToRemove) != -1) {
			for(int i =0 ; i <numArray.length - 1;i++) {
				numArray[i] = numArray[i + 1];
			}
			flag = true;
		}
		for(int i = 0; i <numArray.length;i++) {
			System.out.println(numArray[i]);
		}
		
		return false;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return numArray.length;
		
	}

	public int[] rotate(int n) {
		int temp = 0;
		for(int i =0; i < numArray.length;i++) {
			temp = numArray[i];
			numArray[i] = numArray[i + 1];
		}
		// TODO Auto-generated method stub
		return null;
	}
	

}
