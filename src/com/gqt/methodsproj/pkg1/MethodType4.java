package com.gqt.methodsproj.pkg1;
class Calculator4{
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
}
public class MethodType4 {
public static void main(String[]args) {
	Calculator4 c4=new Calculator4();
	int res=c4.add(23,35);
	System.out.println("o/p from main is:"+res);

}
}
