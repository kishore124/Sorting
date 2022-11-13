import java.util.Arrays;

public class Duplicate_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {1,3,5,2,3};
int k=sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(k);
	}
    static int sort(int []arr)
    {
    	int i=0;
    	
    	while(i<arr.length)
    	{
    		if(arr[i]!=i+1)
        	{
    		int correct=arr[i]-1;
    		if(arr[i]!=arr[correct])
    		{
    			int temp=arr[correct];
    			arr[correct]=arr[i];
    			arr[i]=temp;
    		}
    		else
    			return arr[i];
    	}
    		else
        		i++;
        	
    	}
    	
    	return -1;
    }
}
