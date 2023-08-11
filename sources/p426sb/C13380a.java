package p426sb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: sb.a */
/* compiled from: InstoreMerchantView.kt */
public final class C13380a extends FrameLayout {

    /* renamed from: b */
    private final Lazy f21445b;

    /* renamed from: c */
    private final Lazy f21446c;

    /* renamed from: d */
    private Merchant f21447d;

    /* renamed from: e */
    public Map<Integer, View> f21448e = new LinkedHashMap();

    /* renamed from: sb.a$a */
    /* compiled from: InstoreMerchantView.kt */
    static final class C13381a extends C12777p implements C13074a<ImageView> {

        /* renamed from: g */
        final /* synthetic */ C13380a f21449g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13381a(C13380a aVar) {
            super(0);
            this.f21449g = aVar;
        }

        /* renamed from: b */
        public final ImageView invoke() {
            return (ImageView) this.f21449g.findViewById(R.id.imageViewLogo);
        }
    }

    /* renamed from: sb.a$b */
    /* compiled from: InstoreMerchantView.kt */
    static final class C13382b extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ C13380a f21450g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13382b(C13380a aVar) {
            super(0);
            this.f21450g = aVar;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f21450g.findViewById(R.id.textViewPlaceholder);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13380a(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        this.f21445b = C11901h.m25690b(new C13381a(this));
        this.f21446c = C11901h.m25690b(new C13382b(this));
        m30453b();
    }

    /* renamed from: b */
    private final void m30453b() {
        LayoutInflater.from(getContext()).inflate(R.layout.view_instore_merchant, this);
    }

    private final ImageView getImageViewLogo() {
        return (ImageView) this.f21445b.getValue();
    }

    /* access modifiers changed from: private */
    public final TextView getTextViewPlaceholder() {
        return (TextView) this.f21446c.getValue();
    }

    /* renamed from: c */
    public final void mo53001c(Merchant merchant) {
        C12775o.m28639i(merchant, "merchant");
        this.f21447d = merchant;
        getTextViewPlaceholder().setText(merchant.name);
        AsyncImageLoader.loadImage(getImageViewLogo(), (Object) merchant.f18063id, String.valueOf(merchant.getLogoUrl()), (Callback) new C13383c(this));
    }

    public final Merchant getMerchant() {
        return this.f21447d;
    }

    /* renamed from: sb.a$c */
    /* compiled from: InstoreMerchantView.kt */
    public static final class C13383c implements Callback {

        /* renamed from: a */
        final /* synthetic */ C13380a f21451a;

        C13383c(C13380a aVar) {
            this.f21451a = aVar;
        }

        public void onSuccess() {
            this.f21451a.getTextViewPlaceholder().setText("");
        }

        /* renamed from: a */
        public void mo23239a(Exception exc) {
        }
    }
}
