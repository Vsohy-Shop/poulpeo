package p464yd;

import okio.C13121c;
import p364io.grpc.internal.C12397p2;

/* renamed from: yd.n */
/* compiled from: OkHttpWritableBuffer */
class C13912n implements C12397p2 {

    /* renamed from: a */
    private final C13121c f22809a;

    /* renamed from: b */
    private int f22810b;

    /* renamed from: c */
    private int f22811c;

    C13912n(C13121c cVar, int i) {
        this.f22809a = cVar;
        this.f22810b = i;
    }

    /* renamed from: a */
    public int mo50035a() {
        return this.f22810b;
    }

    /* renamed from: b */
    public void mo50036b(byte b) {
        this.f22809a.writeByte(b);
        this.f22810b--;
        this.f22811c++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C13121c mo53637c() {
        return this.f22809a;
    }

    /* renamed from: e */
    public int mo50037e() {
        return this.f22811c;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f22809a.write(bArr, i, i2);
        this.f22810b -= i2;
        this.f22811c += i2;
    }

    public void release() {
    }
}
