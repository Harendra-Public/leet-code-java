package com.leetcode.model;

public class LocalTest {
    LinkedList list;
    public LocalTest() {
        list = new LinkedList();
        list.append(4);
        list.append(21);
        list.append(7);
        list.append(31);
        list.append(9);
        list.append(2);
        list.append(6);
        list.append(11);
    }
    public LinkedList getList() {
        return list;
    }
    public static void main(String[] args) {
        LocalTest test = new LocalTest();
        ListNode middle = test.middleNode(test.getList().head);
        System.out.println("Middle Node Value: " + middle.val);

    }

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
