package CustomList;

public class ListTester {
	public static void main(String...args){
        CustomList ref = new CustomList();
        ref.displayListElements();
        int a[] = {1, 2, 3, 4, 5, 6};
        ref.createList(a);
        ref.displayListElements();
        int b[] = {-5, -6};
        ref.addToList(b);
        ref.displayListElements();
        ref.delete(3);
        ref.displayListElements();
        ref.delete(0);
        ref.displayListElements();
        ref.delete(1);
        ref.displayListElements();
        ref.clearList();
        ref.displayListElements();
    }
}
