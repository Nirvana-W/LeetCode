class Solution {
    public String countAndSay(int n) {
        String result = "1";
        for(int i = 2; i <= n; i++){
            StringBuilder s = new StringBuilder();
            int count = 0;
            for(int x = 0; x < result.length(); x++){
                count++;
                if((x < result.length() - 1 && result.charAt(x) != result.charAt(x+1)) || x == result.length() - 1){
                    s.append(count);
                    s.append(result.charAt(x));
                    count = 0;
                }
            }
            result = s.toString();
        }
        return result;
    }
}
