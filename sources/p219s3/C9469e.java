package p219s3;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: s3.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C9469e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ JobInfoSchedulerService f14087b;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f14088c;

    public /* synthetic */ C9469e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f14087b = jobInfoSchedulerService;
        this.f14088c = jobParameters;
    }

    public final void run() {
        this.f14087b.m5895b(this.f14088c);
    }
}
