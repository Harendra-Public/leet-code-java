package com.leetcode.problems;

import com.leetcode.model.ListNode;

public class MiddleOfLinkeList {

    public ListNode middleNode(Object head) {
        try{
        ListNode middle = (ListNode) head;
        ListNode end = (ListNode) head;
        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
        }catch(Exception e){
            System.out.println("Exception in type casting");
        }
        return null;
    }
    
}
