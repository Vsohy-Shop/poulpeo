package p471ze;

/* renamed from: ze.j */
/* compiled from: OpenHashSet */
public final class C14117j<T> {

    /* renamed from: a */
    final float f23189a;

    /* renamed from: b */
    int f23190b;

    /* renamed from: c */
    int f23191c;

    /* renamed from: d */
    int f23192d;

    /* renamed from: e */
    T[] f23193e;

    public C14117j() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    static int m32770c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo53892a(T t) {
        T t2;
        T[] tArr = this.f23193e;
        int i = this.f23190b;
        int c = m32770c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                c = (c + 1) & i;
                t2 = tArr[c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[c] = t;
        int i2 = this.f23191c + 1;
        this.f23191c = i2;
        if (i2 >= this.f23192d) {
            mo53894d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] mo53893b() {
        return this.f23193e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53894d() {
        T t;
        T[] tArr = this.f23193e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f23191c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    t = tArr[length];
                } while (t == null);
                int c = m32770c(t.hashCode()) & i2;
                if (tArr2[c] != null) {
                    do {
                        c = (c + 1) & i2;
                    } while (tArr2[c] != null);
                }
                tArr2[c] = tArr[length];
                i3 = i4;
            } else {
                this.f23190b = i2;
                this.f23192d = (int) (((float) i) * this.f23189a);
                this.f23193e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean mo53895e(T t) {
        T t2;
        T[] tArr = this.f23193e;
        int i = this.f23190b;
        int c = m32770c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo53896f(c, tArr, i);
        }
        do {
            c = (c + 1) & i;
            t2 = tArr[c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo53896f(c, tArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo53896f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f23191c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int c = m32770c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c || c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c && c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public C14117j(int i, float f) {
        this.f23189a = f;
        int a = C14118k.m32776a(i);
        this.f23190b = a - 1;
        this.f23192d = (int) (f * ((float) a));
        this.f23193e = new Object[a];
    }
}
