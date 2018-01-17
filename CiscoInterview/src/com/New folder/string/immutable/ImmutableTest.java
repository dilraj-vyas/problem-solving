package com.cisco.string.immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableTest {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("name", "Dilraj");
		map.put("lastname", "vyas");
		MyImmutable m=new MyImmutable(map);
		System.out.println(m.getMap());
		m.getMap().put("Address", "Udaipur");
		System.out.println(m.getMap());
		map.put("Address", "Udaipur");
		System.out.println(map);
	}
}
