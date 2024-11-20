

import java.util.*;

public class Average {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> grades=new ArrayList<>();
		
		System.out.println("Enter student grade (enter -1 to end entering)");
		while(true) {
			System.out.print("Enter grade: ");
			int grade=sc.nextInt();
			
			if(grade==-1) {
				break;
			}
			if(grade<0 || grade >100) {
				System.out.println("***  Wrong grade. Please provide grade between 0-100  *** ");
				continue;
			}
			else {
				grades.add(grade);
			}
		}
		if(grades.size()==0) {
			System.out.println("Provide student grade");
		}
		else {
		
		double Average=AverageOfGrades(grades);
		int Highest=HighestGrade(grades);
		int Lowest=LowestGrade(grades);
		System.out.println();
		System.out.print("-------------------------");
		
		System.out.println();
		System.out.printf("Average : %10.2f\n" ,Average);
		System.out.printf("Highest : %10d \n" ,Highest);
		System.out.printf("Lowest  : %10d\n",Lowest);
		System.out.println("-------------------------");
		}
	}
	public static double AverageOfGrades(ArrayList<Integer> grades) {
		int sum=0;
		for(int num:grades) {
			sum+=num;
		}
		return (double)sum/grades.size();
	}
	public static int HighestGrade(ArrayList<Integer> grades) {
		int highest=grades.get(0);
		for(int num:grades) {
			if(num>highest) {
				highest=num;
			}
		}
		return highest;
	}
	public static int LowestGrade(ArrayList<Integer> grades) {
		int lowest=grades.get(0);
		for(int num:grades) {
			if(num<lowest) {
				lowest=num;
			}
		}
		return lowest;
	}
}
