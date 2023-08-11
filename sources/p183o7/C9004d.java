package p183o7;

/* renamed from: o7.d */
/* compiled from: Protobuf */
public @interface C9004d {

    /* renamed from: o7.d$a */
    /* compiled from: Protobuf */
    public enum C9005a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    C9005a intEncoding() default C9005a.DEFAULT;

    int tag();
}
