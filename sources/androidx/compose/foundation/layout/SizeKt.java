package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1024:1\n135#2:1025\n135#2:1026\n135#2:1027\n135#2:1028\n135#2:1029\n135#2:1030\n135#2:1031\n135#2:1032\n135#2:1033\n135#2:1034\n135#2:1035\n135#2:1036\n135#2:1037\n135#2:1038\n135#2:1039\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1025\n85#1:1026\n111#1:1027\n138#1:1028\n176#1:1029\n199#1:1030\n226#1:1031\n257#1:1032\n285#1:1033\n315#1:1034\n342#1:1035\n381#1:1036\n405#1:1037\n434#1:1038\n619#1:1039\n*E\n"})
/* compiled from: Size.kt */
public final class SizeKt {
    private static final FillModifier FillWholeMaxHeight = createFillHeightModifier(1.0f);
    private static final FillModifier FillWholeMaxSize = createFillSizeModifier(1.0f);
    private static final FillModifier FillWholeMaxWidth = createFillWidthModifier(1.0f);
    private static final WrapContentModifier WrapContentHeightCenter;
    private static final WrapContentModifier WrapContentHeightTop;
    private static final WrapContentModifier WrapContentSizeCenter;
    private static final WrapContentModifier WrapContentSizeTopStart;
    private static final WrapContentModifier WrapContentWidthCenter;
    private static final WrapContentModifier WrapContentWidthStart;

    static {
        Alignment.Companion companion = Alignment.Companion;
        WrapContentWidthCenter = createWrapContentWidthModifier(companion.getCenterHorizontally(), false);
        WrapContentWidthStart = createWrapContentWidthModifier(companion.getStart(), false);
        WrapContentHeightCenter = createWrapContentHeightModifier(companion.getCenterVertically(), false);
        WrapContentHeightTop = createWrapContentHeightModifier(companion.getTop(), false);
        WrapContentSizeCenter = createWrapContentSizeModifier(companion.getCenter(), false);
        WrapContentSizeTopStart = createWrapContentSizeModifier(companion.getTopStart(), false);
    }

    private static final FillModifier createFillHeightModifier(float f) {
        return new FillModifier(Direction.Vertical, f, new SizeKt$createFillHeightModifier$1(f));
    }

    private static final FillModifier createFillSizeModifier(float f) {
        return new FillModifier(Direction.Both, f, new SizeKt$createFillSizeModifier$1(f));
    }

    private static final FillModifier createFillWidthModifier(float f) {
        return new FillModifier(Direction.Horizontal, f, new SizeKt$createFillWidthModifier$1(f));
    }

    private static final WrapContentModifier createWrapContentHeightModifier(Alignment.Vertical vertical, boolean z) {
        return new WrapContentModifier(Direction.Vertical, z, new SizeKt$createWrapContentHeightModifier$1(vertical), vertical, new SizeKt$createWrapContentHeightModifier$2(vertical, z));
    }

    private static final WrapContentModifier createWrapContentSizeModifier(Alignment alignment, boolean z) {
        return new WrapContentModifier(Direction.Both, z, new SizeKt$createWrapContentSizeModifier$1(alignment), alignment, new SizeKt$createWrapContentSizeModifier$2(alignment, z));
    }

    private static final WrapContentModifier createWrapContentWidthModifier(Alignment.Horizontal horizontal, boolean z) {
        return new WrapContentModifier(Direction.Horizontal, z, new SizeKt$createWrapContentWidthModifier$1(horizontal), horizontal, new SizeKt$createWrapContentWidthModifier$2(horizontal, z));
    }

    @Stable
    /* renamed from: defaultMinSize-VpY3zN4  reason: not valid java name */
    public static final Modifier m33322defaultMinSizeVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$defaultMinSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$defaultMinSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new UnspecifiedConstraintsModifier(f, f2, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: defaultMinSize-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33323defaultMinSizeVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33322defaultMinSizeVpY3zN4(modifier, f, f2);
    }

    @Stable
    public static final Modifier fillMaxHeight(Modifier modifier, float f) {
        boolean z;
        FillModifier fillModifier;
        C12775o.m28639i(modifier, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fillModifier = FillWholeMaxHeight;
        } else {
            fillModifier = createFillHeightModifier(f);
        }
        return modifier.then(fillModifier);
    }

