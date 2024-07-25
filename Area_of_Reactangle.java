import java.util.Scanner;
public class Area_of_Reactangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int l= sc.nextInt();
        System.out.println("enter breadth");
        int b= sc.nextInt();
        int area =reactanglearea(l,b);
        System.out.println(area);
    }

    private static int reactanglearea(int l, int b) {
        return(l*b);

    }
}