class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int count = 0;
        if(a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a+ " "+b);
        int sqrt_result = log2((double)2,(double)n);
        for(int i =0;i<sqrt_result;i++){
            count++;
            if((a+1 == b) && (a%2 == 1)){
                answer = count;
                break;
            }
            if(a%2 == 0)
                a = a/2;
            else
                a = (a+1)/2;
            if(b%2 == 0)
                b = b/2;
            else
                b = (b+1)/2;
            
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
    public static int log2(double i,double j){
        return (int)(Math.log10(j)/Math.log10(i));
    }
}