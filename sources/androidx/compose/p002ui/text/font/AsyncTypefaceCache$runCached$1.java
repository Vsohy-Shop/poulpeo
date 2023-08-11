package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.text.font.AsyncTypefaceCache", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {394}, mo50612m = "runCached")
/* renamed from: androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncTypefaceCache$runCached$1 extends C12737d {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncTypefaceCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, C12074d<? super AsyncTypefaceCache$runCached$1> dVar) {
        super(dVar);
        this.this$0 = asyncTypefaceCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runCached((Font) null, (PlatformFontLoader) null, false, (Function1<? super C12074d<Object>, ? extends Object>) null, this);
    }
}
