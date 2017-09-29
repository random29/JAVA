package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[]=new int [n];
        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int chet=0,nechet=0,chetindex=a[0],nechetindex=0,locmax=0,max=1; int temp=1;
        if (a[0]%2==0) chet+=a[0]; else nechet+=a[0];

        for (int i=1;i<n;i++){
        if (a[i]%2==0) {
            chet+=a[i];
        } else if (a[i]%2!=0) {
            nechet += a[i];
        }
        if (i%2==0) chetindex = chetindex + a[i];
        else if (i%2!=0) {
            nechetindex += a[i];
        }
        if (a[i-1]<a[i]) {
            temp++;
             if (temp>max) { max=temp;}
        }
        else temp=1;
            if (a[i-1]<a[i] && a[i]>a[i+1]) {
                locmax++;
            }
        }
        for (int i=0 ;i<n ;i++){
        if (a[i]==0) a[i]=-a[i+1];
        }
        System.out.print(chet + " " + nechet + " " + chetindex+ " " + nechetindex + " " + locmax + " " + max);
        System.out.println();
        for (int i=0;i<n;i++)
        System.out.print(a[i] + " ");
    }
}
