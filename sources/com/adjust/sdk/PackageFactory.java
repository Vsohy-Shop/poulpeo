package com.adjust.sdk;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PackageFactory {
    private static final String ADJUST_PREFIX = "adjust_";

    public static ActivityPackage buildDeeplinkSdkClickPackage(Uri uri, long j, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters) {
        String uri2;
        if (uri == null || (uri2 = uri.toString()) == null || uri2.length() == 0) {
            return null;
        }
        AdjustFactory.getLogger().verbose("Url to parse (%s)", uri);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseUrl(uri2);
        PackageBuilder queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, sessionParameters);
        if (queryStringClickPackageBuilder == null) {
            return null;
        }
        queryStringClickPackageBuilder.deeplink = uri.toString();
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        return queryStringClickPackageBuilder.buildClickPackage(Constants.DEEPLINK);
    }

    public static ActivityPackage buildInstallReferrerSdkClickPackage(ReferrerDetails referrerDetails, String str, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters) {
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, sessionParameters, System.currentTimeMillis());
        packageBuilder.referrer = referrerDetails.installReferrer;
        packageBuilder.clickTimeInSeconds = referrerDetails.referrerClickTimestampSeconds;
        packageBuilder.installBeginTimeInSeconds = referrerDetails.installBeginTimestampSeconds;
        packageBuilder.clickTimeServerInSeconds = referrerDetails.referrerClickTimestampServerSeconds;
        packageBuilder.installBeginTimeServerInSeconds = referrerDetails.installBeginTimestampServerSeconds;
        packageBuilder.installVersion = referrerDetails.installVersion;
        packageBuilder.googlePlayInstant = referrerDetails.googlePlayInstant;
        packageBuilder.referrerApi = str;
        return packageBuilder.buildClickPackage(Constants.INSTALL_REFERRER);
    }

    public static ActivityPackage buildPreinstallSdkClickPackage(String str, String str2, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters) {
        if (str == null || str.length() == 0) {
            return null;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, sessionParameters, System.currentTimeMillis());
        packageBuilder.preinstallPayload = str;
        packageBuilder.preinstallLocation = str2;
        return packageBuilder.buildClickPackage(Constants.PREINSTALL);
    }

    public static ActivityPackage buildReftagSdkClickPackage(String str, long j, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters) {
        String str2 = Constants.MALFORMED;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, Constants.ENCODING);
        } catch (UnsupportedEncodingException e) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (IllegalArgumentException e2) {
            AdjustFactory.getLogger().error("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (Exception e3) {
            AdjustFactory.getLogger().error("Referrer decoding failed. Message: (%s)", e3.getMessage());
        }
        AdjustFactory.getLogger().verbose("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        PackageBuilder queryStringClickPackageBuilder = queryStringClickPackageBuilder(urlQuerySanitizer.getParameterList(), activityState, adjustConfig, deviceInfo, sessionParameters);
        if (queryStringClickPackageBuilder == null) {
            return null;
        }
        queryStringClickPackageBuilder.referrer = str2;
        queryStringClickPackageBuilder.clickTimeInMilliseconds = j;
        queryStringClickPackageBuilder.rawReferrer = str;
        return queryStringClickPackageBuilder.buildClickPackage(Constants.REFTAG);
    }

    private static PackageBuilder queryStringClickPackageBuilder(List<UrlQuerySanitizer.ParameterValuePair> list, ActivityState activityState, AdjustConfig adjustConfig, DeviceInfo deviceInfo, SessionParameters sessionParameters) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        for (UrlQuerySanitizer.ParameterValuePair next : list) {
            readQueryString(next.mParameter, next.mValue, linkedHashMap, adjustAttribution);
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str = (String) linkedHashMap.remove(Constants.REFTAG);
        if (activityState != null) {
            activityState.lastInterval = currentTimeMillis - activityState.lastActivity;
        }
        PackageBuilder packageBuilder = new PackageBuilder(adjustConfig, deviceInfo, activityState, sessionParameters, currentTimeMillis);
        packageBuilder.extraParameters = linkedHashMap;
        packageBuilder.attribution = adjustAttribution;
        packageBuilder.reftag = str;
        return packageBuilder;
    }

    private static boolean readQueryString(String str, String str2, Map<String, String> map, AdjustAttribution adjustAttribution) {
        if (str == null || str2 == null || !str.startsWith(ADJUST_PREFIX)) {
            return false;
        }
        String substring = str.substring(7);
        if (substring.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (tryToSetAttribution(adjustAttribution, substring, str2)) {
            return true;
        }
        map.put(substring, str2);
        return true;
    }

    private static boolean tryToSetAttribution(AdjustAttribution adjustAttribution, String str, String str2) {
        if (str.equals("tracker")) {
            adjustAttribution.trackerName = str2;
            return true;
        } else if (str.equals(APIResourceDescriptors.RESOURCE_TYPE_CAMPAIGN)) {
            adjustAttribution.campaign = str2;
            return true;
        } else if (str.equals("adgroup")) {
            adjustAttribution.adgroup = str2;
            return true;
        } else if (!str.equals("creative")) {
            return false;
        } else {
            adjustAttribution.creative = str2;
            return true;
        }
    }
}
