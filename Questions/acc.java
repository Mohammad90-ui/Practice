import java.util.*;

public class acc {
    public static void main(String[] args) {
        // write a program to find acceleration using distance and time

        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int time = sc.nextInt();
        int acc = ((2*distance)/(time*time));
        System.out.println(acc);
    }
}
