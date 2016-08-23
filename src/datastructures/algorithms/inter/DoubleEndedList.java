package datastructures.algorithms.inter;

public interface DoubleEndedList<E> {
	
	void insertFirst(E elem);
	void insertLast(E elem);
	E deleteFirst();
	E deleteLast();
	boolean isEmpty();
	void insertAfter(E elem, E afterElem);
	E deleteElement(E elem);
        void displayList();
        E returnFirst();

}
