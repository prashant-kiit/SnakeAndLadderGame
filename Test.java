package SnakeAndLadderGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int i=0;
        while(i<10) {
            System.out.println("value = " + i);
            i++;
            i=i%10;
            int s;
            s = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }
    }
}
