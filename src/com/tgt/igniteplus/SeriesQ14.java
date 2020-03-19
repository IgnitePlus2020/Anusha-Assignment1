package com.tgt.igniteplus;

import java.util.Scanner;

public class SeriesQ14 {
    public static void main(String[] args) {
        int []a=new int[100];
        a[0]=1;
        a[1]=4;
        a[2]=7;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n >3");
        int n=sc.nextInt();
        int i;
        for(i=3;i<n;i++)
            a[i]=a[i-1]+a[i-2]+a[i-3];
        for(i=0;i<=n-1;i++)
            System.out.print(a[i]+" ");

    }
}
