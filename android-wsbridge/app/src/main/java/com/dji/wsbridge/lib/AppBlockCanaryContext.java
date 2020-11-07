package com.dji.wsbridge.lib;

// --Commented out by Inspection START (12/11/2018 11:21 AM):
///**
// * Configuration class for BlockCanary
// */
//
//class AppBlockCanaryContext extends BlockCanaryContext {
//
//    private static final String TAG = AppBlockCanaryContext.class.getSimpleName();
//
//    @Override
//    public String provideQualifier() {
//        String qualifier = "";
//        try {
//            PackageInfo info = BridgeApplication.getInstance()
//                                              .getPackageManager()
//                                              .getPackageInfo(BridgeApplication.getInstance().getPackageName(), 0);
//            qualifier += info.versionCode + "_" + info.versionName + "_YYB";
//        } catch (PackageManager.NameNotFoundException e) {
//            Log.e(TAG, "provideQualifier exception", e);
//        }
//        return qualifier;
//    }
//
//    /**
//     * Random number to identify our app
//     */
//    @Override
//    public String provideUid() {
//        return "10112017";
//    }
//
//    /**
//     * We mostly run sample app in test devices,
//     * which only have wifi connection
//     */
//    @Override
//    public String provideNetworkType() {
//        return "wifi";
//    }
//
//    /**
//     * As long as possible
//     */
//    @Override
//    public int provideMonitorDuration() {
//        return Integer.MAX_VALUE;
//    }
//
//    /**
//     * Ideally this should be 16 milliseconds
//     * to guarantee 60 fps but we are far away
//     * from there
//     */
//    @Override
//    public int provideBlockThreshold() {
//        return 500;
//    }
//
//    /**
//     * Turn off notification to not interrupt QA
//     */
//    @Override
//    public boolean displayNotification() {
//        return false;
//    }
//
//    /**
//     * Path to save log file
//     */
//    @Override
//    public String providePath() {
//        return "/DJI/blocks/";
//    }
//}
// --Commented out by Inspection STOP (12/11/2018 11:21 AM)

