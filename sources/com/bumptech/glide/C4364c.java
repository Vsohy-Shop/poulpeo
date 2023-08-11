package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.load.engine.C4407j;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p106h1.C7883b;
import p106h1.C7885d;
import p106h1.C7886e;
import p106h1.C7891i;
import p106h1.C7894j;
import p117i1.C8064a;
import p117i1.C8074f;
import p117i1.C8076g;
import p117i1.C8077h;
import p117i1.C8079i;
import p127j1.C8329a;
import p217s1.C9429d;
import p217s1.C9432f;
import p217s1.C9439l;
import p250v1.C9919e;
import p250v1.C9920f;

/* renamed from: com.bumptech.glide.c */
/* compiled from: GlideBuilder */
public final class C4364c {

    /* renamed from: a */
    private final Map<Class<?>, C4374i<?, ?>> f3675a = new ArrayMap();

    /* renamed from: b */
    private C4407j f3676b;

    /* renamed from: c */
    private C7885d f3677c;

    /* renamed from: d */
    private C7883b f3678d;

    /* renamed from: e */
    private C8077h f3679e;

    /* renamed from: f */
    private C8329a f3680f;

    /* renamed from: g */
    private C8329a f3681g;

    /* renamed from: h */
    private C8064a.C8065a f3682h;

    /* renamed from: i */
    private C8079i f3683i;

    /* renamed from: j */
    private C9429d f3684j;

    /* renamed from: k */
    private int f3685k = 4;

    /* renamed from: l */
    private C4362b.C4363a f3686l = new C4365a();
    @Nullable

    /* renamed from: m */
    private C9439l.C9441b f3687m;

    /* renamed from: n */
    private C8329a f3688n;

    /* renamed from: o */
    private boolean f3689o;
    @Nullable

    /* renamed from: p */
    private List<C9919e<Object>> f3690p;

    /* renamed from: q */
    private boolean f3691q;

    /* renamed from: r */
    private boolean f3692r;

    /* renamed from: com.bumptech.glide.c$a */
    /* compiled from: GlideBuilder */
    class C4365a implements C4362b.C4363a {
        C4365a() {
        }

        @NonNull
        public C9920f build() {
            return new C9920f();
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public C4362b mo31191a(@NonNull Context context) {
        Context context2 = context;
        if (this.f3680f == null) {
            this.f3680f = C8329a.m16540g();
        }
        if (this.f3681g == null) {
            this.f3681g = C8329a.m16538e();
        }
        if (this.f3688n == null) {
            this.f3688n = C8329a.m16536c();
        }
        if (this.f3683i == null) {
            this.f3683i = new C8079i.C8080a(context2).mo41913a();
        }
        if (this.f3684j == null) {
            this.f3684j = new C9432f();
        }
        if (this.f3677c == null) {
            int b = this.f3683i.mo41911b();
            if (b > 0) {
                this.f3677c = new C7894j((long) b);
            } else {
                this.f3677c = new C7886e();
            }
        }
        if (this.f3678d == null) {
            this.f3678d = new C7891i(this.f3683i.mo41910a());
        }
        if (this.f3679e == null) {
            this.f3679e = new C8076g((long) this.f3683i.mo41912d());
        }
        if (this.f3682h == null) {
            this.f3682h = new C8074f(context2);
        }
        if (this.f3676b == null) {
            this.f3676b = new C4407j(this.f3679e, this.f3682h, this.f3681g, this.f3680f, C8329a.m16541h(), this.f3688n, this.f3689o);
        }
        List<C9919e<Object>> list = this.f3690p;
        if (list == null) {
            this.f3690p = Collections.emptyList();
        } else {
            this.f3690p = Collections.unmodifiableList(list);
        }
        return new C4362b(context, this.f3676b, this.f3679e, this.f3677c, this.f3678d, new C9439l(this.f3687m), this.f3684j, this.f3685k, this.f3686l, this.f3675a, this.f3690p, this.f3691q, this.f3692r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31192b(@Nullable C9439l.C9441b bVar) {
        this.f3687m = bVar;
    }
}
