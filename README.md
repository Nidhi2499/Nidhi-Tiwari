- All the four programs have been coded in java language
- Program-1 => Calculator using class
    - created a class calculator having calculation method which accepts operands and operator as input.
    - used a switch block to check what operation needs to be performed
    - in main method intialised scanner object to get the inputs
    - after getting the inputs , these are passed as parameter to the calculation method in calculator class.
    - result is stored in a double result variable which then is printed to console.

- Program-2 => print odd number as many as the input given
    - in main method, initialised the scanner object to get the input a as to how many odd numbers need to be printed.
    - used for loop to increment  i =1 till it is equal to the input a.
    - inside the loop , we are printing the odd numbers by doubling i and then subtracting 1 in each iteration.

- Program-3 => print odd numbers as many as input odd numbers .
    - in main method , we get the input from the user
    - store the odd number in the count variable if the input even by subtracting 1 from it as we want only odd number of odd numbers as output even if input a is even.
    - we take int number initializing it to 1, started for loop running i till i = count
    - every iteration print number and incrementing it by 2.

- Program-4 => given list of numbers print the number of multiples in the list of numbers 1 to 9.
    - running for loop from 1 to 9 , initialize count variable to 1.
    - within that for loop, we run a for each loop for the integers in the given list to check if the numbers are divisible by that value of i.
    - increment count by 1 if the number is divisible.
    - end of for each loop print the i and multiple of i.