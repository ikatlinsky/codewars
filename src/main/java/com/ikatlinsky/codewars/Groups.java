package com.ikatlinsky.codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author ikatlinsky
 * @since 9/1/15
 */
public class Groups{

    private static final Map<Character, Character> PAIRS = new HashMap<Character, Character>() {{
        put('[', ']');
        put(']', '[');
        put('(', ')');
        put(')', '(');
        put('{', '}');
        put('}', '{');
    }};

    public static boolean groupCheck(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
             switch (s.charAt(i)) {
                 case '(':
                 case '[':
                 case '{':
                     stack.push(PAIRS.get(s.charAt(i)));
                     break;
                 case ')':
                 case ']':
                 case '}':
                     if (stack.empty() || stack.pop() != s.charAt(i)) {
                         return false;
                     }
                     break;
                 default:
                     return false;
             }
        }

        return stack.empty();
    }

}