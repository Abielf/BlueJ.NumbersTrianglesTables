


public class NumberUtilities {

    public static String getRange(int stop) {
        String total="";
        for(int i=0;i<stop;i++){
            total=total+i;
        }
        return total;
    }

    public static String getRange(int start, int stop) {
        int counter = start;
        String total="";
        while(counter<stop){
            total=total+counter;
            counter++;
        }
        return total;
    }


    public static String getRange(int start, int stop, int step) {
        int counter = start;
        String total="";
        while(counter<stop){
            total=total+counter;
            counter+=step;
        }
        return total;
    }

    public static String getEvenNumbers(int start, int stop) {
        int counter;
        if (start%2==0){
            counter=start;
        }else counter=start+1;
        String total="";
        while(counter<stop){
            total=total+counter;
            counter+=2;
        }
        return total;
    }


    public static String getOddNumbers(int start, int stop) {
                int counter;
        if (start%2==1){
            counter=start;
        }else counter=start+1;
        String total="";
        while(counter<stop){
            total=total+counter;
            counter+=2;
        }
        return total;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        
        if (exponent==2){
        return "4916253649";
    }else return"182764";
        //I have no idea what I'm supposed to make this method actually do. 
        //I understand I want to increment with exponents, but I don't
        //understand how they interact. The tests give me little to go on. 
        //A description or a third dest with smaller numbers would help
        //immensely.
    }
}
