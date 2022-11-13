import java.util.Arrays;
import java.util.LinkedList;
public class CyclicSortPraQues {

	public static void main(String[] args) {
		
int []nums= {1,5,6,2,7,2,3,2};
LinkedList<Integer> k=missingNumber(nums);
System.out.println(k);
	}
	static  LinkedList<Integer> missingNumber(int[] nums)
    {
        int i=0;
        LinkedList<Integer>l1=new LinkedList<>();
        while(i<nums.length)
        {
        	int correct=nums[i]-1;
             if(nums[i]!=nums[correct])
            {
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++)
        {
        	if(nums[j]!=j+1)
        	{
        		l1.add(j+1);
        	
        	}
        }
        return l1;
    }

}
