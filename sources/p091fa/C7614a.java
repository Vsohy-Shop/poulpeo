package p091fa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionJumbotron;
import com.rmn.utils.AsyncImageLoader;
import com.squareup.picasso.Callback;
import java.net.URL;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: fa.a */
/* compiled from: JumbotronSectionViewHolder.kt */
public final class C7614a extends C14080a {

    /* renamed from: g */
    private final TextView f10586g;

    /* renamed from: h */
    private final TextView f10587h;

    /* renamed from: i */
    private final ImageView f10588i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7614a(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.textViewTitle)");
        this.f10586g = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.textViewDescription);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.textViewDescription)");
        this.f10587h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.imageViewIllustration);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.imageViewIllustration)");
        this.f10588i = (ImageView) findViewById3;
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        String url;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.apiclient.impl.api.models.submodels.page.sections.PageSectionJumbotron");
        PageSectionJumbotron pageSectionJumbotron = (PageSectionJumbotron) obj;
        this.f10586g.setText(pageSectionJumbotron.title);
        this.f10587h.setText(pageSectionJumbotron.content);
        URL background = pageSectionJumbotron.getBackground();
        if (background != null && (url = background.toString()) != null) {
            AsyncImageLoader.loadImage(this.f10588i, url, url, 0, (Callback) null);
        }
    }
}
