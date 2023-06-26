// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12939

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sarr = s.split(" ");
        int temp = 0;
        for(int i=0; i<sarr.length-1; i++) {
            for(int j=i+1; j<sarr.length; j++) {
                if(Integer.parseInt(sarr[i]) > Integer.parseInt(sarr[j])) {
                    temp = Integer.parseInt(sarr[i]);
                    sarr[i] = sarr[j];
                    sarr[j] = Integer.toString(temp);
                }
            }
        }
        answer += sarr[0];
        answer += " " + sarr[sarr.length-1];
        return answer;
    }
}