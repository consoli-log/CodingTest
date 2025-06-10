package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 이어 붙인 수
 * 난이도: 🤍 Level 0
 * 유형: 문자열 처리 / 숫자 이어붙이기 / 조건 분기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181928
 */

public class ConcatenatedSum {

    public int solution(int[] num_list) {
        String even = "";
        String odd = "";

        for (int i = 0; i < num_list.length; i++) {
//      for(int num : num_list) {

            if (num_list[i] % 2 == 0) {
                even += num_list[i] + "";
            } else {
                odd += num_list[i] + "";
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);

//        int even = 0;
//        int odd = 0;
//
//        for(int num : num_list) {
//            if(num % 2 == 0) {
//                even *= 10;
//                even += num;
//            } else {
//                odd *= 10;
//                odd += num;
//            }
//        }
//
//        return even + odd;

//        StringBuilder a = new StringBuilder();
//        StringBuilder b = new StringBuilder();
//
//        for (int num : num_list) {
//            (num % 2 == 0 ? a : b).append(num);
//        }
//
//        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());

    }

    public static void main(String[] args) {
        ConcatenatedSum cs = new ConcatenatedSum();

        System.out.println(cs.solution(new int[]{3, 4, 5, 2, 1})); // 393
        System.out.println(cs.solution(new int[]{5, 7, 8, 3})); // 581
    }
}

