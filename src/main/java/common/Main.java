package common;

import programmers.Printer;

public class Main {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(new Printer().solution(priorities,location));
    }
}