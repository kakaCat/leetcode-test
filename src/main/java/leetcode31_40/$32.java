package leetcode31_40;

public class $32 {
    public static void main(String[] args) {
        longestValidParentheses("()(()");
    }

    public static int longestValidParentheses(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int ans = 0, l=0;
        char[] chs = s.toCharArray();

        for(int i=0;i<chs.length;i++){
            if(chs[i]=='('){
                l++;
            }else if(l>0&&chs[i]==')'){
                l--;
                ans+=2;
            }
        }
        return ans;
    }
}
