package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.hapticfeedback.HapticFeedback;
import androidx.compose.p002ui.platform.ClipboardManager;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.platform.TextToolbar;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n25#2:145\n36#2:152\n25#2:159\n25#2:166\n1114#3,6:146\n1114#3,6:153\n1114#3,6:160\n1114#3,6:167\n76#4:173\n76#4:174\n76#4:175\n76#5:176\n102#5,2:177\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n43#1:145\n47#1:152\n85#1:159\n86#1:166\n43#1:146,6\n47#1:153,6\n85#1:160,6\n86#1:167,6\n88#1:173\n89#1:174\n90#1:175\n43#1:176\n43#1:177,2\n*E\n"})
/* compiled from: SelectionContainer.kt */
public final class SelectionContainerKt {
    @ComposableInferredTarget(scheme = "[0[0]]")
    @Composable
    public static final void DisableSelection(C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
        int i2;
        int i3;
        C12775o.m28639i(oVar, "content");
        Composer startRestartGroup = composer.startRestartGroup(336063542);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(oVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336063542, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:60)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null)}, oVar, startRestartGroup, ((i2 << 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SelectionContainerKt$DisableSelection$1(oVar, i));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SelectionContainer(androidx.compose.p002ui.Modifier r8, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r9, androidx.compose.runtime.Composer r10, int r11, int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r0 = -1075498320(0xffffffffbfe532b0, float:-1.7906094)
            androidx.compose.runtime.Composer r10 = r10.startRestartGroup(r0)
            r1 = r12 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0014
            r3 = r11 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0023
            boolean r3 = r10.changed((java.lang.Object) r8)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            r3 = r3 | r11
            goto L_0x0024
        L_0x0023:
            r3 = r11
        L_0x0024:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x002b
            r3 = r3 | 48
            goto L_0x003b
        L_0x002b:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x003b
            boolean r4 = r10.changedInstance(r9)
            if (r4 == 0) goto L_0x0038
            r4 = 32
            goto L_0x003a
        L_0x0038:
            r4 = 16
        L_0x003a:
            r3 = r3 | r4
        L_0x003b:
            r4 = r3 & 91
            r5 = 18
            if (r4 != r5) goto L_0x004d
            boolean r4 = r10.getSkipping()
            if (r4 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            r10.skipToGroupEnd()
            goto L_0x00bd
        L_0x004d:
            if (r1 == 0) goto L_0x0051
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.p002ui.Modifier.Companion
        L_0x0051:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x005d
            r1 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:41)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r3, r1, r4)
        L_0x005d:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.startReplaceableGroup(r0)
            java.lang.Object r0 = r10.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r1.getEmpty()
            if (r0 != r4) goto L_0x0077
            r0 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r0, r2, r0)
            r10.updateRememberedValue(r0)
        L_0x0077:
            r10.endReplaceableGroup()
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            androidx.compose.foundation.text.selection.Selection r2 = SelectionContainer$lambda$1(r0)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r10.startReplaceableGroup(r4)
            boolean r4 = r10.changed((java.lang.Object) r0)
            java.lang.Object r5 = r10.rememberedValue()
            if (r4 != 0) goto L_0x0096
            java.lang.Object r1 = r1.getEmpty()
            if (r5 != r1) goto L_0x009e
        L_0x0096:
            androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1 r5 = new androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
            r5.<init>(r0)
            r10.updateRememberedValue(r5)
        L_0x009e:
            r10.endReplaceableGroup()
            r0 = r5
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r1 = r3 & 14
            int r3 = r3 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r1 | r3
            r7 = 0
            r1 = r8
            r3 = r0
            r4 = r9
            r5 = r10
            SelectionContainer(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00bd
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00bd:
            androidx.compose.runtime.ScopeUpdateScope r10 = r10.endRestartGroup()
            if (r10 != 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2 r0 = new androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2
            r0.<init>(r8, r9, r11, r12)
            r10.updateScope(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer(androidx.compose.ui.Modifier, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    /* access modifiers changed from: private */
    public static final void SelectionContainer$lambda$2(MutableState<Selection> mutableState, Selection selection) {
        mutableState.setValue(selection);
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void SelectionContainer(Modifier modifier, Selection selection, Function1<? super Selection, C11921v> function1, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i, int i2) {
        int i3;
        C12775o.m28639i(function1, "onSelectionChange");
        C12775o.m28639i(oVar, "children");
        Composer startRestartGroup = composer.startRestartGroup(2078139907);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed((Object) modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed((Object) selection) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(oVar) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078139907, i5, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:75)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new SelectionRegistrarImpl();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionManager selectionManager = (SelectionManager) rememberedValue2;
            selectionManager.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            selectionManager.setClipboardManager((ClipboardManager) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            selectionManager.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(function1);
            selectionManager.setSelection(selection);
            selectionManager.setTouchMode(TouchMode_androidKt.isInTouchMode());
            ContextMenu_androidKt.ContextMenuArea(selectionManager, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(startRestartGroup, -123806316, true, new SelectionContainerKt$SelectionContainer$3(selectionRegistrarImpl, modifier, selectionManager, oVar, i5)), startRestartGroup, 56);
            EffectsKt.DisposableEffect((Object) selectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new SelectionContainerKt$SelectionContainer$4(selectionManager), startRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SelectionContainerKt$SelectionContainer$5(modifier2, selection, function1, oVar, i, i2));
        }
    }
}
