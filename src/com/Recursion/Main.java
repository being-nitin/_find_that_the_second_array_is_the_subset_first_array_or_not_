package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	  Given two arrays: arr1[0..m-1] of size m and arr2[0..n-1] of size n. Task is to
	  check whether arr2[] is a subset of arr1[] or not. Both the arrays can be both unsorted
	  or sorted. It may be assumed that elements in both array are distinct.

      Input Format
      The first line of input contains an integer T denoting the number of test cases. Then T
      test cases follow. Each test case contains an two integers m and n denoting the size of
      arr1 and arr2 respectively. The following two lines contains the space separated elements
      of arr1 and arr2 respectively.

      Constraints

      1 <= T <= 100 1 <= m,n <= 10^5 1 <= arr1[i], arr2[j] <= 10^5
      Output Format

      Print "Yes"(without quotes) if arr2 is subset of arr1. Print "No"(without quotes) if arr2
      is not subset of arr1.
      Sample Input 0
      3
      6 4
      11 1 13 21 3 7
      11 3 7 1
      6 3
      1 2 3 4 5 6
      1 2 4
      5 3
      10 5 2 23 19
      19 5 3
      Sample Output 0
      Yes
      Yes
      No
      Explanation 0
      (11, 3, 7, 1) is a subset of first array
	 */
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        boolean b1 = subset(arr1,arr2);
        System.out.println(b1);
    }
    }
    public static boolean subset(int[] arr1,int[] arr2){
        int count = 0;
        int m = arr1.length;
        int n = arr2.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                }
            }
            if(count==n){
                return true;
            }
        }
        return false;
    }
}
//The first loop will run till the length of second array.Because the sub array should be exactly
// the length of the smallest array/


