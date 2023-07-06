// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12951#qna

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String ss = s.toLowerCase();
        answer += String.valueOf(ss.charAt(0)).toUpperCase();
        for(int i=1; i<ss.length(); i++) { 
            if(String.valueOf(ss.charAt(i-1)).equals(" ")) {
            answer += String.valueOf(ss.charAt(i)).toUpperCase();
                }else{
                answer += String.valueOf(ss.charAt(i));
            }
        }
        return answer;
    }
}