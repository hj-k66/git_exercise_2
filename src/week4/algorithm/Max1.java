package week4.algorithm;

public class Max1 {
    public int getMax(int[] arr){
        //loop 구성
        int maxValue = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i] > maxValue){
                maxValue = arr[i]
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61 };
        Max1 max1 = new Max1();
        int result = max1.getMax(arr);

        if(result == 85){
            System.out.println("테스트 통과");
        }else{
            System.out.println("테스트 실패, result : " + result);
        }


    }
}
