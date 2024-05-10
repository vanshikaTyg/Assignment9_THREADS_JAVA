# Assignment9_THREADS_JAVA

### Overview
This program calculates the sum of numbers from 1 to a given positive integer n using multiple threads. The program divides the calculation task among multiple threads to improve performance.

### Classes and Methods
## SumCalculator Class
# Constructors
SumCalculator(int start, int end, String name):
    Constructor for creating a SumCalculator object.
    Parameters:
          start: Starting number for sum calculation.
          end: Ending number for sum calculation.
          name: Name of the thread.

# Public Methods
long getSum():
   Returns the calculated sum.

void run():
  Overrides the run() method of the Thread class.
  Calculates the sum of numbers from start to end.


## Main Class
# Methods
public static void main(String[] args):
     Entry point of the program.
     Creates multiple SumCalculator threads, divides the sum calculation task, and starts the threads.
     Waits for all threads to finish and then calculates the total sum.
     Outputs the total sum and thread properties.


### Thread Methods Used
## start() Method
  Used to start the execution of a thread.

## join() Method
   Used to wait for a thread to die.

## sleep(long millis) Method
  Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.

## getName() Method
   Returns the name of the thread.

## getId() Method
   Returns the identifier of this thread.

## getPriority() Method
   Returns the priority of this thread.

## isAlive() Method
   Tests if this thread is alive.
