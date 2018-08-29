package io.daocloud.leetcode.leetcode002_middle;


/*
* 002
*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
* */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int currentValue;
        int leftValue=0;
        ListNode node =null;
        ListNode current=null;
        ListNode nextNode;


        while (true){
            if (l1 ==null&& l2 ==null){

                if (leftValue!=0){
                    if (current!=null){ current.next=new ListNode(leftValue);
                    }else {
                        node.next=new ListNode(leftValue);
                    }

                }
                break;
            }

            currentValue= (l1==null?0:l1.val)
                    + leftValue
                    + (l2==null?0:l2.val);

            if (currentValue>=10){

                leftValue=currentValue/10;
                currentValue=currentValue%10;

            }else {
                leftValue=0;
            }
            if (node==null){
                node=new ListNode(currentValue);
            }else {
                nextNode=new ListNode(currentValue);
                if (node.next==null){
                    node.next=nextNode;
                    current=nextNode;
                }else {
                    current.next=nextNode;
                    current=nextNode;
                }
            }
            if (l1!=null){
                l1=l1.next;
            }
            if (l2!=null){
                l2=l2.next;
            }
        }

        return node;
    }
    public static class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
    }
}
