public class Prime {
    public static void main(String[] args) {
        for (int i=102;i<200;i++) {
            boolean isPrime=false;
            for (int k=2;k<=i-1;k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime=true;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }
}
