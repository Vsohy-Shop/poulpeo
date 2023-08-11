package androidx.core.content;

import android.content.ContentValues;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;

/* compiled from: ContentValues.kt */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(C11906l<String, ? extends Object>... lVarArr) {
        C12775o.m28639i(lVarArr, "pairs");
        ContentValues contentValues = new ContentValues(lVarArr.length);
        for (C11906l<String, ? extends Object> lVar : lVarArr) {
            String a = lVar.mo49109a();
            Object b = lVar.mo49110b();
            if (b == null) {
                contentValues.putNull(a);
            } else if (b instanceof String) {
                contentValues.put(a, (String) b);
            } else if (b instanceof Integer) {
                contentValues.put(a, (Integer) b);
            } else if (b instanceof Long) {
                contentValues.put(a, (Long) b);
            } else if (b instanceof Boolean) {
                contentValues.put(a, (Boolean) b);
            } else if (b instanceof Float) {
                contentValues.put(a, (Float) b);
            } else if (b instanceof Double) {
                contentValues.put(a, (Double) b);
            } else if (b instanceof byte[]) {
                contentValues.put(a, (byte[]) b);
            } else if (b instanceof Byte) {
                contentValues.put(a, (Byte) b);
            } else if (b instanceof Short) {
                contentValues.put(a, (Short) b);
            } else {
                throw new IllegalArgumentException("Illegal value type " + b.getClass().getCanonicalName() + " for key \"" + a + '\"');
            }
        }
        return contentValues;
    }
}
