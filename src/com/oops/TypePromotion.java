package com.oops;

public class TypePromotion
{
 public void m1(String s)
{
    System.out.println("Hello");
 }
 public void m1(StringBuffer s)
{
    System.out.println("Java");
 }
public static void main(String[] args)
{
   TypePromotion t = new TypePromotion();

//  t.m1(new Object() ); // Exact match not found because The method m1(String) is not applicable with object argument.
    t.m1("Deep"); // Exact match with string argument

      t.m1(new StringBuffer()); // Exact match with string buffer parameter.
//  t.m1(null); // The method m1(String) is ambiguous for the type TypePro.
    }
 }