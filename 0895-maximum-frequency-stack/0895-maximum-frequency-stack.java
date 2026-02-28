import java.util.*;

class FreqStack {

    class Element {
        int value;
        int insertionTime;
        int freq;

        Element(int val, int ist, int f) {
            value = val;
            insertionTime = ist;
            freq = f;
        }
    }

    int time = 0;
    Map<Integer, Integer> mp = new HashMap<>();

    Comparator<Element> cmp = (a, b) -> {
        if (a.freq == b.freq)
            return b.insertionTime - a.insertionTime;
        return b.freq - a.freq;
    };

    PriorityQueue<Element> pq = new PriorityQueue<>(cmp);

    public FreqStack() {}

    public void push(int val) {
        int newFreq = mp.getOrDefault(val, 0) + 1;
        mp.put(val, newFreq);
        pq.offer(new Element(val, time++, newFreq));
    }

    public int pop() {
        while (true) {
            Element top = pq.poll();

            int currentFreq = mp.get(top.value);

            // skip stale entries
            if (top.freq == currentFreq) {
                if (currentFreq == 1)
                    mp.remove(top.value);
                else
                    mp.put(top.value, currentFreq - 1);

                return top.value;
            }
        }
    }
}