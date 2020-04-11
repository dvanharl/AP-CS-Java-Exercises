public class Main {
  public static void main (String[] args)
  {
   String word = "TAN";
   System.out.print(scrambleWord(word));
  }

  public static String scrambleWord(String word)
  {
    String retword = "";
    for(int i = 0; i < word.length()  ; i++)
    {
      if( "A".equals(word.substring(i,i+1)) && !"A".equals(word.substring(i+1,i+2)))
        {
          retword += word.substring(i+1);
        retword += word.substring(i);
        i++;
        }
      else
      {
        retword += word.substring(i,i+1);
      }
    System.out.println(retword);
    }
    return retword;
  }
}

