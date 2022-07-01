public class Solution {
    public bool IsPalindrome(int x) {
    int nReversed = 0;
    int n=x;
    while (n > 0) 
    {
      nReversed = (nReversed * 10) + (n % 10);
      n = n / 10;
    }
        return x == nReversed;
    }
}
