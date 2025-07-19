class Solution {
    public int solution(int n, int w, int num) {
        int height = (n + w - 1) / w;
        int row = (num - 1) / w;
        int col = row % 2 == 0 ? (num - 1) % w : w - 1 - (num - 1) % w;
        int cnt = 0;
        
        for (int r = row + 1; r < height; r++) {
            int upperBox;
            if (r % 2 == 0) {
                upperBox = r * w + col + 1;
            }
            else {
                upperBox = r * w + (w - 1 - col) + 1;
            }
            if (upperBox <= n) cnt++;
        }
        
        return cnt + 1;
    }
}