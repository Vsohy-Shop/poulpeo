package androidx.compose.foundation.text;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.LayoutKt;
import androidx.compose.p002ui.node.ComposeUiNode;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.style.TextOverflow;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,702:1\n33#2,4:703\n38#2:738\n33#2,6:739\n71#3,4:707\n75#3,11:712\n88#3:737\n76#4:711\n456#5,14:723\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt\n*L\n81#1:703,4\n81#1:738\n682#1:739,6\n82#1:707,4\n82#1:712,11\n82#1:737\n82#1:711\n82#1:723,14\n*E\n"})
/* compiled from: CoreText.kt */
public final class CoreTextKt {
    private static final C11906l<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>>> EmptyInlineContent = new C11906l<>(C12726w.m28524k(), C12726w.m28524k());

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void InlineChildren(AnnotatedString annotatedString, List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>> list, Composer composer, int i) {
        AnnotatedString annotatedString2 = annotatedString;
        List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>> list2 = list;
        int i2 = i;
        C12775o.m28639i(annotatedString2, "text");
        C12775o.m28639i(list2, "inlineContents");
        Composer startRestartGroup = composer.startRestartGroup(-110905764);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-110905764, i2, -1, "androidx.compose.foundation.text.InlineChildren (CoreText.kt:76)");
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            AnnotatedString.Range range = list2.get(i3);
            C13089p pVar = (C13089p) range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            CoreTextKt$InlineChildren$1$2 coreTextKt$InlineChildren$1$2 = CoreTextKt$InlineChildren$1$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.Companion;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            C13074a<ComposeUiNode> constructor = companion2.getConstructor();
            C13089p<SkippableUpdater<ComposeUiNode>, Composer, Integer, C11921v> materializerOf = LayoutKt.materializerOf(companion);
            int i4 = size;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer r3 = Updater.m35292constructorimpl(startRestartGroup);
            Updater.m35299setimpl(r3, coreTextKt$InlineChildren$1$2, companion2.getSetMeasurePolicy());
            Updater.m35299setimpl(r3, density, companion2.getSetDensity());
            Updater.m35299setimpl(r3, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m35299setimpl(r3, viewConfiguration, companion2.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m35283boximpl(SkippableUpdater.m35284constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            pVar.invoke(annotatedString2.subSequence(component2, component3).getText(), startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            i3++;
            size = i4;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextKt$InlineChildren$2(annotatedString2, list2, i2));
        }
    }

    public static final C11906l<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<C13089p<String, Composer, Integer, C11921v>>>> resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        C12775o.m28639i(annotatedString, "text");
        C12775o.m28639i(map, "inlineContent");
        if (map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = stringAnnotations.get(i);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new C11906l<>(arrayList, arrayList2);
    }

    /* renamed from: updateTextDelegate-rm0N8CA  reason: not valid java name */
    public static final TextDelegate m33649updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        AnnotatedString annotatedString2 = annotatedString;
        TextStyle textStyle2 = textStyle;
        Density density2 = density;
        FontFamily.Resolver resolver2 = resolver;
        List<AnnotatedString.Range<Placeholder>> list2 = list;
        TextDelegate textDelegate2 = textDelegate;
        C12775o.m28639i(textDelegate, "current");
        C12775o.m28639i(annotatedString, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        C12775o.m28639i(list2, "placeholders");
        if (!C12775o.m28634d(textDelegate.getText(), annotatedString) || !C12775o.m28634d(textDelegate.getStyle(), textStyle)) {
            boolean z2 = z;
        } else if (textDelegate.getSoftWrap() == z) {
            if (TextOverflow.m38390equalsimpl0(textDelegate.m33708getOverflowgIe3tQ8(), i)) {
                if (textDelegate.getMaxLines() == i2) {
                    if (textDelegate.getMinLines() == i3 && C12775o.m28634d(textDelegate.getDensity(), density2) && C12775o.m28634d(textDelegate.getPlaceholders(), list2) && textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate2;
                    }
                    return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
                }
                int i4 = i3;
                return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
            }
            int i5 = i2;
            int i42 = i3;
            return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
        }
        int i6 = i;
        int i52 = i2;
        int i422 = i3;
        return new TextDelegate(annotatedString, textStyle, i2, i3, z, i, density, resolver, list, (DefaultConstructorMarker) null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default  reason: not valid java name */
    public static /* synthetic */ TextDelegate m33650updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = i4;
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i5 = TextOverflow.Companion.m38397getClipgIe3tQ8();
        } else {
            i5 = i;
        }
        if ((i8 & 128) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            i7 = 1;
        } else {
            i7 = i3;
        }
        return m33649updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z2, i5, i6, i7, list);
    }

    /* renamed from: updateTextDelegate-x_uQXYA  reason: not valid java name */
    public static final TextDelegate m33651updateTextDelegatex_uQXYA(TextDelegate textDelegate, String str, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3) {
        String str2 = str;
        TextStyle textStyle2 = textStyle;
        Density density2 = density;
        FontFamily.Resolver resolver2 = resolver;
        TextDelegate textDelegate2 = textDelegate;
        C12775o.m28639i(textDelegate2, "current");
        C12775o.m28639i(str2, "text");
        C12775o.m28639i(textStyle2, "style");
        C12775o.m28639i(density2, "density");
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        if (!C12775o.m28634d(textDelegate.getText().getText(), str2) || !C12775o.m28634d(textDelegate.getStyle(), textStyle2)) {
            boolean z2 = z;
        } else if (textDelegate.getSoftWrap() == z) {
            if (TextOverflow.m38390equalsimpl0(textDelegate.m33708getOverflowgIe3tQ8(), i)) {
                if (textDelegate.getMaxLines() == i2) {
                    if (textDelegate.getMinLines() == i3 && C12775o.m28634d(textDelegate.getDensity(), density2) && textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate2;
                    }
                    return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
                }
                int i4 = i3;
                return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
            }
            int i5 = i2;
            int i42 = i3;
            return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
        }
        int i6 = i;
        int i52 = i2;
        int i422 = i3;
        return new TextDelegate(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), textStyle, i2, i3, z, i, density, resolver, (List) null, 256, (DefaultConstructorMarker) null);
    }

    /* renamed from: updateTextDelegate-x_uQXYA$default  reason: not valid java name */
    public static /* synthetic */ TextDelegate m33652updateTextDelegatex_uQXYA$default(TextDelegate textDelegate, String str, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, int i4, Object obj) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8 = i4;
        if ((i8 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i8 & 64) != 0) {
            i5 = TextOverflow.Companion.m38397getClipgIe3tQ8();
        } else {
            i5 = i;
        }
        if ((i8 & 128) != 0) {
            i6 = Integer.MAX_VALUE;
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            i7 = 1;
        } else {
            i7 = i3;
        }
        return m33651updateTextDelegatex_uQXYA(textDelegate, str, textStyle, density, resolver, z2, i5, i6, i7);
    }
}
