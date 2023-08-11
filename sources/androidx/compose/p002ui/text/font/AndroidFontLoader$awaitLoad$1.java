package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.ui.text.font.AndroidFontLoader", mo50610f = "AndroidFontLoader.android.kt", mo50611l = {61, 62}, mo50612m = "awaitLoad")
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 */
/* compiled from: AndroidFontLoader.android.kt */
final class AndroidFontLoader$awaitLoad$1 extends C12737d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFontLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, C12074d<? super AndroidFontLoader$awaitLoad$1> dVar) {
        super(dVar);
        this.this$0 = androidFontLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitLoad((Font) null, this);
    }
}
