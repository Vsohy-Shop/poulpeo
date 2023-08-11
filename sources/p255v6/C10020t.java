package p255v6;

/* renamed from: v6.t */
/* compiled from: DeliveryMechanism */
public enum C10020t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: b */
    private final int f15083b;

    private C10020t(int i) {
        this.f15083b = i;
    }

    /* renamed from: a */
    public static C10020t m21016a(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    /* renamed from: b */
    public int mo44601b() {
        return this.f15083b;
    }

    public String toString() {
        return Integer.toString(this.f15083b);
    }
}
