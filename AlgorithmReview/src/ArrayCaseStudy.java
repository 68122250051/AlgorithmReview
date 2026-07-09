public class ArrayCaseStudy {
    public static void main(String[] args) {

        int[] score = {6,8,4,9,7,5,10,3,8,2};

        int sum = 0;
        int max = score[0];
        int min = score[0];
        int count = 0;

        for(int i=0;i<score.length;i++){

            sum = sum + score[i];

            if(score[i]>max){
                max = score[i];
            }

            if(score[i]<min){
                min = score[i];
            }

            if(score[i]>=7){
                count++;
            }
        }

        System.out.println("Total = "+sum);
        System.out.println("Average = "+(double)sum/score.length);
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Student score >=7 = "+count);

        System.out.println("Need Review");

        for(int i=0;i<score.length;i++){
            if(score[i]<5){
                System.out.println("Student "+(i+1)+" Score "+score[i]);
            }
        }
    }
}