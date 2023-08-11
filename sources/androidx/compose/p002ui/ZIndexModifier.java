package androidx.compose.p002ui;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.ZIndexModifier */
/* compiled from: ZIndexModifier.kt */
final class ZIndexModifier extends InspectorValueInfo implements LayoutModifier {
    /* access modifiers changed from: private */
    public final float zIndex;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZIndexModifier(float f, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(function1, "inspectorInfo");
        this.zIndex = f;
    }

    public boolean equals(Object obj) {
        ZIndexModifier zIndexModifier;
        if (obj instanceof ZIndexModifier) {
            zIndexModifier = (ZIndexModifier) obj;
        } else {
            zIndexModifier = null;
        }
        if (zIndexModifier != null && this.zIndex == zIndexModifier.zIndex) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m35314measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, r9.getWidth(), r9.getHeight(), (Map) null, new ZIndexModifier$measure$1(r9, this), 4, (Object) null);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }
}
