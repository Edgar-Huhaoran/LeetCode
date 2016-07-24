package questions.q290;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null || pattern.length() == 0 || str.length() == 0) {
            return false;
        }

        String[] strArr = str.split(" ");
        if (pattern.length() != strArr.length) {
            return false;
        }

        Map<Character, String> charStrMap = new HashMap<Character, String>();
        Map<String, Character> strCharMap = new HashMap<String, Character>();
        for (int i = 0; i < pattern.length(); i++) {
            Character iChar = pattern.charAt(i);
            String iStr = strArr[i];
            if (charStrMap.get(iChar) == null && strCharMap.get(iStr) == null) {
                charStrMap.put(iChar, iStr);
                strCharMap.put(iStr, iChar);
            } else if (!iStr.equals(charStrMap.get(iChar)) || !iChar.equals(strCharMap.get(iStr))) {
                return false;
            }
        }

        return true;
    }

}
