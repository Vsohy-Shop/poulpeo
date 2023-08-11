package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,276:1\n135#2:277\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n*L\n137#1:277\n*E\n"})
/* renamed from: androidx.compose.ui.draw.DrawModifierKt */
/* compiled from: DrawModifier.kt */
public final class DrawModifierKt {
    public static final Modifier drawBehind(Modifier modifier, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onDraw");
        return modifier.then(new DrawBehindElement(function1));
    }

    public static final Modifier drawWithCache(Modifier modifier, Function1<? super CacheDrawScope, DrawResult> function1) {
        Function1 function12;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onBuildDrawCache");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function12 = new DrawModifierKt$drawWithCache$$inlined$debugInspectorInfo$1(function1);
        } else {
            function12 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function12, new DrawModifierKt$drawWithCache$2(function1));
    }

    public static final Modifier drawWithContent(Modifier modifier, Function1<? super ContentDrawScope, C11921v> function1) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "onDraw");
        return modifier.then(new DrawWithContentElement(function1));
    }
}
