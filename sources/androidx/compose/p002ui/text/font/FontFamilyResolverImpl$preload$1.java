package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", mo50610f = "FontFamilyResolver.kt", mo50611l = {45}, mo50612m = "preload")
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 */
/* compiled from: FontFamilyResolver.kt */
final class FontFamilyResolverImpl$preload$1 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$preload$1(FontFamilyResolverImpl fontFamilyResolverImpl, C12074d<? super FontFamilyResolverImpl$preload$1> dVar) {
        super(dVar);
        this.this$0 = fontFamilyResolverImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preload((FontFamily) null, this);
    }
}
