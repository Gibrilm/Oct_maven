package com.MavenProj;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Maven_Repet_pgm {
public static void main(String[] args) {
		String s = "for the people by the people of the people";
		String[] split = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String str : split) {
			System.out.println(str);
			if (map.containsKey(str)) {
				Integer i = map.get(str);
				map.put(str, i + 1);
			} else {
				map.put(str, 1);
			}
		}
			System.out.println(map);
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(entry);
				}
			}
		}
}

