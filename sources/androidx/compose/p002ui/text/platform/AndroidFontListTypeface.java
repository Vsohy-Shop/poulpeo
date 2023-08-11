package androidx.compose.p002ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontListFontFamily;
import androidx.compose.p002ui.text.font.FontMatcher;
import androidx.compose.p002ui.text.font.FontSynthesis_androidKt;
import androidx.compose.p002ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n35#2,3:175\n38#2,2:182\n40#2:185\n56#2,4:197\n60#2,3:205\n63#2:209\n33#3,4:178\n38#3:184\n151#3,3:186\n33#3,4:189\n154#3,2:193\n38#3:195\n156#3:196\n33#3,4:201\n38#3:208\n33#3,6:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n67#1:175,3\n67#1:182,2\n67#1:185\n72#1:197,4\n72#1:205,3\n72#1:209\n67#1:178,4\n67#1:184\n70#1:186,3\n70#1:189,4\n70#1:193,2\n70#1:195\n70#1:196\n72#1:201,4\n72#1:208\n80#1:210,6\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidFontListTypeface */
/* compiled from: AndroidFontListTypeface.android.kt */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final FontMatcher fontMatcher = new FontMatcher();
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final Map<Font, Typeface> loadedTypefaces;

    /* renamed from: androidx.compose.ui.text.platform.AndroidFontListTypeface$Companion */
    /* compiled from: AndroidFontListTypeface.android.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AndroidFontListTypeface(androidx.compose.p002ui.text.font.FontListFontFamily r8, android.content.Context r9, java.util.List<p336ef.C11906l<androidx.compose.p002ui.text.font.FontWeight, androidx.compose.p002ui.text.font.FontStyle>> r10, androidx.compose.p002ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            java.lang.String r0 = "fontFamily"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "fontMatcher"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r7.<init>()
            r7.fontMatcher$1 = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        L_0x0027:
            if (r3 >= r1) goto L_0x0046
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.p002ui.text.font.Font) r5
            int r5 = r5.m38034getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.p002ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m38055getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.p002ui.text.font.FontLoadingStrategy.m38050equalsimpl0(r5, r6)
            if (r5 == 0) goto L_0x0043
            r0.add(r4)
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x0046:
            if (r10 == 0) goto L_0x00b2
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = r2
        L_0x0056:
            if (r3 >= r1) goto L_0x0080
            java.lang.Object r4 = r10.get(r3)
            ef.l r4 = (p336ef.C11906l) r4
            java.lang.Object r5 = r4.mo49109a()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.p002ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.mo49110b()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.p002ui.text.font.FontStyle) r4
            int r4 = r4.m38066unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher$1
            java.util.List r4 = r6.m38059matchFontRetOiIg((java.util.List<? extends androidx.compose.p002ui.text.font.Font>) r0, (androidx.compose.p002ui.text.font.FontWeight) r5, (int) r4)
            java.lang.Object r4 = kotlin.collections.C12686e0.m28223b0(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p002ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L_0x0056
        L_0x0080:
            java.util.List r10 = androidx.compose.p002ui.text.TempListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto L_0x00b2
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = r2
        L_0x009d:
            if (r4 >= r3) goto L_0x00b3
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.p002ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto L_0x00af
            r1.add(r5)
        L_0x00af:
            int r4 = r4 + 1
            goto L_0x009d
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            if (r1 != 0) goto L_0x00b6
            goto L_0x00b7
        L_0x00b6:
            r0 = r1
        L_0x00b7:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x00f6
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        L_0x00c6:
            if (r2 >= r11) goto L_0x00f1
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.p002ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.p002ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch:{ Exception -> 0x00da }
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch:{ Exception -> 0x00da }
            r10.put(r1, r3)     // Catch:{ Exception -> 0x00da }
            int r2 = r2 + 1
            goto L_0x00c6
        L_0x00da:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot create Typeface from "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x00f1:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        L_0x00f6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    /* renamed from: getNativeTypeface-PYhJU0U  reason: not valid java name */
    public Typeface m38199getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(fontWeight, "fontWeight");
        Font font = (Font) C12686e0.m28223b0(this.fontMatcher$1.m38059matchFontRetOiIg((List<? extends Font>) new ArrayList(this.loadedTypefaces.keySet()), fontWeight, i));
        if (font != null) {
            Typeface typeface = this.loadedTypefaces.get(font);
            if (typeface != null) {
                Object r4 = FontSynthesis_androidKt.m38082synthesizeTypefaceFxwP2eA(i2, typeface, font, fontWeight, i);
                C12775o.m28637g(r4, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) r4;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalStateException("Could not load font");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
