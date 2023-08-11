package androidx.compose.p002ui.geometry;

import androidx.compose.p002ui.util.MathHelpersKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.geometry.RoundRectKt */
/* compiled from: RoundRect.kt */
public final class RoundRectKt {
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, CornerRadius, CornerRadius, CornerRadius, CornerRadius, (DefaultConstructorMarker) null);
    }

    /* renamed from: RoundRect-ZAM2FJo  reason: not valid java name */
    public static final RoundRect m35474RoundRectZAM2FJo(Rect rect, long j, long j2, long j3, long j4) {
        Rect rect2 = rect;
        C12775o.m28639i(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j, j2, j3, j4, (DefaultConstructorMarker) null);
    }

    /* renamed from: RoundRect-ZAM2FJo$default  reason: not valid java name */
    public static /* synthetic */ RoundRect m35475RoundRectZAM2FJo$default(Rect rect, long j, long j2, long j3, long j4, int i, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i & 2) != 0) {
            j5 = CornerRadius.Companion.m35407getZerokKHJgLs();
        } else {
            j5 = j;
        }
        if ((i & 4) != 0) {
            j6 = CornerRadius.Companion.m35407getZerokKHJgLs();
        } else {
            j6 = j2;
        }
        if ((i & 8) != 0) {
            j7 = CornerRadius.Companion.m35407getZerokKHJgLs();
        } else {
            j7 = j3;
        }
        if ((i & 16) != 0) {
            j8 = CornerRadius.Companion.m35407getZerokKHJgLs();
        } else {
            j8 = j4;
        }
        return m35474RoundRectZAM2FJo(rect, j5, j6, j7, j8);
    }

    /* renamed from: RoundRect-gG7oq9Y  reason: not valid java name */
    public static final RoundRect m35476RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m35397getXimpl(j), CornerRadius.m35398getYimpl(j));
    }

    /* renamed from: RoundRect-sniSvfs  reason: not valid java name */
    public static final RoundRect m35477RoundRectsniSvfs(Rect rect, long j) {
        C12775o.m28639i(rect, "rect");
        return RoundRect(rect, CornerRadius.m35397getXimpl(j), CornerRadius.m35398getYimpl(j));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs()), CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m35398getYimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        boolean z;
        C12775o.m28639i(roundRect, "<this>");
        if (roundRect.getWidth() == roundRect.getHeight()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !isEllipse(roundRect)) {
            return false;
        }
        return true;
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C12775o.m28639i(roundRect, "<this>");
        if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6 && ((double) roundRect.getWidth()) <= ((double) CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs())) * 2.0d && ((double) roundRect.getHeight()) <= ((double) CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs())) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        C12775o.m28639i(roundRect, "<this>");
        if (roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom()) {
            return true;
        }
        return false;
    }

    public static final boolean isFinite(RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C12775o.m28639i(roundRect, "<this>");
        float left = roundRect.getLeft();
        if (Float.isInfinite(left) || Float.isNaN(left)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float top = roundRect.getTop();
            if (Float.isInfinite(top) || Float.isNaN(top)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                float right = roundRect.getRight();
                if (Float.isInfinite(right) || Float.isNaN(right)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    float bottom = roundRect.getBottom();
                    if (Float.isInfinite(bottom) || Float.isNaN(bottom)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r0 != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r0 != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isRect(androidx.compose.p002ui.geometry.RoundRect r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            long r0 = r6.m35472getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0016
            r0 = r2
            goto L_0x0017
        L_0x0016:
            r0 = r3
        L_0x0017:
            if (r0 != 0) goto L_0x002a
            long r4 = r6.m35472getTopLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            r0 = r2
            goto L_0x0028
        L_0x0027:
            r0 = r3
        L_0x0028:
            if (r0 == 0) goto L_0x0091
        L_0x002a:
            long r4 = r6.m35473getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r3
        L_0x0039:
            if (r0 != 0) goto L_0x004c
            long r4 = r6.m35473getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0049
            r0 = r2
            goto L_0x004a
        L_0x0049:
            r0 = r3
        L_0x004a:
            if (r0 == 0) goto L_0x0091
        L_0x004c:
            long r4 = r6.m35470getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r0 = r2
            goto L_0x005b
        L_0x005a:
            r0 = r3
        L_0x005b:
            if (r0 != 0) goto L_0x006e
            long r4 = r6.m35470getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            r0 = r2
            goto L_0x006c
        L_0x006b:
            r0 = r3
        L_0x006c:
            if (r0 == 0) goto L_0x0091
        L_0x006e:
            long r4 = r6.m35471getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            r0 = r2
            goto L_0x007d
        L_0x007c:
            r0 = r3
        L_0x007d:
            if (r0 != 0) goto L_0x0092
            long r4 = r6.m35471getBottomRightCornerRadiuskKHJgLs()
            float r6 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x008d
            r6 = r2
            goto L_0x008e
        L_0x008d:
            r6 = r3
        L_0x008e:
            if (r6 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r2 = r3
        L_0x0092:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.geometry.RoundRectKt.isRect(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    public static final boolean isSimple(RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C12775o.m28639i(roundRect, "<this>");
        if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35397getXimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35473getTopRightCornerRadiuskKHJgLs())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35397getXimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35471getBottomRightCornerRadiuskKHJgLs())) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs())) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (CornerRadius.m35397getXimpl(roundRect.m35472getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m35398getYimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs())) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f) {
        float f2 = f;
        C12775o.m28639i(roundRect, "start");
        C12775o.m28639i(roundRect2, "stop");
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f2), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f2), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f2), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f2), CornerRadiusKt.m35408lerp3Ry4LBc(roundRect.m35472getTopLeftCornerRadiuskKHJgLs(), roundRect2.m35472getTopLeftCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m35408lerp3Ry4LBc(roundRect.m35473getTopRightCornerRadiuskKHJgLs(), roundRect2.m35473getTopRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m35408lerp3Ry4LBc(roundRect.m35471getBottomRightCornerRadiuskKHJgLs(), roundRect2.m35471getBottomRightCornerRadiuskKHJgLs(), f2), CornerRadiusKt.m35408lerp3Ry4LBc(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m35470getBottomLeftCornerRadiuskKHJgLs(), f2), (DefaultConstructorMarker) null);
    }

    /* renamed from: translate-Uv8p0NA  reason: not valid java name */
    public static final RoundRect m35478translateUv8p0NA(RoundRect roundRect, long j) {
        RoundRect roundRect2 = roundRect;
        C12775o.m28639i(roundRect, "$this$translate");
        return new RoundRect(roundRect.getLeft() + Offset.m35422getXimpl(j), roundRect.getTop() + Offset.m35423getYimpl(j), roundRect.getRight() + Offset.m35422getXimpl(j), roundRect.getBottom() + Offset.m35423getYimpl(j), roundRect.m35472getTopLeftCornerRadiuskKHJgLs(), roundRect.m35473getTopRightCornerRadiuskKHJgLs(), roundRect.m35471getBottomRightCornerRadiuskKHJgLs(), roundRect.m35470getBottomLeftCornerRadiuskKHJgLs(), (DefaultConstructorMarker) null);
    }

    public static final RoundRect RoundRect(Rect rect, float f, float f2) {
        C12775o.m28639i(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
