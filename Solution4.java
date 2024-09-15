public class Solution4 {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        Map<Character, Character> lkup = new HashMap<>(3);

        lkup.put( ')', '(' );
        lkup.put( '}', '{' );
        lkup.put( ']', '[' );

        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(lkup.containsKey(c)){
                if(!stk.isEmpty() && lkup.get(c) == stk.peek()){
                    stk.pop();
                }else{
                    return false;
                }
            }else{
                stk.push(c);
            } 

        }
        return stk.isEmpty();
    }
}
