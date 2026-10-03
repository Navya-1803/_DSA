class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n = nums.length;
        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 2*n; i++){
            int currentIndex = i%n;

            while(!stack.isEmpty() && nums[currentIndex] > nums[stack.peek()]){
                int previousIndex = stack.pop();
                answer[previousIndex] = nums[currentIndex];
            }
            if(i<n){
                stack.push(currentIndex);
            }
        }
        return answer;
    }
}