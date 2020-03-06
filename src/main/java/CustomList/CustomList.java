package CustomList;

import java.util.List;
// Custom List using LinkedList approach!
public class CustomList {
    class Node{
        int data;
        Node next;
        Node(){
            this.data = 0;
            this.next = null;
        }
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
    private Node start;
    private int size = 0;
    public CustomList(){
        start = null;
    }
    public void createList(int[] a){
        Node temp = null;
        for(int i = 0; i < 10; i++, this.size++ ){
            if( this.start == null ) {
                this.start = new Node(a[i]);
                temp = this.start;
            } else {
                if(i < a.length) {this.start.next = new Node(a[i]);}
                else {this.start.next = new Node();}
                this.start = this.start.next;
            }
        }
        this.start = temp;
    }
    public void addToList(int[] a){
        if(this.start == null){
            System.out.println("List isn't created");
            return;
        }
        Node temp = this.start;
        while(this.start.next != null){ this.start = this.start.next; }
        for(int i = 0; i < a.length; i++, this.size++){
            this.start.next = new Node(a[i]);
            this.start = this.start.next;
        }
        this.start = temp;
    }
    public void delete(int index){
        if(this.start == null ) {
            System.out.println("Empty list ");
            return;
        } else if(index < 0 || index >= this.size){
            System.out.println("invalid operation");
            return;
        } else if(index == 0){
            this.start = this.start.next;
            return;
        }
        Node temp = this.start;
        int count = index;
        Node prev = this.start;
        while(count-- > 0){
            prev = this.start;
            this.start = this.start.next;
        }
        prev.next = this.start.next;
        this.start = temp;
    }
    public void displayListElements(){
        if( this.start == null ){
            System.out.println("Empty List!");
            return;
        }
        Node moveAble = this.start;
        System.out.print("[");
        while( moveAble != null ){
            System.out.print(moveAble.data);
            moveAble = moveAble.next;
            if( moveAble != null ){
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
    public void clearList() {
    	if(this.start != null) {
    		this.start = null;
    	} else {
    		System.out.println("List is Empty");
    	}
    }
}
