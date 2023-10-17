package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_landingcontents{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlmain").vw.setHeight((int)((170d / 100 * height)));
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setTop((int)((3d / 100 * height)));
views.get("more_btn").vw.setLeft((int)((views.get("pnlmain").vw.getWidth())-(2d / 100 * width) - (views.get("more_btn").vw.getWidth())));
views.get("more_btn").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight()/2) - (views.get("more_btn").vw.getHeight() / 2)));
views.get("pnlnews").vw.setLeft((int)(0d));
views.get("pnlnews").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("clvnews").vw.setLeft((int)(0d));
views.get("clvnews").vw.setWidth((int)((views.get("pnlnews").vw.getWidth()) - (0d)));
views.get("pnlnews").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(5d * scale)));
views.get("pnlnews").vw.setHeight((int)((75d / 100 * height) - ((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(5d * scale))));
views.get("clvnews").vw.setTop((int)(0d));
views.get("clvnews").vw.setHeight((int)((views.get("pnlnews").vw.getHeight()) - (0d)));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setTop((int)((views.get("pnlnews").vw.getTop() + views.get("pnlnews").vw.getHeight())+(10d * scale)));
views.get("pnlaboutus").vw.setLeft((int)(0d));
views.get("pnlaboutus").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("pnlaboutus").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(5d * scale)));
views.get("pnlaboutus").vw.setHeight((int)((110d / 100 * height) - ((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(5d * scale))));
views.get("imgabout").vw.setLeft((int)((1d / 100 * width)));
views.get("imgabout").vw.setWidth((int)((views.get("pnlaboutus").vw.getWidth())-(33d / 100 * width) - ((1d / 100 * width))));
views.get("imgabout").vw.setTop((int)((1d / 100 * height)));
views.get("imgabout").vw.setHeight((int)((views.get("pnlaboutus").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
views.get("label4").vw.setLeft((int)((views.get("imgabout").vw.getLeft() + views.get("imgabout").vw.getWidth())));
views.get("label4").vw.setWidth((int)((views.get("pnlaboutus").vw.getWidth())-(1d / 100 * width) - ((views.get("imgabout").vw.getLeft() + views.get("imgabout").vw.getWidth()))));
views.get("label4").vw.setTop((int)((views.get("imgabout").vw.getTop() + views.get("imgabout").vw.getHeight()/2) - (views.get("label4").vw.getHeight())));
views.get("label5").vw.setLeft((int)((views.get("imgabout").vw.getLeft() + views.get("imgabout").vw.getWidth())));
views.get("label5").vw.setWidth((int)((views.get("pnlaboutus").vw.getWidth())-(1d / 100 * width) - ((views.get("imgabout").vw.getLeft() + views.get("imgabout").vw.getWidth()))));
views.get("label5").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
//BA.debugLineNum = 26;BA.debugLine="Label3.Left = 2%x"[landingcontents/General script]
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 27;BA.debugLine="Label3.Top = pnlAboutUs.Bottom + 10dip"[landingcontents/General script]
views.get("label3").vw.setTop((int)((views.get("pnlaboutus").vw.getTop() + views.get("pnlaboutus").vw.getHeight())+(10d * scale)));
//BA.debugLineNum = 28;BA.debugLine="pnlFAQ.SetLeftAndRight(0, pnlMain.Width)"[landingcontents/General script]
views.get("pnlfaq").vw.setLeft((int)(0d));
views.get("pnlfaq").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
//BA.debugLineNum = 29;BA.debugLine="pnlFAQ.SetTopAndBottom(Label3.Bottom + 10dip, pnlMain.Bottom - 1%y)"[landingcontents/General script]
views.get("pnlfaq").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())+(10d * scale)));
views.get("pnlfaq").vw.setHeight((int)((views.get("pnlmain").vw.getTop() + views.get("pnlmain").vw.getHeight())-(1d / 100 * height) - ((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())+(10d * scale))));
//BA.debugLineNum = 31;BA.debugLine="imgTable.SetLeftAndRight(1%x, pnlFAQ.Width - 1%x)"[landingcontents/General script]
views.get("imgtable").vw.setLeft((int)((1d / 100 * width)));
views.get("imgtable").vw.setWidth((int)((views.get("pnlfaq").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 32;BA.debugLine="imgTable.SetTopAndBottom(1%y, pnlFAQ.Height - 1%y)"[landingcontents/General script]
views.get("imgtable").vw.setTop((int)((1d / 100 * height)));
views.get("imgtable").vw.setHeight((int)((views.get("pnlfaq").vw.getHeight())-(1d / 100 * height) - ((1d / 100 * height))));
//BA.debugLineNum = 33;BA.debugLine="lblQ1.Top = 3%y"[landingcontents/General script]
views.get("lblq1").vw.setTop((int)((3d / 100 * height)));
//BA.debugLineNum = 34;BA.debugLine="lblQ1.SetLeftAndRight(3%x, imgTable.Width - 2%x)"[landingcontents/General script]
views.get("lblq1").vw.setLeft((int)((3d / 100 * width)));
views.get("lblq1").vw.setWidth((int)((views.get("imgtable").vw.getWidth())-(2d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="lblQ2.Top = lblQ1.Bottom + 12dip"[landingcontents/General script]
views.get("lblq2").vw.setTop((int)((views.get("lblq1").vw.getTop() + views.get("lblq1").vw.getHeight())+(12d * scale)));
//BA.debugLineNum = 37;BA.debugLine="lblQ2.SetLeftAndRight(3%x, imgTable.Width - 2%x)"[landingcontents/General script]
views.get("lblq2").vw.setLeft((int)((3d / 100 * width)));
views.get("lblq2").vw.setWidth((int)((views.get("imgtable").vw.getWidth())-(2d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 39;BA.debugLine="lblQ3.Top = lblQ2.Bottom + 12dip"[landingcontents/General script]
views.get("lblq3").vw.setTop((int)((views.get("lblq2").vw.getTop() + views.get("lblq2").vw.getHeight())+(12d * scale)));
//BA.debugLineNum = 40;BA.debugLine="lblQ3.SetLeftAndRight(3%x, imgTable.Width - 2%x)"[landingcontents/General script]
views.get("lblq3").vw.setLeft((int)((3d / 100 * width)));
views.get("lblq3").vw.setWidth((int)((views.get("imgtable").vw.getWidth())-(2d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 42;BA.debugLine="lblQ4.Top = lblQ3.Bottom + 12dip"[landingcontents/General script]
views.get("lblq4").vw.setTop((int)((views.get("lblq3").vw.getTop() + views.get("lblq3").vw.getHeight())+(12d * scale)));
//BA.debugLineNum = 43;BA.debugLine="lblQ4.SetLeftAndRight(3%x, imgTable.Width - 2%x)"[landingcontents/General script]
views.get("lblq4").vw.setLeft((int)((3d / 100 * width)));
views.get("lblq4").vw.setWidth((int)((views.get("imgtable").vw.getWidth())-(2d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 45;BA.debugLine="lblViewAll.Top = lblQ4.Bottom + 8dip"[landingcontents/General script]
views.get("lblviewall").vw.setTop((int)((views.get("lblq4").vw.getTop() + views.get("lblq4").vw.getHeight())+(8d * scale)));
//BA.debugLineNum = 46;BA.debugLine="lblViewAll.SetLeftAndRight(3%x, imgTable.Width-1%x)"[landingcontents/General script]
views.get("lblviewall").vw.setLeft((int)((3d / 100 * width)));
views.get("lblviewall").vw.setWidth((int)((views.get("imgtable").vw.getWidth())-(1d / 100 * width) - ((3d / 100 * width))));

}
}