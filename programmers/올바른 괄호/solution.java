// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12909

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int lcnt = 0;
        int rcnt = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                lcnt++;
            } else {
                rcnt++;
            }
            if(lcnt < rcnt) {
                answer = false;
                break;
            }
        }
        if(lcnt > rcnt) {
            answer = false;
        }
        return answer;
    }
}