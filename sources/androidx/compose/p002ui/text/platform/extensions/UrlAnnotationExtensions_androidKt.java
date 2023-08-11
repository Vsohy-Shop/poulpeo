package androidx.compose.p002ui.text.platform.extensions;

import android.text.style.URLSpan;
import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.UrlAnnotation;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.extensions.UrlAnnotationExtensions_androidKt */
/* compiled from: UrlAnnotationExtensions.android.kt */
public final class UrlAnnotationExtensions_androidKt {
    @ExperimentalTextApi
    public static final URLSpan toSpan(UrlAnnotation urlAnnotation) {
        C12775o.m28639i(urlAnnotation, "<this>");
        return new URLSpan(urlAnnotation.getUrl());
    }
}
