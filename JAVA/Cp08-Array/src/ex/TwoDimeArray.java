package ex;

public class TwoDimeArray {

   public static void main(String[] args) {
            
      // 1 차원 배열 선언, 생성
      int[][] arr = new int[3][4];
      
      // arr[행의 위치][1차원 배열의 index]
      // arr[0~2][0~3]
      
      System.out.println("2차원 배열의 size : " +arr.length);
      System.out.println("arr[0] 1차원 배열의 size : " +arr[0].length);
      System.out.println("arr[1] 1차원 배열의 size : " +arr[1].length);
      System.out.println("arr[2] 1차원 배열의 size : " +arr[2].length);
      
      System.out.println("----------------------------------");
      
      
      // 2차원 배열의 요소 참조 방법
            // 2차원 배열의 행의 반복
            for(int i=0;i<arr.length;i++) {
               
               // 1차원 배열의 요소 참조 반복
               for(int j=0; j<arr[i].length;j++) {
                  
                  arr[i][j]=i+j;
                  
               }
               
               //개행
               System.out.println();
               
            }
            
            
      
      // 2차원 배열의 요소 참조 방법
      // 2차원 배열의 행의 반복
      for(int i=0;i<arr.length;i++) {
         
         // 1차원 배열의 요소 참조 반복
         for(int j=0; j<arr[i].length;j++) {
            System.out.print(arr[i][j]+"\t");
         }
         
         //개행
         System.out.println();
         
      }
      
      
      
   }

}