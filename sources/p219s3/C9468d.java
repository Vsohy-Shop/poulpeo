package p219s3;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.facebook.applinks.AppLinkData;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p139k3.C8549o;
import p189p3.C9050a;
import p230t3.C9609d;
import p263w3.C10111a;

@RequiresApi(api = 21)
/* renamed from: s3.d */
/* compiled from: JobInfoScheduler */
public class C9468d implements C9492x {

    /* renamed from: a */
    private final Context f14084a;

    /* renamed from: b */
    private final C9609d f14085b;

    /* renamed from: c */
    private final C9470f f14086c;

    public C9468d(Context context, C9609d dVar, C9470f fVar) {
        this.f14084a = context;
        this.f14085b = dVar;
        this.f14086c = fVar;
    }

    /* renamed from: d */
    private boolean m19599d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo43919a(C8549o oVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f14084a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f14084a.getSystemService("jobscheduler");
        int c = mo43921c(oVar);
        if (z || !m19599d(jobScheduler, c, i)) {
            long E = this.f14085b.mo44089E(oVar);
            JobInfo.Builder c2 = this.f14086c.mo43923c(new JobInfo.Builder(c, componentName), oVar.mo42582d(), E, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", oVar.mo42580b());
            persistableBundle.putInt("priority", C10111a.m21240a(oVar.mo42582d()));
            if (oVar.mo42581c() != null) {
                persistableBundle.putString(AppLinkData.ARGUMENTS_EXTRAS_KEY, Base64.encodeToString(oVar.mo42581c(), 0));
            }
            c2.setExtras(persistableBundle);
            C9050a.m18381b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c), Long.valueOf(this.f14086c.mo43924g(oVar.mo42582d(), E, i)), Long.valueOf(E), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C9050a.m18380a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* renamed from: b */
    public void mo43920b(C8549o oVar, int i) {
        mo43919a(oVar, i, false);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public int mo43921c(C8549o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f14084a.getPackageName().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(oVar.mo42580b().getBytes(Charset.forName(Constants.ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(C10111a.m21240a(oVar.mo42582d())).array());
        if (oVar.mo42581c() != null) {
            adler32.update(oVar.mo42581c());
        }
        return (int) adler32.getValue();
    }
}
