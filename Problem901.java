/*
Problem 901: Online Stock Span

Approach:
1. Use a stack to store pairs of price and span
2. Initialize the span of the current price to 1
3. Pop elements while the top price is less than or equal to the current price and add their spans to the current span
4. Push the current price and its calculated span onto the stack
5. Return the calculated span

Time Complexity: O(1) amortized per call to next()
Space Complexity: O(n)
*/

class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class StockSpanner {
    public StockSpanner() {
        
    }

    Stack<Pair>st = new Stack<>();

    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek().first<=price){
            span = span + st.peek().second;
            st.pop();
        }
        st.push(new Pair(price,span));
        return span;
    }
}
