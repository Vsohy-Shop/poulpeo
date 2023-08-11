package p425sa;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.core.model.RemoteImage;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.utils.AsyncImageLoader;
import java.net.URL;
import java.text.NumberFormat;
import kotlin.jvm.internal.C12775o;
import p446vd.C13629j;

@StabilityInferred(parameters = 0)
/* renamed from: sa.k */
/* compiled from: MarketingEventsMerchantViewHolder.kt */
public final class C13379k {

    /* renamed from: a */
    private final View f21443a;

    /* renamed from: b */
    private final TextView f21444b;

    public C13379k(Context context, ViewGroup viewGroup, Merchant merchant) {
        URL imageURL;
        String url;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(viewGroup, "rootView");
        C12775o.m28639i(merchant, "merchant");
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_merchant_happy_hours, viewGroup, false);
        C12775o.m28638h(inflate, "from(context).inflate(R.…y_hours, rootView, false)");
        this.f21443a = inflate;
        View findViewById = inflate.findViewById(R.id.textViewCashback);
        C12775o.m28638h(findViewById, "view.findViewById(R.id.textViewCashback)");
        this.f21444b = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.imageViewIllustration);
        C12775o.m28638h(findViewById2, "view.findViewById(R.id.imageViewIllustration)");
        ImageView imageView = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.imageViewLogo);
        C12775o.m28638h(findViewById3, "view.findViewById(R.id.imageViewLogo)");
        ImageView imageView2 = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.textViewName);
        C12775o.m28638h(findViewById4, "view.findViewById(R.id.textViewName)");
        TextView textView = (TextView) findViewById4;
        RemoteImage remoteImage = merchant.illustrationTopMobile;
        if (!(remoteImage == null || (imageURL = remoteImage.getImageURL()) == null || (url = imageURL.toString()) == null)) {
            AsyncImageLoader.loadImage(imageView, (Object) url, url, (int) R.color.theme);
        }
        AsyncImageLoader.loadImage(imageView2, (Object) String.valueOf(merchant.getLogoUrl()), String.valueOf(merchant.getLogoUrl()), (int) R.drawable.merchant_logo_placeholder);
        textView.setText(merchant.name);
        m30450b(context, merchant.getCashbackObject());
    }

    /* renamed from: b */
    private final void m30450b(Context context, CashbackObject cashbackObject) {
        if (cashbackObject == null) {
            this.f21444b.setText("");
            return;
        }
        NumberFormat d = C13629j.m31134d();
        String previousCashbackText = cashbackObject.getPreviousCashbackText(d, "%s ");
        C12775o.m28638h(previousCashbackText, "cashbackObject.getPreviousCashbackText(f, \"%s \")");
        String string = context.getString(R.string.marketing_event_merchant_cashback);
        SpannableString spannableString = new SpannableString(cashbackObject.getCashbackText(d, "", previousCashbackText + string));
        spannableString.setSpan(new StrikethroughSpan(), 0, previousCashbackText.length() - 1, 17);
        spannableString.setSpan(new StyleSpan(1), previousCashbackText.length(), spannableString.length(), 17);
        this.f21444b.setText(spannableString);
    }

    /* renamed from: a */
    public final View mo53000a() {
        return this.f21443a;
    }
}
