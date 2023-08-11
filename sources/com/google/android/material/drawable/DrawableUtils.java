package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DrawableUtils {
    private DrawableUtils() {
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        int i;
        int i2;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
            i2 = intrinsicWidth;
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth2 = ((float) drawable2.getIntrinsicWidth()) / ((float) drawable2.getIntrinsicHeight());
            if (intrinsicWidth2 >= ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) {
                i2 = drawable.getIntrinsicWidth();
                i = (int) (((float) i2) / intrinsicWidth2);
            } else {
                i = drawable.getIntrinsicHeight();
                i2 = (int) (intrinsicWidth2 * ((float) i));
            }
        } else {
            i2 = drawable2.getIntrinsicWidth();
            i = drawable2.getIntrinsicHeight();
        }
        layerDrawable.setLayerSize(1, i2, i);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != 16842912) {
                iArr2[i] = i2;
                i++;
            }
        }
        return iArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f A[Catch:{ IOException | XmlPullParserException -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[Catch:{ IOException | XmlPullParserException -> 0x0047 }] */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.AttributeSet parseDrawableXml(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.XmlRes int r4, @androidx.annotation.NonNull java.lang.CharSequence r5) {
        /*
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
        L_0x0008:
            int r0 = r3.next()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r1 = 2
            if (r0 == r1) goto L_0x0012
            r2 = 1
            if (r0 != r2) goto L_0x0008
        L_0x0012:
            if (r0 != r1) goto L_0x003f
            java.lang.String r0 = r3.getName()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            if (r0 == 0) goto L_0x0023
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            return r3
        L_0x0023:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r1 = "Must have a <"
            r0.append(r1)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r5 = "> start tag"
            r0.append(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r5 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            r3.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            throw r3     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
            throw r3     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0047 }
        L_0x0047:
            r3 = move-exception
            goto L_0x004a
        L_0x0049:
            r3 = move-exception
        L_0x004a:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't load badge resource ID #0x"
            r0.append(r1)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.drawable.DrawableUtils.parseDrawableXml(android.content.Context, int, java.lang.CharSequence):android.util.AttributeSet");
    }

    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DrawableCompat.setTint(drawable, i);
        } else {
            DrawableCompat.setTintList(drawable, (ColorStateList) null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    @Nullable
    private static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        } else if (z) {
            drawable.mutate();
        }
        return drawable;
    }
}
