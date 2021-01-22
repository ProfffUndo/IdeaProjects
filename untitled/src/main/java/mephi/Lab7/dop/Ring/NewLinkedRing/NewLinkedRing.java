package mephi.Lab7.dop.Ring.NewLinkedRing;

import mephi.Lab7.dop.Ring.Ring;
import net.sf.javagimmicks.collections.LinkedRing;
import net.sf.javagimmicks.collections.RingCursor;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NewLinkedRing<E> implements Ring<E> {
    private int size = 0;
    private RingElement<E> hook = null;

    public LinkedRingCursor<E> cursor() {
        return new LinkedRingCursor<E>(this, this.hook);
    }
    @Override
    public boolean add(final E value)
    {
        // Get the initial RingCursor add the element before the current position
        // (this means at the 'end' of the ring)
        cursor().insertBefore(value);

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(final Collection<? extends E> collection)
    {
        for (final E value : collection)
        {
            cursor().insertBefore(value);
        }


        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size()==0) return true;
        else return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator()
    {
        return cursor().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public String toString()
    {
        return cursor().toString();
    }

    @Override
    public E previous() {
        return cursor().previous();
    }

    @Override
    public E next() {
        return cursor().next();
    }

    @Override
    public E current() {
        return (E) cursor().current;
    }

    @Override
    public void goNext() {
       cursor().current=next();
    }

    @Override
    public void goPrev() {
        cursor().current= (RingElement<E>) previous();
    }

    private static class RingElement<E>
    {
        private RingElement<E> previous;
        private RingElement<E> next;

        private E value;
    }

    RingElement<E>(RingElement<E> prev, RingElement<E> next){

    }

    private class LinkedRingCursor<E>
    {
        private RingElement<E> current;
        private NewLinkedRing<E> ring;

        private LinkedRingCursor(final NewLinkedRing<E> ring, final RingElement<E> current)
        {
            this.current = current;
            this.ring=ring;
        }

        public E get() {
            if (current == null) {
                throw new NoSuchElementException("Ring is empty");
            }

            return current.value;
        }

        public void insertAfter(final E value)
        {
            final RingElement<E> next = current != null ? current.next : null;

            insert(value, current, next);
        }

        public void insertBefore(final E value)
        {
            final RingElement<E> previous = current != null ? current.previous : null;

            insert(value, previous, current);
        }

        private void insert(final E newvalue, final RingElement<E> previous, final RingElement<E> next)
        {

            RingElement<E> newElement = new RingElement<E>();
            newElement.value = newvalue;

            if (previous == null || next == null)
            {
                // This is the first element, so link it to itself
                newElement.previous = newElement;
                newElement.next = newElement;

                // Also update the current element and the hook of the ring
                current = newElement;
                ring.hook = newElement;
            }
            else
            {
                // Set links of new element
                newElement.previous = previous;
                newElement.next = next;

                // Set links to new element
                previous.next = newElement;
                next.previous = newElement;
            }

            // Increase ring size
            ++size;

        }

        public E next()
        {

            if (current == null)
            {
                throw new NoSuchElementException("Ring is empty");
            }

            current = current.next;

            return get();
        }

        public E previous()
        {
            if (current == null)
            {
                throw new NoSuchElementException("Ring is empty");
            }

            current = current.previous;

            return get();
        }

        public E remove()
        {
            // Get the ring size
            final int ringSize = ring.size;

            // If nothing to remove, throw an exception
            if (ringSize == 0)
            {
                throw new NoSuchElementException();
            }

            final E result = current.value;

            if (ringSize == 1)
            {
                // If only one element is remaining, clean up everything
                current.next = null;
                current.previous = null;
                current = null;
                ring.hook = null;
            }
            else
            {
                // Get the next and previous element
                final RingElement<E> nextElement = current.next;
                final RingElement<E> previousElement = current.previous;

                // Re-assign their links
                nextElement.previous = previousElement;
                previousElement.next = nextElement;

                // Clean links of element to remove
                current.next = null;
                current.previous = null;

                // Relink the hook (if necessary) and the current RingCursor
                // position
                if (ring.hook == current)
                {
                    ring.hook = nextElement;
                }
                current = nextElement;
            }
                // Decrease ring size
                --size;

                return result;
            }

        }
    }
