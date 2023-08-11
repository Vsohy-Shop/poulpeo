package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", mo50610f = "AndroidFontLoader.android.kt", mo50611l = {}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2 */
/* compiled from: AndroidFontLoader.android.kt */
final class AndroidFontLoader_androidKt$loadAsync$2 extends C12746l implements C13088o<C13995l0, C12074d<? super Typeface>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ResourceFont $this_loadAsync;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidFontLoader_androidKt$loadAsync$2(ResourceFont resourceFont, Context context, C12074d<? super AndroidFontLoader_androidKt$loadAsync$2> dVar) {
        super(2, dVar);
        this.$this_loadAsync = resourceFont;
        this.$context = context;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.$this_loadAsync, this.$context, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C12150d.m26492c();
        if (this.label == 0) {
            C11910n.m25701b(obj);
            return AndroidFontLoader_androidKt.load(this.$this_loadAsync, this.$context);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super Typeface> dVar) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
