package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Methods
{
	public static void main(String[] args) 
	{
		//System.out.println("*****SIMPLE*****\n");
		List<String> list = new ArrayList<String>();
		list.add("Rahel");
		list.add("Pratiksha");
		list.add("Arti");
		list.add("Monali");
		list.add("Poonam");
		list.add("Yogita");
		System.out.println("Simple List :\n"+list);
		
		//*****Collections.addAll()*****
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1,"Sara","John","Sharon","Siyon","Genesis");
		System.out.println("\nHere Is Collections addAll Method() :\n"+list1);
		
		//*****Collections.binarySearch()*****
		List<String> list2 = new ArrayList<String>();
		Collections.addAll(list2,"Sara","John","Sharon","Siyon","Genesis");
		int index=Collections.binarySearch(list2, "Sara");
		System.out.println("\nHere Is Collections Binary Search Method() INDEX :\n"+index);
		
		//*****Collections.disjoint()*****
		List<String> list3 = new ArrayList<String>();
		Collections.addAll(list3,"Sara","John","Sharon","Simran","Genesis");

		List<String> list4 = new ArrayList<String>();
		Collections.addAll(list4,"Rahel","Pratiksha","Arti","Siyon","Monali");
		
		System.out.println("\nHere Is Collections Disjoint Method() :");
		boolean isCommon = Collections.disjoint(list3 ,list4);
		System.out.println("Not Found Any Common Elements !!!\n"+isCommon);
		
		//*****Collections.fill()*****
		List<String> list5 = new ArrayList<String>();
		Collections.addAll(list5,"Sara","John","Sharon","Siyon","Genesis");
		System.out.println("\nOrginal List :"+list5);
		Collections.fill(list5, "Simran");
		System.out.println("Here Is After Collections Fill Method() :\n"+list5);
		

		//*****Collections.frequency()*****
		List<String> list6 = new ArrayList<String>();
		Collections.addAll(list6,"Sara","John","Sharon","Siyon","Genesis","John","John");
		System.out.println("\nActual List :"+list6);
		System.out.println("Here Is Collections Frequency Method() of John :\n"+Collections.frequency(list6, "John"));
		

		//*****Collections.max()*****
		List<Integer> list7 = new ArrayList<Integer>();
		Collections.addAll(list7,99,88,55,77,33,22,11,111);
		System.out.println("\nOrginal List :"+list7);
		int max = Collections.max(list7);
		System.out.println("Here Is After Collections max Method() of Maximum Number :\n"+max);
		
		//*****Collections.min()*****
		List<Integer> list8 = new ArrayList<Integer>();
		Collections.addAll(list8,99,88,55,77,33,22,11,111);
		System.out.println("\nOrginal List :"+list8);
		int min = Collections.min(list8);
		System.out.println("Here Is After Collections min Method() of Minimum Number :\n"+min);
		
		//*****Collections.replaceAll()*****
		List<String> list9 = new ArrayList<String>();
		Collections.addAll(list9,"Rahel","Pratiksha","Rahel","Rahel","Monali");
		System.out.println("\nOrginal List :"+list9);
		boolean isReplace = Collections.replaceAll(list9, "Rahel", "Rachel");
		System.out.println("Here Is After Collections replaceAll Method() :\n"+list9);
		
		
	}

}
