class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        String result = "";
        int pow = 0;
        //for eg 999999
        //          999



        // here we only add the 999 of num1 and num2
        while(i > -1 && j > -1)
        {
            int sum = 0;
            int n1 = Character.getNumericValue(num1.charAt(i));
            int n2 = Character.getNumericValue(num2.charAt(j));

            sum = n1+n2+pow;

            result  = String.valueOf(sum%10) + result;
            pow = sum/10;

            i--;
            j--;
        }
        
        //remaining characters of num1 

        while(i > -1)
        {
            int sum = Character.getNumericValue(num1.charAt(i)) + pow;
            result = String.valueOf(sum%10) + result;
            pow = sum/10;
            
            i--;
        }

        //or if remaining are of num2 
        while(j > -1)
        {
            int sum = Character.getNumericValue(num2.charAt(j)) + pow;
            result = String.valueOf(sum%10) + result;
            pow = sum/10;
            
            j--;
        }


        if(pow != 0) result = String.valueOf(pow) + result;


        return result;
    }
}