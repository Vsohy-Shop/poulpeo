package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n435#2,6:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.SizeKt$requiredSizeIn-qDBjuR0$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ float $maxHeight$inlined;
    final /* synthetic */ float $maxWidth$inlined;
    final /* synthetic */ float $minHeight$inlined;
    final /* synthetic */ float $minWidth$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(float f, float f2, float f3, float f4) {
        super(1);
        this.$minWidth$inlined = f;
        this.$minHeight$inlined = f2;
        this.$maxWidth$inlined = f3;
        this.$maxHeight$inlined = f4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("requiredSizeIn");
        inspectorInfo.getProperties().set("minWidth", C1232Dp.m38466boximpl(this.$minWidth$inlined));
        inspectorInfo.getProperties().set("minHeight", C1232Dp.m38466boximpl(this.$minHeight$inlined));
        inspectorInfo.getProperties().set("maxWidth", C1232Dp.m38466boximpl(this.$maxWidth$inlined));
        inspectorInfo.getProperties().set("maxHeight", C1232Dp.m38466boximpl(this.$maxHeight$inlined));
    }
}
