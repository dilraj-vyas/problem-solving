package com.marbles;

public class MarbelProblem {
	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 31, 0, 0 }, { 51, 31, 0, 0, 0 },
				{ 0, 0, 21, 0, 0 }, { 0, 11, 0, 0, 32 } };
		int i = 0;
		int j = 0;
		String direction = "";
		while (true) {
			switch (direction) {
			case "top":
				if (i > 0) {
					if (arr[i][j] != 0) {
						Block b = new Block(arr[i][j], "top");
						if (b.getDirection() == "top")
							i--;
						else if (b.getDirection() == "down")
							i++;
						if (b.getDirection() == "left")
							i--;
					} else
						i--;
				} else {
					if (arr[i][j] != 0) {

					} else {
						i = 3;
					}
				}

				break;
			case "left":

				break;
			case "right":
				if (j > 0) {
					if (arr[i][j] != 0) {
						Block b = new Block(arr[i][j], "top");
						if (b.getDirection() == "top")
							i--;
						else if (b.getDirection() == "down")
							i++;
						if (b.getDirection() == "left")
							i--;
					} else
						i--;
				} else {
					if (arr[i][j] != 0) {

					} else {
						i = 3;
					}
				}

				break;
			case "down":

				break;
			}
		}
	}
}
