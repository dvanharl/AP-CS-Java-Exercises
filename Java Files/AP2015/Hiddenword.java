public class Main {
  public static void main (String[] args)
  {
    HiddenWord puzzle = new HiddenWord("HARPS");
    System.out.println(puzzle.getHint("AAAAA"));
    System.out.println(puzzle.getHint("HELLO"));
    System.out.println(puzzle.getHint("HEART"));
    System.out.println(puzzle.getHint("HARMS"));
    System.out.println(puzzle.getHint("HARPS"));
  }
}

public class HiddenWord
{

private String hiddenWord;

public HiddenWord(String hiddenWord)
{
  this.hiddenWord = hiddenWord;
}

public String getHint(String guess)
{
  String retword = "";
  for(int i =0 ; i< guess.length() ; i++)
    {
      if(hiddenWord.substring(i,i+1).equals(guess.substring(i,i+1)))
      {
        retword += guess.substring(i,i+1);
      }
      else if(hiddenWord.contains(guess.substring(i,i+1)))
      {
        retword += "+";
      }
      else
      retword += "*";
    }
  return retword;
}
}