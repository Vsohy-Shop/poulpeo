package androidx.compose.p002ui.input.pointer;

/* renamed from: androidx.compose.ui.input.pointer.PointerEvent_androidKt */
/* compiled from: PointerEvent.android.kt */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m37232constructorimpl(0);
    }

    /* renamed from: getAreAnyPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m37132getAreAnyPressedaHzCxE(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E  reason: not valid java name */
    public static final int m37133indexOfFirstPressedaHzCxE(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = (i & -97) | ((i & 96) >>> 5); (i3 & 1) == 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E  reason: not valid java name */
    public static final int m37134indexOfLastPressedaHzCxE(int i) {
        int i2 = -1;
        for (int i3 = (i & -97) | ((i & 96) >>> 5); i3 != 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37135isAltGraphPressed5xRPYO0(int i) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37136isAltPressed5xRPYO0(int i) {
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isBackPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m37137isBackPressedaHzCxE(int i) {
        if ((i & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isCapsLockOn-5xRPYO0  reason: not valid java name */
    public static final boolean m37138isCapsLockOn5xRPYO0(int i) {
        if ((i & 1048576) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isCtrlPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37139isCtrlPressed5xRPYO0(int i) {
        if ((i & 4096) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isForwardPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m37140isForwardPressedaHzCxE(int i) {
        if ((i & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isFunctionPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37141isFunctionPressed5xRPYO0(int i) {
        if ((i & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isMetaPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37142isMetaPressed5xRPYO0(int i) {
        if ((i & 65536) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isNumLockOn-5xRPYO0  reason: not valid java name */
    public static final boolean m37143isNumLockOn5xRPYO0(int i) {
        if ((i & 2097152) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isPressed-bNIWhpI  reason: not valid java name */
    public static final boolean m37144isPressedbNIWhpI(int i, int i2) {
        if (i2 == 0) {
            return m37145isPrimaryPressedaHzCxE(i);
        }
        if (i2 == 1) {
            return m37147isSecondaryPressedaHzCxE(i);
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            if ((i & (1 << i2)) != 0) {
                return true;
            }
        } else if ((i & (1 << (i2 + 2))) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isPrimaryPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m37145isPrimaryPressedaHzCxE(int i) {
        if ((i & 33) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isScrollLockOn-5xRPYO0  reason: not valid java name */
    public static final boolean m37146isScrollLockOn5xRPYO0(int i) {
        if ((i & 4194304) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m37147isSecondaryPressedaHzCxE(int i) {
        if ((i & 66) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isShiftPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37148isShiftPressed5xRPYO0(int i) {
        if ((i & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isSymPressed-5xRPYO0  reason: not valid java name */
    public static final boolean m37149isSymPressed5xRPYO0(int i) {
        if ((i & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E  reason: not valid java name */
    public static final boolean m37150isTertiaryPressedaHzCxE(int i) {
        if ((i & 4) != 0) {
            return true;
        }
        return false;
    }
}
