package okio;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* renamed from: okio.t0 */
/* compiled from: Segment.kt */
public final class C13168t0 {

    /* renamed from: h */
    public static final C13169a f20966h = new C13169a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final byte[] f20967a;

    /* renamed from: b */
    public int f20968b;

    /* renamed from: c */
    public int f20969c;

    /* renamed from: d */
    public boolean f20970d;

    /* renamed from: e */
    public boolean f20971e;

    /* renamed from: f */
    public C13168t0 f20972f;

    /* renamed from: g */
    public C13168t0 f20973g;

    /* renamed from: okio.t0$a */
    /* compiled from: Segment.kt */
    public static final class C13169a {
        private C13169a() {
        }

        public /* synthetic */ C13169a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C13168t0() {
        this.f20967a = new byte[8192];
        this.f20971e = true;
        this.f20970d = false;
    }

    /* renamed from: a */
    public final void mo52716a() {
        boolean z;
        C13168t0 t0Var = this.f20973g;
        int i = 0;
        if (t0Var != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12775o.m28636f(t0Var);
            if (t0Var.f20971e) {
                int i2 = this.f20969c - this.f20968b;
                C13168t0 t0Var2 = this.f20973g;
                C12775o.m28636f(t0Var2);
                int i3 = 8192 - t0Var2.f20969c;
                C13168t0 t0Var3 = this.f20973g;
                C12775o.m28636f(t0Var3);
                if (!t0Var3.f20970d) {
                    C13168t0 t0Var4 = this.f20973g;
                    C12775o.m28636f(t0Var4);
                    i = t0Var4.f20968b;
                }
                if (i2 <= i3 + i) {
                    C13168t0 t0Var5 = this.f20973g;
                    C12775o.m28636f(t0Var5);
                    mo52722g(t0Var5, i2);
                    mo52717b();
                    C13171u0.m29872b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C13168t0 mo52717b() {
        C13168t0 t0Var = this.f20972f;
        if (t0Var == this) {
            t0Var = null;
        }
        C13168t0 t0Var2 = this.f20973g;
        C12775o.m28636f(t0Var2);
        t0Var2.f20972f = this.f20972f;
        C13168t0 t0Var3 = this.f20972f;
        C12775o.m28636f(t0Var3);
        t0Var3.f20973g = this.f20973g;
        this.f20972f = null;
        this.f20973g = null;
        return t0Var;
    }

    /* renamed from: c */
    public final C13168t0 mo52718c(C13168t0 t0Var) {
        C12775o.m28639i(t0Var, "segment");
        t0Var.f20973g = this;
        t0Var.f20972f = this.f20972f;
        C13168t0 t0Var2 = this.f20972f;
        C12775o.m28636f(t0Var2);
        t0Var2.f20973g = t0Var;
        this.f20972f = t0Var;
        return t0Var;
    }

    /* renamed from: d */
    public final C13168t0 mo52719d() {
        this.f20970d = true;
        return new C13168t0(this.f20967a, this.f20968b, this.f20969c, true, false);
    }

    /* renamed from: e */
    public final C13168t0 mo52720e(int i) {
        boolean z;
        C13168t0 t0Var;
        if (i <= 0 || i > this.f20969c - this.f20968b) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i >= 1024) {
                t0Var = mo52719d();
            } else {
                t0Var = C13171u0.m29873c();
                byte[] bArr = this.f20967a;
                byte[] bArr2 = t0Var.f20967a;
                int i2 = this.f20968b;
                byte[] unused = C12708o.m28343j(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            t0Var.f20969c = t0Var.f20968b + i;
            this.f20968b += i;
            C13168t0 t0Var2 = this.f20973g;
            C12775o.m28636f(t0Var2);
            t0Var2.mo52718c(t0Var);
            return t0Var;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final C13168t0 mo52721f() {
        byte[] bArr = this.f20967a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C12775o.m28638h(copyOf, "copyOf(this, size)");
        return new C13168t0(copyOf, this.f20968b, this.f20969c, false, true);
    }

    /* renamed from: g */
    public final void mo52722g(C13168t0 t0Var, int i) {
        C12775o.m28639i(t0Var, "sink");
        if (t0Var.f20971e) {
            int i2 = t0Var.f20969c;
            if (i2 + i > 8192) {
                if (!t0Var.f20970d) {
                    int i3 = t0Var.f20968b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = t0Var.f20967a;
                        byte[] unused = C12708o.m28343j(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        t0Var.f20969c -= t0Var.f20968b;
                        t0Var.f20968b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f20967a;
            byte[] bArr3 = t0Var.f20967a;
            int i4 = t0Var.f20969c;
            int i5 = this.f20968b;
            byte[] unused2 = C12708o.m28337d(bArr2, bArr3, i4, i5, i5 + i);
            t0Var.f20969c += i;
            this.f20968b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C13168t0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C12775o.m28639i(bArr, "data");
        this.f20967a = bArr;
        this.f20968b = i;
        this.f20969c = i2;
        this.f20970d = z;
        this.f20971e = z2;
    }
}
