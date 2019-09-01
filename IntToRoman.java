class IntToRoman {
    public String intToRoman(int num) {
        String roman = "";
        int numThousands = num / 1000;
        for (int i = 0; i < numThousands; i++){
            roman += "M";
        }
        int currNum = num % 1000;
        
        if (currNum >= 900) {
            roman += "CM";
            currNum = currNum % 900;
        }
        
        int num5Huns = currNum / 500;
        for (int i = 0; i < num5Huns; i++){
            roman += "D";
        }
        currNum = currNum % 500;
        
        if (currNum >= 400){
            roman += "CD";
            currNum = currNum % 400;
        }
        
        int numHuns = currNum / 100;
        for (int i = 0; i < numHuns; i++){
            roman += "C";
        }
        currNum = currNum % 100;

        if (currNum >= 90){
            roman += "XC";
            currNum = currNum % 90;
        }
        
        int num50s = currNum / 50;
        for (int i = 0; i < num50s; i++){
            roman += "L";
        }
        currNum = currNum % 50;
                
        if (currNum >= 40){
            roman += "XL";
            currNum = currNum % 40
        }
    
        int num10s = currNum / 10;
        for (int i= 0; i < num10s; i++){
            roman += "X";
        }
        currNum = currNum % 10;
        
        if (currNum >= 9){
            roman += "IX";
            currNum = currNum % 9;
        }
        
        int num5s = currNum / 5;
        for (int i= 0; i < num5s; i++){
            roman += "V";
        }
        currNum = currNum % 5;
        
        if (currNum >= 4){
            roman += "IV";
            currNum = currNum % 4;
        }
        
        for (int i = 0; i < currNum; i++){
            roman += "I";
        }
        return roman;
    }
}