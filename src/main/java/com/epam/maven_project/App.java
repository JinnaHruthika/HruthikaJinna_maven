package com.epam.maven_project;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int total_wt = 0,qnt = 0,wt = 0,totalbox_weight = 0,i=0,totwt=0;
		String s[]= {"dairymilk","fivestar","kajubarfi","maisurpak"};
		int[] a = new int[4];
        char n1;
        sweets collect;
        Boolean n=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("select different sweets from below");
        while(n)
        {
        	System.out.println("Available Sweets:");
        	System.out.println("1.Dairymilk");
        	System.out.println("2.fivestar");
        	System.out.println("3.kajubarfi");
        	System.out.println("4.maisurpak");
        	System.out.println("Select from the above sweets");
        	switch(sc.next().charAt(0))
        	{
        	case '1': System.out.println("Enter the quantity of Dairymilk: ");
        			  qnt=sc.nextInt();
        			  System.out.println("Enter the weight in grams: ");
        			  wt=sc.nextInt();
        			  collect= new dairymilk();
        			  totwt=qnt*wt;
        			  total_wt=collect.totalwt( qnt, wt);
        			  totalbox_weight=totalbox_weight+total_wt;
        			  System.out.println("Total weight of the box:" + total_wt);
        			  a[0]+=totwt;
        			  
        			  totwt=0;
        			  System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
        			  System.out.println("do you want to add any other item (y/n)");
   	        	      n1=sc.next().charAt(0);
   	        	      if(n1=='y'|| n1=='Y')
   	        	        { 
   	        	    	  n=true;
   	        	          break;
   	        	        }
   	        	     else
   	        		    {
   	        	    	 n=false;
   	                     System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
   	                     break;
   	                    }
        	case '2': System.out.println("Enter the quantity of fivestar: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new dairymilk();
			  totwt=qnt*wt;
			  total_wt=collect.totalwt( qnt, wt);
			  totalbox_weight=totalbox_weight+total_wt;
			  System.out.println("Total weight of the box:" + total_wt);
			  a[1]+=totwt;
			  
			  totwt=0;
			  System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
			  System.out.println("do you want to add any other item (y/n)");
     	      n1=sc.next().charAt(0);
     	      if(n1=='y'|| n1=='Y')
     	        { 
     	    	  n=true;
     	          break;
     	        }
     	     else
     		    {
     	    	 n=false;
                  System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
                  break;
                 }
        	case '3': System.out.println("Enter the quantity of kajubarfi: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new dairymilk();
			  totwt=qnt*wt;
			  total_wt=collect.totalwt( qnt, wt);
			  totalbox_weight=totalbox_weight+total_wt;
			  System.out.println("Total weight of the box:" + total_wt);
			  a[2]+=totwt;
			  
			  totwt=0;
			  System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
			  System.out.println("do you want to add any other item (y/n)");
   	      n1=sc.next().charAt(0);
   	      if(n1=='y'|| n1=='Y')
   	        { 
   	    	  n=true;
   	          break;
   	        }
   	     else
   		    {
   	    	 n=false;
                System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
                break;
               }
        	case '4': System.out.println("Enter the quantity of maisurpak: ");
			  qnt=sc.nextInt();
			  System.out.println("Enter the weight in grams: ");
			  wt=sc.nextInt();
			  collect= new dairymilk();
			  totwt=qnt*wt;
			  total_wt=collect.totalwt( qnt, wt);
			  totalbox_weight=totalbox_weight+total_wt;
			  System.out.println("Total weight of the box:" + total_wt);
			  a[3]+=totwt;
			  
			  totwt=0;
			  System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
			  System.out.println("do you want to add any other item (y/n)");
   	      n1=sc.next().charAt(0);
   	      if(n1=='y'|| n1=='Y')
   	        { 
   	    	  n=true;
   	          break;
   	        }
   	     else
   		    {
   	    	 n=false;
                System.out.println("Total weight of gift box is:"+totalbox_weight+"grams");
                break;
               }
    	
    }
        }  
        System.out.println("Enter the range in which you need to have total weights of the sweets");
        int w=sc.nextInt();
        int k=sc.nextInt();
        
        for( i=0;i<=3;i++)
        {
        	if(a[i]<=k && a[i]>=w)
        	{
        		System.out.println(s[i]+" :" + a[i]+"\n");
        	}
        }
        sc.close();
    }
}
