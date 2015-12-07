Bank account kata
=================

Think of your personal bank account experience  
When in doubt, go for the simplest solution  

Requirements
------------

* Deposit and Withdrawal  
* Transfer  
* Account statement (date, amount, balance)  
* Statement printing  

Given a client makes a deposit of 1000 on 10-01-2012  
and a deposit of 2000 on 13-01-2012  
and a withdrawal of 500 on 14-01-2012  
when she prints her bank statement then she would see:


    date       || credit    || debit  || balance
    --------------------------------------------
    14/01/2012 ||           || 500.00 || 2500.00
    13/01/2012 || 2000.00   ||        || 3000.00
    10/01/2012 || 1000.00   ||        || 1000.00
    
The statement should be printed on console, you can introduce some kind of mocked console which prints to SOUT.