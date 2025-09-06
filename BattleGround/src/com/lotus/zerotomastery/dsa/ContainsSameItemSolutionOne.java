package com.lotus.zerotomastery.dsa;

public class ContainsSameItemSolutionOne {

	public static void main(String[] args) {
		char array1[] = {'a','b','c','x'};
		char array2[] = {'z','y','i'};
		ContainsSameItemSolutionOne contains = new ContainsSameItemSolutionOne();
		boolean hasPair = contains.compareArrays(array1, array2);
		
		if(hasPair) {
			System.out.println(" Two arrays have same item");
		} else {
			System.out.println(" Two arrays do not have common item");
		}
	}
	
	public boolean compareArrays(char arr[], char arr2[]) {
		boolean hasPair = false;
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j< arr2.length; j++) {
				if ( arr[i] == arr2[j]) {
					hasPair = true;
					break;
				}
			}
		}
	return hasPair;
	}

}
