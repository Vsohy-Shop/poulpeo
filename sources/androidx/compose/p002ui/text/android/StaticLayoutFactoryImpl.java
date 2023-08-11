package androidx.compose.p002ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;

/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryImpl */
/* compiled from: StaticLayoutFactory.kt */
interface StaticLayoutFactoryImpl {
    @DoNotInline
    StaticLayout create(StaticLayoutParams staticLayoutParams);

    boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z);
}
