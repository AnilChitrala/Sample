package AnilAcademy.Education;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] values= {7,2,1,5,6,4,6};
		Collection<? extends Integer> values=(Collection<? extends Integer>) Arrays.asList(7,2,8,9,1,3,4,5,5,8,6,8,2,25);
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.addAll(values);
		
		/*a.add(7);
		a.add(2);
		a.add(8);
		a.add(9);
		a.add(1);
		a.add(3);
		a.add(4);*/
		int d=a.size();
		for(int i=0 ;i<=0;i++)
		{
			for (int c=1;c<d;c++)
			{
				
			int sumvalue= (a.get(0)+a.get(c));
			
			
			System.out.print(sumvalue);
			System.out.print("\t");
			}
		}
		
		
	}
	

}
