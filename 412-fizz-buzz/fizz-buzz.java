class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 1; i <= n; i++)
        {
            String res = "";
            if(i%3 == 0) res += "Fizz";
            if(i%5 == 0) res += "Buzz";

            if(res.length() == 0) result.add(String.valueOf(i));
            else result.add(res);
        }

        return result;
    }
}