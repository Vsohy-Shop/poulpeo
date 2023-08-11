package androidx.emoji2.text.flatbuffer;

import java.util.function.Supplier;

/* renamed from: androidx.emoji2.text.flatbuffer.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1985b extends ThreadLocal {

    /* renamed from: a */
    public final /* synthetic */ Supplier f562a;

    public /* synthetic */ C1985b(Supplier supplier) {
        this.f562a = supplier;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ Object initialValue() {
        return this.f562a.get();
    }
}
