package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Stable;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.TestTagKt */
/* compiled from: TestTag.kt */
public final class TestTagKt {
    @Stable
    public static final Modifier testTag(Modifier modifier, String str) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        return SemanticsModifierKt.semantics$default(modifier, false, new TestTagKt$testTag$1(str), 1, (Object) null);
    }
}
