package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends you have");
        int numOfFriends = input.nextInt();

        String [] friendsList = new String[numOfFriends];


        for (int i = 0; i < numOfFriends; i++) {
            System.out.println("Enter your friend name");
            String name = input.next();
            friendsList[i] = name;

        }
        System.out.println(Arrays.toString(friendsList));






    }
}
