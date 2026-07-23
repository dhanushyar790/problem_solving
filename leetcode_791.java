class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans=new StringBuilder();
        for(char i:order.toCharArray()){
            for(char j : s.toCharArray()){
                if(i==j){
                    ans.append(j);
                }
                
            }
        }
        for(char i:s.toCharArray()){
            if(!order.contains(String.valueOf(i))){
                ans.append(i);
            }
        }
        return ans.toString();
    }
}
