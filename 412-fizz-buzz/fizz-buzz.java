class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        int c3 = 0,  c5 = 0;
        for(int i = 1; i <= n; i++)
        {
            String res = "";
            c3++;
            c5++;
            if(c3 == 3)
            { res += "Fizz"; c3 = 0; }
            if(c5 == 5) 
            { res += "Buzz"; c5 = 0; }

            if(res == "") result.add(String.valueOf(i));
            else result.add(res);
        }

        return result;
    }
}