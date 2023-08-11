package com.rmn.apiclient.core.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

public abstract class BaseModel implements IModel {
    @NonNull

    /* renamed from: id */
    public final String f18063id;

    public BaseModel(@NonNull String str) {
        this.f18063id = str;
    }

    public static boolean defaultBoolean() {
        return false;
    }

    public static double defaultNumber(double d) {
        return d;
    }

    @NonNull
    public static String defaultString() {
        return "";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseModel)) {
            return false;
        }
        return this.f18063id.equals(((BaseModel) obj).f18063id);
    }

    @NonNull
    public String getId() {
        return this.f18063id;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f18063id});
    }

    public String toString() {
        return getClass().getSimpleName() + "{id='" + this.f18063id + '\'' + '}';
    }

    public static boolean defaultBoolean(boolean z) {
        return z;
    }

    public static float defaultNumber(float f) {
        return f;
    }

    @NonNull
    public static String defaultString(@NonNull String str) {
        return str;
    }

    public static int defaultNumber() {
        return 0;
    }

    public static int defaultNumber(int i) {
        return i;
    }
}
