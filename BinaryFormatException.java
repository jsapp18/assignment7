public class BinaryFormatException{
    //I was a bit confused on what to make for this assignment, as the directions didnt quite make sense to me, hope this is sufficient
    private String binaryString;

    public BinaryFormatException(String binaryString){
        super(binaryString + "is not a valid binary string");
        this.binaryString = binaryString;
    }
}
