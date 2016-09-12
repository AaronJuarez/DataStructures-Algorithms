package datastructures.algorithms.impl;

import datastructures.algorithms.inter.DoublyLinkedList;

public class DoublyLinkedListImpl<E> implements DoublyLinkedList<E> {

    private Link first = null;
    private Link last = null;
    private int size;

    @Override
    public void insertFirst(E elem) {
        Link temp = new Link(elem);
        temp.setNext(first);
        if (!isEmpty()) {
            first.setPrevious(temp);
        } else {
            last = temp;
        }
        first = temp;
        size++;
    }

    @Override
    public void insertLast(E elem) {
        Link temp = new Link(elem);
        temp.setPrevious(last);
        if (!isEmpty()) {
            last.setNext(temp);
        } else {
            first = temp;
        }
        last = temp;
        size++;
    }

    @Override
    public void insertAfter(E elem, E afterElem) {
        Link temp = new Link(elem);
        Link current = first;

        while (current != null) {
            if (current.getData() == afterElem) {
                temp.setNext(current.getNext());
                temp.setPrevious(current);
                current.next.setPrevious(temp);
                current.setNext(temp);
                break;
            } else {
                current = current.getNext();
            }
        }

    }

    @Override
    public E deleteFirst() {
        Link temp;
        if (!isEmpty()) {
            temp = first;
            first = first.getNext();
            first.setPrevious(null);
            return temp.getData();
        } else {
            return null;
        }
    }

    @Override
    public E deleteLast() {
        Link temp;
        if (!isEmpty()) {
            temp = last;
            last = last.getPrevious();
            last.setNext(null);
            return temp.getData();
        } else {
            return null;
        }
    }

    @Override
    public E deleteElement(E elem) {
        Link current = first;
        Link temp;

        while (current != null) {
            if (current.getData() == elem) {
                temp = current;
                current.next.setPrevious(current.getPrevious());
                current.previous.setNext(current.getNext());
                return temp.getData();
            } else {
                current = current.getNext();
            }
        }
        return null;
    }

    @Override
    public void displayForward() {
        Link current = first;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
        }
        System.out.println();
    }

    @Override
    public void displayBackward() {
        Link current = last;

        while (current != null) {
            System.out.print(current.getData());
            current = current.getPrevious();
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public class Link {

        private E data = null;
        private Link previous = null;
        private Link next = null;

        public Link(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        public Link getPrevious() {
            return previous;
        }

        public void setPrevious(Link previous) {
            this.previous = previous;
        }

        public Link getNext() {
            return next;
        }

        public void setNext(Link next) {
            this.next = next;
        }

    }

}
