package ex04.set;
import java.util.*;

class TreeSetEx2{
	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //자동 정렬
		int[] score = {85, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
			set.add(new Integer(score[i]));

		System.out.println("50보다 작은 값 :" + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 :" + set.tailSet(new Integer(50)));
	}
}