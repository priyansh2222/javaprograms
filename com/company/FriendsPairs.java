package com.company;

public class FriendsPairs {
    static int friendspairs(int n) {
        if (n == 0 || n == 1 || n == 2)
            return n;
            return friendspairs(n - 1) + friendspairs(n - 2) * (n - 1);
        }

    public static void main(String[] args) {
        System.out.println("pairs "+friendspairs(4));
    }
}

