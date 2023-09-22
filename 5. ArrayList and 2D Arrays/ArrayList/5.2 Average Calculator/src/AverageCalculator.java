import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        int suma = 0;
        int contador = 0;
        for(int number:numbers){
            suma += number;
            contador += 1;

        }double division = suma / contador;
        return  division;

    }
}