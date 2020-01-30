package software_engineering2;

public class Insertion_sort {
	
	static void sort(int arr[])
	{
		int s=arr.length;
		for(int i=1;i<s;i++)
		{
			int key=arr[i];
			int j=i-1;
	
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j-=1;
			}
		
			
			arr[j+1]=key;
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
	int arr[]= {1,59,3,7,5,9,8,33,22};
	sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
		
		

	}

}
