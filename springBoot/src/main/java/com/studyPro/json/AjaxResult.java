package com.studyPro.json;

import java.util.Calendar;

/**
 * @author 范富强
 * @description
 * @date 2018/1/9 15:20
 */
public class AjaxResult {

    private static final String OK = "ok";
    private static final String ERROR = "error";

    private Meta meta;
    private Object data;

    public AjaxResult success(){
        this.meta = new Meta(true, OK);
        return this;
    }

    public AjaxResult success(Object data){
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    public AjaxResult failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    public AjaxResult failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    private class Meta{
        private boolean result;
        private String msg;

        public Meta(boolean result) {
            this.result = result;
        }

        public Meta(boolean result, String msg) {
            this.result = result;
            this.msg = msg;
        }

        public boolean isResult() {
            return result;
        }

        public void setResult(boolean result) {
            this.result = result;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

}
