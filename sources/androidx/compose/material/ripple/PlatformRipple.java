package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,253:1\n50#2:254\n49#2:255\n67#2,3:262\n66#2:265\n1057#3,6:256\n1057#3,6:266\n76#4:272\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/PlatformRipple\n*L\n68#1:254\n68#1:255\n91#1:262,3\n91#1:265\n68#1:256,6\n91#1:266,6\n106#1:272\n*E\n"})
@Stable
/* compiled from: Ripple.android.kt */
public final class PlatformRipple extends Ripple {
    public /* synthetic */ PlatformRipple(boolean z, float f, State state, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state);
    }

    @Composable
    private final ViewGroup findNearestViewGroup(Composer composer, int i) {
        composer.startReplaceableGroup(-1737891121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737891121, i, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)");
        }
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(consume instanceof ViewGroup)) {
            ViewParent parent = ((View) consume).getParent();
            if (parent instanceof View) {
                C12775o.m28638h(parent, "parent");
                consume = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + consume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewGroup;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: androidx.compose.material.ripple.AndroidRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: androidx.compose.material.ripple.CommonRippleIndicationInstance} */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cb, code lost:
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x005c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.material.ripple.RippleIndicationInstance m34227rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource r13, boolean r14, float r15, androidx.compose.runtime.State<androidx.compose.p002ui.graphics.Color> r16, androidx.compose.runtime.State<androidx.compose.material.ripple.RippleAlpha> r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r18
            r3 = r19
            java.lang.String r4 = "interactionSource"
            kotlin.jvm.internal.C12775o.m28639i(r13, r4)
            java.lang.String r4 = "color"
            r8 = r16
            kotlin.jvm.internal.C12775o.m28639i(r8, r4)
            java.lang.String r4 = "rippleAlpha"
            r9 = r17
            kotlin.jvm.internal.C12775o.m28639i(r9, r4)
            r4 = 331259447(0x13be9e37, float:4.8118755E-27)
            r2.startReplaceableGroup(r4)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x002b
            r5 = -1
            java.lang.String r6 = "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r4, r3, r5, r6)
        L_0x002b:
            int r3 = r3 >> 15
            r3 = r3 & 14
            android.view.ViewGroup r3 = r12.findNearestViewGroup(r2, r3)
            r4 = 1643267286(0x61f244d6, float:5.5863403E20)
            r2.startReplaceableGroup(r4)
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x0081
            r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r2.startReplaceableGroup(r3)
            boolean r1 = r2.changed((java.lang.Object) r13)
            boolean r3 = r2.changed((java.lang.Object) r12)
            r1 = r1 | r3
            java.lang.Object r3 = r18.rememberedValue()
            if (r1 != 0) goto L_0x005c
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x006c
        L_0x005c:
            androidx.compose.material.ripple.CommonRippleIndicationInstance r3 = new androidx.compose.material.ripple.CommonRippleIndicationInstance
            r10 = 0
            r5 = r3
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            r2.updateRememberedValue(r3)
        L_0x006c:
            r18.endReplaceableGroup()
            androidx.compose.material.ripple.CommonRippleIndicationInstance r3 = (androidx.compose.material.ripple.CommonRippleIndicationInstance) r3
            r18.endReplaceableGroup()
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x007d:
            r18.endReplaceableGroup()
            return r3
        L_0x0081:
            r18.endReplaceableGroup()
            int r4 = r3.getChildCount()
            r5 = 0
        L_0x0089:
            if (r5 >= r4) goto L_0x0097
            android.view.View r6 = r3.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.compose.material.ripple.RippleContainer
            if (r7 == 0) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            int r5 = r5 + 1
            goto L_0x0089
        L_0x0097:
            r6 = 0
        L_0x0098:
            if (r6 != 0) goto L_0x00ab
            androidx.compose.material.ripple.RippleContainer r6 = new androidx.compose.material.ripple.RippleContainer
            android.content.Context r4 = r3.getContext()
            java.lang.String r5 = "view.context"
            kotlin.jvm.internal.C12775o.m28638h(r4, r5)
            r6.<init>(r4)
            r3.addView(r6)
        L_0x00ab:
            r3 = 1618982084(0x607fb4c4, float:7.370227E19)
            r2.startReplaceableGroup(r3)
            boolean r1 = r2.changed((java.lang.Object) r13)
            boolean r3 = r2.changed((java.lang.Object) r12)
            r1 = r1 | r3
            boolean r3 = r2.changed((java.lang.Object) r6)
            r1 = r1 | r3
            java.lang.Object r3 = r18.rememberedValue()
            if (r1 != 0) goto L_0x00cd
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r3 != r1) goto L_0x00e0
        L_0x00cd:
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r3 = new androidx.compose.material.ripple.AndroidRippleIndicationInstance
            r10 = r6
            androidx.compose.material.ripple.RippleContainer r10 = (androidx.compose.material.ripple.RippleContainer) r10
            r11 = 0
            r5 = r3
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.updateRememberedValue(r3)
        L_0x00e0:
            r18.endReplaceableGroup()
            androidx.compose.material.ripple.AndroidRippleIndicationInstance r3 = (androidx.compose.material.ripple.AndroidRippleIndicationInstance) r3
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00ee
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00ee:
            r18.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.PlatformRipple.m34227rememberUpdatedRippleInstance942rkJo(androidx.compose.foundation.interaction.InteractionSource, boolean, float, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):androidx.compose.material.ripple.RippleIndicationInstance");
    }

    private PlatformRipple(boolean z, float f, State<Color> state) {
        super(z, f, state, (DefaultConstructorMarker) null);
    }
}
