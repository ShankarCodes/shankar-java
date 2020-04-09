class SLinkedList
{
    private Node head;
    private long list_no = 0;
    SLinkedList()
    {
        head = new Node(null, list_no);
    }
    
    void add(Object data)
    {
        list_no = list_no + 1;
        head.next = new Node(data, list_no);
    }
    
    void get(long index)
    
}


class Node
{
    Object data;
    Node next;
    long index;
    Node(Object data, long index)
    {
        this.data = data;
        this.index = index;
        
    }
}