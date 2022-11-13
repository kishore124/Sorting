import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {8,3,4,12,5};
arr=mergesorting(arr);
System.out.println(Arrays.toString(arr));
	}
	static int[] mergesorting(int[] arr)
	{
	int c=arr.length;
	  if(arr.length==1)
	  {
		  return arr;
	  }
	  int mid=arr.length/2;
	  int [] left=mergesorting(Arrays.copyOfRange(arr, 0, mid));
	  int[] right=mergesorting(Arrays.copyOfRange(arr, mid, arr.length));
	  
	  return merge(left,right);
	}
	 static int[] merge(int[] left, int[] right)
	 {
		int i=0;
		int j=0;
		int k=0;
		int [] mix=new int[left.length+right.length];
		while(i<left.length && j<right.length)
		{
			if(left[i]<right[j])
			{
				mix[k]=left[i];
				i++;
			}
			else
			{
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		
		  while(i<left.length) { mix[k]=left[i]; i++; k++; }
		  while(j<right.length) {mix[k]=right[j]; j++; k++; }
		 
		return mix;
	}

}
