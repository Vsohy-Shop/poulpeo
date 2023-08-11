package androidx.compose.p002ui.text.font;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {103}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends C12746l implements C13088o<C13995l0, C12074d<? super Object>, Object> {
    final /* synthetic */ Font $font;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    @C12739f(mo50609c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", mo50610f = "FontListFontFamilyTypefaceAdapter.kt", mo50611l = {105}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1 */
    /* compiled from: FontListFontFamilyTypefaceAdapter.kt */
    static final class C12211 extends C12746l implements Function1<C12074d<? super Object>, Object> {
        int label;

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C12211(font, platformFontLoader, dVar);
        }

        public final Object invoke(C12074d<Object> dVar) {
            return ((C12211) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final PlatformFontLoader platformFontLoader = platformFontLoader;
                final Font font = font;
                C12221 r7 = new C13088o<C13995l0, C12074d<? super Object>, Object>((C12074d<? super C12221>) null) {
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, C12074d<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> dVar) {
                            super(2, dVar);
                            this.this$0 = fontListFontFamilyTypefaceAdapter;
                            this.$font = font;
                            this.$resourceLoader = platformFontLoader;
                        }

                        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                            return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, dVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object c = C12150d.m26492c();
                            int i = this.label;
                            if (i == 0) {
                                C11910n.m25701b(obj);
                                AsyncTypefaceCache access$getAsyncTypefaceCache$p = this.this$0.asyncTypefaceCache;
                                final Font font = this.$font;
                                final PlatformFontLoader platformFontLoader = this.$resourceLoader;
                                C12211 r7 = new C12211((C12074d<? super C12211>) null);
                                this.label = 1;
                                obj = access$getAsyncTypefaceCache$p.runCached(font, platformFontLoader, true, r7, this);
                                if (obj == c) {
                                    return c;
                                }
                            } else if (i == 1) {
                                C11910n.m25701b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return obj;
                        }

                        public final Object invoke(C13995l0 l0Var, C12074d<Object> dVar) {
                            return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
                        }
                    }
