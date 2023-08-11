package androidx.compose.p002ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 */
/* compiled from: AndroidCompositionLocals.android.kt */
final class C1087x68d8e1f6 extends C12777p implements Function1<Configuration, C11921v> {
    final /* synthetic */ MutableState<Configuration> $configuration$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1087x68d8e1f6(MutableState<Configuration> mutableState) {
        super(1);
        this.$configuration$delegate = mutableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Configuration configuration) {
        C12775o.m28639i(configuration, "it");
        AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals$lambda$2(this.$configuration$delegate, configuration);
    }
}
