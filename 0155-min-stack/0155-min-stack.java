import java.util.*;

class MinStack {

    private List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        int minVal = st.isEmpty() 
            ? val 
            : Math.min(val, st.get(st.size() - 1)[1]);

        st.add(new int[]{val, minVal});
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            st.remove(st.size() - 1);
        }
    }
    
    public int top() {
        if (st.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return st.get(st.size() - 1)[0];
    }
    
    public int getMin() {
        if (st.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return st.get(st.size() - 1)[1];
    }
}