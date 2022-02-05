package com.company;

public class TreeNodeNode {

    private int data;
    private TreeNodeNode leftChild;
    private TreeNodeNode rightChild;

    public TreeNodeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNodeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNodeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public TreeNodeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public int getData() {
        return data;
    }

    public int min() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.max();
        }
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNodeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNodeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNodeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNodeNode rightChild) {
        this.rightChild = rightChild;
    }
}
