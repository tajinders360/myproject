
public class testing2 {  
	
	
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length ; i++)  
        {  
            int index = i;  
            for (int j = i+1; j < arr.length; j++){  
            	   if (arr[j] < arr[index]){  
                   index = j;//searching for lowest index  
                    }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
            for(int k=0;k<arr.length;k++)
            {
            	System.out.print(arr[k]+"\t");
            }
            System.out.println();
            //2,14,3,9,43,11
            //2,3,14,9,43,11
            //2,3,9,14,43,11
            //2,3,9,11,43,14
            //2,3,9,11,14,43
            
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  