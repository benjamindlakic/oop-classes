package lab6;

public class task2 {
    /*
     * Define a class for a type called CounterType. An object of this type is used
     * to count things, so it records a count that is a nonnegative whole number.
     * 
     * Include a mutator function that sets the counter to a count given as an
     * argument. Include member functions to increase the count by one and to
     * decrease the count by one.
     * Be sure that no member function allows the value of the counter to become
     * negative.
     * Also, include a member function that returns the current count value and one
     * that outputs the count. Embed your class definition in a test program.
     */

    /*
     * Define a class for a type called Fraction. This class is used to represent a
     * ratio of two integers. Include mutator functions that allow the user to set
     * the numerator and the denominator.
     * 
     * Also include a member function that returns the value of the numerator
     * divided by the denominator as a double. Include an additional member function
     * that outputs the value of the fraction reduced to lowest terms. For example,
     * instead of outputting 20/60 the function should output 1/3. This will require
     * finding the greatest common divisor for the numerator and denominator, and
     * then dividing both by that number. Embed your class in a test program.
     */
    /*
     * Create a Temperature class that internally stores a temperature in degrees
     * Kelvin. Create functions named setTempKelvin, setTempFahrenheit and
     * setTempCelsius that take an input temperature in the specified temperature
     * scale, convert the temperature to Kelvin, and store that temperature in the
     * class member variable.
     * 
     * Also, create functions that return the stored temperature in degrees Kelvin,
     * Fahrenheit, or Celsius. Write a main function to test your class. Use the
     * equations shown next to convert between the three temperature scales.
     * Kelvin = Celsius + 273.15
     * Celsius = (5.0/9) * (Fahrenheit - 32)
     * 
     */
    public static void main(String[] args) {
        ResultGrade student1=new ResultGrade(8, 6, 100, 100);
        student1.quizes();
        student1.midtermGrade();
        student1.finalGrade();
        student1.totalGrade();
        student1.printFinalGrade();
    }

}
