package com.qa.practice;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCount {

     static void Duplicatechar(){
         HashMap<Character,Integer> temp= new HashMap<>();
         String str1= "chandan";
         for (int i=0; i<str1.length();i++){
             char text= str1.charAt(i);
             temp.merge(text, 1, Integer::sum);
         }
         for (char c : temp.keySet()) {
             if (temp.get(c) > 1) {
                 System.out.println("The duplicate value is " + c + " ---and the count is " + temp.get(c));
             }
         }
         System.out.println(temp);
    }

    public static void main(String[] args) {
        String str = "My My name is java aa aa a a a";
        Duplicatechar();

//        HashMap<String,Integer> store= new HashMap<>();
//        String[] split= str.split(" ");
//         for (String text:split){
//             if (store.get(text) != null)
//             {
//                 store.put(text, store.get(text)+1);
//             }
//           else {
//                 store.put(text, 1);
//             }
//         }
//         Iterator<String> text =store.keySet().iterator();
//         while (text.hasNext()){
//
//           String temp=  text.next();
//           if (store.get(temp)>1)
//           {
//               System.out.println("The duplicate value is "+ temp+ " ---and the count is "+store.get(temp));
//           }
//         }
//        System.out.println(store);

    }
}
