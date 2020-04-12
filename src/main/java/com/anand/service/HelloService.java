package com.anand.service;
import org.springframework.stereotype.Service;
import java.util.*;
@Service("helloService")
public class HelloService {
public String sayHello(String name) {
	return "\nHello "+name+" Welcome to Spring Boot Application";
}
public boolean check(int a[],int k)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==k)
			return true;
	}
	return false;
}
public void playGame()
{
	Random r=new Random();
	int result_analysis_array[]={12,23,31};
	int[][] result_store_array=new int[4][4];
		for(int i=0;i<result_store_array.length;i++)
			for(int j=0;j<result_store_array.length;j++)
				result_store_array[i][j]=0;
	int counter=1;
	String show_array[]={"paper","rock","scissors"};
	int[] player_choice_array=new int[4];
	while(counter<=50)
	{
		System.out.print("\nIteration No:-"+(counter));
		for(int i=0;i<player_choice_array.length;i++)
			player_choice_array[i]=r.nextInt(3)+1;
		//int choice[]={2,2,1,3};			
		System.out.println("\n"+"\t\tPlayer1\t\tPlayer2\t\tPlayer3\t\tPlayer4");
		for(int i=0;i<player_choice_array.length;i++)
			System.out.print("\t       "+show_array[player_choice_array[i]-1]);
		System.out.println("\n\n"+"\t\tPlayer1\t\tPlayer2\t\tPlayer3\t\tPlayer4");
		for(int i=0;i<player_choice_array.length;i++)
		{	for(int j=0;j<=player_choice_array.length;j++)
			{
				if(j==0)
				{
					System.out.print("Player"+(i+1)+"\t\t");
					continue;
				}
				if(check(result_analysis_array,Integer.parseInt(String.valueOf(player_choice_array[i])+String.valueOf(player_choice_array[j-1])))==true)
				{
					result_store_array[i][j-1]=result_store_array[i][j-1]+1;
				}
					if(i==(j-1))
						System.out.print("_"+"\t\t");
					else
						System.out.print(result_store_array[i][j-1]+"\t\t");
			}
				System.out.println();
		}
		counter=counter+1;
	}
}
}
