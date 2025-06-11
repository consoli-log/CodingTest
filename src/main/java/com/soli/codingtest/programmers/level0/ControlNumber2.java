package com.soli.codingtest.programmers.level0;

/**
 * 프로그래머스 - 수 조작하기 2
 * 난이도: 🤍 Level 0
 * 유형: 배열 순회 / 값 차이 계산 / 문자열 조합
 * 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181925
 */

public class ControlNumber2 {

    public String solution(int[] numLog) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < numLog.length - 1; i++) {
            int diffrence = numLog[i + 1] - numLog[i];

            if (diffrence == 1) {
                sb.append("w");
            } else if (diffrence == -1) {
                sb.append("s");
            } else if (diffrence == 10) {
                sb.append("d");
            } else if (diffrence == -10) {
                sb.append("a");
            }
        }

//        for(int i = 1; i < numLog.length; i++){
//            int j = numLog[i - 1] - numLog[i];
//            switch(j){
//                case -1 : answer+='w'; break;
//                case 1 : answer+='s'; break;
//                case -10 : answer+='d'; break;
//                case 10 : answer+='a'; break;
//            }
//        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ControlNumber2 cn = new ControlNumber2();

        System.out.println(cn.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1})); // wsdawsdassw
    }
}

