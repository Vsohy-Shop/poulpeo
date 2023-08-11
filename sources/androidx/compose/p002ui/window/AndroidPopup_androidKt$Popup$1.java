package androidx.compose.p002ui.window;

import androidx.compose.p002ui.Alignment;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 */
/* compiled from: AndroidPopup.android.kt */
final class AndroidPopup_androidKt$Popup$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ long $offset;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ PopupProperties $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$1(Alignment alignment, long j, C13074a<C11921v> aVar, PopupProperties popupProperties, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, int i2) {
        super(2);
        this.$alignment = alignment;
        this.$offset = j;
        this.$onDismissRequest = aVar;
        this.$properties = popupProperties;
        this.$content = oVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        AndroidPopup_androidKt.m38710PopupK5zGePQ(this.$alignment, this.$offset, this.$onDismissRequest, this.$properties, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
