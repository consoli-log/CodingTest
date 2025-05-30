package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 홀짝 구분하기
 * 난이도: 🤍 Level 0
 * 유형: 정수의 홀짝 판단 / 조건문 / 출력
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
            // System.out.printf("%d is even", n);
        } else {
            System.out.println(n + " is odd");
            // System.out.printf("%d is odd", n);
        }

        // System.out.print(n + " is " + (n % 2 == 0 ? "even" : "odd"));
    }
}

