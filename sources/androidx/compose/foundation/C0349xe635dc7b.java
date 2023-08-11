package androidx.compose.foundation;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n1#1,170:1\n143#2,8:171\n*E\n"})
/* renamed from: androidx.compose.foundation.BasicMarqueeKt$basicMarquee-1Mj1MLw$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0349xe635dc7b extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ int $animationMode$inlined;
    final /* synthetic */ int $delayMillis$inlined;
    final /* synthetic */ int $initialDelayMillis$inlined;
    final /* synthetic */ int $iterations$inlined;
    final /* synthetic */ MarqueeSpacing $spacing$inlined;
    final /* synthetic */ float $velocity$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0349xe635dc7b(int i, int i2, int i3, int i4, MarqueeSpacing marqueeSpacing, float f) {
        super(1);
        this.$iterations$inlined = i;
        this.$animationMode$inlined = i2;
        this.$delayMillis$inlined = i3;
        this.$initialDelayMillis$inlined = i4;
        this.$spacing$inlined = marqueeSpacing;
        this.$velocity$inlined = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("basicMarquee");
        inspectorInfo.getProperties().set("iterations", Integer.valueOf(this.$iterations$inlined));
        inspectorInfo.getProperties().set("animationMode", MarqueeAnimationMode.m33009boximpl(this.$animationMode$inlined));
        inspectorInfo.getProperties().set("delayMillis", Integer.valueOf(this.$delayMillis$inlined));
        inspectorInfo.getProperties().set("initialDelayMillis", Integer.valueOf(this.$initialDelayMillis$inlined));
        inspectorInfo.getProperties().set("spacing", this.$spacing$inlined);
        inspectorInfo.getProperties().set("velocity", C1232Dp.m38466boximpl(this.$velocity$inlined));
    }
}
