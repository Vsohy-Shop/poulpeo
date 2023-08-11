package com.facebook;

public class FacebookDialogException extends FacebookException {
    static final long serialVersionUID = 1;

    /* renamed from: c */
    private int f4097c;

    /* renamed from: d */
    private String f4098d;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f4097c = i;
        this.f4098d = str2;
    }

    /* renamed from: a */
    public int mo31477a() {
        return this.f4097c;
    }

    /* renamed from: b */
    public String mo31478b() {
        return this.f4098d;
    }

    public final String toString() {
        return "{FacebookDialogException: " + "errorCode: " + mo31477a() + ", message: " + getMessage() + ", url: " + mo31478b() + "}";
    }
}
