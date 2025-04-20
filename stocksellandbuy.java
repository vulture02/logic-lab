package DSA;



public class stocksellandbuy {
    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
        System.out.println(maxProfit(price));

//        maxProfit(price);
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int idx = 0;
        int max=0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                idx = i;

            }
        }
        for (int j=idx+1;j<prices.length;j++){
            int diff=prices[j]-min;
            if(diff>max){
                max=diff;

            }

        }
        return max;


    }




    }

