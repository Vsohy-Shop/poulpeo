package androidx.compose.p002ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.p002ui.text.TtsAnnotation;
import androidx.compose.p002ui.text.VerbatimTtsAnnotation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt */
/* compiled from: TtsAnnotationExtensions.android.kt */
public final class TtsAnnotationExtensions_androidKt {
    public static final TtsSpan toSpan(TtsAnnotation ttsAnnotation) {
        C12775o.m28639i(ttsAnnotation, "<this>");
        if (ttsAnnotation instanceof VerbatimTtsAnnotation) {
            return toSpan((VerbatimTtsAnnotation) ttsAnnotation);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan toSpan(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        C12775o.m28639i(verbatimTtsAnnotation, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
        C12775o.m28638h(build, "builder.build()");
        return build;
    }
}
