// Write a change amount program
// The purchase amount must be less than $1 and calculate the change from purchase amount, the change is for $1
// how many quarters, dime, nickel, or pennies would someone get back
// try to come up with minimum number of coins as a change
public class HelloWorld {
    public static void main(String[] args) {
        int purchaseAmount = 13;
        int paymentAmount = 100;
        int calculatedAmount = paymentAmount - purchaseAmount;
        int quat=calculatedAmount/20;
        int rem=calculatedAmount%20;
        System.out.println("Change Amount: "+calculatedAmount);
        int remainder=1;
        int amount20 = 0,amount10 = 0,amount5 = 0, amount1 = 0;
        while(remainder!=0){
            if(calculatedAmount>=20){
                amount20=calculatedAmount/20;
                remainder=calculatedAmount%20;
                calculatedAmount = remainder;
                System.out.println("20 dollar bill: "+ amount20);

            }else if(calculatedAmount>=10){
                amount10=calculatedAmount/10;
                remainder=calculatedAmount%10;
                calculatedAmount = remainder;
                System.out.println("10 dollar bill: "+ amount10);

            }else if(calculatedAmount>=5){
                amount5=calculatedAmount/5;
                remainder=calculatedAmount%5;
                calculatedAmount = remainder;
                System.out.println("5 dollar bill: "+ amount5);

            }else {
                 amount1=remainder;
                 remainder=0;
                System.out.println("1 dollar bill: "+ amount1);

            }
        }
    }
}
