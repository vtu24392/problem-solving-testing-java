// COMPARE THE TRIPLETS

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i]=sc.nextInt();
        }
        int c1=0,c2=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    if(a[i]>b[j]){
                        c1++;
                    }
                    if(a[i]<b[j]){
                        c2++;
                    }
                }
            }
        }
        System.out.println(c1+" "+c2);
    }
}
