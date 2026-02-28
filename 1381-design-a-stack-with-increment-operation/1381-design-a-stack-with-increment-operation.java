import java.util.ArrayList;

class CustomStack {
    private ArrayList<Integer> stack;
    private int[] inc;
    private int maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new ArrayList<>();
        this.inc = new int[maxSize];
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.add(x);
            inc[stack.size() - 1] = 0; // reset increment slot
        }
    }

    public int pop() {
        if (stack.isEmpty()) return -1;

        int idx = stack.size() - 1;
        int res = stack.get(idx) + inc[idx];

        // propagate increment to next element below
        if (idx > 0) {
            inc[idx - 1] += inc[idx];
        }

        inc[idx] = 0;   // IMPORTANT: clear increment before removing
        stack.remove(idx);

        return res;
    }

    public void increment(int k, int val) {
        if (!stack.isEmpty()) {
            int idx = Math.min(k, stack.size()) - 1;
            inc[idx] += val;
        }
    }
}