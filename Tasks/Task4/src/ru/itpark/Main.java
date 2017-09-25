package ru.itpark;
import java.util.Scanner;

public class Main {
    public static void swap(int c,int d) {
        int temp=c;
        c=d;
        d=temp;
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i] = scanner.nextInt();
        }
        /*for (int i=0;i<n/2;i++){
           int temp=a[i];
           a[i]=a[n-1-i];
           a[n-1-i]=temp;
//          swap(a[i],a[n-1-i]);
        }
        */


        int min=a[0],max=a[0],maxIndex=0,minIndex=0;
        for (int i=0;i<n;i++){
            if (max<a[i]){ max=a[i]; maxIndex=i;}
            if (min>a[i]){ min=a[i]; minIndex=i;}
        }
        /*int temp=a[minIndex];
        a[minIndex]=a[maxIndex];
        a[maxIndex]=temp;*/
        swap(a[minIndex],a[maxIndex]);
        for (int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }

}