package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import p113h8.C8030b;
import p172n6.C8930b;
import p192p6.C9063a;

/* renamed from: com.google.firebase.abt.component.a */
/* compiled from: AbtComponent */
public class C6912a {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map<String, C8930b> f9108a = new HashMap();

    /* renamed from: b */
    private final Context f9109b;

    /* renamed from: c */
    private final C8030b<C9063a> f9110c;

    @VisibleForTesting(otherwise = 3)
    protected C6912a(Context context, C8030b<C9063a> bVar) {
        this.f9109b = context;
        this.f9110c = bVar;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: a */
    public C8930b mo39753a(String str) {
        return new C8930b(this.f9109b, this.f9110c, str);
    }

    /* renamed from: b */
    public synchronized C8930b mo39754b(String str) {
        if (!this.f9108a.containsKey(str)) {
            this.f9108a.put(str, mo39753a(str));
        }
        return this.f9108a.get(str);
    }
}
