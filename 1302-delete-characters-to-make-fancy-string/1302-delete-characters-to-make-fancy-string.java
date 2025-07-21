class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
                count++;
            } else {
                count = 1;
            }
            if (count <= 2) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}