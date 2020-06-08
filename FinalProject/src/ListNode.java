/* CS211 Yudong Lin 
 * HW06
 * 16 May 2020
 * Chapter 16, do exercises 8 and 12 on page 1023
 */
// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
    public String data;       // data stored in this node
    public ListNode next;  // link to next node in the list

    // post: constructs a node with given data and given link
    public ListNode(String data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    // post: constructs a node with given data and null link
    public ListNode(String data) {
        this(data, null);
    }
}
