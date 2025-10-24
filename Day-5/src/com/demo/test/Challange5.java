package com.demo.test;

import java.util.Arrays;
public class Challange5 {

	public static void main(String[] args) {
		        int[] num1 = {1, 2, 3, 4};
		        int[] num2 = {5, 6, 7, 8};

		        int[] merge = new int[num1.length + num2.length];

		        int i = 0, j = 0, k = 0; 
		        while (i < num1.length && j < num2.length) {
		            if (num1[i] < num2[j]) {
		                merge[k] = num1[i];
		                i++;
		            } else {
		                merge[k] = num2[j];
		                j++;
		            }
		            k++;
		        }
		        while (i < num1.length) {
		            merge[k] = num1[i];
		            i++;
		            k++;
		        }
		        while (j < num2.length) {
		            merge[k] = num2[j];
		            j++;
		            k++;
		        }
		        System.out.println(" array: " + Arrays.toString(merge));
		    }

	}

