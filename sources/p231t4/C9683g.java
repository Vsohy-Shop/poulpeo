package p231t4;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p200q4.C9222d;
import p200q4.C9230h;

/* renamed from: t4.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C9683g<T extends IInterface> extends C9665c<T> implements C4719a.C4728f {

    /* renamed from: G */
    private final C9673d f14459G;

    /* renamed from: H */
    private final Set<Scope> f14460H;
    @Nullable

    /* renamed from: I */
    private final Account f14461I;

    @Deprecated
    protected C9683g(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C9673d dVar, @NonNull C4733c.C4734a aVar, @NonNull C4733c.C4735b bVar) {
        this(context, looper, i, dVar, (C9222d) aVar, (C9230h) bVar);
    }

    /* renamed from: m0 */
    private final Set<Scope> m20219m0(@NonNull Set<Scope> set) {
        Set<Scope> l0 = mo44190l0(set);
        for (Scope contains : l0) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return l0;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: D */
    public final Set<Scope> mo44124D() {
        return this.f14460H;
    }

    @NonNull
    /* renamed from: a */
    public Set<Scope> mo32394a() {
        if (mo32407o()) {
            return this.f14460H;
        }
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: k0 */
    public final C9673d mo44189k0() {
        return this.f14459G;
    }

    @Nullable
    /* renamed from: u */
    public final Account mo44151u() {
        return this.f14461I;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: w */
    public final Executor mo44152w() {
        return null;
    }

    protected C9683g(@NonNull Context context, @NonNull Looper looper, int i, @NonNull C9673d dVar, @NonNull C9222d dVar2, @NonNull C9230h hVar) {
        this(context, looper, C9686h.m20228b(context), GoogleApiAvailability.m6375n(), i, dVar, (C9222d) C9713p.m20275j(dVar2), (C9230h) C9713p.m20275j(hVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C9683g(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull android.os.Looper r12, @androidx.annotation.NonNull p231t4.C9686h r13, @androidx.annotation.NonNull com.google.android.gms.common.GoogleApiAvailability r14, int r15, @androidx.annotation.NonNull p231t4.C9673d r16, @androidx.annotation.Nullable p200q4.C9222d r17, @androidx.annotation.Nullable p200q4.C9230h r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            t4.f0 r3 = new t4.f0
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            t4.g0 r0 = new t4.g0
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.mo44168j()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f14459G = r0
            android.accounts.Account r1 = r16.mo44159a()
            r9.f14461I = r1
            java.util.Set r0 = r16.mo44162d()
            java.util.Set r0 = r10.m20219m0(r0)
            r9.f14460H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p231t4.C9683g.<init>(android.content.Context, android.os.Looper, t4.h, com.google.android.gms.common.GoogleApiAvailability, int, t4.d, q4.d, q4.h):void");
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: l0 */
    public Set<Scope> mo44190l0(@NonNull Set<Scope> set) {
        return set;
    }
}
