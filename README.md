# ATM-Machine-Simulation
When the program starts, ask the user to enter a 4-digit PIN.
Correct PIN: 1234
The user has 3 attempts. If all attempts are used, print 'Your account has
been locked.' and terminate.
After Successful Login
Initial balance: 2500.75;
Display this menu repeatedly until Exit is selected:
========= ATM =========
1. Check Balance
2. Deposit
3. Withdraw
4. Show Account Status
5. Exit
=======================
Menu Options
1. Check Balance
▪ Display the current balance.
2. Deposit
▪ Ask for a deposit amount. It must be greater than 0; otherwise
print 'Invalid amount.'
▪ Update the balance if valid.

3. Withdraw
▪ Ask for an amount. It must be greater than 0 and not exceed the
balance.
▪ If it does, print 'Insufficient balance.' Otherwise subtract it.
4. Show Account Status
▪ VIP Customer (>=5000)
▪ Regular Customer (1000–4999.99)
▪ Low Balance (<1000).
5. Exit
Print 'Thank you for using our ATM.' and use the break statement to
terminate the loop.
Invalid Menu Choice
▪ If the user enters any option other than 1–5, display 'Invalid
option.'
========================
• Count successful deposit/withdrawal transactions and display the
total when exiting.
• If the withdrawal amount is 0, print 'Transaction cancelled.'
• If the balance becomes exactly 0, print 'Warning: Your account is
empty.'
• Display the updated balance after every successful deposit or
withdrawal.
