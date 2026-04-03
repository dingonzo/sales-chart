# Sales-Chart
[![Android CI](https://github.com/dingonzo/sales-chart/actions/workflows/android.yml/badge.svg)](https://github.com/dingonzo/sales-chart/actions/workflows/android.yml)
#
A simple Java console application that generates a visual bar chart representing daily sales for five different store locations.

# Description
This is a console-based data visualization tool that creates a horizontal bar chart based on user input
- Data Collection
The program uses a Scanner to read input from the keyboard. It then initializes an integer array of size 5 to store sales figures for five different "stores". A for loop iterates five times, prompting the user for a value and storing each one in the array.
- Unit Conversion
To generate the chart, the code performs a specific calculation: arr[i] / 100. This means each asterisk (*) represents exactly $100 in sales. For example, if you enter "300," the program calculates that 3 asterisks should be displayed. 
- Visual Output
The program prints "SALES BAR CHART" as a header. It uses nested loops to build the chart: Outer Loop: Iterates through each store (1 through 5). Inner Loop: Prints the correct number of asterisks side-by-side on the same line for that specific store. After printing the asterisks for one store, it uses System.out.println() to move to the next line for the next store.
