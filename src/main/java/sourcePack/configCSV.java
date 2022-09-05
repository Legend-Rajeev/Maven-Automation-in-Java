package sourcePack;


public class ConfigCSV{
    public static void main(String[] args){        
        String names[] = {"Shivam", "Sani", "Thakur", "Govind Kumar singh", "Ramesh Singh", "Kumar sanu", "Salman Khan", "Chandan Chaudary", "raju"};
        int n = 9;
        Solution str = new Solution();
        str.solve(names, n);
    }
}

class Solution{
    public void solve(String names[], int n){
        int maxlen = 0;
        String ans = "";
        for(int i=0; i<n; i++){
            int temp = names[i].length();
            if(temp > maxlen){
                maxlen = temp;
                ans = names[i];
            }
        }
        System.out.println(ans);
//        System.out.println(names[n - 1]);
    }
}