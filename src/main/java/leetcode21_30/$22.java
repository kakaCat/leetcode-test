package leetcode21_30;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $22
 * @Description 22. 括号生成
 * @Author yunp
 * @Date 2020/6/10 10:39
 * @Version 1.0
 **/
public class $22 {

    public static void main(String[] args) {
        List<String> list = generateParenthesis(3);


        System.out.println(list);
    }


    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n,n,"",res);
        return res;
    }

    private static void dfs(int l, int r, String curStr,List<String> res) {

        if(l==0&&r==0){
            res.add(curStr );
            return ;
        }
        if(l>0){
            dfs(l-1,r,curStr+"(",res);
        }
        if(l<r){
            dfs(l,r-1,curStr+")",res);
        }
    }

}
