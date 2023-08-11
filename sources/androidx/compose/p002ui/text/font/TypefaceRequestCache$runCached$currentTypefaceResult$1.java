package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.platform.SynchronizedObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,248:1\n24#2:249\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/TypefaceRequestCache$runCached$currentTypefaceResult$1\n*L\n191#1:249\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1 */
/* compiled from: FontFamilyResolver.kt */
final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends C12777p implements Function1<TypefaceResult, C11921v> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = typefaceRequest;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TypefaceResult) obj);
        return C11921v.f18618a;
    }

    public final void invoke(TypefaceResult typefaceResult) {
        C12775o.m28639i(typefaceResult, "finalResult");
        SynchronizedObject lock$ui_text_release = this.this$0.getLock$ui_text_release();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        synchronized (lock$ui_text_release) {
            if (typefaceResult.getCacheable()) {
                typefaceRequestCache.resultCache.put(typefaceRequest, typefaceResult);
            } else {
                typefaceRequestCache.resultCache.remove(typefaceRequest);
            }
            C11921v vVar = C11921v.f18618a;
        }
    }
}
