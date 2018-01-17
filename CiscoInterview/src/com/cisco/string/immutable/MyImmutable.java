package com.cisco.string.immutable;

import java.util.HashMap;
import java.util.Map;

public final class MyImmutable {
	private Map<String, String> map;

	public MyImmutable(Map<String, String> map) {
		this.map = new HashMap<String, String>(map);
	}

	public Map<String, String> getMap() {
		return new HashMap<String, String>(map);
	}

}
