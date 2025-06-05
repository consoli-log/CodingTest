package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 홀짝에 따라 다른 값 반환하기
 * 난이도: 🤍 Level 0
 * 유형: 수학 / 반복문 / 조건 분기 / 누적합
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

public class EvenOddSum {

    public int solution(int n) {
        int sum = 0;

        if (n % 2 == 0) { // 짝수면
            for (int i = 0; i <= n; i++) {
//            for (int i = 2; i <= n; i += 2)
                if (i % 2 == 0) { // 짝수면
                    sum += (i * i);
                }
            }
        } else { // 홀수면
            for (int i = 0; i <= n; i++) {
//            for (int i = 1; i <= n; i += 2) {
                if (i % 2 != 0) { // 홀수면
                    sum += i;
                }
            }
        }

        // for(int i = n; i >= 0; i -= 2)
        //     sum += (n % 2 == 0) ? i * i : i;

        return sum;
    }

    public static void main(String[] args) {
        EvenOddSum eos = new EvenOddSum();

        System.out.println(eos.solution(7));  // 16
        System.out.println(eos.solution(10)); // 220
    }
}

