package com.assignment4_3;
import java.util.List;

/**
 * Yonatan: Assignment 4_3
 * 
 * */

public class MyStringList {
	
	private String[] strArray;
	private int size;
	
	
	// Constructor 
	public MyStringList() {
		size = 2;
		strArray = new String[size];
	}
	
	// adds s to the end of the underlying array
	public void add(String s) {
		if (s != null) {
			if (size() < size) {
				strArray[size()] = s;
			} else {
				resize();
				strArray[size()] = s;
			}
		} else {
			System.out.println("Null cannot be added.");
		}
	}	
	
	//	retrieves the String at the ith position in the underlying array		 	
	public String get(int i) {
		return strArray[i];
	}
	
	//-	returns true if String s is found in the array, false otherwise
    public boolean find(String s) {
    	for (int i=0; i<size(); i++) {
    		if (strArray[i] == s) {
    			return true;
    		}
    	}
    	return false;
    }
    
	// - removes first occurrence of  String s if it is found in the underlying array
	// if found, returns true; if not found returns false
	public boolean remove(String s)	{
		if (find(s)) {
			for (int i=0; i<size(); i++) {
				if (strArray[i] == s) {
					strArray[i] = null;
					String[] strBuf = new String[size];
					System.arraycopy(strArray, 0, strBuf, 0, size);
					//size *= 2;
					strArray = new String[size];
					for (int j=0, k=0; k<strBuf.length; k++) {
						if (strBuf[k] != null) {
							strArray[j] = strBuf[k];
							j++;
						}
					}
					return true;
				}
			}			
		}
		return false;
	}
	
	//	- returns a String representation of the underlyin g array 
	//	here is a typical output:
	//	[Bob, Steve, Susan, Mark, Dave]
	public String toString() {
		int len = size();
		String outStr = "[";
		if (len == 0) {
			outStr = outStr.concat("]");
			return outStr;
		} else {
			for (int i=0; i<len; i++) {
				if (i==len-1) {
					outStr = outStr + strArray[i]+ "]";
				} else {
					outStr = outStr + strArray[i]+ ", ";
				}
			}
			return outStr;
		}
	}
	
	// - returns the next open position in the underlying array 
	// – this is precisely the number of Strings that have been
	// added minus the number of String that have been removed.
	public int size() {
		int len = 0;
		for (int i=0; i<strArray.length; i++) {
			if (strArray[i] != null) {
				len++;
			}
		}
		return len;
	}
	
	// resizing the array when it is full and need to add items
	private void resize() {
		System.out.println("Resizing...");
		int maxSize = size();
		if (maxSize == size) {
			String[] strBuffer = new String[size];
			System.arraycopy(strArray, 0, strBuffer, 0, size);
			//size *= 2;
			strArray = new String[2*size];
			System.arraycopy(strBuffer, 0, strArray, 0, size);
			size *= 2;
		}
	}
}
