package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4721b;
import com.google.android.gms.common.api.internal.C4746d;
import p180o4.C8974c;
import p200q4.C9217a0;
import p200q4.C9232i;
import p200q4.C9252y;
import p200q4.C9253z;
import p231t4.C9713p;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C4753g<A extends C4719a.C4721b, L> {
    @NonNull

    /* renamed from: a */
    public final C4751f<A, L> f4979a;
    @NonNull

    /* renamed from: b */
    public final C4759i<A, L> f4980b;
    @NonNull

    /* renamed from: c */
    public final Runnable f4981c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4754a<A extends C4719a.C4721b, L> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C9232i<A, C10406g<Void>> f4982a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C9232i<A, C10406g<Boolean>> f4983b;

        /* renamed from: c */
        private Runnable f4984c = C9252y.f13599b;

        /* renamed from: d */
        private C4746d<L> f4985d;

        /* renamed from: e */
        private C8974c[] f4986e;

        /* renamed from: f */
        private boolean f4987f = true;

        /* renamed from: g */
        private int f4988g;

        /* synthetic */ C4754a(C9253z zVar) {
        }

        @NonNull
        /* renamed from: a */
        public C4753g<A, L> mo32508a() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f4982a != null) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20267b(z, "Must set register function");
            if (this.f4983b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9713p.m20267b(z2, "Must set unregister function");
            if (this.f4985d == null) {
                z3 = false;
            }
            C9713p.m20267b(z3, "Must set holder");
            return new C4753g<>(new C4783z(this, this.f4985d, this.f4986e, this.f4987f, this.f4988g), new C4741a0(this, (C4746d.C4747a) C9713p.m20276k(this.f4985d.mo32496b(), "Key must not be null")), this.f4984c, (C9217a0) null);
        }

        @NonNull
        /* renamed from: b */
        public C4754a<A, L> mo32509b(@NonNull C9232i<A, C10406g<Void>> iVar) {
            this.f4982a = iVar;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C4754a<A, L> mo32510c(@NonNull C8974c... cVarArr) {
            this.f4986e = cVarArr;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C4754a<A, L> mo32511d(int i) {
            this.f4988g = i;
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C4754a<A, L> mo32512e(@NonNull C9232i<A, C10406g<Boolean>> iVar) {
            this.f4983b = iVar;
            return this;
        }

        @NonNull
        /* renamed from: f */
        public C4754a<A, L> mo32513f(@NonNull C4746d<L> dVar) {
            this.f4985d = dVar;
            return this;
        }
    }

    /* synthetic */ C4753g(C4751f fVar, C4759i iVar, Runnable runnable, C9217a0 a0Var) {
        this.f4979a = fVar;
        this.f4980b = iVar;
        this.f4981c = runnable;
    }

    @NonNull
    /* renamed from: a */
    public static <A extends C4719a.C4721b, L> C4754a<A, L> m6561a() {
        return new C4754a<>((C9253z) null);
    }
}
