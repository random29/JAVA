package ru.itpark;

import java.util.Scanner;

public class DocumentUtil {
    static int count =0;
    public static void showdocument(String document[]){
        for (int i = 0; i < document.length; i++) {
            String lineToOut = document[i] == null ? "_______" : document[i];
            System.out.println(i + ": " + lineToOut);
        }
    }
    public static void inbegin(String document[],String newLine){

        for (int i = count; i > 0; i--) {
            document[i] = document[i - 1];
        }
        document[0] = newLine;
        count++;
    }
    public static void inend(String document[],String newLine){
        document[count] = newLine;
        count++;
    }
    public static void deletestring(String document[],int newLine){
        if (newLine == count) {
            document[newLine]=null;
            count--;
        }
        else
        {
            for (int i=newLine; i<count ; i++) {
                document[i]=document[i+1];
            }
            document[count]=null;
            count--;
        }
    }
    public static void cleanme(String document[],int index){
        document[index]=null;
    }

    public static void changeme(String document[],int index,String newLine){
        document[index]=newLine;
    }
}
