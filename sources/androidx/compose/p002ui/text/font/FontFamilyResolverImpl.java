package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12079g;

@SourceDebugExtension({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,248:1\n151#2,3:249\n33#2,4:252\n154#2,2:256\n38#2:258\n156#2:259\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n47#1:249,3\n47#1:252,4\n47#1:256,2\n47#1:258\n47#1:259\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl */
/* compiled from: FontFamilyResolver.kt */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    /* access modifiers changed from: private */
    public final Function1<TypefaceRequest, Object> createDefaultTypeface;
    /* access modifiers changed from: private */
    public final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
    /* access modifiers changed from: private */
    public final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;
    private final PlatformFontLoader platformFontLoader;
    private final PlatformResolveInterceptor platformResolveInterceptor;
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(PlatformFontLoader platformFontLoader2, PlatformResolveInterceptor platformResolveInterceptor2, TypefaceRequestCache typefaceRequestCache2, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        C12775o.m28639i(platformFontLoader2, "platformFontLoader");
        C12775o.m28639i(platformResolveInterceptor2, "platformResolveInterceptor");
        C12775o.m28639i(typefaceRequestCache2, "typefaceRequestCache");
        C12775o.m28639i(fontListFontFamilyTypefaceAdapter2, "fontListFontFamilyTypefaceAdapter");
        C12775o.m28639i(platformFontFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.platformFontLoader = platformFontLoader2;
        this.platformResolveInterceptor = platformResolveInterceptor2;
        this.typefaceRequestCache = typefaceRequestCache2;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter2;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    /* access modifiers changed from: private */
    public final State<Object> resolve(TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest));
    }

    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[LOOP:0: B:21:0x006a->B:22:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object preload(androidx.compose.p002ui.text.font.FontFamily r14, p355hf.C12074d<? super p336ef.C11921v> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof androidx.compose.p002ui.text.font.FontFamilyResolverImpl$preload$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.p002ui.text.font.FontFamilyResolverImpl$preload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r14 = r0.L$1
            androidx.compose.ui.text.font.FontFamily r14 = (androidx.compose.p002ui.text.font.FontFamily) r14
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.p002ui.text.font.FontFamilyResolverImpl) r0
            p336ef.C11910n.m25701b(r15)
            goto L_0x0055
        L_0x0031:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0039:
            p336ef.C11910n.m25701b(r15)
            boolean r15 = r14 instanceof androidx.compose.p002ui.text.font.FontListFontFamily
            if (r15 != 0) goto L_0x0043
            ef.v r14 = p336ef.C11921v.f18618a
            return r14
        L_0x0043:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r15 = r13.fontListFontFamilyTypefaceAdapter
            androidx.compose.ui.text.font.PlatformFontLoader r2 = r13.platformFontLoader
            r0.L$0 = r13
            r0.L$1 = r14
            r0.label = r3
            java.lang.Object r15 = r15.preload(r14, r2, r0)
            if (r15 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r13
        L_0x0055:
            r15 = r14
            androidx.compose.ui.text.font.FontListFontFamily r15 = (androidx.compose.p002ui.text.font.FontListFontFamily) r15
            java.util.List r15 = r15.getFonts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r15.size()
            r1.<init>(r2)
            int r2 = r15.size()
            r3 = 0
        L_0x006a:
            if (r3 >= r2) goto L_0x00a5
            java.lang.Object r4 = r15.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p002ui.text.font.Font) r4
            androidx.compose.ui.text.font.TypefaceRequest r12 = new androidx.compose.ui.text.font.TypefaceRequest
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontFamily r6 = r5.interceptFontFamily(r14)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontWeight r7 = r4.getWeight()
            androidx.compose.ui.text.font.FontWeight r7 = r5.interceptFontWeight(r7)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r5 = r0.platformResolveInterceptor
            int r4 = r4.m38035getStyle_LCdwA()
            int r8 = r5.m38086interceptFontStyleT2F_aPo(r4)
            androidx.compose.ui.text.font.FontSynthesis$Companion r4 = androidx.compose.p002ui.text.font.FontSynthesis.Companion
            int r9 = r4.m38078getAllGVVA2EU()
            androidx.compose.ui.text.font.PlatformFontLoader r4 = r0.platformFontLoader
            java.lang.Object r10 = r4.getCacheKey()
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r12)
            int r3 = r3 + 1
            goto L_0x006a
        L_0x00a5:
            androidx.compose.ui.text.font.TypefaceRequestCache r14 = r0.typefaceRequestCache
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r15 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r15.<init>(r0)
            r14.preWarmCache(r1, r15)
            ef.v r14 = p336ef.C11921v.f18618a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.FontFamilyResolverImpl.preload(androidx.compose.ui.text.font.FontFamily, hf.d):java.lang.Object");
    }

    /* renamed from: resolve-DPcqOEQ  reason: not valid java name */
    public State<Object> m38038resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(fontWeight, "fontWeight");
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m38086interceptFontStyleT2F_aPo(i), this.platformResolveInterceptor.m38087interceptFontSynthesisMscr08Y(i2), this.platformFontLoader.getCacheKey(), (DefaultConstructorMarker) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader2, PlatformResolveInterceptor platformResolveInterceptor2, TypefaceRequestCache typefaceRequestCache2, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter2, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(platformFontLoader2, (i & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor2, (i & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache2, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), (C12079g) null, 2, (DefaultConstructorMarker) null) : fontListFontFamilyTypefaceAdapter2, (i & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
