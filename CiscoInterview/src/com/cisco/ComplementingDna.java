package com.cisco;

public class ComplementingDna {
	public static void main(String[] args) {
		System.out.println(complements("ACCGGGTTTT"));
		;
	}

	public static String complements(String str) {
		String resultString = "";
		System.out.println(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			char finalCharacter = (str.charAt(i) == 'A' || str.charAt(i) == 'a') ? 'T'
					: (str.charAt(i) == 'T' || str.charAt(i) == 't') ? 'A'
							: (str.charAt(i) == 'C' || str.charAt(i) == 'c') ? 'G'
									: (str.charAt(i) == 'G' || str.charAt(i) == 'g') ? 'C'
											: str.charAt(i);
			resultString += finalCharacter;
		}

		return resultString;
	}
}
