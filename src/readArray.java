public class readArray
{
    private int[] numbers;
    public readArray(int[] numbers)
    {
        this.numbers = numbers;
    }
    public String getArray()
    {
        String output = "";
        for (int count = 0; count < numbers.length; count++)
        {
            output += numbers[count] + " ";
        }
        return output;
    }
    public String getInputCount()
    {
        String output = "";
        for (int i = 0; i < numbers.length; i++)
        {
            int testedNumber = numbers[i];
            int count = 0;
            for (int x = 0; x < numbers.length; x++)
            {
                if (numbers[x] == testedNumber)
                {
                    count++;
                }
            }
            output += "\n" + testedNumber + " was entered " + count + " times!";
        }
        return output;
    }
    public String generateChart()
    {
        String output = "";
        String temp = "";

        temp = "0-10    | ";
        for (int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] >= 0 && numbers[i] <= 10)
            {
                temp += "*";
            }
        }
        output += temp;

        int lowestValueOfRange = 11;
        for (int range = 0; range < 4; range ++) {
            temp = lowestValueOfRange + "-" + (lowestValueOfRange + 9) + "   | ";
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= lowestValueOfRange && numbers[i] <= lowestValueOfRange + 9) {
                    temp += "*";
                }
            }
            output += "\n" + temp;
            lowestValueOfRange += 10;
        }
        return output;
    }
}