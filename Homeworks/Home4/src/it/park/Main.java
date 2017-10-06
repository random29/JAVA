package it.park;

public class Main {

    public static int parse(char a[]) {
        int x=0;
        int temp1=a.length-1;
        for (int i=0;i<a.length;i++){
           int temp=a[i];
           temp-=48;
          
           int temp2=temp1;
           while (temp2>0){
               temp*=10;
               temp2--;
           }

           x+=temp;
           temp1--;
        }
        return x;
    }
    public static void main(String[] args) {
        char number[] = {'3', '2', '4', '1'};
        int numberAsInt = parse(number);
        System.out.print(numberAsInt);
    }
}
