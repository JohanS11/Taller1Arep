package edu.escuelaing.arep.calculator.app;

public class Node<Obj> {

    private Node<Obj> prior,next;
    private Obj value;

    public Node(Obj value, Node<Obj> prior, Node<Obj> next) {
        this.value = value;
        this.prior = prior;
        this.next = next;
    }

    public Node() {
    }

    public Node<Obj> getPrior() {
        return prior;
    }

    public void setPrior(Node<Obj> prior) {
        this.prior = prior;
    }

    public Node<Obj> getNext() {
        return next;
    }

    public void setNext(Node<Obj> next) {
        this.next = next;
    }

    public Obj getValue() {
        return value;
    }

    public void setValue(Obj value) {
        this.value = value;
    }
}
