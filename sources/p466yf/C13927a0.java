package p466yf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,662:1\n1#2:663\n*E\n"})
/* renamed from: yf.a0 */
/* compiled from: CancellableContinuationImpl.kt */
final class C13927a0 {

    /* renamed from: a */
    public final Object f22841a;

    /* renamed from: b */
    public final C13994l f22842b;

    /* renamed from: c */
    public final Function1<Throwable, C11921v> f22843c;

    /* renamed from: d */
    public final Object f22844d;

    /* renamed from: e */
    public final Throwable f22845e;

    public C13927a0(Object obj, C13994l lVar, Function1<? super Throwable, C11921v> function1, Object obj2, Throwable th) {
        this.f22841a = obj;
        this.f22842b = lVar;
        this.f22843c = function1;
        this.f22844d = obj2;
        this.f22845e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ C13927a0 m32200b(C13927a0 a0Var, Object obj, C13994l lVar, Function1<Throwable, C11921v> function1, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = a0Var.f22841a;
        }
        if ((i & 2) != 0) {
            lVar = a0Var.f22842b;
        }
        C13994l lVar2 = lVar;
        if ((i & 4) != 0) {
            function1 = a0Var.f22843c;
        }
        Function1<Throwable, C11921v> function12 = function1;
        if ((i & 8) != 0) {
            obj2 = a0Var.f22844d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = a0Var.f22845e;
        }
        return a0Var.mo53669a(obj, lVar2, function12, obj4, th);
    }

    /* renamed from: a */
    public final C13927a0 mo53669a(Object obj, C13994l lVar, Function1<? super Throwable, C11921v> function1, Object obj2, Throwable th) {
        return new C13927a0(obj, lVar, function1, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo53670c() {
        if (this.f22845e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo53671d(C14010o<?> oVar, Throwable th) {
        C13994l lVar = this.f22842b;
        if (lVar != null) {
            oVar.mo53793p(lVar, th);
        }
        Function1<Throwable, C11921v> function1 = this.f22843c;
        if (function1 != null) {
            oVar.mo53794q(function1, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13927a0)) {
            return false;
        }
        C13927a0 a0Var = (C13927a0) obj;
        if (C12775o.m28634d(this.f22841a, a0Var.f22841a) && C12775o.m28634d(this.f22842b, a0Var.f22842b) && C12775o.m28634d(this.f22843c, a0Var.f22843c) && C12775o.m28634d(this.f22844d, a0Var.f22844d) && C12775o.m28634d(this.f22845e, a0Var.f22845e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Object obj = this.f22841a;
        int i5 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i6 = i * 31;
        C13994l lVar = this.f22842b;
        if (lVar == null) {
            i2 = 0;
        } else {
            i2 = lVar.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        Function1<Throwable, C11921v> function1 = this.f22843c;
        if (function1 == null) {
            i3 = 0;
        } else {
            i3 = function1.hashCode();
        }
        int i8 = (i7 + i3) * 31;
        Object obj2 = this.f22844d;
        if (obj2 == null) {
            i4 = 0;
        } else {
            i4 = obj2.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        Throwable th = this.f22845e;
        if (th != null) {
            i5 = th.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f22841a + ", cancelHandler=" + this.f22842b + ", onCancellation=" + this.f22843c + ", idempotentResume=" + this.f22844d + ", cancelCause=" + this.f22845e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13927a0(Object obj, C13994l lVar, Function1 function1, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : lVar, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
