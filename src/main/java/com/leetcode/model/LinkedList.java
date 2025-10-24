package com.leetcode.model;

public class LinkedList {
    public ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int val) {
        if (head == null) {
            head = new ListNode(val);
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
    }
}
