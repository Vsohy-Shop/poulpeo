package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13092s;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3 extends C12777p implements C13092s<Float, Color, Color, Float, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextStyle $bodySmall;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $supportingText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            iArr[TextFieldType.Filled.ordinal()] = 1;
            iArr[TextFieldType.Outlined.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, String str, boolean z, int i, TextFieldColors textFieldColors, boolean z2, InteractionSource interactionSource, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, TextFieldType textFieldType, C13088o<? super Composer, ? super Integer, C11921v> oVar6, boolean z3, PaddingValues paddingValues, int i2, boolean z4, TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar7) {
        super(6);
        this.$label = oVar;
        this.$placeholder = oVar2;
        this.$transformedText = str;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$colors = textFieldColors;
        this.$enabled = z2;
        this.$interactionSource = interactionSource;
        this.$leadingIcon = oVar3;
        this.$trailingIcon = oVar4;
        this.$supportingText = oVar5;
        this.$type = textFieldType;
        this.$innerTextField = oVar6;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z4;
        this.$bodySmall = textStyle;
        this.$container = oVar7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m34669invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m35681unboximpl(), ((Color) obj3).m35681unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: invoke-RIQooxk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34669invokeRIQooxk(float r21, long r22, long r24, float r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            r20 = this;
            r0 = r20
            r10 = r21
            r15 = r27
            r1 = r28
            r2 = r1 & 14
            if (r2 != 0) goto L_0x0017
            boolean r2 = r15.changed((float) r10)
            if (r2 == 0) goto L_0x0014
            r2 = 4
            goto L_0x0015
        L_0x0014:
            r2 = 2
        L_0x0015:
            r2 = r2 | r1
            goto L_0x0018
        L_0x0017:
            r2 = r1
        L_0x0018:
            r3 = r1 & 112(0x70, float:1.57E-43)
            r8 = r22
            if (r3 != 0) goto L_0x002a
            boolean r3 = r15.changed((long) r8)
            if (r3 == 0) goto L_0x0027
            r3 = 32
            goto L_0x0029
        L_0x0027:
            r3 = 16
        L_0x0029:
            r2 = r2 | r3
        L_0x002a:
            r3 = r1 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x003d
            r3 = r24
            boolean r5 = r15.changed((long) r3)
            if (r5 == 0) goto L_0x0039
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x003b
        L_0x0039:
            r5 = 128(0x80, float:1.794E-43)
        L_0x003b:
            r2 = r2 | r5
            goto L_0x003f
        L_0x003d:
            r3 = r24
        L_0x003f:
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r12 = r26
            if (r1 != 0) goto L_0x0051
            boolean r1 = r15.changed((float) r12)
            if (r1 == 0) goto L_0x004e
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0050
        L_0x004e:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0050:
            r2 = r2 | r1
        L_0x0051:
            r13 = r2
            r1 = 46811(0xb6db, float:6.5596E-41)
            r1 = r1 & r13
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r2) goto L_0x0066
            boolean r1 = r27.getSkipping()
            if (r1 != 0) goto L_0x0061
            goto L_0x0066
        L_0x0061:
            r27.skipToGroupEnd()
            goto L_0x02ed
        L_0x0066:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0075
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:112)"
            r5 = 1915872767(0x7231e5ff, float:3.5236413E30)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r13, r1, r2)
        L_0x0075:
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r5 = r0.$label
            r7 = 1
            if (r5 == 0) goto L_0x0098
            boolean r6 = r0.$shouldOverrideTextStyleColor
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 r2 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
            r1 = r2
            r11 = r2
            r2 = r21
            r3 = r24
            r17 = r6
            r6 = r13
            r14 = r7
            r7 = r17
            r8 = r22
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r1 = 1199990137(0x47866579, float:68810.945)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r1, r14, r11)
            r11 = r1
            goto L_0x009a
        L_0x0098:
            r14 = r7
            r11 = 0
        L_0x009a:
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r1 = r0.$placeholder
            r2 = 0
            if (r1 == 0) goto L_0x00c7
            java.lang.String r1 = r0.$transformedText
            int r1 = r1.length()
            if (r1 != 0) goto L_0x00a9
            r7 = r14
            goto L_0x00aa
        L_0x00a9:
            r7 = r2
        L_0x00aa:
            if (r7 == 0) goto L_0x00c7
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 r1 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
            androidx.compose.material3.TextFieldColors r5 = r0.$colors
            boolean r6 = r0.$enabled
            int r7 = r0.$$dirty1
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r8 = r0.$placeholder
            int r9 = r0.$$dirty
            r3 = r1
            r4 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = 1472145357(0x57bf27cd, float:4.20355328E14)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r3, r14, r1)
            r7 = r1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            androidx.compose.material3.Strings$Companion r1 = androidx.compose.material3.Strings.Companion
            int r1 = r1.m34586getDefaultErrorMessageadMyvUU()
            r8 = 6
            java.lang.String r1 = androidx.compose.material3.Strings_androidKt.m34594getStringNWtq28(r1, r15, r8)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            boolean r4 = r0.$isError
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r0.$isError
            r9 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.startReplaceableGroup(r9)
            boolean r4 = r15.changed((java.lang.Object) r4)
            boolean r6 = r15.changed((java.lang.Object) r1)
            r4 = r4 | r6
            java.lang.Object r6 = r27.rememberedValue()
            if (r4 != 0) goto L_0x00fa
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r6 != r4) goto L_0x0102
        L_0x00fa:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 r6 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
            r6.<init>(r5, r1)
            r15.updateRememberedValue(r6)
        L_0x0102:
            r27.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r1 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r3, r2, r6, r14, r1)
            androidx.compose.material3.TextFieldColors r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.$interactionSource
            int r5 = r0.$$dirty1
            r6 = r5 & 14
            r17 = r5 & 112(0x70, float:1.57E-43)
            r6 = r6 | r17
            r8 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | r8
            int r5 = r5 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r27
            androidx.compose.runtime.State r1 = r1.leadingIconColor$material3_release(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$leadingIcon
            if (r3 == 0) goto L_0x0146
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1 r4 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
            r4.<init>(r1, r3)
            r1 = 175497959(0xa75e2e7, float:1.18389965E-32)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r1, r14, r4)
            r8 = r1
            goto L_0x0147
        L_0x0146:
            r8 = 0
        L_0x0147:
            androidx.compose.material3.TextFieldColors r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.$interactionSource
            int r5 = r0.$$dirty1
            r6 = r5 & 14
            r17 = r5 & 112(0x70, float:1.57E-43)
            r6 = r6 | r17
            r9 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | r9
            int r5 = r5 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r27
            androidx.compose.runtime.State r1 = r1.trailingIconColor$material3_release(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$trailingIcon
            if (r3 == 0) goto L_0x0181
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 r4 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
            r4.<init>(r1, r3)
            r1 = -432498573(0xffffffffe6389873, float:-2.179319E23)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r1, r14, r4)
            r9 = r1
            goto L_0x0182
        L_0x0181:
            r9 = 0
        L_0x0182:
            androidx.compose.material3.TextFieldColors r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.$interactionSource
            int r5 = r0.$$dirty1
            r6 = r5 & 14
            r17 = r5 & 112(0x70, float:1.57E-43)
            r6 = r6 | r17
            r14 = r5 & 896(0x380, float:1.256E-42)
            r6 = r6 | r14
            int r5 = r5 >> 3
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r5
            r5 = r27
            androidx.compose.runtime.State r1 = r1.supportingTextColor$material3_release(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$supportingText
            if (r3 == 0) goto L_0x01bf
            androidx.compose.ui.text.TextStyle r4 = r0.$bodySmall
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1 r5 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
            r5.<init>(r1, r4, r3)
            r1 = -1269483524(0xffffffffb45537fc, float:-1.9857538E-7)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r1, r2, r5)
            r14 = r1
            goto L_0x01c0
        L_0x01bf:
            r14 = 0
        L_0x01c0:
            androidx.compose.material3.TextFieldType r1 = r0.$type
            int[] r2 = androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r4 = 1
            if (r1 == r4) goto L_0x0290
            r4 = 2
            if (r1 == r4) goto L_0x01dd
            r1 = 404044016(0x181538f0, float:1.9286545E-24)
            r15.startReplaceableGroup(r1)
            r27.endReplaceableGroup()
            ef.v r1 = p336ef.C11921v.f18618a
            goto L_0x02e4
        L_0x01dd:
            r1 = 404042394(0x1815329a, float:1.9283346E-24)
            r15.startReplaceableGroup(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r1)
            java.lang.Object r1 = r27.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r1 != r5) goto L_0x0208
            androidx.compose.ui.geometry.Size$Companion r1 = androidx.compose.p002ui.geometry.Size.Companion
            long r5 = r1.m35500getZeroNHjbRc()
            androidx.compose.ui.geometry.Size r1 = androidx.compose.p002ui.geometry.Size.m35479boximpl(r5)
            r5 = 2
            r6 = 0
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r6, r5, r6)
            r15.updateRememberedValue(r1)
        L_0x0208:
            r27.endReplaceableGroup()
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1 r5 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
            androidx.compose.foundation.layout.PaddingValues r6 = r0.$contentPadding
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$container
            int r3 = r0.$$dirty1
            r5.<init>(r1, r6, r2, r3)
            r2 = 787383072(0x2eee8320, float:1.08462794E-10)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r2, r3, r5)
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$innerTextField
            boolean r6 = r0.$singleLine
            java.lang.Float r3 = java.lang.Float.valueOf(r21)
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r15.startReplaceableGroup(r5)
            boolean r3 = r15.changed((java.lang.Object) r3)
            boolean r5 = r15.changed((java.lang.Object) r1)
            r3 = r3 | r5
            java.lang.Object r5 = r27.rememberedValue()
            if (r3 != 0) goto L_0x0243
            java.lang.Object r3 = r4.getEmpty()
            if (r5 != r3) goto L_0x024b
        L_0x0243:
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1 r5 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$1$1
            r5.<init>(r10, r1)
            r15.updateRememberedValue(r5)
        L_0x024b:
            r27.endReplaceableGroup()
            r17 = r5
            kotlin.jvm.functions.Function1 r17 = (kotlin.jvm.functions.Function1) r17
            androidx.compose.foundation.layout.PaddingValues r5 = r0.$contentPadding
            int r1 = r0.$$dirty
            int r3 = r1 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r4
            int r1 = r1 >> 9
            r4 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r1 = r1 | r3
            int r3 = r13 << 21
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r18 = r1 | r3
            int r1 = r0.$$dirty1
            r3 = 6
            int r1 = r1 >> r3
            r19 = r1 & 112(0x70, float:1.57E-43)
            r1 = r12
            r3 = r7
            r4 = r11
            r12 = r5
            r5 = r8
            r7 = r6
            r6 = r9
            r8 = r21
            r9 = r17
            r10 = r16
            r11 = r14
            r13 = r27
            r14 = r18
            r0 = r15
            r15 = r19
            androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r27.endReplaceableGroup()
            ef.v r0 = p336ef.C11921v.f18618a
            r0 = r20
            goto L_0x02e4
        L_0x0290:
            r0 = r15
            r1 = 404041480(0x18152f08, float:1.9281543E-24)
            r0.startReplaceableGroup(r1)
            androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1 r1 = new androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
            r0 = r20
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$container
            int r3 = r0.$$dirty1
            r1.<init>(r2, r3)
            r2 = 1566950173(0x5d65c31d, float:1.03475678E18)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r2, r3, r1)
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$innerTextField
            boolean r6 = r0.$singleLine
            androidx.compose.foundation.layout.PaddingValues r5 = r0.$contentPadding
            int r1 = r0.$$dirty
            int r3 = r1 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r4
            int r1 = r1 >> 9
            r4 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r1 = r1 | r3
            int r3 = r13 << 21
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r13 = r1 | r3
            int r1 = r0.$$dirty1
            int r1 = r1 >> 9
            r17 = r1 & 14
            r1 = r12
            r3 = r11
            r4 = r7
            r11 = r5
            r5 = r8
            r7 = r6
            r6 = r9
            r8 = r21
            r9 = r16
            r10 = r14
            r12 = r27
            r14 = r17
            androidx.compose.material3.TextFieldKt.TextFieldLayout(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r27.endReplaceableGroup()
            ef.v r1 = p336ef.C11921v.f18618a
        L_0x02e4:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x02ed
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x02ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldImplKt$CommonDecorationBox$3.m34669invokeRIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void");
    }
}
