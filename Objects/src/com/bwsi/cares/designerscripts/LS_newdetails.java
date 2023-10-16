package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_newdetails{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlmain").vw.setWidth((int)((100d / 100 * width)));
views.get("pnlmain").vw.setHeight((int)((100d / 100 * height)));
views.get("back").vw.setWidth((int)((12d / 100 * width)));
views.get("back").vw.setHeight((int)((views.get("back").vw.getWidth())));
views.get("back").vw.setTop((int)((2d / 100 * height)));
views.get("back").vw.setLeft((int)((4d / 100 * width)));
views.get("imgnews").vw.setWidth((int)((90d / 100 * width)));
views.get("imgnews").vw.setHeight((int)((50d / 100 * height)));
views.get("imgnews").vw.setTop((int)((1d / 100 * height)));
views.get("imgnews").vw.setLeft((int)((50d / 100 * width) - (views.get("imgnews").vw.getWidth() / 2)));
views.get("panel2").vw.setLeft((int)((views.get("imgnews").vw.getLeft())));
views.get("panel2").vw.setWidth((int)((views.get("imgnews").vw.getLeft() + views.get("imgnews").vw.getWidth()) - ((views.get("imgnews").vw.getLeft()))));
views.get("panel2").vw.setTop((int)((views.get("imgnews").vw.getTop())));
views.get("panel2").vw.setHeight((int)((views.get("imgnews").vw.getTop() + views.get("imgnews").vw.getHeight()) - ((views.get("imgnews").vw.getTop()))));
views.get("threedot_btn").vw.setWidth((int)((12d / 100 * width)));
views.get("threedot_btn").vw.setHeight((int)((views.get("threedot_btn").vw.getWidth())));
views.get("threedot_btn").vw.setTop((int)((2d / 100 * height)));
views.get("threedot_btn").vw.setLeft((int)((views.get("panel2").vw.getWidth())-(4d / 100 * width) - (views.get("threedot_btn").vw.getWidth())));
views.get("lblnewstitle").vw.setWidth((int)((views.get("imgnews").vw.getWidth())-(8d / 100 * width)));
views.get("lblnewstitle").vw.setHeight((int)((7.5d / 100 * height)));
views.get("lblnewstitle").vw.setLeft((int)((4d / 100 * width)));
views.get("lblnewstitle").vw.setTop((int)((35d / 100 * height)));
views.get("lblauthor").vw.setWidth((int)((40d / 100 * width)));
views.get("lblauthor").vw.setLeft((int)((views.get("lblnewstitle").vw.getLeft())+(2d / 100 * width)));
views.get("lblauthor").vw.setTop((int)((views.get("lblnewstitle").vw.getTop() + views.get("lblnewstitle").vw.getHeight())));
views.get("lbldatepublished").vw.setWidth((int)((40d / 100 * width)));
views.get("lbldatepublished").vw.setLeft((int)((views.get("lblauthor").vw.getLeft())));
views.get("lbldatepublished").vw.setTop((int)((views.get("lblauthor").vw.getTop() + views.get("lblauthor").vw.getHeight())));
views.get("about").vw.setLeft((int)((5d / 100 * width)));
views.get("about").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("about").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())));
views.get("about").vw.setHeight((int)((56d / 100 * height) - ((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight()))));
views.get("newsdescview").vw.setTop((int)((views.get("about").vw.getTop() + views.get("about").vw.getHeight())+(10d * scale)));
views.get("newsdescview").vw.setHeight((int)((90d / 100 * height) - ((views.get("about").vw.getTop() + views.get("about").vw.getHeight())+(10d * scale))));
views.get("newsdescview").vw.setLeft((int)((views.get("about").vw.getLeft())));
views.get("newsdescview").vw.setWidth((int)((95d / 100 * width) - ((views.get("about").vw.getLeft()))));
views.get("pnlreader").vw.setLeft((int)((5d / 100 * width)));
views.get("pnlreader").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("pnlreader").vw.setTop((int)((91d / 100 * height)));
views.get("pnlreader").vw.setHeight((int)((99d / 100 * height) - ((91d / 100 * height))));
views.get("person1_img").vw.setHeight((int)((6d / 100 * height)));
views.get("person1_img").vw.setWidth((int)((views.get("person1_img").vw.getHeight())));
views.get("person1_img").vw.setLeft((int)((2d / 100 * width)));
views.get("person1_img").vw.setTop((int)((views.get("pnlreader").vw.getHeight())/2d - (views.get("person1_img").vw.getHeight() / 2)));
views.get("person2_img").vw.setHeight((int)((views.get("person1_img").vw.getHeight())));
views.get("person2_img").vw.setWidth((int)((views.get("person1_img").vw.getHeight())));
views.get("person2_img").vw.setLeft((int)((8d / 100 * width)));
views.get("person2_img").vw.setTop((int)((views.get("pnlreader").vw.getHeight())/2d - (views.get("person2_img").vw.getHeight() / 2)));
views.get("person3_img").vw.setHeight((int)((views.get("person1_img").vw.getHeight())));
views.get("person3_img").vw.setWidth((int)((views.get("person1_img").vw.getHeight())));
views.get("person3_img").vw.setLeft((int)((14d / 100 * width)));
views.get("person3_img").vw.setTop((int)((views.get("pnlreader").vw.getHeight())/2d - (views.get("person3_img").vw.getHeight() / 2)));
views.get("person4_img").vw.setHeight((int)((views.get("person1_img").vw.getHeight())));
views.get("person4_img").vw.setWidth((int)((views.get("person1_img").vw.getHeight())));
views.get("person4_img").vw.setLeft((int)((20d / 100 * width)));
views.get("person4_img").vw.setTop((int)((views.get("pnlreader").vw.getHeight())/2d - (views.get("person4_img").vw.getHeight() / 2)));
//BA.debugLineNum = 67;BA.debugLine="lblReadBy.SetLeftAndRight(Person4_Img.Right +4%x,45%y)"[NewDetails/General script]
views.get("lblreadby").vw.setLeft((int)((views.get("person4_img").vw.getLeft() + views.get("person4_img").vw.getWidth())+(4d / 100 * width)));
views.get("lblreadby").vw.setWidth((int)((45d / 100 * height) - ((views.get("person4_img").vw.getLeft() + views.get("person4_img").vw.getWidth())+(4d / 100 * width))));
//BA.debugLineNum = 68;BA.debugLine="lblReadBy.Height = 7%y"[NewDetails/General script]
views.get("lblreadby").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 69;BA.debugLine="lblReadBy.VerticalCenter = pnlReader.Height/2"[NewDetails/General script]
views.get("lblreadby").vw.setTop((int)((views.get("pnlreader").vw.getHeight())/2d - (views.get("lblreadby").vw.getHeight() / 2)));
//BA.debugLineNum = 71;BA.debugLine="More_btn.Height = 7%y"[NewDetails/General script]
views.get("more_btn").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 72;BA.debugLine="More_btn.Width = More_btn.Height"[NewDetails/General script]
views.get("more_btn").vw.setWidth((int)((views.get("more_btn").vw.getHeight())));
//BA.debugLineNum = 73;BA.debugLine="More_btn.VerticalCenter = pnlReader.Height/2"[NewDetails/General script]
views.get("more_btn").vw.setTop((int)((views.get("pnlreader").vw.getHeight())/2d - (views.get("more_btn").vw.getHeight() / 2)));
//BA.debugLineNum = 74;BA.debugLine="More_btn.Right = 89%x"[NewDetails/General script]
views.get("more_btn").vw.setLeft((int)((89d / 100 * width) - (views.get("more_btn").vw.getWidth())));
//BA.debugLineNum = 76;BA.debugLine="Rate_Lbl.Width = 18%x"[NewDetails/General script]
views.get("rate_lbl").vw.setWidth((int)((18d / 100 * width)));
//BA.debugLineNum = 77;BA.debugLine="Rate_Lbl.Height = 5%y"[NewDetails/General script]
views.get("rate_lbl").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 78;BA.debugLine="Rate_Lbl.Bottom = Panel2.Height -2%y"[NewDetails/General script]
views.get("rate_lbl").vw.setTop((int)((views.get("panel2").vw.getHeight())-(2d / 100 * height) - (views.get("rate_lbl").vw.getHeight())));
//BA.debugLineNum = 79;BA.debugLine="Rate_Lbl.Right = 86%x"[NewDetails/General script]
views.get("rate_lbl").vw.setLeft((int)((86d / 100 * width) - (views.get("rate_lbl").vw.getWidth())));

}
}