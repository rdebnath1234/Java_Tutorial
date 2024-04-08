package com.company;

public class Program_23 {

	public static void main(String[] args) {
		// Add Two Matrix Size 2X3
		int [][] mat1 = {{1,4,5},
						 {5,8,9}
						};
		int [][] mat2 = {{10,3,7},
				         {0,-5,19}
				        };
		int [][] result = {{0,0,0},
				           {0,0,0}
						  };
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				result[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		System.out.println("The result of 2X3 matrix addition: ");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
