package p446vd;

/* renamed from: vd.o */
/* compiled from: ScreenSize */
public final class C13634o {

    /* renamed from: a */
    public final int f21950a;

    /* renamed from: b */
    public final int f21951b;

    public C13634o(int i, int i2) {
        this.f21950a = i;
        this.f21951b = i2;
    }

    /* renamed from: a */
    public int mo53286a() {
        int i = this.f21950a;
        int i2 = this.f21951b;
        if (i > i2) {
            return i;
        }
        return i2;
    }

    /* renamed from: b */
    public int mo53287b() {
        int i = this.f21950a;
        int i2 = this.f21951b;
        if (i < i2) {
            return i;
        }
        return i2;
    }

    /* renamed from: c */
    public boolean mo53288c() {
        if (this.f21950a > 0 && this.f21951b > 0) {
            return true;
        }
        return false;
    }
}
