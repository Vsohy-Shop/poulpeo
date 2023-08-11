package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13092s;

@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,374:1\n50#2:375\n49#2:376\n25#2:383\n50#2:390\n49#2:391\n1114#3,6:377\n1114#3,6:384\n1114#3,6:392\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n*L\n151#1:375\n151#1:376\n191#1:383\n209#1:390\n209#1:391\n151#1:377,6\n191#1:384,6\n209#1:392,6\n*E\n"})
/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3 extends C12777p implements C13092s<Float, Color, Color, Float, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $border;
    final /* synthetic */ TextFieldColors $colors;
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
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    /* compiled from: TextFieldImpl.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.TextFieldType[] r0 = androidx.compose.material.TextFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.TextFieldType r1 = androidx.compose.material.TextFieldType.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.TextFieldType r1 = androidx.compose.material.TextFieldType.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, String str, boolean z, int i, TextFieldColors textFieldColors, boolean z2, InteractionSource interactionSource, int i2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, TextFieldType textFieldType, C13088o<? super Composer, ? super Integer, C11921v> oVar5, boolean z3, PaddingValues paddingValues, boolean z4, C13088o<? super Composer, ? super Integer, C11921v> oVar6) {
        super(6);
        this.$label = oVar;
        this.$placeholder = oVar2;
        this.$transformedText = str;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$colors = textFieldColors;
        this.$enabled = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty = i2;
        this.$leadingIcon = oVar3;
        this.$trailingIcon = oVar4;
        this.$type = textFieldType;
        this.$innerTextField = oVar5;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z4;
        this.$border = oVar6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m34191invokeRIQooxk(((Number) obj).floatValue(), ((Color) obj2).m35681unboximpl(), ((Color) obj3).m35681unboximpl(), ((Number) obj4).floatValue(), (Composer) obj5, ((Number) obj6).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: invoke-RIQooxk  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m34191invokeRIQooxk(float r21, long r22, long r24, float r26, androidx.compose.runtime.Composer r27, int r28) {
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
            goto L_0x030a
        L_0x0066:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0075
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)"
            r5 = 341865432(0x146073d8, float:1.1331956E-26)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r13, r1, r2)
        L_0x0075:
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r5 = r0.$label
            r7 = 1
            if (r5 == 0) goto L_0x0098
            boolean r6 = r0.$shouldOverrideTextStyleColor
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 r2 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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
            r1 = 362863774(0x15a0dc9e, float:6.497156E-26)
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
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 r1 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
            androidx.compose.material.TextFieldColors r5 = r0.$colors
            boolean r6 = r0.$enabled
            int r7 = r0.$$dirty
            int r8 = r0.$$dirty1
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r9 = r0.$placeholder
            r3 = r1
            r4 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = 1120552650(0x42ca46ca, float:101.13826)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r3, r14, r1)
            r7 = r1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            androidx.compose.material.Strings$Companion r1 = androidx.compose.material.Strings.Companion
            int r1 = r1.m34120getDefaultErrorMessageUdPEhr4()
            r8 = 6
            java.lang.String r1 = androidx.compose.material.Strings_androidKt.m34125getString4foXLRw(r1, r15, r8)
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
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 r6 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1
            r6.<init>(r5, r1)
            r15.updateRememberedValue(r6)
        L_0x0102:
            r27.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r1 = 0
            androidx.compose.ui.Modifier r12 = androidx.compose.p002ui.semantics.SemanticsModifierKt.semantics$default(r3, r2, r6, r14, r1)
            androidx.compose.material.TextFieldColors r1 = r0.$colors
            boolean r1 = r1 instanceof androidx.compose.material.TextFieldColorsWithIcons
            if (r1 == 0) goto L_0x0149
            r1 = -1083197894(0xffffffffbf6fb63a, float:-0.9363743)
            r15.startReplaceableGroup(r1)
            androidx.compose.material.TextFieldColors r1 = r0.$colors
            androidx.compose.material.TextFieldColorsWithIcons r1 = (androidx.compose.material.TextFieldColorsWithIcons) r1
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.$interactionSource
            int r5 = r0.$$dirty
            int r5 = r5 >> 27
            r5 = r5 & 14
            int r6 = r0.$$dirty1
            int r17 = r6 << 3
            r17 = r17 & 112(0x70, float:1.57E-43)
            r5 = r5 | r17
            int r6 = r6 << 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | r5
            r5 = r27
            androidx.compose.runtime.State r1 = r1.leadingIconColor(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            r27.endReplaceableGroup()
            goto L_0x0178
        L_0x0149:
            r1 = -1083197798(0xffffffffbf6fb69a, float:-0.93638)
            r15.startReplaceableGroup(r1)
            androidx.compose.material.TextFieldColors r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            int r4 = r0.$$dirty
            int r4 = r4 >> 27
            r4 = r4 & 14
            int r5 = r0.$$dirty1
            int r6 = r5 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            int r5 = r5 >> 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            androidx.compose.runtime.State r1 = r1.leadingIconColor(r2, r3, r15, r4)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            r27.endReplaceableGroup()
        L_0x0178:
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$leadingIcon
            if (r3 == 0) goto L_0x018b
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
            r4.<init>(r1, r3)
            r1 = 1505327088(0x59b977f0, float:6.5255929E15)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r1, r14, r4)
            r17 = r1
            goto L_0x018d
        L_0x018b:
            r17 = 0
        L_0x018d:
            androidx.compose.material.TextFieldColors r1 = r0.$colors
            boolean r1 = r1 instanceof androidx.compose.material.TextFieldColorsWithIcons
            if (r1 == 0) goto L_0x01ca
            r1 = -1083197452(0xffffffffbf6fb7f4, float:-0.93640065)
            r15.startReplaceableGroup(r1)
            androidx.compose.material.TextFieldColors r1 = r0.$colors
            androidx.compose.material.TextFieldColorsWithIcons r1 = (androidx.compose.material.TextFieldColorsWithIcons) r1
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            androidx.compose.foundation.interaction.InteractionSource r4 = r0.$interactionSource
            int r5 = r0.$$dirty
            int r5 = r5 >> 27
            r5 = r5 & 14
            int r6 = r0.$$dirty1
            int r18 = r6 << 3
            r18 = r18 & 112(0x70, float:1.57E-43)
            r5 = r5 | r18
            int r6 = r6 << 3
            r6 = r6 & 896(0x380, float:1.256E-42)
            r6 = r6 | r5
            r5 = r27
            androidx.compose.runtime.State r1 = r1.trailingIconColor(r2, r3, r4, r5, r6)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            r27.endReplaceableGroup()
            goto L_0x01f9
        L_0x01ca:
            r1 = -1083197355(0xffffffffbf6fb855, float:-0.93640643)
            r15.startReplaceableGroup(r1)
            androidx.compose.material.TextFieldColors r1 = r0.$colors
            boolean r2 = r0.$enabled
            boolean r3 = r0.$isError
            int r4 = r0.$$dirty
            int r4 = r4 >> 27
            r4 = r4 & 14
            int r5 = r0.$$dirty1
            int r6 = r5 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r4 = r4 | r6
            int r5 = r5 >> 3
            r5 = r5 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            androidx.compose.runtime.State r1 = r1.trailingIconColor(r2, r3, r15, r4)
            java.lang.Object r1 = r1.getValue()
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.p002ui.graphics.Color) r1
            long r1 = r1.m35681unboximpl()
            r27.endReplaceableGroup()
        L_0x01f9:
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$trailingIcon
            if (r3 == 0) goto L_0x020b
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 r4 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
            r4.<init>(r1, r3)
            r1 = -1894727196(0xffffffff8f10c1e4, float:-7.13709E-30)
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r1, r14, r4)
            r6 = r1
            goto L_0x020c
        L_0x020b:
            r6 = 0
        L_0x020c:
            androidx.compose.material.TextFieldType r1 = r0.$type
            int[] r2 = androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r14) goto L_0x02c9
            r4 = 2
            if (r1 == r4) goto L_0x0226
            r1 = -1083194976(0xffffffffbf6fc1a0, float:-0.93654823)
            r15.startReplaceableGroup(r1)
            r27.endReplaceableGroup()
            goto L_0x0301
        L_0x0226:
            r1 = -1083196463(0xffffffffbf6fbbd1, float:-0.9364596)
            r15.startReplaceableGroup(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r15.startReplaceableGroup(r1)
            java.lang.Object r1 = r27.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r1 != r5) goto L_0x0251
            androidx.compose.ui.geometry.Size$Companion r1 = androidx.compose.p002ui.geometry.Size.Companion
            long r18 = r1.m35500getZeroNHjbRc()
            androidx.compose.ui.geometry.Size r1 = androidx.compose.p002ui.geometry.Size.m35479boximpl(r18)
            r2 = 0
            r5 = 2
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r2, r5, r2)
            r15.updateRememberedValue(r1)
        L_0x0251:
            r27.endReplaceableGroup()
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1 r2 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
            androidx.compose.foundation.layout.PaddingValues r5 = r0.$contentPadding
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r3 = r0.$border
            int r8 = r0.$$dirty1
            r2.<init>(r1, r5, r3, r8)
            r3 = 139886979(0x8568183, float:6.4550523E-34)
            androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r15, r3, r14, r2)
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$innerTextField
            boolean r8 = r0.$singleLine
            java.lang.Float r3 = java.lang.Float.valueOf(r21)
            r15.startReplaceableGroup(r9)
            boolean r3 = r15.changed((java.lang.Object) r3)
            boolean r5 = r15.changed((java.lang.Object) r1)
            r3 = r3 | r5
            java.lang.Object r5 = r27.rememberedValue()
            if (r3 != 0) goto L_0x0288
            java.lang.Object r3 = r4.getEmpty()
            if (r5 != r3) goto L_0x0290
        L_0x0288:
            androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1 r5 = new androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
            r5.<init>(r10, r1)
            r15.updateRememberedValue(r5)
        L_0x0290:
            r27.endReplaceableGroup()
            r9 = r5
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.foundation.layout.PaddingValues r5 = r0.$contentPadding
            int r1 = r0.$$dirty
            int r3 = r1 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r4
            r4 = 6
            int r1 = r1 >> r4
            r16 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r16
            r1 = r1 | r3
            int r3 = r13 << 21
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r13
            r13 = r1 | r3
            int r1 = r0.$$dirty1
            int r1 = r1 >> r4
            r16 = r1 & 14
            r1 = r12
            r3 = r7
            r4 = r11
            r11 = r5
            r5 = r17
            r7 = r8
            r8 = r21
            r10 = r14
            r12 = r27
            r14 = r16
            androidx.compose.material.OutlinedTextFieldKt.OutlinedTextFieldLayout(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r27.endReplaceableGroup()
            goto L_0x0301
        L_0x02c9:
            r1 = -1083197019(0xffffffffbf6fb9a5, float:-0.93642646)
            r15.startReplaceableGroup(r1)
            of.o<androidx.compose.runtime.Composer, java.lang.Integer, ef.v> r2 = r0.$innerTextField
            boolean r8 = r0.$singleLine
            androidx.compose.foundation.layout.PaddingValues r9 = r0.$contentPadding
            int r1 = r0.$$dirty
            int r3 = r1 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 6
            int r1 = r1 >> r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r1 = r1 & r4
            r1 = r1 | r3
            int r3 = r13 << 21
            r4 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r4
            r1 = r1 | r3
            int r3 = r0.$$dirty1
            int r3 = r3 << 18
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r4
            r13 = r1 | r3
            r1 = r12
            r3 = r11
            r4 = r7
            r5 = r17
            r7 = r8
            r8 = r21
            r10 = r27
            r11 = r13
            androidx.compose.material.TextFieldKt.TextFieldLayout(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r27.endReplaceableGroup()
        L_0x0301:
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x030a
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3.m34191invokeRIQooxk(float, long, long, float, androidx.compose.runtime.Composer, int):void");
    }
}
