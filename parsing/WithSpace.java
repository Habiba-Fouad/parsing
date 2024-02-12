package parsing;

public class WithSpace {
    public static void main(String[] args) {
        String s="hany 2000 ahmed 3000 wael 2450";
        String [] result=s.split(" ");
        int sum=0;
        for (int i = 0; i < result.length; i++) {
            StringBuilder a =new StringBuilder(result[i]);
            if(Character.isDigit(a.charAt(0))){
                sum+=Integer.parseInt(result[i]);
            }
        }
        System.out.println(sum);
    }
}
