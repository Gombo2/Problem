import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);  // idx 1의 문자가 같은 문자열일 경우 정렬
        String[] answer = new String[strings.length]; 
        
        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(n, n+1); //substring 이용하여 idx answer[] 입력
        }
        Arrays.sort(answer); //idx 정렬
        
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j).substring(n, n+1).equals(answer[i])) {
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        
        return answer;
    }
}
