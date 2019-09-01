class ZigZagString {
    public String convert(String s, int numRows) {
        String output = "";
        int currentIdx = 0;
        int currentRow = 0;
        if (numRows < 1){
            return output;
        } else if (numRows < 2){
            return s;
        }
        int bounceFactor = (numRows - 1) * 2;
        while (currentRow < numRows){
            currentIdx = currentRow;
            while (currentIdx < s.length()){
                if (((currentIdx + currentRow) % bounceFactor) == 0 || ((currentIdx - currentRow) % bounceFactor) == 0){
                    output += s.charAt(currentIdx);
                    System.out.println("Current Output: " + output + " Current Idx: " + currentIdx);
                }             
                currentIdx++;
            }           
            currentRow++;
        }
        return output;
    }
}