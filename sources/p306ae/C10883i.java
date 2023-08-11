package p306ae;

/* renamed from: ae.i */
/* compiled from: Settings */
public final class C10883i {

    /* renamed from: a */
    private int f16746a;

    /* renamed from: b */
    private int f16747b;

    /* renamed from: c */
    private int f16748c;

    /* renamed from: d */
    private final int[] f16749d = new int[10];

    /* renamed from: a */
    public int mo45868a(int i) {
        return this.f16749d[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo45869b() {
        if ((this.f16746a & 2) != 0) {
            return this.f16749d[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo45870c(int i) {
        if ((this.f16746a & 32) != 0) {
            return this.f16749d[5];
        }
        return i;
    }

    /* renamed from: d */
    public boolean mo45871d(int i) {
        if (((1 << i) & this.f16746a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public C10883i mo45872e(int i, int i2, int i3) {
        int[] iArr = this.f16749d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.f16746a |= i4;
        if ((i2 & 1) != 0) {
            this.f16747b |= i4;
        } else {
            this.f16747b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.f16748c |= i4;
        } else {
            this.f16748c &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo45873f() {
        return Integer.bitCount(this.f16746a);
    }
}
