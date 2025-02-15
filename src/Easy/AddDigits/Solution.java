package Easy.AddDigits;

public class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        int s = 0 ;
        while(num>0){
            int d = num % 10;
            s +=d;
            num/=10;
        }
        return addDigits(s);
    }
}