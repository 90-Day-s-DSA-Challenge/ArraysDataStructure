package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1773. Count Items Matching a Rule
//https://leetcode.com/problems/count-items-matching-a-rule/description/

public class CountItemMatchingRule {
    public static void main(String[] args) {
      List<List<String>>  items = new ArrayList<>();

      items.add(Arrays.asList("phone", "blue", "pixel"));
      items.add(Arrays.asList("computer", "silver", "lenovo"));
      items.add(Arrays.asList("phone", "gold", "iphone"));

      String ruleKey = "type";
      String ruleValue = "phone";

      int result = countMatches(items, ruleKey, ruleValue);

        System.out.println(result);

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int matches=0;

//        first find index of rule according to problem
        int ruleIndex;
        if(ruleKey.equals("type")){
            ruleIndex=0;
        } else if (ruleKey.equals("color")) {
            ruleIndex=1;
        }else{
            ruleIndex=2;
        }

//        for(int i = 0; i < items.size(); i++){
//            if(items.get(i).get(ruleIndex).equals(ruleValue)){
//                matches++;
//            }
//
//        }

        for(List<String> item: items){
            if(item.get(ruleIndex).equals(ruleValue)){
                matches++;
            }
        }

        return matches;
    }
}


//todo: explore how to iterate, get, set, and list methods
