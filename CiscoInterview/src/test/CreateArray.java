package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CreateArray {
	public static void main(String[] args) {
		try {
			createArray();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static int[] createArray() throws NumberFormatException, IOException
	{
		
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		int rows=Integer.parseInt(br.readLine());
		int[] resultArray=new int[rows];
		
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i]=Integer.parseInt(br.readLine());
		}
		
//		System.out.println(Arrays.toString(resultArray));
		br.close();
		return resultArray;
		}
	
	}
