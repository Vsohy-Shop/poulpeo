package p320cg;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10972h0;
import p320cg.C11062c;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
/* renamed from: cg.a */
/* compiled from: AbstractSharedFlow.kt */
public abstract class C11060a<S extends C11062c<?>> {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public S[] f17160b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f17161c;

    /* renamed from: d */
    private int f17162d;

    /* renamed from: e */
    private C11090t f17163e;

    /* renamed from: g */
    public final C10972h0<Integer> mo46153g() {
        C11090t tVar;
        synchronized (this) {
            tVar = this.f17163e;
            if (tVar == null) {
                tVar = new C11090t(this.f17161c);
                this.f17163e = tVar;
            }
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final S mo46154h() {
        S s;
        C11090t tVar;
        synchronized (this) {
            S[] sArr = this.f17160b;
            if (sArr == null) {
                sArr = mo46043j(2);
                this.f17160b = sArr;
            } else if (this.f17161c >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C12775o.m28638h(copyOf, "copyOf(this, newSize)");
                this.f17160b = (C11062c[]) copyOf;
                sArr = (C11062c[]) copyOf;
            }
            int i = this.f17162d;
            do {
                s = sArr[i];
                if (s == null) {
                    s = mo46042i();
                    sArr[i] = s;
                }
                i++;
                if (i >= sArr.length) {
                    i = 0;
                }
                C12775o.m28637g(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s.mo46017a(this));
            this.f17162d = i;
            this.f17161c++;
            tVar = this.f17163e;
        }
        if (tVar != null) {
            tVar.mo46176Z(1);
        }
        return s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract S mo46042i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract S[] mo46043j(int i);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo46155k(S s) {
        C11090t tVar;
        int i;
        C12074d[] b;
        synchronized (this) {
            int i2 = this.f17161c - 1;
            this.f17161c = i2;
            tVar = this.f17163e;
            if (i2 == 0) {
                this.f17162d = 0;
            }
            C12775o.m28637g(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b = s.mo46018b(this);
        }
        for (C12074d dVar : b) {
            if (dVar != null) {
                C11907m.C11908a aVar = C11907m.f18600b;
                dVar.resumeWith(C11907m.m25696a(C11921v.f18618a));
            }
        }
        if (tVar != null) {
            tVar.mo46176Z(-1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo46156l() {
        return this.f17161c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final S[] mo46157m() {
        return this.f17160b;
    }
}
