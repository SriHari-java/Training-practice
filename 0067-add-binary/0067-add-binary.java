class Solution {
    public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int rem = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || rem == 1) 
    {
      if(i >= 0)
        rem += a.charAt(i--) - '0';
      if(j >= 0)
        rem += b.charAt(j--) - '0';
      sb.append(rem% 2);
      rem /= 2;
    }
    return sb.reverse().toString();
  }
}