package com.dailycodebuffer.demo.springboot.tutorial.errorHandler;

public class DepartmentErrorHandler extends Exception
{
    public DepartmentErrorHandler() {
        super();
    }

    public DepartmentErrorHandler(String message) {
        super(message);
    }

    public DepartmentErrorHandler(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentErrorHandler(Throwable cause) {
        super(cause);
    }

    protected DepartmentErrorHandler(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
