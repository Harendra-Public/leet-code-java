package com.leetcode.util;

import com.leetcode.model.ListNode;
import com.leetcode.model.ListNodeInput;
import java.util.List;

public class ListNodeUtil {
    public static ListNode fromList(List<Integer> values) {
        if (values == null || values.isEmpty()) return null;
        ListNode head = new ListNode(values.get(0));
        ListNode current = head;
        for (int i = 1; i < values.size(); i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }
        return head;
    }

    public static ListNode fromInput(ListNodeInput input) {
        return fromList(input.getValues());
    }
}