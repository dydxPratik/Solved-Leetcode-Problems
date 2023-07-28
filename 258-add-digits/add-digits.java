class Solution {
    public int addDigits(int num) {
        if((String.valueOf(num)).length() == 1) return num;

        int sum = 0;
        while(num != 0)
        {
            int rem = num%10;
            num = num/10;
            sum += rem;
        }
        return addDigits(sum);
    }
}