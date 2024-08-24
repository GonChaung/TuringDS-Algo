package sorting;

public class PalindroneProblem {
    public boolean palindrone(String str){
        int leftPointer = 0;
        int rightPointer = str.length()-1;
        while (leftPointer < rightPointer){
            if(str.charAt(leftPointer) != str.charAt(rightPointer)){
                return false;
            }
            leftPointer ++;
            rightPointer --;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindroneProblem palin = new PalindroneProblem();
        Boolean pb = palin.palindrone("abba");
        System.out.println(pb);
    }
}
