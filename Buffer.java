package com.training;

public class Buffer {
	public static void main(String[] args)
    {
        StringBuffer s=new StringBuffer();
        System.out.println(s.capacity());//capacity of memory in heap
        System.out.println(s.append("Sindhu from MNCCc"));
        //more than 16 so buffer automatically generates more space
        System.out.println(s.capacity());
        //finding lastindex
        System.out.println(s.lastIndexOf("i"));
        //finding charAt particular index
        System.out.println(s.charAt(4));
        //delete char at given index
        System.out.println(s.deleteCharAt(4));
        //finding length of buffer
        System.out.println(s.length());
        System.out.println(s.lastIndexOf("C"));
        //reverse of string
        System.out.println(s.reverse());
        //finding substring with start index
        System.out.println(s.substring(2));
        //with start and end
        System.out.println(s.substring(0,2));
        //checking if it is empty
        System.out.println(s.isEmpty());
        //appending 2 strings
        System.out.println(s.append("hello"));
    }
}
