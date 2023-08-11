package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.C0127Px;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C6372R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialAttributes {
    @Nullable
    public static TypedValue resolve(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@NonNull Context context, @AttrRes int i, boolean z) {
        TypedValue resolve = resolve(context, i);
        if (resolve == null || resolve.type != 18) {
            return z;
        }
        if (resolve.data != 0) {
            return true;
        }
        return false;
    }

    public static boolean resolveBooleanOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        if (resolveOrThrow(context, i, str) != 0) {
            return true;
        }
        return false;
    }

    @C0127Px
    public static int resolveDimension(@NonNull Context context, @AttrRes int i, @DimenRes int i2) {
        float dimension;
        TypedValue resolve = resolve(context, i);
        if (resolve == null || resolve.type != 5) {
            dimension = context.getResources().getDimension(i2);
        } else {
            dimension = resolve.getDimension(context.getResources().getDisplayMetrics());
        }
        return (int) dimension;
    }

    public static int resolveInteger(@NonNull Context context, @AttrRes int i, int i2) {
        TypedValue resolve = resolve(context, i);
        if (resolve == null || resolve.type != 16) {
            return i2;
        }
        return resolve.data;
    }

    @C0127Px
    public static int resolveMinimumAccessibleTouchTarget(@NonNull Context context) {
        return resolveDimension(context, C6372R.attr.minTouchTargetSize, C6372R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        return resolveTypedValueOrThrow(context, i, str).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull View view, @AttrRes int i) {
        return resolveTypedValueOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static int resolveOrThrow(@NonNull View view, @AttrRes int i) {
        return resolveTypedValueOrThrow(view, i).data;
    }

    @NonNull
    public static TypedValue resolveTypedValueOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        TypedValue resolve = resolve(context, i);
        if (resolve != null) {
            return resolve;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }
}
