import java.util.*;

class DinnerPlates {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    List<Stack<Integer>> list = new ArrayList<>();
    int capacity;

    public DinnerPlates(int capacity) {
        this.capacity = capacity;
    }

    public void push(int val) {

        // remove invalid indices from heap
        while (!pq.isEmpty()) {
            int idx = pq.peek();
            if (idx >= list.size() || list.get(idx).size() == capacity) {
                pq.poll();
            } else break;
        }

        if (!pq.isEmpty()) {
            int index = pq.peek();
            Stack<Integer> stack = list.get(index);
            stack.push(val);

            if (stack.size() == capacity) {
                pq.poll();
            }
        } else {
            Stack<Integer> stack = new Stack<>();
            stack.push(val);
            list.add(stack);

            if (capacity > 1) {
                pq.offer(list.size() - 1);
            }
        }
    }

    void removeFromListAndHeap() {
        while (!list.isEmpty() && list.get(list.size() - 1).isEmpty()) {
            int lastIndex = list.size() - 1;
            list.remove(lastIndex);
        }
    }

    int removeValFromStack(int index) {
        if (index < 0 || index >= list.size()) return -1;

        Stack<Integer> stack = list.get(index);
        if (stack.isEmpty()) return -1;

        int val = stack.pop();

        if (stack.size() == capacity - 1) {
            pq.offer(index);
        }

        removeFromListAndHeap();
        return val;
    }

    public int pop() {
        return removeValFromStack(list.size() - 1);
    }

    public int popAtStack(int index) {
        return removeValFromStack(index);
    }
}