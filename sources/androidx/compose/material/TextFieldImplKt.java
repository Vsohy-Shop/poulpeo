package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.LayoutIdParentData;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.input.TransformedText;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,374:1\n50#2:375\n49#2:376\n1114#3,6:377\n658#4:383\n646#4:384\n658#4:385\n646#4:386\n154#5:387\n154#5:388\n154#5:389\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:375\n81#1:376\n81#1:377,6\n112#1:383\n112#1:384\n115#1:385\n115#1:386\n371#1:387\n372#1:388\n374#1:389\n*E\n"})
/* compiled from: TextFieldImpl.kt */
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;
    private static final float HorizontalIconPadding = C1232Dp.m38468constructorimpl((float) 12);
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding = C1232Dp.m38468constructorimpl((float) 16);
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);

    static {
        float f = (float) 48;
        IconDefaultSizeModifier = SizeKt.m33322defaultMinSizeVpY3zN4(Modifier.Companion, C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl(f));
    }

    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Composable
    public static final void CommonDecorationBox(TextFieldType textFieldType, String str, C13088o<? super Composer, ? super Integer, C11921v> oVar, VisualTransformation visualTransformation, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, boolean z, boolean z2, boolean z3, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, C13088o<? super Composer, ? super Integer, C11921v> oVar6, Composer composer, int i, int i2, int i3) {
        int i4;
        int i5;
        C13088o<? super Composer, ? super Integer, C11921v> oVar7;
        Composer composer2;
        boolean z4;
        boolean z5;
        boolean z6;
        C13088o<? super Composer, ? super Integer, C11921v> oVar8;
        C13088o<? super Composer, ? super Integer, C11921v> oVar9;
        C13088o<? super Composer, ? super Integer, C11921v> oVar10;
        InputPhase inputPhase;
        TextFieldType textFieldType2 = textFieldType;
        String str2 = str;
        C13088o<? super Composer, ? super Integer, C11921v> oVar11 = oVar;
        VisualTransformation visualTransformation2 = visualTransformation;
        C13088o<? super Composer, ? super Integer, C11921v> oVar12 = oVar2;
        InteractionSource interactionSource2 = interactionSource;
        PaddingValues paddingValues2 = paddingValues;
        TextFieldColors textFieldColors2 = textFieldColors;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        C12775o.m28639i(textFieldType2, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str2, "value");
        C12775o.m28639i(oVar11, "innerTextField");
        C12775o.m28639i(visualTransformation2, "visualTransformation");
        C12775o.m28639i(interactionSource2, "interactionSource");
        C12775o.m28639i(paddingValues2, "contentPadding");
        C12775o.m28639i(textFieldColors2, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-712568069);
        if ((i8 & 1) != 0) {
            i4 = i6 | 6;
        } else if ((i6 & 14) == 0) {
            i4 = (startRestartGroup.changed((Object) textFieldType2) ? 4 : 2) | i6;
        } else {
            i4 = i6;
        }
        int i9 = 32;
        if ((i8 & 2) != 0) {
            i4 |= 48;
        } else if ((i6 & 112) == 0) {
            i4 |= startRestartGroup.changed((Object) str2) ? 32 : 16;
        }
        int i10 = 256;
        if ((i8 & 4) != 0) {
            i4 |= 384;
        } else if ((i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            i4 |= startRestartGroup.changedInstance(oVar11) ? 256 : 128;
        }
        int i11 = 2048;
        if ((i8 & 8) != 0) {
            i4 |= 3072;
        } else if ((i6 & 7168) == 0) {
            i4 |= startRestartGroup.changed((Object) visualTransformation2) ? 2048 : 1024;
        }
        int i12 = 16384;
        if ((i8 & 16) != 0) {
            i4 |= 24576;
        } else if ((57344 & i6) == 0) {
            i4 |= startRestartGroup.changedInstance(oVar12) ? 16384 : 8192;
        }
        int i13 = i8 & 32;
        if (i13 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.f1069xf2722a21;
            C13088o<? super Composer, ? super Integer, C11921v> oVar13 = oVar3;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar14 = oVar3;
            if ((i6 & 458752) == 0) {
                i4 |= startRestartGroup.changedInstance(oVar14) ? 131072 : 65536;
            }
        }
        int i14 = i8 & 64;
        if (i14 != 0) {
            i4 |= 1572864;
            C13088o<? super Composer, ? super Integer, C11921v> oVar15 = oVar4;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar16 = oVar4;
            if ((i6 & 3670016) == 0) {
                i4 |= startRestartGroup.changedInstance(oVar16) ? 1048576 : 524288;
            }
        }
        int i15 = i8 & 128;
        if (i15 != 0) {
            i4 |= 12582912;
            C13088o<? super Composer, ? super Integer, C11921v> oVar17 = oVar5;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar18 = oVar5;
            if ((i6 & 29360128) == 0) {
                i4 |= startRestartGroup.changedInstance(oVar18) ? 8388608 : 4194304;
            }
        }
        int i16 = i8 & 256;
        if (i16 != 0) {
            i4 |= 100663296;
            boolean z7 = z;
        } else {
            boolean z8 = z;
            if ((i6 & 234881024) == 0) {
                i4 |= startRestartGroup.changed(z8) ? 67108864 : 33554432;
            }
        }
        int i17 = i8 & 512;
        if (i17 != 0) {
            i4 |= 805306368;
            boolean z9 = z2;
        } else {
            int i18 = i6 & 1879048192;
            boolean z10 = z2;
            if (i18 == 0) {
                i4 |= startRestartGroup.changed(z10) ? 536870912 : 268435456;
            }
        }
        int i19 = i8 & 1024;
        if (i19 != 0) {
            i5 = i7 | 6;
            boolean z11 = z3;
        } else {
            boolean z12 = z3;
            if ((i7 & 14) == 0) {
                i5 = i7 | (startRestartGroup.changed(z12) ? 4 : 2);
            } else {
                i5 = i7;
            }
        }
        if ((i8 & 2048) != 0) {
            i5 |= 48;
        } else if ((i7 & 112) == 0) {
            if (!startRestartGroup.changed((Object) interactionSource2)) {
                i9 = 16;
            }
            i5 |= i9;
        }
        int i20 = i5;
        if ((i8 & 4096) != 0) {
            i20 |= 384;
        } else if ((i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (!startRestartGroup.changed((Object) paddingValues2)) {
                i10 = 128;
            }
            i20 |= i10;
        }
        if ((i8 & 8192) != 0) {
            i20 |= 3072;
        } else if ((i7 & 7168) == 0) {
            if (!startRestartGroup.changed((Object) textFieldColors2)) {
                i11 = 1024;
            }
            i20 |= i11;
        }
        int i21 = i8 & 16384;
        if (i21 != 0) {
            i20 |= 24576;
            C13088o<? super Composer, ? super Integer, C11921v> oVar19 = oVar6;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar20 = oVar6;
            if ((i7 & 57344) == 0) {
                if (!startRestartGroup.changedInstance(oVar20)) {
                    i12 = 8192;
                }
                i20 |= i12;
            }
        }
        if ((i4 & 1533916891) == 306783378 && (46811 & i20) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            oVar10 = oVar3;
            oVar9 = oVar4;
            oVar8 = oVar5;
            z6 = z;
            z5 = z2;
            z4 = z3;
            oVar7 = oVar6;
            composer2 = startRestartGroup;
        } else {
            C13088o<? super Composer, ? super Integer, C11921v> oVar21 = i13 != 0 ? null : oVar3;
            C13088o<? super Composer, ? super Integer, C11921v> oVar22 = i14 != 0 ? null : oVar4;
            C13088o<? super Composer, ? super Integer, C11921v> oVar23 = i15 != 0 ? null : oVar5;
            boolean z13 = i16 != 0 ? false : z;
            boolean z14 = i17 != 0 ? true : z2;
            boolean z15 = i19 != 0 ? false : z3;
            C13088o<? super Composer, ? super Integer, C11921v> oVar24 = i21 != 0 ? null : oVar6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-712568069, i4, i20, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed((Object) str2) | startRestartGroup.changed((Object) visualTransformation2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = visualTransformation2.filter(new AnnotatedString(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            String text = ((TransformedText) rememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource2, startRestartGroup, (i20 >> 3) & 14).getValue().booleanValue()) {
                inputPhase = InputPhase.Focused;
            } else {
                if (text.length() == 0) {
                    inputPhase = InputPhase.UnfocusedEmpty;
                } else {
                    inputPhase = InputPhase.UnfocusedNotEmpty;
                }
            }
            InputPhase inputPhase2 = inputPhase;
            int i22 = i4;
            Composer composer3 = startRestartGroup;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(textFieldColors, z14, z15, interactionSource, i22, i20);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composer3, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long r4 = subtitle1.m37995getColor0d7_KjU();
            Color.Companion companion = Color.Companion;
            TextStyle textStyle = caption;
            boolean z16 = (Color.m35672equalsimpl0(r4, companion.m35707getUnspecified0d7_KjU()) && !Color.m35672equalsimpl0(textStyle.m37995getColor0d7_KjU(), companion.m35707getUnspecified0d7_KjU())) || (!Color.m35672equalsimpl0(subtitle1.m37995getColor0d7_KjU(), companion.m35707getUnspecified0d7_KjU()) && Color.m35672equalsimpl0(textStyle.m37995getColor0d7_KjU(), companion.m35707getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.INSTANCE;
            composer3.startReplaceableGroup(2129141006);
            long r1 = materialTheme.getTypography(composer3, 6).getCaption().m37995getColor0d7_KjU();
            if (z16) {
                if (!(r1 != companion.m35707getUnspecified0d7_KjU())) {
                    r1 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, composer3, 0)).m35681unboximpl();
                }
            }
            long j = r1;
            composer3.endReplaceableGroup();
            composer3.startReplaceableGroup(2129141197);
            long r0 = materialTheme.getTypography(composer3, 6).getSubtitle1().m37995getColor0d7_KjU();
            if (z16) {
                if (!(r0 != companion.m35707getUnspecified0d7_KjU())) {
                    r0 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase2, composer3, 0)).m35681unboximpl();
                }
            }
            long j2 = r0;
            composer3.endReplaceableGroup();
            boolean z17 = oVar2 != null;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$12 = textFieldImplKt$CommonDecorationBox$labelColor$1;
            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$3 = r0;
            TextFieldImplKt$CommonDecorationBox$3 textFieldImplKt$CommonDecorationBox$32 = new TextFieldImplKt$CommonDecorationBox$3(oVar2, oVar21, text, z15, i20, textFieldColors, z14, interactionSource, i22, oVar22, oVar23, textFieldType, oVar, z13, paddingValues, z16, oVar24);
            composer2 = composer3;
            textFieldTransitionScope.m34199TransitionDTcfvLk(inputPhase2, j, j2, textFieldImplKt$CommonDecorationBox$labelColor$12, z17, ComposableLambdaKt.composableLambda(composer2, 341865432, true, textFieldImplKt$CommonDecorationBox$3), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            oVar10 = oVar21;
            oVar9 = oVar22;
            oVar8 = oVar23;
            z6 = z13;
            z5 = z14;
            z4 = z15;
            oVar7 = oVar24;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            TextFieldImplKt$CommonDecorationBox$4 textFieldImplKt$CommonDecorationBox$4 = r0;
            TextFieldImplKt$CommonDecorationBox$4 textFieldImplKt$CommonDecorationBox$42 = new TextFieldImplKt$CommonDecorationBox$4(textFieldType, str, oVar, visualTransformation, oVar2, oVar10, oVar9, oVar8, z6, z5, z4, interactionSource, paddingValues, textFieldColors, oVar7, i, i2, i3);
            endRestartGroup.updateScope(textFieldImplKt$CommonDecorationBox$4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableOpenTarget(index = 0)
    /* renamed from: Decoration-euL9pac  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34190DecorationeuL9pac(long r15, androidx.compose.p002ui.text.TextStyle r17, java.lang.Float r18, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            r6 = r19
            r7 = r21
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            r0 = -399493340(0xffffffffe8303724, float:-3.3286147E24)
            r1 = r20
            androidx.compose.runtime.Composer r8 = r1.startRestartGroup(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001a
            r1 = r7 | 6
            r9 = r15
            goto L_0x002b
        L_0x001a:
            r1 = r7 & 14
            r9 = r15
            if (r1 != 0) goto L_0x002a
            boolean r1 = r8.changed((long) r9)
            if (r1 == 0) goto L_0x0027
            r1 = 4
            goto L_0x0028
        L_0x0027:
            r1 = 2
        L_0x0028:
            r1 = r1 | r7
            goto L_0x002b
        L_0x002a:
            r1 = r7
        L_0x002b:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0032
            r1 = r1 | 48
            goto L_0x0045
        L_0x0032:
            r3 = r7 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r17
            boolean r4 = r8.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x0041
            r4 = 32
            goto L_0x0043
        L_0x0041:
            r4 = 16
        L_0x0043:
            r1 = r1 | r4
            goto L_0x0047
        L_0x0045:
            r3 = r17
        L_0x0047:
            r4 = r22 & 4
            if (r4 == 0) goto L_0x004e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r5 = r7 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0061
            r5 = r18
            boolean r11 = r8.changed((java.lang.Object) r5)
            if (r11 == 0) goto L_0x005d
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r11 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r1 = r1 | r11
            goto L_0x0063
        L_0x0061:
            r5 = r18
        L_0x0063:
            r11 = r22 & 8
            if (r11 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r11 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x007a
            boolean r11 = r8.changedInstance(r6)
            if (r11 == 0) goto L_0x0077
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r1 = r1 | r11
        L_0x007a:
            r11 = r1
            r1 = r11 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r1 != r12) goto L_0x008d
            boolean r1 = r8.getSkipping()
            if (r1 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r8.skipToGroupEnd()
            r4 = r5
            goto L_0x00e5
        L_0x008d:
            r1 = 0
            if (r2 == 0) goto L_0x0092
            r12 = r1
            goto L_0x0093
        L_0x0092:
            r12 = r3
        L_0x0093:
            if (r4 == 0) goto L_0x0097
            r13 = r1
            goto L_0x0098
        L_0x0097:
            r13 = r5
        L_0x0098:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x00a4
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.Decoration (TextFieldImpl.kt:231)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r11, r1, r2)
        L_0x00a4:
            androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1 r14 = new androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
            r0 = r14
            r1 = r15
            r3 = r13
            r4 = r19
            r5 = r11
            r0.<init>(r1, r3, r4, r5)
            r0 = 494684590(0x1d7c49ae, float:3.3390014E-21)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r8, r0, r1, r14)
            if (r12 == 0) goto L_0x00c9
            r1 = -2009952864(0xffffffff88328da0, float:-5.3731406E-34)
            r8.startReplaceableGroup(r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            r1 = r1 | 48
            androidx.compose.material.TextKt.ProvideTextStyle(r12, r0, r8, r1)
            goto L_0x00d7
        L_0x00c9:
            r1 = -2009952812(0xffffffff88328dd4, float:-5.3731645E-34)
            r8.startReplaceableGroup(r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r8, r1)
        L_0x00d7:
            r8.endReplaceableGroup()
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x00e3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00e3:
            r3 = r12
            r4 = r13
        L_0x00e5:
            androidx.compose.runtime.ScopeUpdateScope r8 = r8.endRestartGroup()
            if (r8 != 0) goto L_0x00ec
            goto L_0x00fc
        L_0x00ec:
            androidx.compose.material.TextFieldImplKt$Decoration$1 r11 = new androidx.compose.material.TextFieldImplKt$Decoration$1
            r0 = r11
            r1 = r15
            r5 = r19
            r6 = r21
            r7 = r22
            r0.<init>(r1, r3, r4, r5, r6, r7)
            r8.updateScope(r11)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt.m34190DecorationeuL9pac(long, androidx.compose.ui.text.TextStyle, java.lang.Float, of.o, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        LayoutIdParentData layoutIdParentData;
        C12775o.m28639i(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof LayoutIdParentData) {
            layoutIdParentData = (LayoutIdParentData) parentData;
        } else {
            layoutIdParentData = null;
        }
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
