package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.TypefaceResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p466yf.C13977i0;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14039u2;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,427:1\n35#2,3:428\n38#2,2:435\n40#2:438\n56#2,4:450\n60#2,3:458\n63#2:462\n33#3,4:431\n38#3:437\n151#3,3:439\n33#3,4:442\n154#3,2:446\n38#3:448\n156#3:449\n33#3,4:454\n38#3:461\n33#3,6:463\n49#4,4:469\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n68#1:428,3\n68#1:435,2\n68#1:438\n70#1:450,4\n70#1:458,3\n70#1:462\n68#1:431,4\n68#1:437\n69#1:439,3\n69#1:442,4\n69#1:446,2\n69#1:448\n69#1:449\n70#1:454,4\n70#1:461\n74#1:463,6\n155#1:469,4\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C13977i0 DropExceptionHandler = new C1220x6d95c97a(C13977i0.f22907a0);
    /* access modifiers changed from: private */
    public static final FontMatcher fontMatcher = new FontMatcher();
    private C13995l0 asyncLoadScope;
    /* access modifiers changed from: private */
    public final AsyncTypefaceCache asyncTypefaceCache;

    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$Companion */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13977i0 getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }
    }

    public FontListFontFamilyTypefaceAdapter() {
        this((AsyncTypefaceCache) null, (C12079g) null, 3, (DefaultConstructorMarker) null);
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, C12074d<? super C11921v> dVar) {
        FontFamily fontFamily2 = fontFamily;
        PlatformFontLoader platformFontLoader2 = platformFontLoader;
        if (!(fontFamily2 instanceof FontListFontFamily)) {
            return C11921v.f18618a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily2;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i = 0; i < size; i++) {
            Font font = fonts2.get(i);
            if (FontLoadingStrategy.m38050equalsimpl0(font.m38034getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m38054getAsyncPKNRLFQ())) {
                arrayList.add(font);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Font font2 = (Font) arrayList.get(i2);
            arrayList2.add(C11915r.m25707a(font2.getWeight(), FontStyle.m38060boximpl(font2.m38035getStyle_LCdwA())));
        }
        HashSet hashSet = new HashSet(arrayList2.size());
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size3 = arrayList2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj = arrayList2.get(i3);
            if (hashSet.add((C11906l) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size4 = arrayList3.size();
        int i4 = 0;
        while (i4 < size4) {
            C11906l lVar = (C11906l) arrayList3.get(i4);
            FontWeight fontWeight = (FontWeight) lVar.mo49109a();
            int r4 = ((FontStyle) lVar.mo49110b()).m38066unboximpl();
            List<Font> r15 = fontMatcher.m38059matchFontRetOiIg((List<? extends Font>) fonts, fontWeight, r4);
            TypefaceRequest typefaceRequest = r1;
            TypefaceRequest typefaceRequest2 = new TypefaceRequest(fontFamily, fontWeight, r4, FontSynthesis.Companion.m38078getAllGVVA2EU(), platformFontLoader.getCacheKey(), (DefaultConstructorMarker) null);
            List list = (List) FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(r15, typefaceRequest, this.asyncTypefaceCache, platformFontLoader2, FontListFontFamilyTypefaceAdapter$preload$2$1.INSTANCE).mo49109a();
            if (list != null) {
                arrayList4.add(C12686e0.m28221Z(list));
            }
            i4++;
            FontFamily fontFamily3 = fontFamily;
        }
        Object e = C13999m0.m32451e(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList4, this, platformFontLoader2, (C12074d<? super FontListFontFamilyTypefaceAdapter$preload$3>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1<? super TypefaceResult.Immutable, C11921v> function1, Function1<? super TypefaceRequest, ? extends Object> function12) {
        TypefaceRequest typefaceRequest2 = typefaceRequest;
        PlatformFontLoader platformFontLoader2 = platformFontLoader;
        Function1<? super TypefaceRequest, ? extends Object> function13 = function12;
        C12775o.m28639i(typefaceRequest2, "typefaceRequest");
        C12775o.m28639i(platformFontLoader2, "platformFontLoader");
        C12775o.m28639i(function1, "onAsyncCompletion");
        C12775o.m28639i(function13, "createDefaultTypeface");
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        C11906l access$firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m38059matchFontRetOiIg((List<? extends Font>) ((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m38114getFontStyle_LCdwA()), typefaceRequest2, this.asyncTypefaceCache, platformFontLoader2, function13);
        List list = (List) access$firstImmediatelyAvailable.mo49109a();
        Object b = access$firstImmediatelyAvailable.mo49110b();
        if (list == null) {
            return new TypefaceResult.Immutable(b, false, 2, (DefaultConstructorMarker) null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b, typefaceRequest, this.asyncTypefaceCache, function1, platformFontLoader);
        C14054y1 unused = C13985j.m32422d(this.asyncLoadScope, (C12079g) null, C14004n0.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, (C12074d<? super FontListFontFamilyTypefaceAdapter$resolve$1>) null), 1, (Object) null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache2, C12079g gVar) {
        C12775o.m28639i(asyncTypefaceCache2, "asyncTypefaceCache");
        C12775o.m28639i(gVar, "injectedContext");
        this.asyncTypefaceCache = asyncTypefaceCache2;
        this.asyncLoadScope = C13999m0.m32447a(DropExceptionHandler.plus(gVar).plus(C14039u2.m32560a((C14054y1) gVar.get(C14054y1.f22970b0))));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache2, C12079g gVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache2, (i & 2) != 0 ? C12085h.f18916b : gVar);
    }
}
