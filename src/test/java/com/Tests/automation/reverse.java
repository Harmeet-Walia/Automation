package com.Tests.automation;

public class reverse {

	public static void main(String[] args) {
		reverse r=new reverse();
		r.reverseString("Missippi");

	}
	
	public void reverseString(String str) {
		String output="";
		for (int i=0; i<str.length(); i++){
			output=str.charAt(i)+output;
			}
			System.out.println(output);
			}

	}


