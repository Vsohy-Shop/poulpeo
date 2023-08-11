package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.internal.C4742b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p190p4.C9056e;
import p200q4.C9222d;
import p200q4.C9230h;
import p200q4.C9234j;

@Deprecated
/* renamed from: com.google.android.gms.common.api.c */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4733c {

    /* renamed from: a */
    private static final Set<C4733c> f4921a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.c$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4734a extends C9222d {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.c$b */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public interface C4735b extends C9230h {
    }

    @NonNull
    /* renamed from: b */
    public static Set<C4733c> m6458b() {
        Set<C4733c> set = f4921a;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    /* renamed from: a */
    public <A extends C4719a.C4721b, T extends C4742b<? extends C9056e, A>> T mo32427a(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: c */
    public Looper mo32428c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public boolean mo32429d(@NonNull C9234j jVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void mo32430e() {
        throw new UnsupportedOperationException();
    }
}
