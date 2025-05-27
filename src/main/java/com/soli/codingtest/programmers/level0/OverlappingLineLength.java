package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 겹치는 선분의 길이
 * 난이도: 🤍 Level 0
 * 유형: 구현
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/120876
 */

public class OverlappingLineLength {

    public int solution(int[][] lines) {
        int[] points = new int[201];

        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];

            for(int i = start; i < end; i++){
                points[100 + i]++;
            }
        }

        int anwser = 0;

        for (int count : points) {
            if (count >= 2) anwser++;
        }

        return anwser;
    }

    public static void main(String[] args) {
        OverlappingLineLength oll = new OverlappingLineLength();
        int[][] input1 = {{0, 1}, {2, 5}, {3, 9}};
        int[][] input2 = {{-1, 1}, {1, 3}, {3, 9}};
        int[][] input3 = {{0, 5}, {3, 9}, {1, 10}};

        System.out.println("result 1: " + oll.solution(input1)); // 2
        System.out.println("result 2: " + oll.solution(input2)); // 0
        System.out.println("result 2: " + oll.solution(input3)); // 8
    }

}
