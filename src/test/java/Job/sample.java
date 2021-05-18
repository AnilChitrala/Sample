package Job;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;
@Test
public class sample {
	
	

	public static void main(String[] args) throws Exception {
		
		try {
			dataDriven d=new dataDriven();
			ArrayList<String> data = d.getData("EmailID");
			for (int i = 0; i <data.size(); i++) {
				System.out.println(i);
			System.out.println(data.get(i));
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
	}

}
