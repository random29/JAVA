package com.company;

import java.util.Scanner;

public class DocumentUtil {
    static int count = 0;
    String lines[] = new String[6];

    public void showdocument() {
        for (int i = 0; i < lines.length; i++) {
            String lineToOut = lines[i] == null ? "_______" : lines[i];
            System.out.println(i + ": " + lineToOut);
        }
    }

    public void inbegin(String newLine) {

        for (int i = count; i > 0; i--) {
            lines[i] = lines[i - 1];
        }
        lines[0] = newLine;
        count++;
    }

    public void inend(String newLine) {
        if (count == lines.length) {
            System.err.println("Нет места");
            return;
        }
        lines[count] = newLine;
        count++;
    }

    public void deletestring(int newLine) {
        if (newLine == count) {
            lines[newLine] = null;
            count--;
        } else {
            for (int i = newLine; i < count; i++) {
                lines[i] = lines[i + 1];
            }
            lines[count] = null;
            count--;
        }
    }

    public void cleanme(int index) {
        lines[index] = null;
    }

    public void changeme(int index, String newLine) {
        lines[index] = newLine;
    }

    public static void printall(DocumentUtil document[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " :");
            document[i].showdocument();
            System.out.println();
        }
    }
}
