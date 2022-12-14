package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        //
        Queue<Pair> q = new LinkedList<>();
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            q.add(new Pair(i, priorities[i]));
        }
        while (!q.isEmpty()) {
            int current = q.peek().value;
            boolean flag = false;
            for (Pair x : q) {
                if (x.value > current) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                Pair temp = q.poll();
                q.add(temp);
            }else {
                answer++;
                Pair pair = q.poll();
                if (pair.index == location) {
                    return answer;
                }
            }
        }
        return answer;
    }

    class Pair {
        int index;
        int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

    }
}



