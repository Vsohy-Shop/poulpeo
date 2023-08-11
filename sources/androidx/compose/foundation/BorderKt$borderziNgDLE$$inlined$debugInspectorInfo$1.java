package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n1#1,170:1\n150#2,10:171\n*E\n"})
/* renamed from: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ Brush $brush$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ float $width$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(float f, Brush brush, Shape shape) {
        super(1);
        this.$width$inlined = f;
        this.$brush$inlined = brush;
        this.$shape$inlined = shape;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName(OutlinedTextFieldKt.BorderId);
        inspectorInfo.getProperties().set("width", C1232Dp.m38466boximpl(this.$width$inlined));
        if (this.$brush$inlined instanceof SolidColor) {
            inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m35661boximpl(((SolidColor) this.$brush$inlined).m36036getValue0d7_KjU()));
            inspectorInfo.setValue(Color.m35661boximpl(((SolidColor) this.$brush$inlined).m36036getValue0d7_KjU()));
        } else {
            inspectorInfo.getProperties().set("brush", this.$brush$inlined);
        }
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
    }
}
