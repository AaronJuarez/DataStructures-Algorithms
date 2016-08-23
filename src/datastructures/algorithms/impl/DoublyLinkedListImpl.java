package datastructures.algorithms.impl;

import datastructures.algorithms.inter.DoublyLinkedList;

public class DoublyLinkedListImpl <E> implements DoublyLinkedList <E> {
	Link first = null;
	Link last = null;
	private int size;

        @Override
	public void insertFirst(E elem) {
		Link temp = new Link(elem);
		temp.next = first;
		if(!isEmpty()){
			first.previous = temp;
		}else{
			last = temp;
		}
		first = temp;
		size++;
	}

        @Override
	public void insertLast(E elem) {
		Link temp = new Link(elem);
		temp.previous = last;
		if(!isEmpty()){
			last.next = temp;
		}else{
			first = temp;
		}
		last = temp;
		size++;
	}

        @Override
	public void insertAfter(E elem, E afterElem) {
		Link temp = new Link(elem);
                Link current = first;
                
                while(current!=null){
                    if(current.data == afterElem){
                        temp.next = current.next;
                        temp.previous = current;
                        current.next.previous = temp;
                        current.next = temp;
                        break;
                    }else{
                        current = current.next;
                    }
                }
		
	}

        @Override
	public E deleteFirst() {
            Link temp;
            if(!isEmpty()){
                temp = first;
                first = first.next;
                first.previous = null;
                return temp.data;
            }else{
                return null;
            }
	}

        @Override
	public E deleteLast() {
            Link temp;
            if(!isEmpty()){
                temp = last;
                last = last.previous;
                last.next = null;
                return temp.data;
            }else{
                return null;
            }
	}

        @Override
	public E deleteElement(E elem) {
            Link current = first;
            Link temp;
            
            while(current != null){
                if(current.data == elem){
                    temp = current;
                    current.next.previous = current.previous;
                    current.previous.next = current.next;
                    return temp.data;
                }else{
                    current = current.next;
                }
            }
            return null;
	}
        
        @Override
	public void displayForward() {
            Link current = first;
            while (current != null){
                current.displayLink();
                current = current.next;
            }	
            System.out.println();
	}

        @Override
	public void displayBackward() {
            Link current = last;
            
            while (current != null){
                current.displayLink();
                current = current.previous;
            }	
            System.out.println();
	}
	
        @Override
	public boolean isEmpty(){
		return size == 0;
	}
	
	public class Link{
		private E data = null;
		private Link previous = null;
		private Link next = null;
		
		public Link(E data){
			this.data = data;
		}
		
		public void displayLink(){
			System.out.print(data + " ");
		}
		
	}

}
