//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public static void mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode res = new ListNode();
        ListNode head = new ListNode(0,res.next);
        while (list1 != null && list2 != null) {
            System.out.println("In loop");
            if (list1.val < list2.val) {
                res = new ListNode(list1.val);
                System.out.println("in nest loop "+ res.val);

                if (list1.next != null) {
                    list1 = list1.next;
                }else {
                    list1 = new ListNode(0,list2);
                    list1 = list1.next;
                }
                res.next = res;
            } else {
                System.out.println("in nested loop");
                res = new ListNode(list2.val);
                list2 = list2.next;
            }
        }
        while (head != null) {
            System.out.println(head+ " in head " + head.next + head.val);
            
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // ListNode
        ListNode l1 = new ListNode(10);
        ListNode l2 = new ListNode(20);
        // l1=new ListNode(5, l1);
        // l1=new ListNode(15, l1);
        // System.out.println(mergeTwoLists(l1, l2));
        mergeTwoLists(l1, l2);

        // while (l1!=null) {
        // System.out.println(l1.val);
        // l1=l1.next;
        // }
        // System.out.println(l1.next);
        // System.out.println(l1.next.val);
        // System.out.println(l1.next);
    }
}