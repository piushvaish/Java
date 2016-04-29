package com.piushvaish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //MyLinkedList list = new MyLinkedList(null);
        //list.traverse(list.getRoot());
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";
        //String stringData = "Drawin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data){
           //list.addItem(new Node(s));
            tree.addItem(new Node(s));
        }

        //tree.traverse(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
       tree.traverse(tree.getRoot());
    }
}
