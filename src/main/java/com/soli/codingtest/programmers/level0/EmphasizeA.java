package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - A 강조하기
 * 난이도: 🤍 Level 0
 * 유형: 문자열
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181874
 */

public class EmphasizeA {

    public String solution(String myString) {
        char[] str = myString.toCharArray();

        for (int i = 0; i < myString.length(); i++) {
            // a나 A인 경우는 대문자로
            if (myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                str[i] = myString.toUpperCase().charAt(i);
            } else {
                str[i] = myString.toLowerCase().charAt(i);
            }
        }

        String answer = new String(str);

        return answer;
    }

    public static void main(String[] args) {
        EmphasizeA ea = new EmphasizeA();

        System.out.println(ea.solution("abstract algebra")); // AbstrAct AlgebrA
        System.out.println(ea.solution("PrOgRaMmErS")); // progrAmmers
    }
}
