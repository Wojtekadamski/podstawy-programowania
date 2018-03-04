package MyCollections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/*  Class Node  */



public class MojaListaPolaczona<T> implements Iterable {
        protected Node start;
        protected Node end ;
        public int size;



        class Node<T>
        {
            protected T data;
            protected Node next, prev;

            /* Constructor */
            public Node()
            {
                next = null;
                prev = null;
                data = null;
            }
            /* Constructor */
            public Node(T data, Node next, Node prev)
            {
                this.data = data;
                this.next = next;
                this.prev = prev;
            }
            /* Function to set link to next node */
            public void setLinkNext(Node n)
            {
                next = n;
            }
            /* Function to set link to previous node */
            public void setLinkPrev(Node p)
            {
                prev = p;
            }
            /* Funtion to get link to next node */
            public Node getLinkNext()
            {
                return next;
            }
            /* Function to get link to previous node */
            public Node getLinkPrev()
            {
                return prev;
            }
            /* Function to set data to node */
            public void setData(T d)
            {
                data = d;
            }
            /* Function to get data from node */
            public T getData()
            {
                return data;
            }
        }



        public MojaListaPolaczona()
        {
            start = null;
            end = null;
            size = 0;
        }
        /* Function to check if list is empty */
        public boolean isEmpty()
        {
            return start == null;
        }
        /* Function to get size of list */
        public int getSize()
        {
            return size;
        }
        /* Function to insert element at begining */
        public void addStart(T val)
        {
            Node nptr = new Node(val, null, null);
            if(start == null)
            {
                start = nptr;
                end = start;
            }
            else
            {
                start.setLinkPrev(nptr);
                nptr.setLinkNext(start);
                start = nptr;
            }
            size++;
        }
        /* Function to insert element at end */
        public void addEnd(T val)
        {
            Node node = new Node(val, null, null);
            if(start == null)
            {
                start = node;
                end = start;
            }
            else
            {
                node.setLinkPrev(end);
                end.setLinkNext(node);
                end = node;
            }
            size++;
        }


        public void addEndAll(T[] collection){

            for(T element: collection)
                addEnd(element);

        }


        /* Function to insert element at position */
        public void addAtPos(T val , int pos)
        {
            Node node = new Node(val, null, null);
            if (pos == 1)
            {
                addStart(val);
                return;
            }
            Node startNode = start;
            for (int i = 2; i <= size; i++)
            {
                if (i == pos)
                {
                    Node tmp = startNode.getLinkNext();
                    startNode.setLinkNext(node);
                    node.setLinkPrev(startNode);
                    node.setLinkNext(tmp);
                    tmp.setLinkPrev(node);
                }
                startNode = startNode.getLinkNext();
            }
            size++ ;
        }

        public void addAtPosAll(T[] collection, int index){
            for (T element: collection){
                addAtPos(element, index);
                index++;
            }



        }

        /* Function to delete node at position */
        public void deleteAtPos(int pos)
        {
            if (pos == 1)
            {
                if (size == 1)
                {
                    start = null;
                    end = null;
                    size = 0;
                    return;
                }
                start = start.getLinkNext();
                start.setLinkPrev(null);
                size--;
                return ;
            }
            if (pos == size)
            {
                end = end.getLinkPrev();
                end.setLinkNext(null);
                size-- ;
            }
            Node ptr = start.getLinkNext();
            for (int i = 2; i <= size; i++)
            {
                if (i == pos)
                {
                    Node p = ptr.getLinkPrev();
                    Node n = ptr.getLinkNext();

                    p.setLinkNext(n);
                    n.setLinkPrev(p);
                    size-- ;
                    return;
                }
                ptr = ptr.getLinkNext();
            }
        }
        /* Function to display status of list */
        public void display()
        {

            if (size == 0)
            {
                System.out.print("puste\n");
                return;
            }
            if (start.getLinkNext() == null)
            {
                System.out.println(start.getData() );
                return;
            }
            Node ptr = start;
            System.out.print(start.getData()+ " <-> ");
            ptr = start.getLinkNext();
            while (ptr.getLinkNext() != null)
            {
                System.out.print(ptr.getData()+ " <-> ");
                ptr = ptr.getLinkNext();
            }
            System.out.print(ptr.getData()+ "\n");
        }


        public void iterateForward(){

            System.out.println("iterating forward..");
            Node tmp = start;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }

        /**
         * this method walks backward through the linked list
         */
        public void iterateBackward(){

            System.out.println("iterating backword..");
            Node tmp = end;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.prev;
            }
        }



        @Override
        public Iterator<T> iterator() {
            Iterator<T> it = new Iterator<T>() {

                private int currentIndex = 0;

                Node iter = start;

                @Override
                public boolean hasNext() {
                    try {
                        return iter.next != null;
                    }
                    catch (NullPointerException npe){
                        return false;
                    }
                }

                @Override
                public T next() {

                    Node temp = iter;
                    iter = iter.next;
                    return (T) temp.data;
                }

                public T previous(){
                    Node temp = iter;
                    iter = iter.prev;
                    return (T) temp.data;
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }

                public void first(){
                   iter = start;
                }

                public void last(){
                    iter = end;
                }

                public T current(){
                    return (T) iter;
                }
            };
            return it;
        }
    }




