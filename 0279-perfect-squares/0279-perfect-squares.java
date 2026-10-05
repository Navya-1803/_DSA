class Solution {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        queue.offer(n);
        visited[n] = true;

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            level++;

            for (int i = 0; i < size; i++) {
                int current = queue.poll();

                for (int j = 1; j * j <= current; j++) {
                    int next = current - j * j;

                    if (next == 0) {
                        return level;
                    }

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }
        }

        return level;
    }
}