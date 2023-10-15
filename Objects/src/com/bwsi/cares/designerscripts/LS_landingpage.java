package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_landingpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlsplash").vw.setTop((int)(0d));
views.get("pnlsplash").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("pnlsplash").vw.setLeft((int)(0d));
views.get("pnlsplash").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("pnlheader").vw.setTop((int)((0d / 100 * height)));
views.get("pnlheader").vw.setLeft((int)((0d / 100 * width)));
views.get("pnlheader").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("imglogo").vw.setTop((int)((2d * scale)));
views.get("imglogo").vw.setLeft((int)((views.get("pnlheader").vw.getLeft() + views.get("pnlheader").vw.getWidth()/2) - (views.get("imglogo").vw.getWidth() / 2)));
if ((anywheresoftware.b4a.keywords.LayoutBuilder.getScreenSize()>6.5d)) { 
;
views.get("pnlheader").vw.setHeight((int)((64d * scale)));
;}else{ 
;
if ((BA.ObjectToBoolean( String.valueOf(anywheresoftware.b4a.keywords.LayoutBuilder.isPortrait())))) { 
;
views.get("pnlheader").vw.setHeight((int)((60d * scale)));
views.get("imglogo").vw.setHeight((int)((50d * scale)));
;}else{ 
;
views.get("pnlheader").vw.setHeight((int)((48d * scale)));
views.get("imglogo").vw.setHeight((int)((45d * scale)));
;};
;};
views.get("imgslider").vw.setLeft((int)((1d / 100 * width)));
views.get("imgslider").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
views.get("imgslider").vw.setTop((int)((views.get("pnlheader").vw.getTop() + views.get("pnlheader").vw.getHeight())+(5d * scale)));
views.get("imgslider").vw.setHeight((int)((28d / 100 * height) - ((views.get("pnlheader").vw.getTop() + views.get("pnlheader").vw.getHeight())+(5d * scale))));
views.get("scvmain").vw.setLeft((int)((0d / 100 * width)));
views.get("scvmain").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("scvmain").vw.setTop((int)((views.get("imgslider").vw.getTop() + views.get("imgslider").vw.getHeight())));
views.get("scvmain").vw.setHeight((int)((90d / 100 * height) - ((views.get("imgslider").vw.getTop() + views.get("imgslider").vw.getHeight()))));
views.get("pnlaccount").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlaccount").vw.setLeft((int)(0d));
views.get("pnlaccount").vw.setTop((int)(0d));
views.get("pnlaccount").vw.setTop((int)(0d));
views.get("pnlaccount").vw.setHeight((int)((90d / 100 * height) - (0d)));
views.get("pnlservices").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlservices").vw.setLeft((int)(0d));
views.get("pnlservices").vw.setTop((int)(0d));
views.get("pnlservices").vw.setHeight((int)((90d / 100 * height) - (0d)));
views.get("pnltitlebar").vw.setLeft((int)(0d));
views.get("pnltitlebar").vw.setWidth((int)((views.get("pnlservices").vw.getWidth()) - (0d)));
views.get("pnltitlebar").vw.setTop((int)(0d));
views.get("pnltitlebar").vw.setHeight((int)((48d * scale) - (0d)));
views.get("btnservicesback").vw.setWidth((int)((10d / 100 * width)));
views.get("btnservicesback").vw.setHeight((int)((views.get("btnservicesback").vw.getWidth())));
views.get("btnservicesback").vw.setTop((int)(0d));
views.get("btnservicesback").vw.setLeft((int)((3d / 100 * width)));
views.get("lbltitle").vw.setTop((int)((views.get("btnservicesback").vw.getTop() + views.get("btnservicesback").vw.getHeight()/2) - (views.get("lbltitle").vw.getHeight() / 2)));
//BA.debugLineNum = 47;BA.debugLine="lblTitle.SetLeftAndRight(btnServicesBack.Right + 10dip, pnlTitleBar.Width)"[landingpage/General script]
views.get("lbltitle").vw.setLeft((int)((views.get("btnservicesback").vw.getLeft() + views.get("btnservicesback").vw.getWidth())+(10d * scale)));
views.get("lbltitle").vw.setWidth((int)((views.get("pnltitlebar").vw.getWidth()) - ((views.get("btnservicesback").vw.getLeft() + views.get("btnservicesback").vw.getWidth())+(10d * scale))));
//BA.debugLineNum = 49;BA.debugLine="imgServices.SetLeftAndRight(1%x, pnlServices.Width - 1%x)"[landingpage/General script]
views.get("imgservices").vw.setLeft((int)((1d / 100 * width)));
views.get("imgservices").vw.setWidth((int)((views.get("pnlservices").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 50;BA.debugLine="imgServices.SetTopAndBottom(pnlTitleBar.Bottom + 1%y, 30%y)"[landingpage/General script]
views.get("imgservices").vw.setTop((int)((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(1d / 100 * height)));
views.get("imgservices").vw.setHeight((int)((30d / 100 * height) - ((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(1d / 100 * height))));
//BA.debugLineNum = 52;BA.debugLine="clvServices.SetLeftAndRight(1%x, pnlServices.Width - 1%x)"[landingpage/General script]
views.get("clvservices").vw.setLeft((int)((1d / 100 * width)));
views.get("clvservices").vw.setWidth((int)((views.get("pnlservices").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 53;BA.debugLine="clvServices.SetTopAndBottom(imgServices.Bottom + 10dip, pnlServices.Height)"[landingpage/General script]
views.get("clvservices").vw.setTop((int)((views.get("imgservices").vw.getTop() + views.get("imgservices").vw.getHeight())+(10d * scale)));
views.get("clvservices").vw.setHeight((int)((views.get("pnlservices").vw.getHeight()) - ((views.get("imgservices").vw.getTop() + views.get("imgservices").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 55;BA.debugLine="btnHome.Width = 6%x"[landingpage/General script]
views.get("btnhome").vw.setWidth((int)((6d / 100 * width)));
//BA.debugLineNum = 56;BA.debugLine="btnHome.Height = btnHome.Width"[landingpage/General script]
views.get("btnhome").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
//BA.debugLineNum = 57;BA.debugLine="btnHome.Left = 10%x"[landingpage/General script]
views.get("btnhome").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 58;BA.debugLine="btnHome.VerticalCenter = 95%y"[landingpage/General script]
views.get("btnhome").vw.setTop((int)((95d / 100 * height) - (views.get("btnhome").vw.getHeight() / 2)));
//BA.debugLineNum = 60;BA.debugLine="btnServices.Width = 6%x"[landingpage/General script]
views.get("btnservices").vw.setWidth((int)((6d / 100 * width)));
//BA.debugLineNum = 61;BA.debugLine="btnServices.Height = btnServices.Width"[landingpage/General script]
views.get("btnservices").vw.setHeight((int)((views.get("btnservices").vw.getWidth())));
//BA.debugLineNum = 62;BA.debugLine="btnServices.Left = btnHome.Right + 12.5%x"[landingpage/General script]
views.get("btnservices").vw.setLeft((int)((views.get("btnhome").vw.getLeft() + views.get("btnhome").vw.getWidth())+(12.5d / 100 * width)));
//BA.debugLineNum = 63;BA.debugLine="btnServices.VerticalCenter = 95%y"[landingpage/General script]
views.get("btnservices").vw.setTop((int)((95d / 100 * height) - (views.get("btnservices").vw.getHeight() / 2)));
//BA.debugLineNum = 65;BA.debugLine="btnBranches.Width = 6%x"[landingpage/General script]
views.get("btnbranches").vw.setWidth((int)((6d / 100 * width)));
//BA.debugLineNum = 66;BA.debugLine="btnBranches.Height = btnHome.Width"[landingpage/General script]
views.get("btnbranches").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
//BA.debugLineNum = 67;BA.debugLine="btnBranches.Left = btnServices.Right + 12.5%x"[landingpage/General script]
views.get("btnbranches").vw.setLeft((int)((views.get("btnservices").vw.getLeft() + views.get("btnservices").vw.getWidth())+(12.5d / 100 * width)));
//BA.debugLineNum = 68;BA.debugLine="btnBranches.VerticalCenter = 95%y"[landingpage/General script]
views.get("btnbranches").vw.setTop((int)((95d / 100 * height) - (views.get("btnbranches").vw.getHeight() / 2)));
//BA.debugLineNum = 70;BA.debugLine="btnCallUs.Width = 6%x"[landingpage/General script]
views.get("btncallus").vw.setWidth((int)((6d / 100 * width)));
//BA.debugLineNum = 71;BA.debugLine="btnCallUs.Height = btnHome.Width"[landingpage/General script]
views.get("btncallus").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
//BA.debugLineNum = 72;BA.debugLine="btnCallUs.Left = btnBranches.Right + 12.5%x"[landingpage/General script]
views.get("btncallus").vw.setLeft((int)((views.get("btnbranches").vw.getLeft() + views.get("btnbranches").vw.getWidth())+(12.5d / 100 * width)));
//BA.debugLineNum = 73;BA.debugLine="btnCallUs.VerticalCenter = 95%y"[landingpage/General script]
views.get("btncallus").vw.setTop((int)((95d / 100 * height) - (views.get("btncallus").vw.getHeight() / 2)));
//BA.debugLineNum = 75;BA.debugLine="btnAccount.Width = 6%x"[landingpage/General script]
views.get("btnaccount").vw.setWidth((int)((6d / 100 * width)));
//BA.debugLineNum = 76;BA.debugLine="btnAccount.Height = btnHome.Width"[landingpage/General script]
views.get("btnaccount").vw.setHeight((int)((views.get("btnhome").vw.getWidth())));
//BA.debugLineNum = 77;BA.debugLine="btnAccount.Left = btnCallUs.Right + 12.5%x"[landingpage/General script]
views.get("btnaccount").vw.setLeft((int)((views.get("btncallus").vw.getLeft() + views.get("btncallus").vw.getWidth())+(12.5d / 100 * width)));
//BA.debugLineNum = 78;BA.debugLine="btnAccount.VerticalCenter = 95%y"[landingpage/General script]
views.get("btnaccount").vw.setTop((int)((95d / 100 * height) - (views.get("btnaccount").vw.getHeight() / 2)));
//BA.debugLineNum = 79;BA.debugLine="fabApply.Right = 90%x"[landingpage/General script]
views.get("fabapply").vw.setLeft((int)((90d / 100 * width) - (views.get("fabapply").vw.getWidth())));
//BA.debugLineNum = 80;BA.debugLine="fabApply.Top = 80%y"[landingpage/General script]
views.get("fabapply").vw.setTop((int)((80d / 100 * height)));

}
}