class BiggestTank {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++){
            for (int j = 0; j < height.length; j++){
                if (i != j){
                    int currentArea = Math.min(height[i], height[j]) * Math.abs(i-j);
                    if (currentArea > maxArea){
                        maxArea = currentArea;
                    }
                }
            }
        }
        return maxArea;
    }
}