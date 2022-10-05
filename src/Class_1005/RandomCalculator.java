package Class_1005;

public class RandomCalculator {
    private int a;
    private int randomNum;

    public int getRandomNum(){
        int v = (int)(Math.random() * 9);
        if(v==0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }
        return v;
    }
    public RandomCalculator(int a) {
        this.a = a;
        this.randomNum = getRandomNum();
    }

    public int plus(){
        return a+randomNum;
    }

    public int minus(){
        return a-randomNum;
    }

    public int multiple(){
        return a*randomNum;
    }

    public float divide(){
        float result = 0;
        try{
            result =  (float) a / randomNum;
        }catch(Exception e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
        }
        return result;
    }
}
