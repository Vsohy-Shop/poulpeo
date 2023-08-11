package p231t4;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.C4718a;
import com.google.android.gms.common.api.C4719a;

/* renamed from: t4.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9687h0 {

    /* renamed from: a */
    private final SparseIntArray f14468a = new SparseIntArray();

    /* renamed from: b */
    private C4718a f14469b;

    public C9687h0(@NonNull C4718a aVar) {
        C9713p.m20275j(aVar);
        this.f14469b = aVar;
    }

    /* renamed from: a */
    public final int mo44194a(Context context, int i) {
        return this.f14468a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo44195b(@NonNull Context context, @NonNull C4719a.C4728f fVar) {
        C9713p.m20275j(context);
        C9713p.m20275j(fVar);
        int i = 0;
        if (!fVar.mo32402j()) {
            return 0;
        }
        int k = fVar.mo32403k();
        int a = mo44194a(context, k);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f14468a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f14468a.keyAt(i2);
                if (keyAt > k && this.f14468a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            if (i == -1) {
                a = this.f14469b.mo32347h(context, k);
            } else {
                a = i;
            }
            this.f14468a.put(k, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo44196c() {
        this.f14468a.clear();
    }
}
