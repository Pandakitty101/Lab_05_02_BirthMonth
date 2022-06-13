public class BirthMonth {
    public static void main(String[] args)
    {
        int birthMonth = 15;
        int smallestBirthMonth = 1;
        int largestBirthMonth = 12;

        if (birthMonth > smallestBirthMonth && birthMonth < largestBirthMonth)
        {
            System.out.println("Your birth month is " + birthMonth);
        }
        else
        {
            System.out.println("Invalid birth month: " + birthMonth);
        }
    }
}
