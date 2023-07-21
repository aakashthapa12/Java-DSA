import java.util.*;
public class a{
    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size == 0){
               head = tail = temp;
            }

            else{
               tail.next = temp;
               tail = temp;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void remove(){
            if(size == 0){
                System.out.print("LL is empty");
            }

            if(size == 1){
                head = tail = null;
                size = 0;
            }
            else{
                head = head.next;
                size--;
            }
        }

        public int getFirst(){
            if(size == 0){
                System.out.print("LL is Empty");
                return -1;
            }

            else{
                return head.data;   
            }
        }
        public int getLast(){
            if(size == 0){
                System.out.print("LL is Empty");
                return -1;
            }

            else{
                return tail.data;
            }
        }
        public int getAt(int idx){
            if(size == 0){
                System.out.print("LL is Empty");
                return -1;
            }
            else if(idx < 0 || idx >= size){
                System.out.print("LL is invalid arguments");
                return -1;
            }

            Node temp = head;
            for(int i=0; i<idx; i++){
                temp = temp.next;
            }

            return temp.data;
        }
        
        public void addFirst(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if(size == 0){
               tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val){
            Node newNode = new Node();
            newNode.data = val;

            if(idx <0 || idx >= size){
                System.out.print("LL is invalid");
            }
            else if(idx == 0){
                addFirst(val);
            }
            else if(idx == size){
                addLast(val);
            }
            else{
                Node temp = head;
                for(int i=0; i<idx-1; i++){
                    temp = temp.next;
                }

                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }

        public void removeLast(){
            if(size == 0){
                System.out.print("LL is empty");
            }
            else if(size == 1){
                remove();
            }
            else{
                Node temp = head;
                for(int i=0; i<size-2; i++){
                    temp = temp.next;
                }

                tail = temp;
                temp.next = null;
                size--;
            }
        }

        private Node getNodeAt(int idx){

            Node temp = head;
            for(int i=0; i<idx; i++){
                temp = temp.next;
            }

            return temp;
        }

        public void reverseLL(){
            int li = 0;
            int ri = size-1;

            while(li < ri){
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);
                
                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        public void reverseLL_PI(){
            Node prev = null;
            Node curr = head;
            
            while(curr != null){ 
                Node next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

        public void removeAt(int idx){
            if(idx < 0 || idx >= size){
                System.out.print("Invalid Input");
            }
            else if(idx == 0){
                remove();
            }
            else if(idx == size-1){
                removeLast();
            }
            else{
                Node temp = head;
                for(int i=0; i<idx-1; i++){
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

        public int kthFromLast(int k){
            Node slow = head;
            Node fast = head;

            for(int i=0; i<k; i++){
                fast = fast.next;
            }

            while(fast != tail){
                slow = slow.next;
                head = head.next;
            }

            int val = slow.data;
            return val;
        }

        public int middleNode(){
            Node slow = head;
            Node fast = head.next;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            
            return slow.data;
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2){
            Node one = l1.head;
            Node two = l2.head;

            LinkedList res = new LinkedList();
            while(one != null && two != null){
                if(one.data <= two.data){
                    res.add(one.data);
                    one = one.next;
                }
                else{
                    res.add(two.data);
                    two = two.next;
                }
            }

            while(one != null){
                res.add(one.data);
                one = one.next;
            }

            while(two != null){
                res.add(two.data);
                two = two.next;
            }

            return res;
        }

        public static Node midNode(Node head, Node tail){
            Node fast = head;
            Node slow = head;

            while(fast != tail && fast.next != tail){
                fast = fast.next.next;
                slow = slow.next;
            }
            
            return slow;
        }
        public static LinkedList mergeSort(Node head, Node tail){
            if(head == tail){
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }

            Node mid = middle(head, tail);
            LinkedList left = mergeSort(head, mid);
            LinkedList right = mergeSort(mid.next, tail);

            LinkedList ans = LinkedList.mergeTwoSortedLists(left, right);
            return ans;
        }

        public void removeDuplicates() {
            LinkedList res = new LinkedList();

            while(this.size() > 0){
                int val = this.getFirst();
                this.removeFirst();

                if(res.size() == 0 || res.tail.data != val){
                    res.addLast(val);
                }
            }

            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size();
        }

        public void oddEven(){
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();

            while(this.size > 0){
                int val = this.getFirst();
                this.removeFirst();

                if(val % 2 == 0){
                    even.addLast(val);
                }
                else{
                    odd.addLast(val);
                }
            }

            if(odd.size > 0 && even.size > 0){
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            }
            else if(odd.size > 0){
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            }
            else if(even.size > 0){
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }

        public void kReverse (int k){
            LinkedList prev = null;

            while(this.size > 0){
                LinkedList curr = new LinkedList();

                if(this.size >= k){
                   for(int i=0; i<k; i++){
                    int val = this.getFirst();
                    this.removeFirst();
                    curr.addFirst(val);
                }
                }
                
                else{
                    int os = this.size();
                    for(int i=0; i<os; i++){
                    int val = this.getFirst();
                    this.removeFirst();
                    curr.addLast(val);
                }
                }

                if(prev == null) {
                    prev = curr;
                }
                else{
                    prev.tail.next = curr.head;
                    prev.tail = curr.tail;
                    prev.size = curr.size;
                }
            }

            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }
        

        Node compute(Node head)
    {
        // your code here
        Node dummy = new Node(0);
        dummy.next = head;
        
        Node cur = dummy, prev = dummy, nex = dummy;
        
        while(nex.next != null){
            cur = prev.next;
            nex = cur.next;
            
            if(cur.data < nex.data){
                prev.next = nex;
            }
            
            cur = cur.next;
            nex = nex.next;
        }
        
        return prev;
    }
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addFirst(4);
        ll.display();
        
        ll.addAt(3, 6);
        ll.display();
        
        ll.reverseLL_PI();
        ll.display();
        ll.remove();
        ll.display();
        // int a = ll.middleNode();
        // System.out.print(a);
    }
}