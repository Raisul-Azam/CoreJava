package LinkedList;



// LinkedList Code

//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head, fast = head, prev, temp;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        prev = slow;
//        slow = slow.next;
//        prev.next = null;
//        while (slow != null) {
//            temp = slow.next;
//            slow.next = prev;
//            prev = slow;
//            slow = temp;
//        }
//        fast = head;
//        slow = prev;
//        while (slow != null) {
//            if (fast.val != slow.val) return false;
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return true;
//    }
//}
//--------------------------------------------------------------------

//  mam code
//	   public boolean isPalindrome(ListNode head) {
//	        List<Integer> li = new ArrayList();
//	        
//	        // Convert Linklist to ArrayList
//	        while(head != null){
//	            li.add(head.val);
//	            head = head.next;
//	        }
//
//	        int low = 0;
//	        int high = li.size()-1;
//	        while(low<=high){
//	            if(!li.get(low).equals (li.get(high))){
//	                return false;
//	            }
//	            low++;
//	            high--;
//	        }
//	        return true;
//
//	    }
//	}

