package Day2.BitManipulations;

import java.util.Scanner;

public class GetSetClear {
    static boolean GetBit(int n, int i){
        return ((n&(1<<i))!=0);
    }
    static int SetBit(int n, int i){
        return (n|(1<<i));
        
    }
    static int ClearBit(int n, int i){
        return (n&(~(1<<i)));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n= sc.nextInt();
        System.out.println("Enter the ith position: ");
        int i = sc.nextInt();
        System.out.println(GetBit(n, i) ? "1" : "0");
        System.out.println(SetBit(n, i));
        System.out.println(ClearBit(n, i));

    }
}
