package recursion;

import java.util.ArrayList;

public class RepalceChar {

//	This is the first method to remove a char from string.
//	This method only for practice.
	@SuppressWarnings("unused")
	private String replaceChar(String unString, String pString, int index) {
		if (index == unString.length()) {
			return pString;
		}
		if (unString.charAt(index) != 'a') {
			pString += unString.charAt(index);
		}
		return replaceChar(unString, pString, index + 1);
	}

	// This is the second method to remove a char from string.
	// This method only for practice.

	@SuppressWarnings("unused")
	private void replaceChar(String pString, String unsString) {
		if (unsString.isEmpty()) {
			System.out.println(pString);
			return;
		}
		char ch = unsString.charAt(0);
		if (ch == 'a') {
			replaceChar(pString, unsString.substring(1));
		} else {
			replaceChar(pString + ch, unsString.substring(1));
		}
	}

	/*
	 * In this method str is the variable for get the string which is given by user
	 * ch is the variable which hold a character which is remove from the give
	 * string. the helper method is private because the user dos't access to use
	 * this method from outside of class.
	 */

	public String replaceCharFromString(String str, char ch) {
		return helperReplaceCharFromString("", str, ch);
	}

	private String helperReplaceCharFromString(String pString, String unString, char rString) {
		if (unString.isEmpty()) {
			return pString;
		}
		char ch = unString.charAt(0);
		if (ch == rString) {
			return helperReplaceCharFromString(pString, unString.substring(1), rString);
		} else {
			return helperReplaceCharFromString(pString + ch, unString.substring(1), rString);
		}
	}

	@SuppressWarnings("unused")
	private void subString(String pString, String unsString) {
		if (unsString.isEmpty()) {
			System.out.println(pString);
			return;
		}
		char ch = unsString.charAt(0);
		subString(pString + ch, unsString.substring(1));
		subString(pString, unsString.substring(1));
	}

	@SuppressWarnings("unused")
	private ArrayList<String> subStringInArr(String pString, String unsString) {
		if (unsString.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(pString);
			return list;
		}
		char ch = unsString.charAt(0);
		ArrayList<String> leftArrayList = subStringInArr(pString + ch, unsString.substring(1));
		ArrayList<String> rigthArrayList = subStringInArr(pString, unsString.substring(1));
		leftArrayList.addAll(rigthArrayList);
		return leftArrayList;
	}

//	This method is use to remove duplicate character from a given string
//	it remove first duplicate character from a given string.
	@SuppressWarnings("unused")
	private String replaceDuplicateString(String pString, String unPString) {
		if (unPString.isEmpty()) {
			System.out.println(pString);
			return pString;
		}
		String ch = "" + unPString.charAt(0);
		if (unPString.substring(1).contains(ch)) {
			return replaceDuplicateString(pString, unPString.substring(1));
		} else {
			return replaceDuplicateString(pString + ch, unPString.substring(1));
		}
	}

}
