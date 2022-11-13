import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args)
	{
		int[]arr= {1,2,-22,-44,-55,5,6,3,9};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	
	static void sort(int[]arr)
	{
		for(int i=0;i<=arr.length-2;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j);
				}
				else
					break;
			}
		}
	}


	 static void swap(int[] arr,int j)
	 {
		
		   int temp=arr[j];
			arr[j]=arr[j-1];
			arr[j-1]=temp;
	}
}
