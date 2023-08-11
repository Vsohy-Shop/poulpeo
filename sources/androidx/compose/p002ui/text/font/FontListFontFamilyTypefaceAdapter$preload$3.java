package androidx.compose.p002ui.text.font;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13946e;
import p466yf.C13995l0;
import p466yf.C14004n0;

@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,427:1\n56#2,4:428\n60#2,3:436\n63#2:440\n33#3,4:432\n38#3:439\n151#3,3:441\n33#3,4:444\n154#3,2:448\n38#3:450\n156#3:451\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n*L\n100#1:428,4\n100#1:436,3\n100#1:440\n100#1:432,4\n100#1:439\n101#1:441,3\n101#1:444,4\n101#1:448,2\n101#1:450\n101#1:451\n*E\n"})
@C12739f(mo50609c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {113}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class FontListFontFamilyTypefaceAdapter$preload$3 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ List<Font> $asyncLoads;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, C12074d<? super FontListFontFamilyTypefaceAdapter$preload$3> dVar) {
        super(2, dVar);
        this.$asyncLoads = list;
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$resourceLoader = platformFontLoader;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, dVar);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            C13995l0 l0Var = (C13995l0) this.L$0;
            List<Font> list = this.$asyncLoads;
            HashSet hashSet = new HashSet(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Font font = list.get(i2);
                if (hashSet.add(font)) {
                    arrayList.add(font);
                }
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
            PlatformFontLoader platformFontLoader = this.$resourceLoader;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(C13985j.m32420b(l0Var, (C12079g) null, (C14004n0) null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList.get(i3), platformFontLoader, (C12074d<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1>) null), 3, (Object) null));
            }
            this.label = 1;
            if (C13946e.m32249a(arrayList2, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
