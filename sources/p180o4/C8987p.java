package p180o4;

import java.lang.ref.WeakReference;

/* renamed from: o4.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
abstract class C8987p extends C8985n {

    /* renamed from: c */
    private static final WeakReference<byte[]> f13074c = new WeakReference<>((Object) null);

    /* renamed from: b */
    private WeakReference<byte[]> f13075b = f13074c;

    C8987p(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b3 */
    public final byte[] mo43158b3() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f13075b.get();
            if (bArr == null) {
                bArr = mo43157c3();
                this.f13075b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c3 */
    public abstract byte[] mo43157c3();
}
