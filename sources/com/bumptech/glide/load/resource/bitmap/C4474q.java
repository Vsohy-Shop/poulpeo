package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.q */
/* compiled from: HardwareConfigState */
public final class C4474q {

    /* renamed from: f */
    private static final File f4043f = new File("/proc/self/fd");

    /* renamed from: g */
    private static volatile C4474q f4044g;

    /* renamed from: a */
    private final boolean f4045a = m5440d();

    /* renamed from: b */
    private final int f4046b;

    /* renamed from: c */
    private final int f4047c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f4048d;
    @GuardedBy("this")

    /* renamed from: e */
    private boolean f4049e = true;

    @VisibleForTesting
    C4474q() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4046b = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.f4047c = 0;
            return;
        }
        this.f4046b = TypedValues.TransitionType.TYPE_DURATION;
        this.f4047c = 128;
    }

    /* renamed from: a */
    public static C4474q m5438a() {
        if (f4044g == null) {
            synchronized (C4474q.class) {
                if (f4044g == null) {
                    f4044g = new C4474q();
                }
            }
        }
        return f4044g;
    }

    /* renamed from: b */
    private synchronized boolean m5439b() {
        boolean z = true;
        int i = this.f4048d + 1;
        this.f4048d = i;
        if (i >= 50) {
            this.f4048d = 0;
            int length = f4043f.list().length;
            if (length >= this.f4046b) {
                z = false;
            }
            this.f4049e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f4046b);
            }
        }
        return this.f4049e;
    }

    /* renamed from: d */
    private static boolean m5440d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = str.substring(0, 7);
        substring.hashCode();
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 0;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 1;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (Build.VERSION.SDK_INT != 26) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public boolean mo31432c(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (!z || !this.f4045a || Build.VERSION.SDK_INT < 26 || z2 || i < (i3 = this.f4047c) || i2 < i3 || !m5439b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo31433e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c = mo31432c(i, i2, z, z2);
        if (c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c;
    }
}
