Que -> Write a function to convert a given number into words.

class Solution {
    
    String tenner(long num){
        switch((int)num){
            case 2 : return "twenty";
            case 3 : return "thirty";
            case 4 : return "forty";
            case 5 : return "fifty";
            case 6 : return "sixty";
            case 7 : return "seventy";
            case 8 : return "eighty";
            case 9 : return "ninety";
        }
        return "";
    }
    
    String ten_to_nineteen(long num){
        switch((int)num){
            case 10 : return "ten";
            case 11 : return "eleven";
            case 12 : return "twelve";
            case 13 : return "thirteen";
            case 14 : return "fourteen";
            case 15 : return "fifteen";
            case 16 : return "sixteen";
            case 17 : return "seventeen";
            case 18 : return "eighteen";
            case 19 : return "nineteen";
        }
        return "";
    }
    String helper_for_one_digi(long num){
        switch((int)num){
            case 1 : return "one";
            case 2 : return "two";
            case 3 : return "three";
            case 4 : return "four";
            case 5 : return "five";
            case 6 : return "six";
            case 7 : return "seven";
            case 8 : return "eight";
            case 9 : return "nine";
        }
        return "";
    }
    
    String helper_for_two_digi(long num){
        if(num == 0) return "";
        if(num < 10) return helper_for_one_digi(num);
        if(num < 20) return ten_to_nineteen(num);
        long tens = num / 10;
        long res = num % 10;
        if(tens !=0 && res != 0) return tenner(tens) + " " + helper_for_one_digi(res);
        if(tens != 0) return tenner(tens);
        if(res != 0) return helper_for_one_digi(res);
        return "";
    }
    
    
    String helper(long num){
        if(num == 0) return "";
        long hundred = num / 100;
        long remaining = num % 100;
        
        if(remaining != 0 && hundred != 0){
            return helper_for_one_digi(hundred) + " " + helper_for_two_digi(remaining);
        }else if(remaining == 0)
            return helper_for_one_digi(hundred);
        else return helper_for_two_digi(remaining);    
        
    }
    
    String convertToWords(long num) {
        // code here
        if(num == 0) return "Zero";
        
        long crore = num/10000000;
        num %= 10000000;
        
        long lakh = num/100000;
        num %= 100000;
        
        long thousand = num/1000;
        num %= 1000;
        
        long hundred = num / 100;
        num %= 100;
        
        String res = "";
        
        if(crore != 0){
            res += helper(crore) + " crore ";
        }
        if(lakh != 0){
            res += helper(lakh) + " lakh ";
        }
        if(thousand != 0){
            res += helper(thousand) + " thousand ";
        }
        if(hundred != 0){
            res += helper(hundred) + " hundred ";
        }
        if((hundred != 0 || thousand != 0 || lakh != 0 || crore != 0) && num != 0 ){
            res += "and ";
        }
        if(num != 0){
            res += helper(num);
        }
        
        return res;
    }
}
