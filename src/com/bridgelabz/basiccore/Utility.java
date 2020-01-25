package com.bridgelabz.basiccore;

public class Utility {

	public String replaceName(String username)
	{
		String main="Hello <<username>>,How are you?";
		String output=main.replace("<<username>>", username);
		return output;
	}
	
	
	public int [] percentageOfFlipCoin(int flipCount)
	{
		int headPercentage,tailPercentage,head=0,tail=0,random;
		
		int [] ans=new int[2];
		for(int i=1;i<=flipCount;i++)
		{
			random=(int)(Math.random()*9);
			
			if(random>5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		}
		headPercentage=(head*100)/flipCount;
		tailPercentage=(tail*100)/flipCount;
		ans[0]=headPercentage;
		ans[1]=tailPercentage;
		return ans;
	}
}
