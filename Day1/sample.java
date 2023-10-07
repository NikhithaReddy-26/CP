import java.util.Scanner;

public class sample{
    public static void main(String args[]){
        System.out.println("Hello \nNithi");
        System.out.println(56/8);
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            int result;
            result = n1 * i;
            System.out.println(n1 + "*" + i + "=" + result) ;
        }
        // System.out.println(n1+n2);
    }   
}