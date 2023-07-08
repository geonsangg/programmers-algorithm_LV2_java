// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/70129

class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int cnt = 0;
        while(!s.equals("1")) {
            String os = "";
            for(int i=0; i<s.length(); i++) {
                if(String.valueOf(s.charAt(i)).equals("0")) {
                    zero++;
                }else {
                    os += 1;
                }
            }
            s = Integer.toBinaryString(os.length());
            cnt++;
        }
        int[] answer = {cnt, zero};
        return answer;
    }
}