
public class StringToSubstring
{
	    
	public static void main(String args[])
	{
		int val;  //return value stored in val
		
		Check c= new Check();	//object of class Check
		
		val= c.checkSub();
		
		//val>=0 if substring is found else val==-1.Val has the position of substring
		if (val>-1)			
			System.out.println("Substring found at position "+val);
		else
			System.out.println("Substring not found");
		
	}
}
	    
	 

class Check
{
	String str = "Hello how are you";  //string
    String sub = "how";					//sub string to be searched
    
    char s[]=str.toCharArray();		//convert string to character array
    char su[]=sub.toCharArray();
        
    //method for checking sub string 
    public int checkSub() 
	  {
    	int strlen=s.length;		//length of string stored
    	int sublen=su.length;		//length of sub string stored
    	
	        for (int i = 0; i < strlen-sublen+1; i++)
	        {
	            for (int j = 0; j < sublen; j++)
	            {
	                if (s[i + j] == su[j])
	                {
	                    if (j == sublen - 1)
	                    {
	                        return i+1;		//return position(index+1)
	                    }
	                } 
	                else
	                {
	                    break;
	                	
	                }
	            }
	        }
			return -1;			//return -1 when substring is not found
	    }
	}
    
    
