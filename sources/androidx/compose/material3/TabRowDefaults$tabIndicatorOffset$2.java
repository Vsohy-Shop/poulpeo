package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* compiled from: TabRow.kt */
final class TabRowDefaults$tabIndicatorOffset$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.$currentTabPosition = tabPosition;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    private static final float m34637invoke$lambda0(State<C1232Dp> state) {
        return state.getValue().m38482unboximpl();
    }

    /* renamed from: invoke$lambda-1  reason: not valid java name */
    private static final float m34638invoke$lambda1(State<C1232Dp> state) {
        return state.getValue().m38482unboximpl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-1541271084);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, i, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:400)");
        }
        Composer composer2 = composer;
        State<C1232Dp> r2 = AnimateAsStateKt.m32888animateDpAsStateKz89ssw(this.$currentTabPosition.m34635getWidthD9Ej5fM(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, (Object) null), (Function1<? super C1232Dp, C11921v>) null, composer2, 0, 4);
        Modifier r1 = SizeKt.m33343width3ABfNKs(OffsetKt.m33255offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, (Object) null), Alignment.Companion.getBottomStart(), false, 2, (Object) null), m34638invoke$lambda1(AnimateAsStateKt.m32888animateDpAsStateKz89ssw(this.$currentTabPosition.m34633getLeftD9Ej5fM(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, (Object) null), (Function1<? super C1232Dp, C11921v>) null, composer2, 0, 4)), 0.0f, 2, (Object) null), m34637invoke$lambda0(r2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r1;
    }
}
