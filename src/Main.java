import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[19][19]; //19X19 2차원 배열(바둑판) 생성
        int num = sc.nextInt(); //흰 돌 갯수 입력

        for(int i=0;i<num;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a-1][b-1] = 1;  //흰 돌 좌표
        }

       for(int i=0;i<arr.length;i++){ //배열(바둑판) 출력
           for(int k=0;k<arr.length;k++){
               System.out.print(arr[i][k]+" ");
           }
           System.out.println();
       }
    }
}