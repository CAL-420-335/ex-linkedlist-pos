package org.example;

public class ListeChainee {

    class Node {
        Node next = null;
        Object v = null;

        Node(Object v) {this.v = v;}
    }

    Node first = null;

    public void ajouter(Object v){
        if(first == null) {
            first = new Node(v);
        }
        else {
            Node n = getLastNode();
            n.next = new Node(v);
        }
    }

    public int taille(){
        int sz = 0;
        Node n = first;
        while(n != null) {
            sz++;
            n = n.next;
        }

        return sz;
    }

    public Object get(int idx) {
        Node n = first;
        while(idx-- > 0) {
            if(n == null) throw new IndexOutOfBoundsException();
            n = n.next;
        }

        return n.v;
    }

    private Node getLastNode() {
        Node n = first;
        while(n != null && n.next != null) n = n.next;
        return n;
    }

}
