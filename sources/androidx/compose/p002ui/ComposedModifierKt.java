package androidx.compose.p002ui;

import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.ComposedModifierKt */
/* compiled from: ComposedModifier.kt */
public final class ComposedModifierKt {
    public static final Modifier composed(Modifier modifier, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        return modifier.then(new ComposedModifier(function1, pVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, Function1<InspectorInfo, C11921v> function1, C13089p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, function1, pVar);
    }

    public static final Modifier materialize(Composer composer, Modifier modifier) {
        C12775o.m28639i(composer, "<this>");
        C12775o.m28639i(modifier, "modifier");
        if (modifier.all(ComposedModifierKt$materialize$1.INSTANCE)) {
            return modifier;
        }
        composer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion, new ComposedModifierKt$materialize$result$1(composer));
        composer.endReplaceableGroup();
        return modifier2;
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(str, "fullyQualifiedName");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        return modifier.then(new KeyedComposedModifier1(str, obj, function1, pVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Function1<InspectorInfo, C11921v> function1, C13089p pVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, (Function1<? super InspectorInfo, C11921v>) function1, (C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) pVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(str, "fullyQualifiedName");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        return modifier.then(new KeyedComposedModifier2(str, obj, obj2, function1, pVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Function1<InspectorInfo, C11921v> function1, C13089p pVar, int i, Object obj3) {
        if ((i & 8) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, function1, pVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object obj, Object obj2, Object obj3, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(str, "fullyQualifiedName");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        return modifier.then(new KeyedComposedModifier3(str, obj, obj2, obj3, function1, pVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object obj, Object obj2, Object obj3, Function1<InspectorInfo, C11921v> function1, C13089p pVar, int i, Object obj4) {
        if ((i & 16) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, obj, obj2, obj3, function1, pVar);
    }

    @ExperimentalComposeUiApi
    public static final Modifier composed(Modifier modifier, String str, Object[] objArr, Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(str, "fullyQualifiedName");
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        return modifier.then(new KeyedComposedModifierN(str, objArr, function1, pVar));
    }

    public static /* synthetic */ Modifier composed$default(Modifier modifier, String str, Object[] objArr, Function1<InspectorInfo, C11921v> function1, C13089p pVar, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return composed(modifier, str, objArr, (Function1<? super InspectorInfo, C11921v>) function1, (C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier>) pVar);
    }
}
