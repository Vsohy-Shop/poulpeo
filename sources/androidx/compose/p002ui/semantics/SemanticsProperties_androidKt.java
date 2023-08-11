package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12781t;
import kotlin.reflect.KProperty;

/* renamed from: androidx.compose.ui.semantics.SemanticsProperties_androidKt */
/* compiled from: SemanticsProperties.android.kt */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {C12764h0.m28589e(new C12781t(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    static {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    @ExperimentalComposeUiApi
    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "<this>");
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    private static Object getTestTagsAsResourceId$delegate(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId();
    }

    @ExperimentalComposeUiApi
    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        C12775o.m28639i(semanticsPropertyReceiver, "<this>");
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }
}
