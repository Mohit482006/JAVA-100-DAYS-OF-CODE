package Array;

import java.util.List;

public class CountItemsMatchingaRule {
    class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int idx=0;
        if(ruleKey.equals("type")){
            idx=1;
        }else if(ruleKey.equals("color")){
            idx=2;
        }else{
            idx=3;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(idx-1).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
}
