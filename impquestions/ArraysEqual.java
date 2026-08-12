package impquestions;
//assignment 65
public class ArraysEqual {

	public static void main(String[] args) {
		
		
		int[] array1= {1,2,3,5};
		int[] array2= {1,2,3,4,7};
		
		if(array1.length!=array2.length)
			System.out.println("Arrrays are not equal");
		
		else
			
		{
			boolean c=true;
			for(int i=0;i<array1.length;i++)
			{
				if(array1[i]!=array2[i])
				{
					c=false;
					break;
				}
			}
			
			if(c)
			{
				System.out.println("arrays are equal");
			}
			else
				System.out.println("Arrays are not equal");
		}
		
		
	}
}
