package p011l9;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.models.Campaign;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.net.URL;
import kotlin.jvm.internal.C12775o;
import p360id.C12139g;
import p373kb.C12650e;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: l9.e */
/* compiled from: SponsorshipCampaignViewHolder.kt */
public final class C2044e extends C14080a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12650e f623g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ImageView f624h;

    /* renamed from: i */
    private Campaign f625i;

    /* renamed from: l9.e$a */
    /* compiled from: SponsorshipCampaignViewHolder.kt */
    public static final class C2045a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C2044e f626a;

        C2045a(C2044e eVar) {
            this.f626a = eVar;
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
            C12139g.m26475d(this.f626a.f624h, false, 0, 2, (Object) null);
        }

        public void onSuccess() {
            C12139g.m26475d(this.f626a.f624h, true, 0, 2, (Object) null);
            this.f626a.f623g.mo46491O();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2044e(View view, C13867a.C13868a aVar, C12650e eVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(eVar, "sponsorshipControllerListener");
        this.f623g = eVar;
        View findViewById = view.findViewById(R.id.imageViewSponsorshipCampaign);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.…eViewSponsorshipCampaign)");
        ImageView imageView = (ImageView) findViewById;
        this.f624h = imageView;
        imageView.setOnClickListener(new C2043d(this, view));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m1359o2(C2044e eVar, View view, View view2) {
        C12775o.m28639i(eVar, "this$0");
        C12775o.m28639i(view, "$itemView");
        eVar.onClick(view);
    }

    /* renamed from: R0 */
    public boolean mo23238R0() {
        return false;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        RemoteImage remoteImage;
        URL imageURL;
        String url;
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            this.f625i = campaign;
            if (this.f624h.getVisibility() != 0 && (remoteImage = campaign.dataIllustration) != null && (imageURL = remoteImage.getImageURL()) != null && (url = imageURL.toString()) != null) {
                AsyncImageLoader.loadImage(this.f624h, url, url, 0, new C2045a(this));
            }
        }
    }
}
