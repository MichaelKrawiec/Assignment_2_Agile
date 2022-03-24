public class ConversionExceptionHandler extends Exception {

    String message;

    public ConversionExceptionHandler(String errMessage){
        message = errMessage;
    }

    public String getMessage() {
        return message;
    }


}
