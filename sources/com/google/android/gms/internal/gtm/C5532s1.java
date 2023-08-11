package com.google.android.gms.internal.gtm;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.internal.gtm.s1 */
public final class C5532s1 {
    @Nullable

    /* renamed from: b */
    private static final Method f6297b = m8483c();
    @Nullable

    /* renamed from: c */
    private static final Method f6298c = m8484d();

    /* renamed from: d */
    private static volatile C5563u1 f6299d = C5547t1.f6323a;

    /* renamed from: a */
    private final JobScheduler f6300a;

    private C5532s1(JobScheduler jobScheduler) {
        this.f6300a = jobScheduler;
    }

    /* renamed from: a */
    private final int m8481a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f6297b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f6300a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f6300a.schedule(jobInfo);
    }

    /* renamed from: b */
    public static int m8482b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f6297b == null || !f6299d.mo33530a() || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C5532s1(jobScheduler).m8481a(jobInfo, str, m8485e(), str2);
    }

    @Nullable
    /* renamed from: c */
    private static Method m8483c() {
        Class<String> cls = String.class;
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    @Nullable
    /* renamed from: d */
    private static Method m8484d() {
        try {
            return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
            return null;
        }
    }

    /* renamed from: e */
    private static int m8485e() {
        Method method = f6298c;
        if (method != null) {
            try {
                return ((Integer) method.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    static final /* synthetic */ boolean m8486f() {
        return false;
    }
}
