package androidx.compose.material;

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
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,517:1\n76#2:518\n76#2:519\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n*L\n409#1:518\n413#1:519\n*E\n"})
/* compiled from: TabRow.kt */
final class TabRowDefaults$tabIndicatorOffset$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.$currentTabPosition = tabPosition;
    }

    private static final float invoke$lambda$0(State<C1232Dp> state) {
        return state.getValue().m38482unboximpl();
    }

    private static final float invoke$lambda$1(State<C1232Dp> state) {
        return state.getValue().m38482unboximpl();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Modifier modifier2 = modifier;
        C12775o.m28639i(modifier, "$this$composed");
        composer.startReplaceableGroup(-398757863);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-398757863, i, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:407)");
        }
        Composer composer2 = composer;
        State<C1232Dp> r2 = AnimateAsStateKt.m32888animateDpAsStateKz89ssw(this.$currentTabPosition.m34163getWidthD9Ej5fM(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, (Object) null), (Function1<? super C1232Dp, C11921v>) null, composer2, 0, 4);
        Modifier r1 = SizeKt.m33343width3ABfNKs(OffsetKt.m33255offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, (Object) null), Alignment.Companion.getBottomStart(), false, 2, (Object) null), invoke$lambda$1(AnimateAsStateKt.m32888animateDpAsStateKz89ssw(this.$currentTabPosition.m34161getLeftD9Ej5fM(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, (Object) null), (Function1<? super C1232Dp, C11921v>) null, composer2, 0, 4)), 0.0f, 2, (Object) null), invoke$lambda$0(r2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r1;
    }
}
