package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.text.font.AsyncFontListLoader", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {300}, mo50612m = "loadWithTimeoutOrNull$ui_text_release")
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class AsyncFontListLoader$loadWithTimeoutOrNull$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$1(AsyncFontListLoader asyncFontListLoader, C12074d<? super AsyncFontListLoader$loadWithTimeoutOrNull$1> dVar) {
        super(dVar);
        this.this$0 = asyncFontListLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadWithTimeoutOrNull$ui_text_release((Font) null, this);
    }
}
