package com.mycompany.csc229_lab01_work;

public class LabWork {
    
    public int sumPrime(int n){
       int sum = 0;
       for(int i = 0; i < n; i++){
           if(isPrime(i) == true)
               sum += i;
       }
       
       return sum;
    }
    
    public int sumPrimewith3(int n){
        int sum = 0; 
        for(int i = 0; i < n; i++){
            if((isPrime(i) && hasDigit3(i)) == true )
                sum+= i;
        }
        
        return sum;
    }
    
    public static int sumPrimewith3and5(int n){
        int sum = 0; 
        for(int i = 0; i < n; i++){
            if((isPrime(i) && hasDigit3(i) && hasDigit5(i)) == true )
                sum+= i;
        }
        
        return sum;
    }
    
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++)
        {
            if((n % i) == 0)
                return false;
        }
        return true;
    }
    
    public static boolean hasDigit3(int n){
        String str = ""+n;
        
        return str.contains("" +3);
    }
    
    public static boolean hasDigit5(int n){
        String str = ""+n;
        
        return str.contains("" +5);
    }
    
    public static void main(String[] args) {
        System.out.println(sumPrimewith3and5(200));
    }
    
}
