package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.C11751p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a */
/* compiled from: Action */
abstract class C11720a<T> {

    /* renamed from: a */
    final C11751p f18185a;

    /* renamed from: b */
    final C11764s f18186b;

    /* renamed from: c */
    final WeakReference<T> f18187c;

    /* renamed from: d */
    final boolean f18188d;

    /* renamed from: e */
    final int f18189e;

    /* renamed from: f */
    final int f18190f;

    /* renamed from: g */
    final int f18191g;

    /* renamed from: h */
    final Drawable f18192h;

    /* renamed from: i */
    final String f18193i;

    /* renamed from: j */
    final Object f18194j;

    /* renamed from: k */
    boolean f18195k;

    /* renamed from: l */
    boolean f18196l;

    /* renamed from: com.squareup.picasso.a$a */
    /* compiled from: Action */
    static class C11721a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C11720a f18197a;

        C11721a(C11720a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f18197a = aVar;
        }
    }

    C11720a(C11751p pVar, T t, C11764s sVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        C11721a aVar;
        this.f18185a = pVar;
        this.f18186b = sVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C11721a(this, t, pVar.f18298j);
        }
        this.f18187c = aVar;
        this.f18189e = i;
        this.f18190f = i2;
        this.f18188d = z;
        this.f18191g = i3;
        this.f18192h = drawable;
        this.f18193i = str;
        this.f18194j = obj == null ? this : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo48648a() {
        this.f18196l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo48649b(Bitmap bitmap, C11751p.C11757e eVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo48650c(Exception exc);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo48651d() {
        return this.f18193i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo48652e() {
        return this.f18189e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo48653f() {
        return this.f18190f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11751p mo48654g() {
        return this.f18185a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C11751p.C11758f mo48655h() {
        return this.f18186b.f18355t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C11764s mo48656i() {
        return this.f18186b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Object mo48657j() {
        return this.f18194j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public T mo48658k() {
        WeakReference<T> weakReference = this.f18187c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo48659l() {
        return this.f18196l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo48660m() {
        return this.f18195k;
    }
}
