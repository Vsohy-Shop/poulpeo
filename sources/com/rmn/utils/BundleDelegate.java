package com.rmn.utils;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

@StabilityInferred(parameters = 0)
/* compiled from: BundleDelegate.kt */
public abstract class BundleDelegate<T> {
    public static final int $stable = 0;
    private final String key;

    @StabilityInferred(parameters = 0)
    /* compiled from: BundleDelegate.kt */
    public static final class Boolean extends BundleDelegate<Boolean> {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Boolean(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Bundle) obj, (KProperty<?>) kProperty, ((Boolean) obj2).booleanValue());
        }

        public Boolean getValue(Bundle bundle, KProperty<?> kProperty) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return Boolean.valueOf(bundle.getBoolean(getKey(), false));
        }

        public void setValue(Bundle bundle, KProperty<?> kProperty, boolean z) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            bundle.putBoolean(getKey(), z);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: BundleDelegate.kt */
    public static final class Int extends BundleDelegate<Integer> {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Int(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Bundle) obj, (KProperty<?>) kProperty, ((Number) obj2).intValue());
        }

        public Integer getValue(Bundle bundle, KProperty<?> kProperty) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return Integer.valueOf(bundle.getInt(getKey(), 0));
        }

        public void setValue(Bundle bundle, KProperty<?> kProperty, int i) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            bundle.putInt(getKey(), i);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: BundleDelegate.kt */
    public static final class Parcelable<T extends android.os.Parcelable> extends BundleDelegate<T> {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Parcelable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public T getValue(Bundle bundle, KProperty<?> kProperty) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            T parcelable = bundle.getParcelable(getKey());
            C12775o.m28637g(parcelable, "null cannot be cast to non-null type T of com.rmn.utils.BundleDelegate.Parcelable");
            return parcelable;
        }

        public void setValue(Bundle bundle, KProperty<?> kProperty, T t) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            C12775o.m28639i(t, "value");
            bundle.putParcelable(getKey(), t);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: BundleDelegate.kt */
    public static final class String extends BundleDelegate<String> {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public String(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public String getValue(Bundle bundle, KProperty<?> kProperty) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            String string = bundle.getString(getKey(), "");
            return string == null ? "" : string;
        }

        public void setValue(Bundle bundle, KProperty<?> kProperty, String str) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            C12775o.m28639i(str, "value");
            bundle.putString(getKey(), str);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: BundleDelegate.kt */
    public static final class StringArrayNullable extends BundleDelegate<String[]> {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringArrayNullable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public String[] getValue(Bundle bundle, KProperty<?> kProperty) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return bundle.getStringArray(getKey());
        }

        public void setValue(Bundle bundle, KProperty<?> kProperty, String[] strArr) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            bundle.putStringArray(getKey(), strArr);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: BundleDelegate.kt */
    public static final class StringNullable extends BundleDelegate<String> {
        public static final int $stable = 0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringNullable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public String getValue(Bundle bundle, KProperty<?> kProperty) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            String string = bundle.getString(getKey());
            if (string == null) {
                return null;
            }
            return string;
        }

        public void setValue(Bundle bundle, KProperty<?> kProperty, String str) {
            C12775o.m28639i(bundle, "thisRef");
            C12775o.m28639i(kProperty, "property");
            if (str != null) {
                bundle.putString(getKey(), str);
            }
        }
    }

    public /* synthetic */ BundleDelegate(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return this.key;
    }

    public abstract /* synthetic */ Object getValue(Object obj, KProperty kProperty);

    public abstract /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2);

    private BundleDelegate(String str) {
        this.key = str;
    }
}
