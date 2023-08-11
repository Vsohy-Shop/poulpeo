package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p106h1.C7885d;

/* renamed from: com.bumptech.glide.load.resource.bitmap.y */
/* compiled from: TransformationUtils */
public final class C4486y {

    /* renamed from: a */
    private static final Paint f4072a = new Paint(6);

    /* renamed from: b */
    private static final Paint f4073b = new Paint(7);

    /* renamed from: c */
    private static final Paint f4074c;

    /* renamed from: d */
    private static final Set<String> f4075d;

    /* renamed from: e */
    private static final Lock f4076e;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$a */
    /* compiled from: TransformationUtils */
    private static final class C4487a implements Lock {
        C4487a() {
        }

        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) {
            return true;
        }

        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public void unlock() {
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f4075d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new C4487a();
        }
        f4076e = lock;
        Paint paint = new Paint(7);
        f4074c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m5480a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f4076e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f4072a);
            m5481b(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f4076e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    private static void m5481b(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: c */
    public static Lock m5482c() {
        return f4076e;
    }

    /* renamed from: d */
    public static int m5483d(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    /* renamed from: e */
    private static Bitmap.Config m5484e(@NonNull Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    @VisibleForTesting
    /* renamed from: f */
    static void m5485f(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public static boolean m5486g(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: h */
    public static Bitmap m5487h(@NonNull C7885d dVar, @NonNull Bitmap bitmap, int i) {
        if (!m5486g(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m5485f(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d = dVar.mo41602d(Math.round(rectF.width()), Math.round(rectF.height()), m5484e(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d.setHasAlpha(bitmap.hasAlpha());
        m5480a(bitmap, d, matrix);
        return d;
    }
}
