package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.TypefaceResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n76#2:428\n102#2,2:429\n33#3,6:431\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n252#1:428\n252#1:429,2\n259#1:431,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class AsyncFontListLoader implements State<Object> {
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final Function1<TypefaceResult.Immutable, C11921v> onCompletion;
    /* access modifiers changed from: private */
    public final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest2, AsyncTypefaceCache asyncTypefaceCache2, Function1<? super TypefaceResult.Immutable, C11921v> function1, PlatformFontLoader platformFontLoader2) {
        C12775o.m28639i(list, "fontList");
        C12775o.m28639i(obj, "initialType");
        C12775o.m28639i(typefaceRequest2, "typefaceRequest");
        C12775o.m28639i(asyncTypefaceCache2, "asyncTypefaceCache");
        C12775o.m28639i(function1, "onCompletion");
        C12775o.m28639i(platformFontLoader2, "platformFontLoader");
        this.fontList = list;
        this.typefaceRequest = typefaceRequest2;
        this.asyncTypefaceCache = asyncTypefaceCache2;
        this.onCompletion = function1;
        this.platformFontLoader = platformFontLoader2;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075 A[SYNTHETIC, Splitter:B:27:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ef A[SYNTHETIC, Splitter:B:38:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object load(p355hf.C12074d<? super p336ef.C11921v> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof androidx.compose.p002ui.text.font.AsyncFontListLoader$load$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = (androidx.compose.p002ui.text.font.AsyncFontListLoader$load$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.ui.text.font.AsyncFontListLoader$load$1 r2 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = p362if.C12150d.m26492c()
            int r4 = r2.label
            r5 = 0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0068
            if (r4 == r7) goto L_0x004a
            if (r4 != r6) goto L_0x0042
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r11 = (androidx.compose.p002ui.text.font.AsyncFontListLoader) r11
            p336ef.C11910n.m25701b(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0103
        L_0x003f:
            r0 = move-exception
            goto L_0x012c
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r4 = r2.I$1
            int r9 = r2.I$0
            java.lang.Object r10 = r2.L$2
            androidx.compose.ui.text.font.Font r10 = (androidx.compose.p002ui.text.font.Font) r10
            java.lang.Object r11 = r2.L$1
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r2.L$0
            androidx.compose.ui.text.font.AsyncFontListLoader r12 = (androidx.compose.p002ui.text.font.AsyncFontListLoader) r12
            p336ef.C11910n.m25701b(r0)     // Catch:{ all -> 0x0064 }
            r15 = r12
            r18 = r11
            r11 = r10
            r10 = r18
            goto L_0x00b9
        L_0x0064:
            r0 = move-exception
            r11 = r12
            goto L_0x012c
        L_0x0068:
            p336ef.C11910n.m25701b(r0)
            java.util.List<androidx.compose.ui.text.font.Font> r0 = r1.fontList     // Catch:{ all -> 0x012a }
            int r4 = r0.size()     // Catch:{ all -> 0x012a }
            r15 = r1
            r14 = r8
        L_0x0073:
            if (r14 >= r4) goto L_0x010f
            java.lang.Object r9 = r0.get(r14)     // Catch:{ all -> 0x0107 }
            r13 = r9
            androidx.compose.ui.text.font.Font r13 = (androidx.compose.p002ui.text.font.Font) r13     // Catch:{ all -> 0x0107 }
            int r9 = r13.m38034getLoadingStrategyPKNRLFQ()     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r10 = androidx.compose.p002ui.text.font.FontLoadingStrategy.Companion     // Catch:{ all -> 0x0107 }
            int r10 = r10.m38054getAsyncPKNRLFQ()     // Catch:{ all -> 0x0107 }
            boolean r9 = androidx.compose.p002ui.text.font.FontLoadingStrategy.m38050equalsimpl0(r9, r10)     // Catch:{ all -> 0x0107 }
            if (r9 == 0) goto L_0x010a
            androidx.compose.ui.text.font.AsyncTypefaceCache r9 = r15.asyncTypefaceCache     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.PlatformFontLoader r11 = r15.platformFontLoader     // Catch:{ all -> 0x0107 }
            r12 = 0
            androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1 r10 = new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1     // Catch:{ all -> 0x0107 }
            r10.<init>(r15, r13, r5)     // Catch:{ all -> 0x0107 }
            r2.L$0 = r15     // Catch:{ all -> 0x0107 }
            r2.L$1 = r0     // Catch:{ all -> 0x0107 }
            r2.L$2 = r13     // Catch:{ all -> 0x0107 }
            r2.I$0 = r14     // Catch:{ all -> 0x0107 }
            r2.I$1 = r4     // Catch:{ all -> 0x0107 }
            r2.label = r7     // Catch:{ all -> 0x0107 }
            r16 = r10
            r10 = r13
            r17 = r13
            r13 = r16
            r16 = r14
            r14 = r2
            java.lang.Object r9 = r9.runCached(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0107 }
            if (r9 != r3) goto L_0x00b3
            return r3
        L_0x00b3:
            r10 = r0
            r0 = r9
            r9 = r16
            r11 = r17
        L_0x00b9:
            if (r0 == 0) goto L_0x00ef
            androidx.compose.ui.text.font.TypefaceRequest r3 = r15.typefaceRequest     // Catch:{ all -> 0x0107 }
            int r3 = r3.m38115getFontSynthesisGVVA2EU()     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.TypefaceRequest r4 = r15.typefaceRequest     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.FontWeight r4 = r4.getFontWeight()     // Catch:{ all -> 0x0107 }
            androidx.compose.ui.text.font.TypefaceRequest r5 = r15.typefaceRequest     // Catch:{ all -> 0x0107 }
            int r5 = r5.m38114getFontStyle_LCdwA()     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = androidx.compose.p002ui.text.font.FontSynthesis_androidKt.m38082synthesizeTypefaceFxwP2eA(r3, r0, r11, r4, r5)     // Catch:{ all -> 0x0107 }
            r15.setValue(r0)     // Catch:{ all -> 0x0107 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0107 }
            hf.g r2 = r2.getContext()
            boolean r2 = p466yf.C13934b2.m32227o(r2)
            r15.cacheable = r8
            kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult$Immutable, ef.v> r3 = r15.onCompletion
            androidx.compose.ui.text.font.TypefaceResult$Immutable r4 = new androidx.compose.ui.text.font.TypefaceResult$Immutable
            java.lang.Object r5 = r15.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            return r0
        L_0x00ef:
            r2.L$0 = r15     // Catch:{ all -> 0x0107 }
            r2.L$1 = r10     // Catch:{ all -> 0x0107 }
            r2.L$2 = r5     // Catch:{ all -> 0x0107 }
            r2.I$0 = r9     // Catch:{ all -> 0x0107 }
            r2.I$1 = r4     // Catch:{ all -> 0x0107 }
            r2.label = r6     // Catch:{ all -> 0x0107 }
            java.lang.Object r0 = p466yf.C13962f3.m32350a(r2)     // Catch:{ all -> 0x0107 }
            if (r0 != r3) goto L_0x0102
            return r3
        L_0x0102:
            r11 = r15
        L_0x0103:
            r14 = r9
            r0 = r10
            r15 = r11
            goto L_0x010c
        L_0x0107:
            r0 = move-exception
            r11 = r15
            goto L_0x012c
        L_0x010a:
            r16 = r14
        L_0x010c:
            int r14 = r14 + r7
            goto L_0x0073
        L_0x010f:
            hf.g r0 = r2.getContext()
            boolean r0 = p466yf.C13934b2.m32227o(r0)
            r15.cacheable = r8
            kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult$Immutable, ef.v> r2 = r15.onCompletion
            androidx.compose.ui.text.font.TypefaceResult$Immutable r3 = new androidx.compose.ui.text.font.TypefaceResult$Immutable
            java.lang.Object r4 = r15.getValue()
            r3.<init>(r4, r0)
            r2.invoke(r3)
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        L_0x012a:
            r0 = move-exception
            r11 = r1
        L_0x012c:
            hf.g r2 = r2.getContext()
            boolean r2 = p466yf.C13934b2.m32227o(r2)
            r11.cacheable = r8
            kotlin.jvm.functions.Function1<androidx.compose.ui.text.font.TypefaceResult$Immutable, ef.v> r3 = r11.onCompletion
            androidx.compose.ui.text.font.TypefaceResult$Immutable r4 = new androidx.compose.ui.text.font.TypefaceResult$Immutable
            java.lang.Object r5 = r11.getValue()
            r4.<init>(r5, r2)
            r3.invoke(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.AsyncFontListLoader.load(hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(androidx.compose.p002ui.text.font.Font r7, p355hf.C12074d<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p002ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.p002ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.p002ui.text.font.Font) r7
            p336ef.C11910n.m25701b(r8)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            goto L_0x004b
        L_0x002e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0036:
            p336ef.C11910n.m25701b(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r8.<init>(r6, r7, r4)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.L$0 = r7     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r0.label = r3     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = p466yf.C14061z2.m32616d(r2, r8, r0)     // Catch:{ CancellationException -> 0x007a, Exception -> 0x004d }
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r4 = r8
            goto L_0x0085
        L_0x004d:
            r8 = move-exception
            hf.g r1 = r0.getContext()
            yf.i0$a r2 = p466yf.C13977i0.f22907a0
            hf.g$b r1 = r1.get(r2)
            yf.i0 r1 = (p466yf.C13977i0) r1
            if (r1 == 0) goto L_0x0085
            hf.g r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L_0x0085
        L_0x007a:
            r7 = move-exception
            hf.g r8 = r0.getContext()
            boolean r8 = p466yf.C13934b2.m32227o(r8)
            if (r8 == 0) goto L_0x0086
        L_0x0085:
            return r4
        L_0x0086:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, hf.d):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z) {
        this.cacheable = z;
    }
}
