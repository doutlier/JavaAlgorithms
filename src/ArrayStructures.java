
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
	

	public String linearSearch(int value){
		
		String results = "";
		
		for(int i=0; i< arraySize; i++){
			
			if(theArray[i]==value){
				
				results =  i + " ";
				
			}
		}
		if(results == "") results = "not found";
		return results;
	}
	
	public void bubbleSort(){
		
		
		for(int i=arraySize-1; i >1 ; i--){
			
			for(int j=0; j>i; j++){
				
				if(theArray[j]<theArray[j+1])
				{
					
					swap(j,j+1);
				}
			}
		}
	}
	
	public void binarySearch(int value){
		
		int lowIndex = 0;
		        int highIndex = arraySize - 1;
		            
		           while(lowIndex <= highIndex){
	                 
	                int middleIndex = (highIndex + lowIndex) / 2;
	                
		               if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
		                
		             else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
		                 
		              else {
	                     
		                    System.out.println("\nFound a Match for " + value + " at Index " + middleIndex);
		                
		                    lowIndex = highIndex + 1;
		                     
		              }
		               }
		
	}
		

	private void swap(int firstValue, int secondValue) {
		// TODO Auto-generated method stub
		
	int temp = theArray[firstValue];
	theArray[firstValue] = theArray[secondValue];
	theArray[secondValue] = temp;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		newArray.printArray();
		System.out.println(newArray.getValueAtIndex(8));
		System.out.println(newArray.contains(40));
		newArray.deleteIndex(4);
		newArray.printArray();
		newArray.insertValue(100);
		newArray.printArray();
		System.out.println(newArray.linearSearch(10));
		newArray.bubbleSort();
		newArray.printArray();
		newArray.binarySearch(100);
		newArray.printArray();
	}

}
