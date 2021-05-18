
public class FizzBuzz {
    public static String checkFizzBuzz(int number){
        boolean isFizz = number%3== 0;
        boolean isBuzz = number%5== 0;
        if (isFizz && isBuzz){
            return "FizzBuzz";
        }else if (isFizz){
            return "Fizz";
        }else if (isBuzz){
            return "Buzz";
        }else
            return changeNumberToString(number);
    }
    public static String changeNumberToString(int number){
        String st = "";
        int hangDonvi = number%10;
        int hangChuc = number/10;
        if (hangDonvi== 3 || hangChuc == 3){
            return "Fizz";
        }else if (hangDonvi== 5 || hangChuc == 5){
            return "Buzz";
        }
        else{
            if (number>10) {
                switch (hangChuc) {
                    case 1:
                        st += "muoi";
                        break;
                    case 2:
                        st += "hai";
                        break;
                    case 4:
                        st += "bon";
                        break;
                    case 6:
                        st += "sau";
                        break;
                    case 7:
                        st += "bay";
                        break;
                    case 8:
                        st += "tam";
                        break;
                    case 9:
                        st += "chin";
                        break;
                    default:
                        return st;
                }

            }
            switch (hangDonvi) {
                case 1:
                    st += " mot";
                    break;
                case 2:
                    st += " hai";
                    break;
                case 4:
                    st += " bon";
                    break;
                case 6:
                    st += " sau";
                    break;
                case 7:
                    st += " bay";
                    break;
                case 8:
                    st += " tam";
                    break;
                case 9:
                    st += " chin";
                    break;
            }
        }
        return st;
    }
}
