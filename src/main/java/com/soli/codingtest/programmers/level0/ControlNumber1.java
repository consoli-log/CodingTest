package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 수 조작하기 1
 * 난이도: 🤍 Level 0
 * 유형: 문자열 순회 / 조건 분기 / 상태 변화
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181926
 */

public class ControlNumber1 {

    public int solution(int n, String control) {

        for (int i = 0; i < control.length(); i++) {

            if (control.charAt(i) == 'w') {
                n++;
            } else if (control.charAt(i) == 's') {
                n--;
            } else if (control.charAt(i) == 'd') {
                n += 10;
            } else if (control.charAt(i) == 'a') {
                n -= 10;
            }

        }

//        for(char c : control.toCharArray()){
//            n += c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10 : -10;
//        }

//        for(char ch : control.toCharArray()) {
//            switch(ch) {
//                case 'w': n += 1; break;
//                case 's': n -= 1; break;
//                case 'd': n += 10; break;
//                case 'a': n -= 10; break;
//                default:break;
//            }
//        }

        return n;
    }

    public static void main(String[] args) {
        ControlNumber1 cn = new ControlNumber1();

        System.out.println(cn.solution(0, "wsdawsdassw")); // -1
    }
}

