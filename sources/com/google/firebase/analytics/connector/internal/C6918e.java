package com.google.firebase.analytics.connector.internal;

import java.util.HashSet;
import java.util.Set;
import p191p5.C9061a;
import p192p6.C9063a;
import p231t4.C9713p;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
public final class C6918e implements C6914a {

    /* renamed from: a */
    final Set<String> f9122a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9063a.C9065b f9123b;

    /* renamed from: c */
    private final C9061a f9124c;

    /* renamed from: d */
    private final C6917d f9125d;

    public C6918e(C9061a aVar, C9063a.C9065b bVar) {
        this.f9123b = bVar;
        this.f9124c = aVar;
        C6917d dVar = new C6917d(this);
        this.f9125d = dVar;
        aVar.mo43275f(dVar);
    }

    /* renamed from: a */
    public final void mo39761a(Set<String> set) {
        this.f9122a.clear();
        Set<String> set2 = this.f9122a;
        HashSet hashSet = new HashSet();
        for (String next : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (C6916c.m12037f(next) && C6916c.m12038g(next)) {
                String d = C6916c.m12035d(next);
                C9713p.m20275j(d);
                hashSet.add(d);
            }
        }
        set2.addAll(hashSet);
    }
}
