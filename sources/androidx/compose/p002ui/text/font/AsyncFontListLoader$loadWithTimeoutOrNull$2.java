package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {301}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends C12746l implements C13088o<C13995l0, C12074d<? super Object>, Object> {
    final /* synthetic */ Font $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, C12074d<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> dVar) {
        super(2, dVar);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = font;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            PlatformFontLoader access$getPlatformFontLoader$p = this.this$0.platformFontLoader;
            Font font = this.$this_loadWithTimeoutOrNull;
            this.label = 1;
            obj = access$getPlatformFontLoader$p.awaitLoad(font, this);
            if (obj == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<Object> dVar) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
