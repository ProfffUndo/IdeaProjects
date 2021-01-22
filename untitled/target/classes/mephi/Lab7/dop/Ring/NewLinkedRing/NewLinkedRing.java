package mephi.Lab7.dop.Ring.NewLinkedRing;

import mephi.Lab7.dop.Ring.Ring;

import java.util.Collection;
import java.util.Iterator;

public class NewLinkedRing<E> implements Ring {
    @Override
    public Object previous() {
        return null;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public Object current() {
        return null;
    }

    @Override
    public void goNext() {

    }

    @Override
    public void goPrev() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
/*    public class Node<E>{
        private Node<E> next;
        private Node<E> previous;
        private E element;
        public Node(Node<E> n, Node<E> p,E e){
            next=n;
            previous=p;
            element=e;
        }

        public Node<E> next() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> previous() {
            return previous;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public E current() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

    }
    private Node<E> tail= null;
    private int size=0;
    public boolean isEmpty(){
        return size==0;
    }
    public void addAll(ArrayDeque<E> pila){
        int n= pila.size();
        for(E element:pila){
            if(size==0){
                tail= new Node<>(null,null,null,element);
                tail.setNext(tail);
                tail.setPrevious(tail);
            }
            else{
                Node<E> newest= new Node<>(tail.getNext(),tail,null,element);
                tail.setNext(newest);
                tail=newest;
            }
            size++;
        }
        if(size%2!=0){
            tail.getNext().setPrevious(tail.previous);
            tail.getPrevious().setNext(tail.next);
            tail= tail.getPrevious();
            size--;
        }
        Node<E> nodo= tail.next;
        Node<E> frente=tail.next;

        do{
            for(int i=0;i<size/2;i++){
                frente= frente.next;
            }
            nodo.setAhead(frente);
            frente=nodo.next;
            nodo=nodo.next;
        }
        while(nodo!=tail.next);


    }

    public Node<E> getTailNodo() {
        return tail;
    }
    public Node<E> getNext(){
        return tail.getNext();
    }


    public int getSize() {
        return size;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public NewLinkedRing(){};

*/
}
