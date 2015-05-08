
public class ArrayStructures {
	
	private int[] theArray = new int[50];
	private int arraySize = 10;
	
	private void generateRandomArray(){
		
		for(int i=0;i <arraySize;i++){
			
			theArray[i] = (int) (Math.random()*10);
		}
			
	}
	
	public void printArray(){
		
		System.out.println("-------------");
		for(int i=0;i < arraySize; i++){
			
			System.out.print(i + "|");
			System.out.println(theArray[i] + "|");
		}
		System.out.println("-------------");
	}
	
	public int getValueAtIndex(int index){
		
		if(index < arraySize) 	
		return theArray[index];
		else
			return 0;
		
	}
	
	public boolean contains(int value){
		boolean status = false;
		for(int i=0;i<arraySize;i++){
			
			if(theArray[i]==value) {
				status = true; 
			}
		}
		return status;
	}
	
	public void deleteIndex(int index){
		
		if(index < arraySize){
			
		for(int i= index; i< (arraySize-1); i++)	
		{
			theArray[i] = theArray[i+1];
			
		}
		arraySize--;
		}
	}
	
	public void insertValue(int value){
		if(arraySize < 50){
		theArray[arraySize] = value;
		}
		arraySize++;
		}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//private int[] theArray = new int[50];
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(8));
		System.out.println(newArray.contains(40));
		newArray.deleteIndex(4);
		newArray.printArray();
		newArray.insertValue(100);
		newArray.printArray();
	}

}
