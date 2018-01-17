package com.marbles;

public class Block {
	int blockNo;
	String direction;

	public Block(int blockNo, String direction) {
		this.blockNo = blockNo;
		this.direction = direction;
	}

	public String getDirection() {
		if (blockNo > 10) {
			return direction == "left" ? "left"
					: direction == "down" ? "down"
							: direction == "right" ? "top" : "right";
		} else if (blockNo > 20) {
			return direction == "left" ? "left"
					: direction == "down" ? "right"
							: direction == "right" ? "down" : "top";
		} else if (blockNo > 30) {
			return direction == "left" ? "down"
					: direction == "down" ? "left"
							: direction == "right" ? "right" : "top";
		} else if (blockNo > 40) {
			return direction == "left" ? "top"
					: direction == "down" ? "down"
							: direction == "right" ? "right" : "top";
		} else if (blockNo > 50) {
			return direction == "left" ? "left"
					: direction == "down" ? "down"
							: direction == "right" ? "right" : "top";
		}
		return "";
	}
}
