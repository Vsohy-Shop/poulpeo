package androidx.compose.p002ui.input.pointer;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.AndroidPointerIconType */
/* compiled from: PointerIcon.android.kt */
public final class AndroidPointerIconType implements PointerIcon {
    private final int type;

    public AndroidPointerIconType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<AndroidPointerIconType> cls2 = AndroidPointerIconType.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C12775o.m28634d(cls2, cls)) {
            return false;
        }
        C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.type != ((AndroidPointerIconType) obj).type) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.type + ')';
    }
}
