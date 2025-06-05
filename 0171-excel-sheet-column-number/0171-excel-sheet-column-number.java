class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0,i=0;
        while(i<columnTitle.length()){
            ans*=26;
            ans+=(columnTitle.charAt(i)-'A'+1);
            i++;
        }
        return ans;
    }
}