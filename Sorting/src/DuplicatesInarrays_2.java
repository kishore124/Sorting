
import java.util.*;
public class DuplicatesInarrays_2 {

	public static void main(String[] args) {

int[]arr= {4,3,2,7,8,2,3,1};
List<Integer> l=sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(l);

	}

	 static List<Integer> sort(int []arr)
	 {
		 int i=0;
		 List<Integer> l1 = new ArrayList<Integer>();
		 
		 while(i<arr.length) {
			 int correct=arr[i]-1;
			 if(arr[i]!=arr[correct])
			 {
				 int temp=arr[correct];
	    			arr[correct]=arr[i];
	    			arr[i]=temp;
			 }
			 else
				 i++;
		 }
		 for(int j=0;j<arr.length;j++)
		 {
			 if(arr[j]!=j+1)
			 {
				 l1.add(arr[j]);
			 }
		 }
		 return l1;
	 }
}
