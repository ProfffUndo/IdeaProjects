package mephi.Lab2.ex16;

public class Queue {
    Node  first;
    private static class Node {
        String str;
        Node next;

        Node(String str) {
            this.str = str;
            next = null;
        }
    }

        public static Queue add(Queue q, String str){
            Node newNode=new Node(str);
            newNode.next=null;
            if (q.first==null){
                q.first=newNode;
            }
            else{
                Node last = q.first;
                while ((last.next !=null)) {
                    last = last.next;
                }
                last.next=newNode;
        }
            return q;
    }

        public static Queue remove(Queue q){
            Node buf = q.first.next;
            q.first=null;
            q.first=buf;
            return q;
        }

        public static void print(Queue q){
        Node current = q.first;
        while(current.next !=null){
            System.out.println(current.str);
            current=current.next;
        }
        }
}
