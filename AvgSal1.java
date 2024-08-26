package com.ece;

public class AvgSal1 {

	public static void main(String[] args) {
		int[] sal= {4000,2300,5000,23000,45000,8000,9000,4700,5600};
		int avg=0,sum=0,len;
		len=sal.length;
		for(int i=0;i<len;i++) {
			sum+=sal[i];
		 }
		avg=sum/len;
		for(int j=0;j<len;j++) {
			if(sal[j]<avg)
			{
			 sal[j]+=sal[j]/2;
			 System.out.println("The Final sal for "+j+ "th Employee is "+sal[j]);
			}
			else {
				System.out.println("The Final sal for "+j+ "th Employee is "+sal[j]);
			}
			}
		}
		 
		}