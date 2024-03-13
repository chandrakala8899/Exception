package RetryException;

public class SBIService {
    int i =0;
    public String transfer()  {
       i = i+1;
        System.out.println("SBI service I value " + i);
        if(i %2 == 0){
            throw new InsufficientFunds(ErrorCode.TIMEOut_Error_Code.getCode(),ErrorCode.TIMEOut_Error_Code.getMessage());
        }else {
            throw new TimeOutException(ErrorCode.INSUFFICIENT_ERROR_CODE.getCode(),ErrorCode.INSUFFICIENT_ERROR_CODE.getMessage());
        }
    }
}
