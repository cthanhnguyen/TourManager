package com.tour.web.model;

/**
 * Created by Administrator on 13/06/2015.
 */
public class DataWraper<T> {
    public static String errorAuthen = "403";
    boolean state;
    String errorCode;
    String mesage;
    T data;

    public DataWraper(boolean state, String errorCode, String mesage, T data) {
        this.state = state;
        this.errorCode = errorCode;
        this.mesage = mesage;
        this.data = data;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMesage() {
        return mesage;
    }

    public void setMesage(String mesage) {
        this.mesage = mesage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
