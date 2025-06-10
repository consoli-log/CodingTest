package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 주사위 게임 2
 * 난이도: 🤍 Level 0
 * 유형: 조건문 / 수학 연산 / 케이스 분기
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181930
 */
public class DiceGame2 {

    public int solution(int a, int b, int c) {

        if (a != b && a != c && b != c) {
            return a + b + c;
        } else if (a == b && a == c && b == c) {
            return (a + b + c)
                    * ((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2))
                    * ((int)Math.pow(a,3) + (int)Math.pow(b,3) + (int)Math.pow(c,3));
        } else {
            return (a + b + c)
                    * ((int)Math.pow(a,2) + (int)Math.pow(b,2) + (int)Math.pow(c,2));
        }

//        Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());
//
//        return (a + b + c) *
//                (numbers.size() < 3 ? a * a + b * b + c * c : 1) *
//                (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1);
    }

    public static void main(String[] args) {
        DiceGame2 dg = new DiceGame2();

        System.out.println(dg.solution(2, 6, 1)); // 9
        System.out.println(dg.solution(5, 3, 3)); // 473
        System.out.println(dg.solution(4, 4, 4)); // 110592
    }
}

