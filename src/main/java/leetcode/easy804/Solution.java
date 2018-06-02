package leetcode.easy804;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. Unique Morse Code Words
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> tranformationSet = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char chr : word.toCharArray()) {
                stringBuilder.append(codes[chr - 'a']);
            }
            tranformationSet.add(stringBuilder.toString());
        }
        return tranformationSet.size();
    }
}
