package p394nb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.GenericElement;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import p360id.C12137e;
import p360id.C12139g;
import p445vc.C13618g;

@StabilityInferred(parameters = 0)
/* renamed from: nb.e */
/* compiled from: SupportTicketHelpView.kt */
public final class C12980e {

    /* renamed from: a */
    private final View f20775a;

    public C12980e(Context context, ViewGroup viewGroup, GenericElement genericElement) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        C12775o.m28639i(genericElement, "help");
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_support_ticket_help, viewGroup, false);
        C12775o.m28638h(inflate, "from(context).inflate(R.…t_help, container, false)");
        this.f20775a = inflate;
        View findViewById = inflate.findViewById(R.id.layoutTitleContainer);
        C12775o.m28638h(findViewById, "view.findViewById(R.id.layoutTitleContainer)");
        View findViewById2 = inflate.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById2, "view.findViewById(R.id.textViewTitle)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.imageViewExpand);
        C12775o.m28638h(findViewById3, "view.findViewById(R.id.imageViewExpand)");
        View findViewById4 = inflate.findViewById(R.id.textViewDetail);
        C12775o.m28638h(findViewById4, "view.findViewById(R.id.textViewDetail)");
        TextView textView2 = (TextView) findViewById4;
        String title = genericElement.getTitle();
        C12775o.m28638h(title, "help.title");
        textView.setText(C12137e.m26470a(title));
        String data = genericElement.getData();
        C12775o.m28638h(data, "help.data");
        textView2.setText(C12137e.m26470a(data));
        findViewById.setOnClickListener(new C12979d(this, textView2, (ImageView) findViewById3, textView));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m29339b(C12980e eVar, TextView textView, ImageView imageView, TextView textView2, View view) {
        C12775o.m28639i(eVar, "this$0");
        C12775o.m28639i(textView, "$textViewDetail");
        C12775o.m28639i(imageView, "$imageViewExpand");
        C12775o.m28639i(textView2, "$textViewTitle");
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(1);
        transitionSet.addTransition(new ChangeBounds().addTarget(eVar.f20775a));
        if (!C12139g.m26473b(textView)) {
            transitionSet.addTransition(new Fade().addTarget((View) textView));
        }
        View view2 = eVar.f20775a;
        C12775o.m28637g(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        TransitionManager.beginDelayedTransition((ViewGroup) view2, transitionSet);
        if (C12139g.m26473b(textView)) {
            C12139g.m26475d(textView, false, 0, 2, (Object) null);
            imageView.setRotation(0.0f);
            return;
        }
        C12139g.m26475d(textView, true, 0, 2, (Object) null);
        imageView.setRotation(180.0f);
        C13618g.f21930b.mo53279c("support", "click", textView2.getText().toString());
    }

    /* renamed from: c */
    public final View mo50886c() {
        return this.f20775a;
    }
}
