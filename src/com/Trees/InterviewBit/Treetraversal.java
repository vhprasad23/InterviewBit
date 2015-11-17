package com.Trees.InterviewBit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by priyavivek on 11/15/15.
 *
 * In-order, pre-order and post-order traversal
 */

public class Treetraversal {

    public ArrayList<Integer> arrayIn = new ArrayList<>();
    public ArrayList<Integer> arrayPre = new ArrayList<>();
    public ArrayList<Integer> arrayPost = new ArrayList<>();

    public void inOrder(TreeNode a){

        if(a == null){
            return;
        }
        inOrder(a.left);
        arrayIn.add(a.val);
        inOrder(a.right);

    }


    public void preOrder(TreeNode a){
        if(a == null){
            return;
        }
        arrayPre.add(a.val);
        preOrder(a.left);
        preOrder(a.right);

    }

    public void postOrder(TreeNode a){
        if(a == null){
            return;
        }
        postOrder(a.left);
        postOrder(a.right);
        arrayPost.add(a.val);

    }

    public static void main(String[] args){

        ArrayList<String> s = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13","14","15","null", "null", "null", "null", "null", "null", "null", "null", "null", "null","null", "null", "null", "null", "null", "null"));
        TreeNode root = CreateBST.insertElements(s);

        Treetraversal t = new Treetraversal();
        t.inOrder(root);
        t.preOrder(root);
        t.postOrder(root);

        System.out.println("Printing in-order");
        for(int i=0;i<t.arrayIn.size();i++){
            System.out.println(t.arrayIn.get(i));
        }

        System.out.println("Printing pre-order");
        for(int i=0;i<t.arrayPre.size();i++){
            System.out.println(t.arrayPre.get(i));
        }

        System.out.println("Printing post-order");
        for(int i=0;i<t.arrayPost.size();i++){
            System.out.println(t.arrayPost.get(i));
        }

    }
}
