class Solution {
    public int countPrimeSetBits(int left, int right) {

        // Tc-> O(N)
        // Sc-> O(1)
        
        int countSetbits = 0;

        for(int i=left ;i<=right ; i++){
            int setBit = count(i);
            if(isPrime(setBit)) countSetbits++;
        }

        return countSetbits;
    }


    private int count(int num){
        int setbits = 0;
        while(num>0){
            num = (num) & (num-1);
            setbits++;
        }

        return setbits;
    }

    private  boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

}