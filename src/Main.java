import arrays.TwoSum;
import linkedlist.ListNode;
import twopointers.LongestSubstringWORepChar;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        System.out.println(Arrays.toString(twoSum.solve(new int[]{2, 7, 11, 15},9 )));

        LongestSubstringWORepChar lswr=new LongestSubstringWORepChar();
        System.out.println(lswr.solve("abcdd"));

    }
}