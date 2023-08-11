package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BoxWithConstraints.kt */
final class BoxWithConstraintsKt$BoxWithConstraints$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $propagateMinConstraints;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BoxWithConstraintsKt$BoxWithConstraints$2(Modifier modifier, Alignment alignment, boolean z, C13089p<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$contentAlignment = alignment;
        this.$propagateMinConstraints = z;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        BoxWithConstraintsKt.BoxWithConstraints(this.$modifier, this.$contentAlignment, this.$propagateMinConstraints, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
