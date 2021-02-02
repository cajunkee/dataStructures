package com.company;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	int [] numbers = new int[6];
		numbers[0]=1;
		numbers[1]=5;
		numbers[2]=6;
		numbers[3]=5;
		numbers[4]=4;
		numbers[5]=1;

		Arrays.sort(numbers);
        out.println(Arrays.toString(numbers));

	int[] array = {1, 5, 6, 5, 4, 1};
	int sum = 0;

	for ( int num : array){
		sum = sum+num;
	}
		out.println("Sum of array elements is:" +sum);


		double[ ] exampleArray = {1,5,6,5,4,1};

		double maximum = exampleArray[0];

		int index = 0;

		for (int i = 1; i<exampleArray.length; i++){

			if (exampleArray[ i ] > maximum) {

				maximum = exampleArray[ i ];

				index = i;

			}

		}

		out.println(index);

//		int base=4;
//		int exp=2;
//
//		out.println(toPower(base, exp));
    }
//    public static int[] toPower(int size, int power){
//
//		return new int[0];
//		System.out.println(Arrays.toString(toPower(4, 2)));
	}


