package p306ae;

/* renamed from: ae.a */
/* compiled from: ErrorCode */
public enum C10867a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    

    /* renamed from: b */
    public final int f16679b;

    /* renamed from: c */
    public final int f16680c;

    /* renamed from: d */
    public final int f16681d;

    private C10867a(int i, int i2, int i3) {
        this.f16679b = i;
        this.f16680c = i2;
        this.f16681d = i3;
    }

    /* renamed from: a */
    public static C10867a m23164a(int i) {
        for (C10867a aVar : values()) {
            if (aVar.f16679b == i) {
                return aVar;
            }
        }
        return null;
    }
}
