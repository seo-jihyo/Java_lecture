package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>(); //타입 자정 안 함 -> 어떤 타입이든 다 받음
		
		int[] score = {85,98,97,45,56,30,65,65,43};
		for (int i = 0; i < score.length; i++) {
			set.add(score[i]);
			set.add(new Integer(score[i]));
		}
				System.out.println(set);
				System.out.println("50부터 작은 값: " + set.headSet(50));
//				system.out.println("50부터 작은 값: " + set.headSet(new Integer(50));
				System.out.println("50보다 큰 값: " + set.tailSet(50));
		
	}
}
