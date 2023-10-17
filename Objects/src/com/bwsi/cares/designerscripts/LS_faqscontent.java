package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_faqscontent{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height)));
views.get("lblgeneralcat").vw.setLeft((int)((2d / 100 * width)));
views.get("lblgeneralcat").vw.setTop((int)((3d / 100 * height)));
views.get("pnlgencat").vw.setLeft((int)(0d));
views.get("pnlgencat").vw.setWidth((int)((views.get("pnlmain").vw.getWidth()) - (0d)));
views.get("clvgeneral").vw.setLeft((int)(0d));
views.get("clvgeneral").vw.setWidth((int)((views.get("pnlgencat").vw.getWidth()) - (0d)));
views.get("pnlgencat").vw.setTop((int)((views.get("lblgeneralcat").vw.getTop() + views.get("lblgeneralcat").vw.getHeight())+(5d * scale)));
views.get("pnlgencat").vw.setHeight((int)((75d / 100 * height) - ((views.get("lblgeneralcat").vw.getTop() + views.get("lblgeneralcat").vw.getHeight())+(5d * scale))));
views.get("clvgeneral").vw.setTop((int)(0d));
views.get("clvgeneral").vw.setHeight((int)((views.get("pnlgencat").vw.getHeight()) - (0d)));

}
}