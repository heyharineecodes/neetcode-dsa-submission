class MinStack {
    Stack<Integer> stack;
    Stack<Integer> MinStack;



    public MinStack() {
        stack=new Stack<>();
        MinStack=new Stack<>();

        
    }
    
    public void push(int val) {
        stack.push(val);
        if(MinStack.isEmpty() || val<=MinStack.peek())
        MinStack.push(val);
        
    }
    
    public void pop() {
        int pooped_value=stack.pop();
        if(pooped_value==MinStack.peek())
        MinStack.pop();
        
    }
    
    public int top() {
        return stack.peek();
        
    }
    
    public int getMin() {
        return MinStack.peek();
        
    }
}
