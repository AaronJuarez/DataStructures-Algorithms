package datastructures.algorithms.inter;

public interface DoublyLinkedList<E> {
	
	void insertFirst(E elem);
	void insertLast(E elem);
	void insertAfter(E elem, E afterElem);
	E deleteFirst();
	E deleteLast();
	E deleteElement(E elem);
	void displayForward();
	void displayBackward();
	boolean isEmpty();

}
