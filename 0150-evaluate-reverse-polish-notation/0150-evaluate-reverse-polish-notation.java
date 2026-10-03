class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if (token.equals("+")||
            token.equals("-")||
            token.equals("/")||
            token.equals("*")){

                int second = stack.pop();
                int first = stack.pop();

                int result = 0;

                if(token.equals("+")){
                    result = first + second;
                } else if(token.equals("-")){
                    result = first - second;
                } else if(token.equals("*")){
                    result = first*second;
                } else {
                    result = first/second;
                }

                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}