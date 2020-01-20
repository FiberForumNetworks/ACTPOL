import java.nio.charset.*

String uuid = UUID.randomUUID().toString().substring(1, 7)

String uuid1 = Date.julianCalendar.gregorianCalendar

println(uuid)

println(uuid1)

		int n = 20
  
        // lower limit for LowerCase Letters 
        int lowerLimit = 97
  
        // lower limit for LowerCase Letters 
        int upperLimit = 122
  
        Random random = new Random()
  
        // Create a StringBuffer to store the result 
        StringBuffer r = new StringBuffer(n)
  
        for (int i = 0; i < n; i++) { 
  
            // take a random value between 97 and 122 
            int nextRandomChar = lowerLimit + random.nextFloat() * (upperLimit - lowerLimit + 1)
                                 
                                         
	  
	            // append a character at the end of bs 
	            r.append((char)nextRandomChar)
	        } 
	  
	        // return the resultant string 
	        return r.toString()
 

  

