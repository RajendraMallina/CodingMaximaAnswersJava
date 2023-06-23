package c05_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Collection :- collections of objects.
 * 
 * @author Rajendra Mallina
 *
 */
public class ArrayListIntro {

	public static void main(String[] args) {
		
		/*
		 *  int arr[] = new int[10];  //dynamic size allocation not allowed in arraysl
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		
		//int arr[] = new int[10]
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		
		for(int i = 0 ; i < 10; i++) {
			list.add(i);
			//list.add(sc.nextInt());
		}
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		list.remove(3);
		
		System.out.println();
		for(int i = 0 ; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		
		/*
		 * add element into array & arraylist
		 * a[i] = number
		 * list.add(number);
		 * 
		 * to get element from array & arraylist
		 * a[i]
		 * list.get(i);
		 * 
		 * delete element from arraylist
		 * list.remove(i)
		 * 
		 * get size of array & arraylist
		 * arr.length
		 * list.size()
		 * 
		 * 
		 */
	}
}
