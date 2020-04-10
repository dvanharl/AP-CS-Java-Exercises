public class Delimiters
{
	/** The open and close delimiters. */
	private String openDel;
	private String closeDel;

	/** Constructs a Delimiters object where open is the open delimiter and close is the
	* close delimiter.
	* Precondition: open and close are non-empty strings.
	*/
	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	/** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
	public ArrayList<String> getDelimitersList(String[] tokens)
	{
		char c;
		String str;
		ArrayList<String> delList = new ArrayList<String>();
		for(int i = 0; i < tokens.length(); i++){
			c = tokens.charAt(i);
			str = String.valueOf(c);
			if(str.equals(openDel)||str.equals(closeDel)){
				delList.add(str);
			}
		}
		return delList;
	}

	/** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
	* Precondition: delimiters contains only valid open and close delimiters.
	*/
	public boolean isBalanced(ArrayList<String> delimiters)
	{
		int openCount = 0;
		int closeCount = 0;
		String del;
		for(int i = 0; i < delimiters.size(); i++){
			del = delimiters.get(i);
			if(del.equals(openDel)){
				openCount++;
			}else if(del.equals(closeDel)){
				closeCount++;
			}

			if(closeCount > openCount){
				return false;
			}
		}
		return (openCount == closeCount);
	}

	// There may be instance variables, constructors, and methods that are not shown.
} 