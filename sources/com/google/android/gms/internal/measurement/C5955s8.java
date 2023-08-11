package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5955s8;
import com.google.android.gms.internal.measurement.C6003v8;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public class C5955s8<MessageType extends C6003v8<MessageType, BuilderType>, BuilderType extends C5955s8<MessageType, BuilderType>> extends C5740f7<MessageType, BuilderType> {

    /* renamed from: b */
    private final MessageType f7371b;

    /* renamed from: c */
    protected MessageType f7372c;

    /* renamed from: d */
    protected boolean f7373d = false;

    protected C5955s8(MessageType messagetype) {
        this.f7371b = messagetype;
        this.f7372c = (C6003v8) messagetype.mo33646v(4, (Object) null, (Object) null);
    }

    /* renamed from: j */
    private static final void m9875j(MessageType messagetype, MessageType messagetype2) {
        C5760ga.m9295a().mo34052b(messagetype.getClass()).mo33707c(messagetype, messagetype2);
    }

    /* renamed from: e */
    public final /* synthetic */ C6052y9 mo34353e() {
        return this.f7371b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ C5740f7 mo33998g(C5757g7 g7Var) {
        mo34358p((C6003v8) g7Var);
        return this;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C5740f7 mo33999h(byte[] bArr, int i, int i2) {
        mo34359q(bArr, 0, i2, C5792i8.m9400a());
        return this;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5740f7 mo34000i(byte[] bArr, int i, int i2, C5792i8 i8Var) {
        mo34359q(bArr, 0, i2, i8Var);
        return this;
    }

    /* renamed from: l */
    public final MessageType mo34354l() {
        MessageType messagetype;
        MessageType m = mo34351A();
        boolean z = true;
        byte byteValue = ((Byte) m.mo33646v(1, (Object) null, (Object) null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                boolean f = C5760ga.m9295a().mo34052b(m.getClass()).mo33710f(m);
                if (true != f) {
                    messagetype = null;
                } else {
                    messagetype = m;
                }
                m.mo33646v(2, messagetype, (Object) null);
                z = f;
            }
        }
        if (z) {
            return m;
        }
        throw new zzma(m);
    }

    /* renamed from: m */
    public MessageType mo34351A() {
        if (this.f7373d) {
            return this.f7372c;
        }
        MessageType messagetype = this.f7372c;
        C5760ga.m9295a().mo34052b(messagetype.getClass()).mo33708d(messagetype);
        this.f7373d = true;
        return this.f7372c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo34356n() {
        MessageType messagetype = (C6003v8) this.f7372c.mo33646v(4, (Object) null, (Object) null);
        m9875j(messagetype, this.f7372c);
        this.f7372c = messagetype;
    }

    /* renamed from: o */
    public final BuilderType clone() {
        BuilderType buildertype = (C5955s8) this.f7371b.mo33646v(5, (Object) null, (Object) null);
        buildertype.mo34358p(mo34351A());
        return buildertype;
    }

    /* renamed from: p */
    public final BuilderType mo34358p(MessageType messagetype) {
        if (this.f7373d) {
            mo34356n();
            this.f7373d = false;
        }
        m9875j(this.f7372c, messagetype);
        return this;
    }

    /* renamed from: q */
    public final BuilderType mo34359q(byte[] bArr, int i, int i2, C5792i8 i8Var) {
        if (this.f7373d) {
            mo34356n();
            this.f7373d = false;
        }
        try {
            C5760ga.m9295a().mo34052b(this.f7372c.getClass()).mo33711g(this.f7372c, bArr, 0, i2, new C5808j7(i8Var));
            return this;
        } catch (zzkh e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.m10405f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }
}
