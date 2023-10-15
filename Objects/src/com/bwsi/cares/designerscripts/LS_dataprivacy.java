package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_dataprivacy{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[DataPrivacy/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="pnlMain.Width = 100%x"[DataPrivacy/General script]
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="pnlMain.Height = 100%y"[DataPrivacy/General script]
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="pnlTitleBar.SetLeftAndRight(0,pnlMain.Width)"[DataPrivacy/General script]
views.get("pnltitlebar").vw.setLeft((int)(0d));
views.get("pnltitlebar").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
//BA.debugLineNum = 6;BA.debugLine="pnlTitleBar.SetTopAndBottom(0, 48dip)"[DataPrivacy/General script]
views.get("pnltitlebar").vw.setTop((int)(0d));
views.get("pnltitlebar").vw.setHeight((int)((48d * scale) - (0d)));
//BA.debugLineNum = 8;BA.debugLine="Back.Width = 10%x"[DataPrivacy/General script]
views.get("back").vw.setWidth((int)((10d / 100 * width)));
//BA.debugLineNum = 9;BA.debugLine="Back.Height = Back.Width"[DataPrivacy/General script]
views.get("back").vw.setHeight((int)((views.get("back").vw.getWidth())));
//BA.debugLineNum = 10;BA.debugLine="Back.Top = 0"[DataPrivacy/General script]
views.get("back").vw.setTop((int)(0d));
//BA.debugLineNum = 11;BA.debugLine="Back.Left = 3%x"[DataPrivacy/General script]
views.get("back").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="lblTitle.VerticalCenter = Back.VerticalCenter"[DataPrivacy/General script]
views.get("lbltitle").vw.setTop((int)((views.get("back").vw.getTop() + views.get("back").vw.getHeight()/2) - (views.get("lbltitle").vw.getHeight() / 2)));
//BA.debugLineNum = 13;BA.debugLine="lblTitle.SetLeftAndRight(0, pnlTitleBar.Width)"[DataPrivacy/General script]
views.get("lbltitle").vw.setLeft((int)(0d));
views.get("lbltitle").vw.setWidth((int)((views.get("pnltitlebar").vw.getWidth()) - (0d)));
//BA.debugLineNum = 14;BA.debugLine="imgLogo.SetTopAndBottom(pnlTitleBar.Bottom +5dip, 16%y)"[DataPrivacy/General script]
views.get("imglogo").vw.setTop((int)((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(5d * scale)));
views.get("imglogo").vw.setHeight((int)((16d / 100 * height) - ((views.get("pnltitlebar").vw.getTop() + views.get("pnltitlebar").vw.getHeight())+(5d * scale))));
//BA.debugLineNum = 15;BA.debugLine="imgLogo.SetLeftAndRight(25%x, pnlMain.Width - 25%x)"[DataPrivacy/General script]
views.get("imglogo").vw.setLeft((int)((25d / 100 * width)));
views.get("imglogo").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(25d / 100 * width) - ((25d / 100 * width))));
//BA.debugLineNum = 17;BA.debugLine="DPView.SetLeftAndRight(1%x, pnlMain.Width - 1%x)"[DataPrivacy/General script]
views.get("dpview").vw.setLeft((int)((1d / 100 * width)));
views.get("dpview").vw.setWidth((int)((views.get("pnlmain").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 18;BA.debugLine="DPView.SetTopAndBottom(imgLogo.Bottom + 10dip, 90%y)"[DataPrivacy/General script]
views.get("dpview").vw.setTop((int)((views.get("imglogo").vw.getTop() + views.get("imglogo").vw.getHeight())+(10d * scale)));
views.get("dpview").vw.setHeight((int)((90d / 100 * height) - ((views.get("imglogo").vw.getTop() + views.get("imglogo").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 19;BA.debugLine="pnlFooter.SetLeftAndRight(0,pnlMain.Width)"[DataPrivacy/General script]
views.get("pnlfooter").vw.setLeft((int)(0d));
views.get("pnlfooter").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
//BA.debugLineNum = 20;BA.debugLine="pnlFooter.SetTopAndBottom(82%y, pnlMain.Bottom)"[DataPrivacy/General script]
views.get("pnlfooter").vw.setTop((int)((82d / 100 * height)));
views.get("pnlfooter").vw.setHeight((int)((views.get("pnlmain").vw.getTop() + views.get("pnlmain").vw.getHeight()) - ((82d / 100 * height))));
//BA.debugLineNum = 21;BA.debugLine="chkAgree.SetLeftAndRight(2%x,pnlFooter.Width - 25%x)"[DataPrivacy/General script]
views.get("chkagree").vw.setLeft((int)((2d / 100 * width)));
views.get("chkagree").vw.setWidth((int)((views.get("pnlfooter").vw.getWidth())-(25d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 22;BA.debugLine="chkAgree.Top = 2%y"[DataPrivacy/General script]
views.get("chkagree").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 23;BA.debugLine="btnContinue.SetTopAndBottom(chkAgree.Bottom + 5dip, pnlFooter.Height - 1%y)"[DataPrivacy/General script]
views.get("btncontinue").vw.setTop((int)((views.get("chkagree").vw.getTop() + views.get("chkagree").vw.getHeight())+(5d * scale)));
views.get("btncontinue").vw.setHeight((int)((views.get("pnlfooter").vw.getHeight())-(1d / 100 * height) - ((views.get("chkagree").vw.getTop() + views.get("chkagree").vw.getHeight())+(5d * scale))));
//BA.debugLineNum = 24;BA.debugLine="btnContinue.SetLeftAndRight(60%x, pnlFooter.Width - 2%x)"[DataPrivacy/General script]
views.get("btncontinue").vw.setLeft((int)((60d / 100 * width)));
views.get("btncontinue").vw.setWidth((int)((views.get("pnlfooter").vw.getWidth())-(2d / 100 * width) - ((60d / 100 * width))));

}
}