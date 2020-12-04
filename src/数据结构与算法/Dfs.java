package com.demo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @author baihuanyu bwx966955
 * @date 2020/12/4 18:34
 */
public class Dfs {
    private static int n;
    private static int m;
    private static int sum;
    private static  int[][] data ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         m = sc.nextInt();
         data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        sum = 0;
        dfs(0,0,sum);
        System.out.println(sum);
    }
    public static void dfs( int i , int j ,int currSum){
        if(i<=n-1 && j<= m-1){
            currSum+= data[i][j];
        }else {
            return;
        }
        if(i==n-1 && j==m-1){
            sum = Math.max(sum, currSum);
            return;
        }
        if(j<m-1){
            dfs(i,j+1,currSum);
        }
        if(i<n-1){
            dfs(i+1,j,currSum);
        }

    }
}
