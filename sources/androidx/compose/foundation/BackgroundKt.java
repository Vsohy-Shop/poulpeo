package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/BackgroundKt\n*L\n49#1:148\n78#1:149\n*E\n"})
/* compiled from: Background.kt */
public final class BackgroundKt {
    public static final Modifier background(Modifier modifier, Brush brush, Shape shape, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(brush, "brush");
        C12775o.m28639i(shape, "shape");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new BackgroundKt$background$$inlined$debugInspectorInfo$1(f, brush, shape);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new Background((Color) null, brush, f, shape, function1, 1, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier background$default(Modifier modifier, Brush brush, Shape shape, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        return background(modifier, brush, shape, f);
    }

    /* renamed from: background-bw27NRU  reason: not valid java name */
    public static final Modifier m32956backgroundbw27NRU(Modifier modifier, long j, Shape shape) {
        BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1 r6;
        C12775o.m28639i(modifier, "$this$background");
        C12775o.m28639i(shape, "shape");
        Color r2 = Color.m35661boximpl(j);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            r6 = new BackgroundKt$backgroundbw27NRU$$inlined$debugInspectorInfo$1(j, shape);
        } else {
            r6 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new Background(r2, (Brush) null, 0.0f, shape, r6, 6, (DefaultConstructorMarker) null));
    }

    /* renamed from: background-bw27NRU$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32957backgroundbw27NRU$default(Modifier modifier, long j, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m32956backgroundbw27NRU(modifier, j, shape);
    }
}
