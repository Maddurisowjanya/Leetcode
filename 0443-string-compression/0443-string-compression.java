class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int pos = 0;

        while (i < chars.length) {
            int j = i;

            // Find the end of the current group
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }
            int count = j - i;

            chars[pos] = chars[i];
            pos++;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[pos] = c;
                    pos++;
                }
            }

            i = j;
        }

        return pos;
    }
}