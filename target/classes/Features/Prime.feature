Feature: Check the number is prime number or not

  Scenario: Verify Number is Prime Number
  When  I Call the method isPrime with 5
  Then the Method should return "True"
  
  Scenario: Verify Number is not a Prime Number
  When  I Call the method isPrime with 4
  Then the Method should return "False"
  
    #Scenario: Verify negative number is prime/not
    #When  I Call the method isPrime with -5
    #Then the Method should return False
    
    
 
  
  
   