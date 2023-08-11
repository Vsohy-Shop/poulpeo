package androidx.compose.p002ui;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.ComposedModifier */
/* compiled from: ComposedModifier.kt */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final C13089p<Modifier, Composer, Integer, Modifier> factory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposedModifier(Function1<? super InspectorInfo, C11921v> function1, C13089p<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> pVar) {
        super(function1);
        C12775o.m28639i(function1, "inspectorInfo");
        C12775o.m28639i(pVar, "factory");
        this.factory = pVar;
    }

    public final C13089p<Modifier, Composer, Integer, Modifier> getFactory() {
        return this.factory;
    }
}
