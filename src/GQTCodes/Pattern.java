package GQTCodes;

import java.util.Scanner;

public class Pattern {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value for n: ");
       int n=sc.nextInt();
       //I
   for(int i=0;i<n;i++) {
	   for(int j=0;j<=n-1;j++) {
		  if(i==0&&j<n/2||(i==(n-1)&&j<n/2)
				  ||j==n/4
				  
				  ) {
		  System.out.print("# ");
		
	  } 
		  else { 
			  System.out.print("  ");
		  }}
	   //L
	   for(int j=0;j<=n-1;j++) {
			  if(i-j==n/2||i+j==(n-1)+n/2||
					  i+j==(n/2)-1&&i!=0&&i!=(n/4)-1||
					  j-i==(n/2)+1&&i!=0&&i!=(n/4)-1||
					  j-i==(n/4)-1&&i>=n/4&&j<=n/2||
					  i+j==(3*n)/4+1&&j<(3*n)/4&&i<n/2
					  
					  
					  
					  ) {
			  System.out.print("# ");
			
		  } 
			  else { 
				  System.out.print("  ");
			  }}
	  
	   for(int j=0;j<=n-1;j++) {
			  if(i==0&&j<n/2||(i==(n-1)&&j<n/2)
					  ||j==n/4
					  
					  ) {
			  System.out.print("# ");
			
		  } 
			  else { 
				  System.out.print("  ");
			  }}
	   for(int j=0;j<=n-1;j++) {
			  if(j==0||j==(n-1)||i==j
					  ) {
			  System.out.print("# ");
			
		  } 
			  else { 
				  System.out.print("  ");
			  }}
  System.out.print("   ");
  for(int j=0;j<=n-1;j++) {
	  if(j==0||j==n/2&&i!=0&&i!=(n-1)||
			  i==0&&j<n/2||
			  i==(n-1)&&j<n/2
			  ) {
	  System.out.print("# ");
	
  } 
	  else { 
		  System.out.print("  ");
	  }}
  for(int j=0;j<=n-1;j++) {
	  if(i==0&&j<n/2||(i==(n-1)&&j<n/2)
			  ||j==n/4
			  
			  ) {
	  System.out.print("# ");
	
  } 
	  else { 
		  System.out.print("  ");
	  }}
  for(int j=0;j<=n-1;j++) {
	  if(j==0||j==n/2||
			  (i==n/2&&j<=n/2)||
			  (i==0&&j<=n/2)
			  ) {
	  System.out.print("# ");
	
  } 
	  else { 
		  System.out.print("  ");
	  }}

	  System.out.println();
 
	}

}}


