package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.applinks.AppLinkData;
import p139k3.C8549o;
import p139k3.C8555t;
import p219s3.C9469e;
import p263w3.C10111a;

@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m5895b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(AppLinkData.ARGUMENTS_EXTRAS_KEY);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C8555t.m17186f(getApplicationContext());
        C8549o.C8550a d = C8549o.m17165a().mo42586b(string).mo42588d(C10111a.m21241b(i));
        if (string2 != null) {
            d.mo42587c(Base64.decode(string2, 0));
        }
        C8555t.m17184c().mo42616e().mo43932v(d.mo42585a(), i2, new C9469e(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
