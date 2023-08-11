package androidx.compose.p002ui.tooling.preview;

import p448vf.C13650g;

/* renamed from: androidx.compose.ui.tooling.preview.PreviewParameterProvider */
/* compiled from: PreviewParameter.kt */
public interface PreviewParameterProvider<T> {

    /* renamed from: androidx.compose.ui.tooling.preview.PreviewParameterProvider$DefaultImpls */
    /* compiled from: PreviewParameter.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            return PreviewParameterProvider.super.getCount();
        }
    }

    int getCount() {
        return C13662o.m31278k(getValues());
    }

    C13650g<T> getValues();
}
