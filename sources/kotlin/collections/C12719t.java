package kotlin.collections;

/* renamed from: kotlin.collections.t */
/* compiled from: CollectionsJVM.kt */
public final class C12719t {

    /* renamed from: a */
    public static final C12719t f20381a = new C12719t();

    /* renamed from: b */
    public static final boolean f20382b;

    static {
        boolean z;
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        if (property != null) {
            z = Boolean.parseBoolean(property);
        } else {
            z = false;
        }
        f20382b = z;
    }

    private C12719t() {
    }
}
