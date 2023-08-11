package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C4842bd;
import com.google.android.gms.internal.cast.C4878dd;

/* renamed from: com.google.android.gms.internal.cast.bd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4842bd<MessageType extends C4878dd<MessageType, BuilderType>, BuilderType extends C4842bd<MessageType, BuilderType>> extends C5183vb<MessageType, BuilderType> {

    /* renamed from: b */
    private final C4878dd f5157b;

    /* renamed from: c */
    protected C4878dd f5158c;

    protected C4842bd(MessageType messagetype) {
        this.f5157b = messagetype;
        if (!messagetype.mo32741p()) {
            this.f5158c = messagetype.mo32745v();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: b */
    private static void m6820b(Object obj, Object obj2) {
        C5118re.m7436a().mo32992b(obj.getClass()).mo32897e(obj, obj2);
    }

    /* renamed from: c */
    public final C4842bd clone() {
        C4842bd bdVar = (C4842bd) this.f5157b.mo32613r(5, (Object) null, (Object) null);
        bdVar.f5158c = mo32647k();
        return bdVar;
    }

    /* renamed from: d */
    public final C4842bd mo32642d(C4878dd ddVar) {
        if (!this.f5157b.equals(ddVar)) {
            if (!this.f5158c.mo32741p()) {
                mo32646h();
            }
            m6820b(this.f5158c, ddVar);
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo32643e() {
        /*
            r5 = this;
            com.google.android.gms.internal.cast.dd r0 = r5.mo32647k()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo32613r(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            com.google.android.gms.internal.cast.re r3 = com.google.android.gms.internal.cast.C5118re.m7436a()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.cast.ue r3 = r3.mo32992b(r4)
            boolean r3 = r3.mo32899g(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo32613r(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.cast.zzsv r1 = new com.google.android.gms.internal.cast.zzsv
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C4842bd.mo32643e():com.google.android.gms.internal.cast.dd");
    }

    /* renamed from: f */
    public MessageType mo32647k() {
        if (!this.f5158c.mo32741p()) {
            return this.f5158c;
        }
        this.f5158c.mo32734g();
        return this.f5158c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo32645g() {
        if (!this.f5158c.mo32741p()) {
            mo32646h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo32646h() {
        C4878dd v = this.f5157b.mo32745v();
        m6820b(v, this.f5158c);
        this.f5158c = v;
    }
}
