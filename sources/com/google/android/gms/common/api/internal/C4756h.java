package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4721b;
import p180o4.C8974c;
import p200q4.C9227f0;
import p200q4.C9232i;
import p231t4.C9713p;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4756h<A extends C4719a.C4721b, ResultT> {
    @Nullable

    /* renamed from: a */
    private final C8974c[] f4992a;

    /* renamed from: b */
    private final boolean f4993b;

    /* renamed from: c */
    private final int f4994c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4757a<A extends C4719a.C4721b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C9232i<A, C10406g<ResultT>> f4995a;

        /* renamed from: b */
        private boolean f4996b = true;

        /* renamed from: c */
        private C8974c[] f4997c;

        /* renamed from: d */
        private int f4998d = 0;

        /* synthetic */ C4757a(C9227f0 f0Var) {
        }

        @NonNull
        /* renamed from: a */
        public C4756h<A, ResultT> mo32517a() {
            boolean z;
            if (this.f4995a != null) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20267b(z, "execute parameter required");
            return new C4743b0(this, this.f4997c, this.f4996b, this.f4998d);
        }

        @NonNull
        /* renamed from: b */
        public C4757a<A, ResultT> mo32518b(@NonNull C9232i<A, C10406g<ResultT>> iVar) {
            this.f4995a = iVar;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C4757a<A, ResultT> mo32519c(boolean z) {
            this.f4996b = z;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C4757a<A, ResultT> mo32520d(@NonNull C8974c... cVarArr) {
            this.f4997c = cVarArr;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C4757a<A, ResultT> mo32521e(int i) {
            this.f4998d = i;
            return this;
        }
    }

    protected C4756h(@Nullable C8974c[] cVarArr, boolean z, int i) {
        this.f4992a = cVarArr;
        boolean z2 = false;
        if (cVarArr != null && z) {
            z2 = true;
        }
        this.f4993b = z2;
        this.f4994c = i;
    }

    @NonNull
    /* renamed from: a */
    public static <A extends C4719a.C4721b, ResultT> C4757a<A, ResultT> m6576a() {
        return new C4757a<>((C9227f0) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo32475b(@NonNull A a, @NonNull C10406g<ResultT> gVar);

    /* renamed from: c */
    public boolean mo32514c() {
        return this.f4993b;
    }

    /* renamed from: d */
    public final int mo32515d() {
        return this.f4994c;
    }

    @Nullable
    /* renamed from: e */
    public final C8974c[] mo32516e() {
        return this.f4992a;
    }
}
