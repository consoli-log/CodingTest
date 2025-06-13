package com.soli.codingtest.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 - 배열 만들기 2
 * 난이도: 🤍 Level 0
 * 유형: 완전 탐색 / 조건 검사 / 나머지 연산
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181921
 */

public class BuildArray2 {

    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        int binaryStart = Integer.parseInt(Integer.toBinaryString(l / 5),2);
        int binaryEnd = Integer.parseInt(Integer.toBinaryString(r / 5),2);

        for (int i = binaryStart; i <= binaryEnd; i++) {
            int binary = Integer.parseInt(Integer.toBinaryString(i),2) * 5;

            if (Integer.toString(binary).matches("[05]+")) {
                answer.add(binary);
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i -> i).toArray();

//        for (int i = 1; i < 64; i++) {
//            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
//            if (l <= num && num <= r)
//                answer.add(num);
//        }
//
//        return answer.isEmpty() ? new int[] { -1 } : answer.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {
        BuildArray2 ba = new BuildArray2();

        System.out.println(Arrays.toString(ba.solution(5, 555))); // [5, 50, 55, 500, 505, 550, 555]
        System.out.println(Arrays.toString(ba.solution(10, 20))); // [-1]
    }
}

