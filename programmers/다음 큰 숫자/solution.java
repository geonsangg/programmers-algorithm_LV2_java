// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12911

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i=0; i<str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals("1")){
                cnt++;
            }
        }
        while(true) {
            n++;
            int ncnt = 0;
            String nss = Integer.toBinaryString(n);
            for(int i=0; i<nss.length(); i++) {
                if(String.valueOf(nss.charAt(i)).equals("1")){
                    ncnt++;
                }
            }
            if(cnt == ncnt) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}