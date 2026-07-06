class Solution {
    public String simplifyPath(String path) {
      String[] arr = path.split("/");
      Stack<String> stack = new Stack<>();
      for(String folder : arr){

    if(folder.isEmpty() || folder.equals(".")){
        continue;
    }
    else if(folder.equals("..")){
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    else{
        stack.push(folder);
         }
      }
      StringBuilder ans = new StringBuilder();
      for(String folder : stack){
    ans.append("/");
    ans.append(folder);
      }
    if(ans.length() == 0){
    return "/";
    }
    return ans.toString();
    }
}