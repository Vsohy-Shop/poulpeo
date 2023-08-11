package p292z;

/* renamed from: z.a */
public enum C10730a {
    SHORT("yyyy-MM-dd"),
    LONG("yyyy-MM-dd kk:mm:ss"),
    ANDROID_LOGCAT("MM-dd kk:mm:ss.SSS"),
    CLOCK_12_HOUR("h:mm a");
    

    /* renamed from: b */
    private final String f16377b;

    private C10730a(String str) {
        this.f16377b = str;
    }

    public final String getFormat() {
        return this.f16377b;
    }
}
