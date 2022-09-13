package Problems;

public class NumberOfDigitsInANumber {
    int InputNumber;

    public void setInputNumber(int InputNumber)
    {
        this.InputNumber = Math.abs(this.InputNumber);;
    }

    public int checkNumberOfDigits()
    {
        int NumberOfDigits;
        NumberOfDigits = (int) Math.log10(Math.abs(this.InputNumber)) + 1;
        return NumberOfDigits;
    }
}

//To be in the main
/*NumberOfDigitsInANumber obj = new NumberOfDigitsInANumber();
obj.setInputNumber(6);
int NumberOfDigits = obj.checkNumberOfDigits();
System.out.println("Number of digits    " + NumberOfDigits);

Class test = obj.getClass();
System.out.println(test.getDeclaredMethods().length);
S

String Title = "1773. Count Items Matching a Rule";
String Link= "https://leetcode.com/problems/count-items-matching-a-rule/";
String Difficulty= ":cake:";
String SolutionEmoji = ":eyes:";
String Solution = "LeetCode%20Solutions/Count%20Items%20Matching%20a%20Rule.java";
int Runtime = 3;
System.out.println("|["+Title+"]("+Link+")|"+Difficulty+"|[Java "+SolutionEmoji+"](./"+Solution+")|"+Runtime+" ms|");*/
