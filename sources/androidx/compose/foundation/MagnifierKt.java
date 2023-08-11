package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyKey;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,394:1\n135#2:395\n146#2:396\n*S KotlinDebug\n*F\n+ 1 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n233#1:395\n231#1:396\n*E\n"})
/* compiled from: Magnifier.kt */
public final class MagnifierKt {
    private static final SemanticsPropertyKey<C13074a<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", (C13088o) null, 2, (DefaultConstructorMarker) null);

    public static final SemanticsPropertyKey<C13074a<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i) {
        if (i >= 28) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i);
    }

    @RequiresApi(28)
    public static final Modifier magnifier(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f, MagnifierStyle magnifierStyle, Function1<? super DpSize, C11921v> function13, PlatformMagnifierFactory platformMagnifierFactory) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "sourceCenter");
        C12775o.m28639i(function12, "magnifierCenter");
        C12775o.m28639i(magnifierStyle, "style");
        C12775o.m28639i(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new MagnifierKt$magnifier$4(function1, function12, f, function13, platformMagnifierFactory, magnifierStyle), 1, (Object) null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f, MagnifierStyle magnifierStyle, Function1 function13, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = MagnifierKt$magnifier$1.INSTANCE;
        }
        Function1 function14 = function12;
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            magnifierStyle = MagnifierStyle.Companion.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i & 16) != 0) {
            function13 = null;
        }
        return magnifier(modifier, function1, function14, f2, magnifierStyle2, function13);
    }

    @ExperimentalFoundationApi
    public static final Modifier magnifier(Modifier modifier, Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, float f, MagnifierStyle magnifierStyle, Function1<? super DpSize, C11921v> function13) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "sourceCenter");
        C12775o.m28639i(function12, "magnifierCenter");
        C12775o.m28639i(magnifierStyle, "style");
        Function1 magnifierKt$magnifier$$inlined$debugInspectorInfo$1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(function1, function12, f, magnifierStyle) : InspectableValueKt.getNoInspectorInfo();
        Modifier modifier2 = Modifier.Companion;
        if (isPlatformMagnifierSupported$default(0, 1, (Object) null)) {
            modifier2 = magnifier(modifier2, function1, function12, f, magnifierStyle, function13, PlatformMagnifierFactory.Companion.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, magnifierKt$magnifier$$inlined$debugInspectorInfo$1, modifier2);
    }
}
