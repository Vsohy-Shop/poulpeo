package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import okhttp3.Route;

/* compiled from: RouteDatabase.kt */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        C12775o.m28639i(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        C12775o.m28639i(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        C12775o.m28639i(route, "route");
        return this.failedRoutes.contains(route);
    }
}
