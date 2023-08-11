package com.rmn.utils;

import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* compiled from: IntentDelegate.kt */
public abstract class IntentDelegate<T> {
    private final String key;

    /* compiled from: IntentDelegate.kt */
    public static final class Boolean extends IntentDelegate<Boolean> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Boolean(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, ((Boolean) obj2).booleanValue());
        }

        public Boolean getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return Boolean.valueOf(intent.getBooleanExtra(getKey(), false));
        }

        public void setValue(Intent intent, KProperty<?> kProperty, boolean z) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), z);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class BundleNullable extends IntentDelegate<Bundle> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BundleNullable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public Bundle getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return intent.getBundleExtra(getKey());
        }

        public void setValue(Intent intent, KProperty<?> kProperty, Bundle bundle) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), bundle);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class Double extends IntentDelegate<Double> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Double(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, ((Number) obj2).doubleValue());
        }

        public Double getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return Double.valueOf(intent.getDoubleExtra(getKey(), 0.0d));
        }

        public void setValue(Intent intent, KProperty<?> kProperty, double d) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), d);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class Int extends IntentDelegate<Integer> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Int(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, ((Number) obj2).intValue());
        }

        public Integer getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return Integer.valueOf(intent.getIntExtra(getKey(), 0));
        }

        public void setValue(Intent intent, KProperty<?> kProperty, int i) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), i);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class Long extends IntentDelegate<Long> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Long(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
            setValue((Intent) obj, (KProperty<?>) kProperty, ((Number) obj2).longValue());
        }

        public Long getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return Long.valueOf(intent.getLongExtra(getKey(), 0));
        }

        public void setValue(Intent intent, KProperty<?> kProperty, long j) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), j);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class Parcelable<T extends android.os.Parcelable> extends IntentDelegate<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Parcelable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public T getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            return intent.getParcelableExtra(getKey());
        }

        public void setValue(Intent intent, KProperty<?> kProperty, T t) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), t);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class String extends IntentDelegate<String> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public String(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public String getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            String stringExtra = intent.getStringExtra(getKey());
            return stringExtra == null ? "" : stringExtra;
        }

        public void setValue(Intent intent, KProperty<?> kProperty, String str) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            C12775o.m28639i(str, "value");
            intent.putExtra(getKey(), str);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class StringArrayNullable extends IntentDelegate<String[]> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringArrayNullable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public String[] getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            String[] stringArrayExtra = intent.getStringArrayExtra(getKey());
            if (stringArrayExtra == null) {
                return null;
            }
            return stringArrayExtra;
        }

        public void setValue(Intent intent, KProperty<?> kProperty, String[] strArr) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            intent.putExtra(getKey(), strArr);
        }
    }

    /* compiled from: IntentDelegate.kt */
    public static final class StringNullable extends IntentDelegate<String> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public StringNullable(String str) {
            super(str, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "key");
        }

        public String getValue(Intent intent, KProperty<?> kProperty) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            String stringExtra = intent.getStringExtra(getKey());
            if (stringExtra == null) {
                return null;
            }
            return stringExtra;
        }

        public void setValue(Intent intent, KProperty<?> kProperty, String str) {
            C12775o.m28639i(intent, "thisRef");
            C12775o.m28639i(kProperty, "property");
            if (str != null) {
                intent.putExtra(getKey(), str);
            }
        }
    }

    public /* synthetic */ IntentDelegate(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* access modifiers changed from: protected */
    public final String getKey() {
        return this.key;
    }

    public abstract /* synthetic */ Object getValue(Object obj, KProperty kProperty);

    public abstract /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2);

    private IntentDelegate(String str) {
        this.key = str;
    }
}
