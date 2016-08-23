package datastructures.algorithms.impl;

import datastructures.algorithms.inter.DoubleEndedList;

public class DoubleEndedListImpl<E> implements DoubleEndedList<E>{
	private Link first = null;
	private Link last = null;
	private int size;
        
        @Override
	public void insertFirst(E elem) {
		Link temp = new Link(elem);
		temp.next = first;
		
		if(isEmpty()){
			last = temp;
		}
		
		first = temp;
		size++;
	}

        @Override
	public void insertLast(E elem) {
		Link temp = new Link(elem);
		last.next = temp;
		if(isEmpty()){
			first = temp;
		}
		last = temp;
		size++;
	}

        @Override
	public E deleteFirst(){
		
		if(!isEmpty()){
			first = first.next;
			size--;
			return first.data;
		}else{
			return null;
		}
	}

        @Override
	public E deleteLast() {
		
		Link current = first;
		Link temp = last;
		
		if(!isEmpty()){
			while(!current.next.equals(last)){
					current = current.next;
			}
			current.next = null;
			last = current;
			return temp.data;
		}else{
			return null;
		}
	}
	
        @Override
	public void insertAfter(E elem, E afterElem){
		Link current = first;
		Link temp = new Link(elem);
		
		if(!isEmpty()){
			for(int i=0; i<size; i++){
				if(current.data.equals(afterElem)){
					temp.next = current.next;
					current.next = temp;
                                        break;
				}else{
					current = current.next;
				}
			}
		}else{
			System.out.println("Is empty");
		}
	}
	
        @Override
	public E deleteElement(E elem){
		Link current = first;
		Link afterCurrent = first;
		E deletedElem = null;
		
		if(!isEmpty()){
			for(int i=0; i<size; i++){
				if(afterCurrent.data.equals(elem)){
					if(i == 0){
						first = current.next;
						deletedElem = current.data;
					}else{
						current.next = afterCurrent.next;
						deletedElem = afterCurrent.data;
					}
				}else{
					current = afterCurrent;
					afterCurrent = afterCurrent.next;
				}
			}
		}else{
			deletedElem = null;
		}
		return deletedElem;
	}
        
        @Override
        public void displayList(){
            System.out.println();
            Link current = first;
            while(current != null){
                current.displayLink();
                current = current.next;
            }
        }

        @Override
	public boolean isEmpty() {
		return size == 0;
	}
        
        @Override
        public E returnFirst(){
            if(!isEmpty()){
                return first.data;
            }
            return null;
        }
	
	public Link getFirst() {
		return first;
	}

	public void setFirst(Link first) {
		this.first = first;
	}

	public Link getLast() {
		return last;
	}

	public void setLast(Link last) {
		this.last = last;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public class Link{
		private E data;
		private Link next;
		
		public Link(E data){
			this.data = data;
		}
		
		public void displayLink(){
			System.out.print(data + " ");
		}
		
		public void setData(E data){
			this.data = data;
		}
		
		public E getData(){
			return data;
		}
		
		public void setNext(Link next){
			this.next = next;
		}
		
		public Link getNext(){
			return next;
		}
		
	}

	
}