    public static /* synthetic */ Modifier fillMaxHeight$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxHeight(modifier, f);
    }

    @Stable
    public static final Modifier fillMaxSize(Modifier modifier, float f) {
        boolean z;
        FillModifier fillModifier;
        C12775o.m28639i(modifier, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fillModifier = FillWholeMaxSize;
        } else {
            fillModifier = createFillSizeModifier(f);
        }
        return modifier.then(fillModifier);
    }

    public static /* synthetic */ Modifier fillMaxSize$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxSize(modifier, f);
    }

    @Stable
    public static final Modifier fillMaxWidth(Modifier modifier, float f) {
        boolean z;
        FillModifier fillModifier;
        C12775o.m28639i(modifier, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fillModifier = FillWholeMaxWidth;
        } else {
            fillModifier = createFillWidthModifier(f);
        }
        return modifier.then(fillModifier);
    }

    public static /* synthetic */ Modifier fillMaxWidth$default(Modifier modifier, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return fillMaxWidth(modifier, f);
    }

    @Stable
    /* renamed from: height-3ABfNKs  reason: not valid java name */
    public static final Modifier m33324height3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$height");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$height3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f, true, function1, 5, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: heightIn-VpY3zN4  reason: not valid java name */
    public static final Modifier m33325heightInVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$heightIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$heightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f2, true, function1, 5, (DefaultConstructorMarker) null));
    }

    /* renamed from: heightIn-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33326heightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33325heightInVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* renamed from: requiredHeight-3ABfNKs  reason: not valid java name */
    public static final Modifier m33327requiredHeight3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredHeight");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredHeight3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f, false, function1, 5, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: requiredHeightIn-VpY3zN4  reason: not valid java name */
    public static final Modifier m33328requiredHeightInVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredHeightIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredHeightInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(0.0f, f, 0.0f, f2, false, function1, 5, (DefaultConstructorMarker) null));
    }

    /* renamed from: requiredHeightIn-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33329requiredHeightInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33328requiredHeightInVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* renamed from: requiredSize-3ABfNKs  reason: not valid java name */
    public static final Modifier m33330requiredSize3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredSize3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, f, f, f, false, function1, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: requiredSize-6HolHcs  reason: not valid java name */
    public static final Modifier m33331requiredSize6HolHcs(Modifier modifier, long j) {
        C12775o.m28639i(modifier, "$this$requiredSize");
        return m33332requiredSizeVpY3zN4(modifier, DpSize.m38566getWidthD9Ej5fM(j), DpSize.m38564getHeightD9Ej5fM(j));
    }

    @Stable
    /* renamed from: requiredSize-VpY3zN4  reason: not valid java name */
    public static final Modifier m33332requiredSizeVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredSize");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredSizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, f2, f, f2, false, function1, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: requiredSizeIn-qDBjuR0  reason: not valid java name */
    public static final Modifier m33333requiredSizeInqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredSizeIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredSizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, f2, f3, f4, false, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: requiredSizeIn-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33334requiredSizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33333requiredSizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    /* renamed from: requiredWidth-3ABfNKs  reason: not valid java name */
    public static final Modifier m33335requiredWidth3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredWidth");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredWidth3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, 0.0f, f, 0.0f, false, function1, 10, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: requiredWidthIn-VpY3zN4  reason: not valid java name */
    public static final Modifier m33336requiredWidthInVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$requiredWidthIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$requiredWidthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, 0.0f, f2, 0.0f, false, function1, 10, (DefaultConstructorMarker) null));
    }

    /* renamed from: requiredWidthIn-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33337requiredWidthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33336requiredWidthInVpY3zN4(modifier, f, f2);
    }

    @Stable
    /* renamed from: size-3ABfNKs  reason: not valid java name */
    public static final Modifier m33338size3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$size");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$size3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, f, f, f, true, function1, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: size-6HolHcs  reason: not valid java name */
    public static final Modifier m33339size6HolHcs(Modifier modifier, long j) {
        C12775o.m28639i(modifier, "$this$size");
        return m33340sizeVpY3zN4(modifier, DpSize.m38566getWidthD9Ej5fM(j), DpSize.m38564getHeightD9Ej5fM(j));
    }

    @Stable
    /* renamed from: size-VpY3zN4  reason: not valid java name */
    public static final Modifier m33340sizeVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$size");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$sizeVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, f2, f, f2, true, function1, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: sizeIn-qDBjuR0  reason: not valid java name */
    public static final Modifier m33341sizeInqDBjuR0(Modifier modifier, float f, float f2, float f3, float f4) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$sizeIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$sizeInqDBjuR0$$inlined$debugInspectorInfo$1(f, f2, f3, f4);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, f2, f3, f4, true, function1, (DefaultConstructorMarker) null));
    }

    /* renamed from: sizeIn-qDBjuR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33342sizeInqDBjuR0$default(Modifier modifier, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33341sizeInqDBjuR0(modifier, f, f2, f3, f4);
    }

    @Stable
    /* renamed from: width-3ABfNKs  reason: not valid java name */
    public static final Modifier m33343width3ABfNKs(Modifier modifier, float f) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$width");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$width3ABfNKs$$inlined$debugInspectorInfo$1(f);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, 0.0f, f, 0.0f, true, function1, 10, (DefaultConstructorMarker) null));
    }

    @Stable
    /* renamed from: widthIn-VpY3zN4  reason: not valid java name */
    public static final Modifier m33344widthInVpY3zN4(Modifier modifier, float f, float f2) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$widthIn");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SizeKt$widthInVpY3zN4$$inlined$debugInspectorInfo$1(f, f2);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SizeModifier(f, 0.0f, f2, 0.0f, true, function1, 10, (DefaultConstructorMarker) null));
    }

    /* renamed from: widthIn-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m33345widthInVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM();
        }
        return m33344widthInVpY3zN4(modifier, f, f2);
    }

    @Stable
    public static final Modifier wrapContentHeight(Modifier modifier, Alignment.Vertical vertical, boolean z) {
        WrapContentModifier wrapContentModifier;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(vertical, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (C12775o.m28634d(vertical, companion.getCenterVertically()) && !z) {
            wrapContentModifier = WrapContentHeightCenter;
        } else if (!C12775o.m28634d(vertical, companion.getTop()) || z) {
            wrapContentModifier = createWrapContentHeightModifier(vertical, z);
        } else {
            wrapContentModifier = WrapContentHeightTop;
        }
        return modifier.then(wrapContentModifier);
    }

    public static /* synthetic */ Modifier wrapContentHeight$default(Modifier modifier, Alignment.Vertical vertical, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            vertical = Alignment.Companion.getCenterVertically();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentHeight(modifier, vertical, z);
    }

    @Stable
    public static final Modifier wrapContentSize(Modifier modifier, Alignment alignment, boolean z) {
        WrapContentModifier wrapContentModifier;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(alignment, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (C12775o.m28634d(alignment, companion.getCenter()) && !z) {
            wrapContentModifier = WrapContentSizeCenter;
        } else if (!C12775o.m28634d(alignment, companion.getTopStart()) || z) {
            wrapContentModifier = createWrapContentSizeModifier(alignment, z);
        } else {
            wrapContentModifier = WrapContentSizeTopStart;
        }
        return modifier.then(wrapContentModifier);
    }

    public static /* synthetic */ Modifier wrapContentSize$default(Modifier modifier, Alignment alignment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentSize(modifier, alignment, z);
    }

    @Stable
    public static final Modifier wrapContentWidth(Modifier modifier, Alignment.Horizontal horizontal, boolean z) {
        WrapContentModifier wrapContentModifier;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(horizontal, "align");
        Alignment.Companion companion = Alignment.Companion;
        if (C12775o.m28634d(horizontal, companion.getCenterHorizontally()) && !z) {
            wrapContentModifier = WrapContentWidthCenter;
        } else if (!C12775o.m28634d(horizontal, companion.getStart()) || z) {
            wrapContentModifier = createWrapContentWidthModifier(horizontal, z);
        } else {
            wrapContentModifier = WrapContentWidthStart;
        }
        return modifier.then(wrapContentModifier);
    }

    public static /* synthetic */ Modifier wrapContentWidth$default(Modifier modifier, Alignment.Horizontal horizontal, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            horizontal = Alignment.Companion.getCenterHorizontally();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return wrapContentWidth(modifier, horizontal, z);
    }
}
