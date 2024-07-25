import java.util.Random;
public class OTP {
    public static void main(String[] args){
        Random random = new Random();

        int myOTP=random.nextInt(100);
        System.out.println("Your otp is " +myOTP);
    }
}
