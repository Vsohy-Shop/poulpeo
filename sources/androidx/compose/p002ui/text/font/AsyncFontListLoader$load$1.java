package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {268, 281}, mo50612m = "load")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$load$1 extends C12737d {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, C12074d<? super AsyncFontListLoader$load$1> dVar) {
        super(dVar);
        this.this$0 = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(this);
    }
}
