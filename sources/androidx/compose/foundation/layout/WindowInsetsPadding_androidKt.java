package androidx.compose.foundation.layout;

import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,255:1\n249#1,7:257\n249#1,7:265\n249#1,7:273\n249#1,7:281\n249#1,7:289\n249#1,7:297\n249#1,7:305\n249#1,7:313\n249#1,7:321\n249#1,7:329\n249#1,7:337\n249#1,7:345\n135#2:256\n135#2:264\n135#2:272\n135#2:280\n135#2:288\n135#2:296\n135#2:304\n135#2:312\n135#2:320\n135#2:328\n135#2:336\n135#2:344\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:257,7\n59#1:265,7\n77#1:273,7\n95#1:281,7\n113#1:289,7\n131#1:297,7\n149#1:305,7\n167#1:313,7\n185#1:321,7\n203#1:329,7\n221#1:337,7\n240#1:345,7\n41#1:256\n59#1:264\n77#1:272\n95#1:280\n113#1:288\n131#1:296\n149#1:304\n167#1:312\n185#1:320\n203#1:328\n221#1:336\n240#1:344\n*E\n"})
/* compiled from: WindowInsetsPadding.android.kt */
public final class WindowInsetsPadding_androidKt {
    public static final Modifier captionBarPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0481xd74e05bc();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0482x41af029b());
    }

    public static final Modifier displayCutoutPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0483xebf9c4bb();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0484xc27b237c());
    }

    public static final Modifier imePadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0485xd2713e08();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0486xaaf2d3cf());
    }

    public static final Modifier mandatorySystemGesturesPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0487xfbc42297();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0488xabfc8120());
    }

    public static final Modifier navigationBarsPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0489x404e3f75();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0490xf8b60002());
    }

    public static final Modifier safeContentPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0491xb5af487d();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0492x2f7617fa());
    }

    public static final Modifier safeDrawingPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0493xd9629bf8();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0494x822d33df());
    }

    public static final Modifier safeGesturesPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0495xd9e5f552();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0496x921505c5());
    }

    public static final Modifier statusBarsPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0497xdb865b57();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0498xc4816060());
    }

    public static final Modifier systemBarsPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0499xd9b3a1ba();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0500x8bfce65d());
    }

    public static final Modifier systemGesturesPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0501x9cf609f0();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0502x310784e7());
    }

    public static final Modifier waterfallPadding(Modifier modifier) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new C0503x61501357();
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new C0504xf7eea860());
    }

    @Stable
    private static final Modifier windowInsetsPadding(Modifier modifier, Function1<? super InspectorInfo, C11921v> function1, Function1<? super WindowInsetsHolder, ? extends WindowInsets> function12) {
        return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_androidKt$windowInsetsPadding$1(function12));
    }
}
