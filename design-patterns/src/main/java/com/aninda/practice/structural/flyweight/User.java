package com.aninda.practice.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class User {
	public static ArrayList<String> strings = new ArrayList<>();
	private int[] names;
	public User(String fullName) {
		Function<String, Integer> getOrAdd = (String s) -> {
		      int idx = strings.indexOf(s);
		      if (idx != -1) return idx;
		      else {
		        strings.add(s);
		        return strings.size() - 1;
		      }
		    };

		 names = Arrays.stream(fullName.split(" "))
		      .mapToInt(s -> getOrAdd.apply(s)).toArray();
	}
	
	public String getFullName() {
		return Arrays.stream(names).mapToObj(i -> strings.get(i))
			      .collect(Collectors.joining(","));
	}
}
