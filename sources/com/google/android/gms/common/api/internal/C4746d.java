package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p231t4.C9713p;
import p297z4.C10821a;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4746d<L> {

    /* renamed from: a */
    private final Executor f4968a;
    @Nullable

    /* renamed from: b */
    private volatile L f4969b;
    @Nullable

    /* renamed from: c */
    private volatile C4747a<L> f4970c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class C4747a<L> {

        /* renamed from: a */
        private final L f4971a;

        /* renamed from: b */
        private final String f4972b;

        C4747a(L l, String str) {
            this.f4971a = l;
            this.f4972b = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4747a)) {
                return false;
            }
            C4747a aVar = (C4747a) obj;
            if (this.f4971a != aVar.f4971a || !this.f4972b.equals(aVar.f4972b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4971a) * 31) + this.f4972b.hashCode();
        }
    }

    C4746d(@NonNull Looper looper, @NonNull L l, @NonNull String str) {
        this.f4968a = new C10821a(looper);
        this.f4969b = C9713p.m20276k(l, "Listener must not be null");
        this.f4970c = new C4747a<>(l, C9713p.m20271f(str));
    }

    /* renamed from: a */
    public void mo32495a() {
        this.f4969b = null;
        this.f4970c = null;
    }

    @Nullable
    /* renamed from: b */
    public C4747a<L> mo32496b() {
        return this.f4970c;
    }
}
