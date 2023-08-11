package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12757e0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2", mo50610f = "ScrollExtensions.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* compiled from: ScrollExtensions.kt */
final class ScrollExtensionsKt$scrollBy$2 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C12757e0 $consumed;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$scrollBy$2(C12757e0 e0Var, float f, C12074d<? super ScrollExtensionsKt$scrollBy$2> dVar) {
        super(2, dVar);
        this.$consumed = e0Var;
        this.$value = f;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ScrollExtensionsKt$scrollBy$2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(this.$consumed, this.$value, dVar);
        scrollExtensionsKt$scrollBy$2.L$0 = obj;
        return scrollExtensionsKt$scrollBy$2;
    }

    public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
        return ((ScrollExtensionsKt$scrollBy$2) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            this.$consumed.f20408b = ((ScrollScope) this.L$0).scrollBy(this.$value);
            return C11921v.f18618a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
