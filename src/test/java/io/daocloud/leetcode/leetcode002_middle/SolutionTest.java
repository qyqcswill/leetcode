package io.daocloud.leetcode.leetcode002_middle;

import org.junit.Test;


public class SolutionTest {
    @Test
    public void test(){
        Solution.ListNode listNode1 = new Solution.ListNode(5);

        Solution.ListNode listNode2 = new Solution.ListNode(5);

        new Solution().addTwoNumbers(listNode1,listNode2);
    }



}