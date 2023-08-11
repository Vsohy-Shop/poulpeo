package androidx.compose.material3;

import android.view.View;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.node.Ref;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;

/* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2 */
/* compiled from: ExposedDropdownMenu.kt */
final class C0856x44cc52d6 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1<Boolean, C11921v> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0856x44cc52d6(boolean z, Function1<? super Boolean, C11921v> function1, int i, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(3);
        this.$expanded = z;
        this.$onExpandedChange = function1;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: of.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r10 = r19
            java.lang.String r2 = "$this$composed"
            kotlin.jvm.internal.C12775o.m28639i(r1, r2)
            r2 = 1714866713(0x6636ca19, float:2.1579969E23)
            r10.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:120)"
            r5 = r20
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r3, r4)
        L_0x001f:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1 r2 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1
            androidx.compose.ui.node.Ref<androidx.compose.ui.layout.LayoutCoordinates> r12 = r0.$coordinates
            android.view.View r13 = r0.$view
            int r14 = r0.$verticalMarginInPx
            androidx.compose.runtime.MutableState<java.lang.Integer> r15 = r0.$width$delegate
            androidx.compose.runtime.MutableState<java.lang.Integer> r3 = r0.$menuHeight$delegate
            r11 = r2
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(r1, r2)
            boolean r2 = r0.$expanded
            kotlin.jvm.functions.Function1<java.lang.Boolean, ef.v> r3 = r0.$onExpandedChange
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            kotlin.jvm.functions.Function1<java.lang.Boolean, ef.v> r5 = r0.$onExpandedChange
            boolean r6 = r0.$expanded
            r7 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r10.startReplaceableGroup(r7)
            boolean r3 = r10.changed((java.lang.Object) r3)
            boolean r4 = r10.changed((java.lang.Object) r4)
            r3 = r3 | r4
            java.lang.Object r4 = r19.rememberedValue()
            if (r3 != 0) goto L_0x005e
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r4 != r3) goto L_0x0066
        L_0x005e:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1 r4 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1
            r4.<init>(r5, r6)
            r10.updateRememberedValue(r4)
        L_0x0066:
            r19.endReplaceableGroup()
            r3 = r4
            of.a r3 = (p404of.C13074a) r3
            r4 = 0
            r5 = 0
            r6 = 0
            int r7 = r0.$$dirty
            int r7 = r7 << 3
            r8 = r7 & 112(0x70, float:1.57E-43)
            r9 = 28
            r7 = r19
            androidx.compose.ui.Modifier r1 = androidx.compose.material3.ExposedDropdownMenuKt.expandable(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.focus.FocusRequester r2 = r0.$focusRequester
            androidx.compose.ui.Modifier r1 = androidx.compose.p002ui.focus.FocusRequesterModifierKt.focusRequester(r1, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L_0x008c
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x008c:
            r19.endReplaceableGroup()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C0856x44cc52d6.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
