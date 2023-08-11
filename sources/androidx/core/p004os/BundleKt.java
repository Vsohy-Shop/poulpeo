package androidx.core.p004os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;

/* renamed from: androidx.core.os.BundleKt */
/* compiled from: Bundle.kt */
public final class BundleKt {
    public static final Bundle bundleOf(C11906l<String, ? extends Object>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        Bundle bundle = new Bundle(lVarArr.length);
        for (C11906l<String, ? extends Object> lVar : lVarArr) {
            String a = lVar.mo49109a();
            Object b = lVar.mo49110b();
            if (b == null) {
                bundle.putString(a, (String) null);
            } else if (b instanceof Boolean) {
                bundle.putBoolean(a, ((Boolean) b).booleanValue());
            } else if (b instanceof Byte) {
                bundle.putByte(a, ((Number) b).byteValue());
            } else if (b instanceof Character) {
                bundle.putChar(a, ((Character) b).charValue());
            } else if (b instanceof Double) {
                bundle.putDouble(a, ((Number) b).doubleValue());
            } else if (b instanceof Float) {
                bundle.putFloat(a, ((Number) b).floatValue());
            } else if (b instanceof Integer) {
                bundle.putInt(a, ((Number) b).intValue());
            } else if (b instanceof Long) {
                bundle.putLong(a, ((Number) b).longValue());
            } else if (b instanceof Short) {
                bundle.putShort(a, ((Number) b).shortValue());
            } else if (b instanceof Bundle) {
                bundle.putBundle(a, (Bundle) b);
            } else if (b instanceof CharSequence) {
                bundle.putCharSequence(a, (CharSequence) b);
            } else if (b instanceof Parcelable) {
                bundle.putParcelable(a, (Parcelable) b);
            } else if (b instanceof boolean[]) {
                bundle.putBooleanArray(a, (boolean[]) b);
            } else if (b instanceof byte[]) {
                bundle.putByteArray(a, (byte[]) b);
            } else if (b instanceof char[]) {
                bundle.putCharArray(a, (char[]) b);
            } else if (b instanceof double[]) {
                bundle.putDoubleArray(a, (double[]) b);
            } else if (b instanceof float[]) {
                bundle.putFloatArray(a, (float[]) b);
            } else if (b instanceof int[]) {
                bundle.putIntArray(a, (int[]) b);
            } else if (b instanceof long[]) {
                bundle.putLongArray(a, (long[]) b);
            } else if (b instanceof short[]) {
                bundle.putShortArray(a, (short[]) b);
            } else if (b instanceof Object[]) {
                Class<?> componentType = b.getClass().getComponentType();
                C12775o.m28636f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C12775o.m28637g(b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(a, (Parcelable[]) b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    C12775o.m28637g(b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(a, (String[]) b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    C12775o.m28637g(b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(a, (CharSequence[]) b);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(a, (Serializable) b);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + a + '\"');
                }
            } else if (b instanceof Serializable) {
                bundle.putSerializable(a, (Serializable) b);
            } else if (b instanceof IBinder) {
                BundleApi18ImplKt.putBinder(bundle, a, (IBinder) b);
            } else if (b instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, a, (Size) b);
            } else if (b instanceof SizeF) {
                BundleApi21ImplKt.putSizeF(bundle, a, (SizeF) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
