package com.training;

public class Example {
	public static void main(String[] args)
    {
        String s="Sindhu";//this goes to string constant pool
        String s1=new String("SINDHU");//this will go to non constant pool
        char a[]={'s','a','i'};
        String Q=new String(a);
        String s3="Sindhu";
        if(s==s3)//equality operator),comparing address
        {
            System.out.println("Same");
        }
        else {
            System.out.println("not same");
        }
        //to compare contents in ref var,use equals()

        if(s.equals(s3))
        {
            System.out.println("equal");
        }
        //comparing using equalsIgnoreCase Method
        if(s.equalsIgnoreCase(s1))
            System.out.println("equal");
        else
            System.out.println("not equal");
        //using compareTo method
        if(s.compareTo(s1)>0)
        {
            System.out.println("hell");
        }
        else if(s1.compareTo(s)>0)
        {
            System.out.println();
        }
        else {
            System.out.println("both are equal Strings");
        }
        //strings are immutable
        String k="SINDHU";
        System.out.println(k);
        k.concat("SAI");
        System.out.println(k);//no change in k value
        //to bring a copy of string from non constant pool to constant pool
        String s11=new String("sai");
        String s2=s1.intern();
        String s33="sai";
        if(s2==s33)
        {
            System.out.println("ref are equal");
        }
        String S="hi hi Sindhu hi";
        S=S.replace("hi","hello");
        System.out.println(S);
        String s5="HitachiTechnologies";
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.contains("Tech"));
        System.out.println(s5.contains("non"));
        System.out.println(s5.indexOf('d'));
        System.out.println(s5.charAt(7));
        System.out.println(s5.substring(7));
        System.out.println(s5.substring(1,7));


    }

}
