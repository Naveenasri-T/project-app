public class swap_without_temp {
    public static void main(String args[]){
        int a=20;
        int b=30;
        System.out.println("swap before a= "+a +", b= "+b);
        a=a+b ;  //  20+30=50
        b=a-b;   // now a=50, so 50-30=20
        a=a-b;  // 50-20 = 30
        System.out.println("after swap a="+a +" ,b="+b);
    }
    
}
