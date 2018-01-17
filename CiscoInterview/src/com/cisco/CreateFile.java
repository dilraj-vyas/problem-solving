package com.cisco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		try {
			String readLine = "";
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			while ((readLine = br.readLine()) != null) {
				// createFile(readLine);
				int index = readLine.indexOf('.');
				if (map.get(readLine.substring(index)) == null) {
					List<String> list = new ArrayList<String>();
					list.add(readLine);
					map.put(readLine.substring(index), list);
				} else {
					List<String> list = map.get(readLine.substring(index));
					list.add(readLine);
					map.put(readLine.substring(index), list);
				}
			}
			writeFile( map.get(".c"),"c_"+"hello.c");
			writeFile( map.get(".cpp"),"c_"+"hello.cpp");
			writeFile( map.get(".cs"),"c_"+"hello.cs");
		
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
	
	public static void writeFile(List<String> list, String fileName) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				 bw.write((String) iterator.next());
				 bw.write("\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
}
