package Week12;

public class Outer 
{
    private void getValue()
    {
        int sum = 20;

        class Inner
        {
            public int divisor;
            public int remainder;

            public inner()
            {
                divisor = 4;
                remainder = sum % divisor;
            }
            private int getDivisor()
            {
                return divisor;
            }
            private int getRemainder()
            {
                return sum % divisor;
            }
            private int getQuotient()
            {
            System.out.println("Inside inner class");
            return sum / divisor;
            }
        }
        Inner inner = new Inner();
        System.out.println("Divisor");
        System.out.println("Remainder");
    }

    public static void main(String[] args){
        Outer outer = new Outer();
        outer.getValue();
    }
}
