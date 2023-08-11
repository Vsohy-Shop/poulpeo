package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpSize;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: SelectionManager.android.kt */
final class SelectionManager_androidKt$selectionMagnifier$1$2$1 extends C12777p implements Function1<C13074a<? extends Offset>, Modifier> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<IntSize> $magnifierSize$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectionManager_androidKt$selectionMagnifier$1$2$1(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.$density = density;
        this.$magnifierSize$delegate = mutableState;
    }

    public final Modifier invoke(final C13074a<Offset> aVar) {
        C12775o.m28639i(aVar, "center");
        Modifier.Companion companion = Modifier.Companion;
        MagnifierStyle textDefault = MagnifierStyle.Companion.getTextDefault();
        C06671 r2 = new Function1<Density, Offset>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Offset.m35411boximpl(m33825invoketuRUvjQ((Density) obj));
            }

            /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
            public final long m33825invoketuRUvjQ(Density density) {
                C12775o.m28639i(density, "$this$magnifier");
                return aVar.invoke().m35432unboximpl();
            }
        };
        final Density density = this.$density;
        final MutableState<IntSize> mutableState = this.$magnifierSize$delegate;
        return MagnifierKt.magnifier$default(companion, r2, (Function1) null, 0.0f, textDefault, new Function1<DpSize, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m33826invokeEaSLcWc(((DpSize) obj).m38574unboximpl());
                return C11921v.f18618a;
            }

            /* renamed from: invoke-EaSLcWc  reason: not valid java name */
            public final void m33826invokeEaSLcWc(long j) {
                MutableState<IntSize> mutableState = mutableState;
                Density density = density;
                SelectionManager_androidKt$selectionMagnifier$1.invoke$lambda$2(mutableState, IntSizeKt.IntSize(density.m38443roundToPx0680j_4(DpSize.m38566getWidthD9Ej5fM(j)), density.m38443roundToPx0680j_4(DpSize.m38564getHeightD9Ej5fM(j))));
            }
        }, 6, (Object) null);
    }
}
