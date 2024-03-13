package Exceptions;

import java.io.FileNotFoundException;

public class ExceptionProcess extends NumberSystem {


   // public boolean ExceptionProcess(int number) throws CheckedException {
//        if (number % 1 == 0) {
//
//        } else {
//
//        return true;
        //  }

        public boolean ExceptionProcessOdd ( int number) throws UncheckedExceptions, CheckedException {
            if (number % 2 == 0) {
                System.out.println("Processing even number in uncheckedException");
                throw new CheckedException(ErrorCode.Even_Ex.code, ErrorCode.Even_Ex.code);
            } else {
                System.out.println("Processing odd number in CheckedException");

                throw new UncheckedExceptions(ErrorCode.Odd_Ex.code, ErrorCode.Odd_Ex.message);
            }
        }
    }
