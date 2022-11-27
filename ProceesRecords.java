package com.src.main;

import java.util.ArrayList;
import java.util.List;

public class ProceesRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProceesRecords proceesReocrds = new ProceesRecords();
		List<String> returnList = proceesReocrds.loadToList();
		List<String> addList = new ArrayList<String>();
		
		for(String eachString : returnList) {				
			addList.add(eachString);
			if(addList.size() == 2) {
				System.out.print("All paired records"+addList+"\n");
				addList.clear();
			}
			
		}
				
	}
	
	public List<String> loadToList(){
		List<String> returnList = new ArrayList<String>();
		returnList.add("!a1");returnList.add("!a2");
		returnList.add("!a3");returnList.add("!a4");
		returnList.add("!a5");returnList.add("!a6");
		returnList.add("!a7");returnList.add("!a8");
		returnList.add("!a9");returnList.add("!a10");
		returnList.add("!a11");returnList.add("!a12");
		returnList.add("!a13");returnList.add("!a14");
		returnList.add("!a15");returnList.add("!a16");
		returnList.add("!a17");
		return returnList;
	}
	
}
