package androidx.compose.p002ui.platform;

import p448vf.C13650g;

/* renamed from: androidx.compose.ui.platform.InspectableValue */
/* compiled from: InspectableValue.kt */
public interface InspectableValue {

    /* renamed from: androidx.compose.ui.platform.InspectableValue$DefaultImpls */
    /* compiled from: InspectableValue.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static C13650g<ValueElement> getInspectableElements(InspectableValue inspectableValue) {
            return InspectableValue.super.getInspectableElements();
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return InspectableValue.super.getNameFallback();
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return InspectableValue.super.getValueOverride();
        }
    }

    C13650g<ValueElement> getInspectableElements() {
        return C13657m.m31271e();
    }

    String getNameFallback() {
        return null;
    }

    Object getValueOverride() {
        return null;
    }
}
