package LinkedListAsgQues;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SumTwoLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;

        int x = 0, y, carry = 0;
        while (p != null || q != null) {
            if (p != null) {
                x = p.val;
            } else {
                x = 0;
            }
            if (q != null) {
                y = q.val;
            } else {
                y = 0;
            }
            int sum = (carry + x + y);
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return result.next;
    }

    public static void main(String[] args) {
        // Create example lists: l1 and l2
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(1);
        l2.next.next.next = new ListNode(9);

        // Create an instance of the Solutions class
        SumTwoLL solutions = new SumTwoLL();

        // Call the addTwoNumbers method
        ListNode result = solutions.addTwoNumbers(l1, l2);

        // Print the resulting list
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}

