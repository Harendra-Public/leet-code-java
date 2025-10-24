package com.leetcode.problems;

import com.leetcode.model.ListNode;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }
}
