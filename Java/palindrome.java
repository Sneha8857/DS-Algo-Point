/* PALINDROME FUNCTION */
class palindrome
{
   boolean Palin(int n)
   {
       int rev=0, t=n, dig;
       while(t>0)
       {
           dig=t%10;
           t=t/10;
           rev=(rev*10)+dig;
        }
        if ( n == rev)
           return true;
         else
             return false;
   }
