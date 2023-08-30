 

import java.util.Scanner;

public class StudentGrade{
    Scanner scan =new Scanner(System.in);
    static int total=0;
    StudentGrade(){
        grade(average(markIn()));
    }
    int[] markIn(){
        System.out.println("Enter no of subjects:");
        int[] arr=new int[scan.nextInt()];
        total=100*arr.length;
        System.out.println("Enter marks(out of 100)");
        for(int x=0;x<arr.length;x++){
            arr[x]=scan.nextInt();
            if (arr[x]<0 || arr[x]>total){
                System.out.print("you entered out of limit marks re enter marks between 0 to 100 only : ");
                arr[x]=scan.nextInt();
            }
        }
        return arr;
    }
    int average(int[] arr){
        int sum=0;
        
        for(int x: arr){
            sum=sum+x;
        }
        System.out.println("total marks: "+sum);
        System.out.println("The average mark is "+ sum/arr.length);
        return sum/arr.length;
    }
    void grade(int sum){
        System.out.print("The grade :  ");
        if (sum<=90){
            System.out.println("A+");
        }
        else if(sum<=80){
            System.out.println("A");
        }
        else if(sum<=70){
            System.out.println("B+");
        }
        else if(sum<=60){
            System.out.println("B");
        }
        else if(sum<=50){
            System.out.println("C+");
        }
        else if(sum<=40){
            System.out.println("C");
        }
        else if(sum<=35){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
    public static void main(String[] args) {
        new StudentGrade();
    }
}
