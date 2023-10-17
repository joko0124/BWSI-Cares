package com.bwsi.cares.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("pnlheader").vw.setLeft((int)(0d));
views.get("pnlheader").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("pnlheader").vw.setTop((int)(0d));
views.get("pnlheader").vw.setHeight((int)((40d / 100 * height) - (0d)));
views.get("pnllogin").vw.setLeft((int)((50d / 100 * width) - (views.get("pnllogin").vw.getWidth() / 2)));
views.get("pnllogin").vw.setTop((int)((views.get("pnlheader").vw.getHeight())/2d+(25d * scale)));
views.get("pnllogin").vw.setHeight((int)((73d / 100 * height) - ((views.get("pnlheader").vw.getHeight())/2d+(25d * scale))));
views.get("btnlogin").vw.setLeft((int)((views.get("pnllogin").vw.getLeft() + views.get("pnllogin").vw.getWidth()/2) - (views.get("btnlogin").vw.getWidth() / 2)));
views.get("btnlogin").vw.setTop((int)((views.get("pnllogin").vw.getTop() + views.get("pnllogin").vw.getHeight()) - (views.get("btnlogin").vw.getHeight() / 2)));
views.get("lbllogin").vw.setLeft((int)((10d / 100 * width)));
views.get("lbllogin").vw.setTop((int)((2d / 100 * height)));
views.get("lblloginstyle").vw.setTop((int)((views.get("lbllogin").vw.getTop() + views.get("lbllogin").vw.getHeight())+(5d * scale)));
views.get("lblloginstyle").vw.setLeft((int)((views.get("lbllogin").vw.getLeft() + views.get("lbllogin").vw.getWidth()/2) - (views.get("lblloginstyle").vw.getWidth() / 2)));
views.get("btnregister").vw.setLeft((int)((views.get("pnllogin").vw.getWidth())-(10d / 100 * width) - (views.get("btnregister").vw.getWidth())));
views.get("btnregister").vw.setTop((int)((2d / 100 * height)));
views.get("emailanchor").vw.setTop((int)((14d / 100 * height)));
views.get("emailanchor").vw.setHeight((int)((22d / 100 * height) - ((14d / 100 * height))));
views.get("emailanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("emailanchor").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("lblloginemail").vw.setLeft((int)((2d / 100 * width)));
views.get("lblloginemail").vw.setTop((int)((views.get("emailanchor").vw.getHeight())/2d - (views.get("lblloginemail").vw.getHeight() / 2)));
views.get("txtloginemail").vw.setLeft((int)((views.get("lblloginemail").vw.getLeft() + views.get("lblloginemail").vw.getWidth())));
views.get("txtloginemail").vw.setWidth((int)((views.get("emailanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("lblloginemail").vw.getLeft() + views.get("lblloginemail").vw.getWidth()))));
views.get("txtloginemail").vw.setTop((int)((0.25d / 100 * height)));
views.get("txtloginemail").vw.setHeight((int)((views.get("emailanchor").vw.getHeight())-(0.25d / 100 * height) - ((0.25d / 100 * height))));
views.get("passwordanchor").vw.setTop((int)((25d / 100 * height)));
views.get("passwordanchor").vw.setHeight((int)((33d / 100 * height) - ((25d / 100 * height))));
views.get("passwordanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("passwordanchor").vw.setWidth((int)((views.get("pnllogin").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
views.get("lblloginpassword").vw.setLeft((int)((2d / 100 * width)));
views.get("lblloginpassword").vw.setTop((int)((views.get("passwordanchor").vw.getHeight())/2d - (views.get("lblloginpassword").vw.getHeight() / 2)));
views.get("txtloginpassword").vw.setLeft((int)((views.get("lblloginpassword").vw.getLeft() + views.get("lblloginpassword").vw.getWidth())));
views.get("txtloginpassword").vw.setWidth((int)((views.get("passwordanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("lblloginpassword").vw.getLeft() + views.get("lblloginpassword").vw.getWidth()))));
views.get("txtloginpassword").vw.setTop((int)((0.25d / 100 * height)));
views.get("txtloginpassword").vw.setHeight((int)((views.get("passwordanchor").vw.getHeight())-(0.25d / 100 * height) - ((0.25d / 100 * height))));
views.get("lblcheck").vw.setLeft((int)((views.get("passwordanchor").vw.getLeft())+(5d * scale)));
views.get("chkremember").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(15d * scale)));
views.get("chkremember").vw.setLeft((int)((views.get("lblcheck").vw.getLeft())-(1d * scale)));
views.get("lblcheck").vw.setTop((int)((views.get("chkremember").vw.getTop() + views.get("chkremember").vw.getHeight()/2) - (views.get("lblcheck").vw.getHeight() / 2)));
views.get("lblforgotpassword").vw.setTop((int)((views.get("passwordanchor").vw.getTop() + views.get("passwordanchor").vw.getHeight())+(15d * scale)));
views.get("pnlfb").vw.setLeft((int)((20d / 100 * width)));
views.get("pnlfb").vw.setWidth((int)((45d / 100 * width) - ((20d / 100 * width))));
views.get("lblfblogo").vw.setLeft((int)((1d / 100 * width)));
views.get("lblfblogo").vw.setTop((int)((views.get("pnlfb").vw.getHeight())/2d - (views.get("lblfblogo").vw.getHeight() / 2)));
views.get("lblfb").vw.setLeft((int)((views.get("lblfblogo").vw.getLeft() + views.get("lblfblogo").vw.getWidth())));
views.get("lblfb").vw.setWidth((int)((views.get("pnlfb").vw.getWidth()) - ((views.get("lblfblogo").vw.getLeft() + views.get("lblfblogo").vw.getWidth()))));
views.get("lblfb").vw.setTop((int)(0d));
views.get("lblfb").vw.setHeight((int)((views.get("pnlfb").vw.getHeight()) - (0d)));
views.get("pnlgoogle").vw.setLeft((int)((55d / 100 * width)));
views.get("pnlgoogle").vw.setWidth((int)((80d / 100 * width) - ((55d / 100 * width))));
views.get("lblgooglepluslogo").vw.setLeft((int)((2d / 100 * width)));
views.get("lblgooglepluslogo").vw.setTop((int)((views.get("pnlgoogle").vw.getHeight())/2d - (views.get("lblgooglepluslogo").vw.getHeight() / 2)));
views.get("lblgoogle").vw.setLeft((int)((views.get("lblgooglepluslogo").vw.getLeft() + views.get("lblgooglepluslogo").vw.getWidth())));
views.get("lblgoogle").vw.setWidth((int)((views.get("pnlgoogle").vw.getWidth()) - ((views.get("lblgooglepluslogo").vw.getLeft() + views.get("lblgooglepluslogo").vw.getWidth()))));
views.get("lblgoogle").vw.setTop((int)(0d));
views.get("lblgoogle").vw.setHeight((int)((views.get("pnlgoogle").vw.getHeight()) - (0d)));
views.get("pnlregister").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlregister").vw.getWidth() / 2)));
views.get("pnlregister").vw.setTop((int)((views.get("pnlheader").vw.getHeight())/2d+(25d * scale)));
views.get("pnlregister").vw.setHeight((int)((79d / 100 * height) - ((views.get("pnlheader").vw.getHeight())/2d+(25d * scale))));
views.get("btnreg").vw.setLeft((int)((views.get("pnlregister").vw.getLeft() + views.get("pnlregister").vw.getWidth()/2) - (views.get("btnreg").vw.getWidth() / 2)));
views.get("btnreg").vw.setTop((int)((views.get("pnlregister").vw.getTop() + views.get("pnlregister").vw.getHeight()) - (views.get("btnreg").vw.getHeight() / 2)));
//BA.debugLineNum = 56;BA.debugLine="REGlblLogin.Left = 10%x"[Login/General script]
views.get("reglbllogin").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 57;BA.debugLine="REGlblLogin.Top = 2%y"[Login/General script]
views.get("reglbllogin").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 58;BA.debugLine="REGbtnRegister.Right = pnlLogin.Width - 10%x"[Login/General script]
views.get("regbtnregister").vw.setLeft((int)((views.get("pnllogin").vw.getWidth())-(10d / 100 * width) - (views.get("regbtnregister").vw.getWidth())));
//BA.debugLineNum = 59;BA.debugLine="REGbtnRegister.Top = 2%y"[Login/General script]
views.get("regbtnregister").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 60;BA.debugLine="lblRegisterStyle.Top = REGbtnRegister.Bottom + 5dip"[Login/General script]
views.get("lblregisterstyle").vw.setTop((int)((views.get("regbtnregister").vw.getTop() + views.get("regbtnregister").vw.getHeight())+(5d * scale)));
//BA.debugLineNum = 61;BA.debugLine="lblRegisterStyle.HorizontalCenter = REGbtnRegister.HorizontalCenter"[Login/General script]
views.get("lblregisterstyle").vw.setLeft((int)((views.get("regbtnregister").vw.getLeft() + views.get("regbtnregister").vw.getWidth()/2) - (views.get("lblregisterstyle").vw.getWidth() / 2)));
//BA.debugLineNum = 63;BA.debugLine="RegEmailAnchor.SetTopAndBottom(11%y,19%y)"[Login/General script]
views.get("regemailanchor").vw.setTop((int)((11d / 100 * height)));
views.get("regemailanchor").vw.setHeight((int)((19d / 100 * height) - ((11d / 100 * height))));
//BA.debugLineNum = 64;BA.debugLine="RegEmailAnchor.SetLeftAndRight(5%x, pnlRegister.Width - 5%x)"[Login/General script]
views.get("regemailanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("regemailanchor").vw.setWidth((int)((views.get("pnlregister").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 65;BA.debugLine="lblRegEmailIcon.Left = 2%x"[Login/General script]
views.get("lblregemailicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 66;BA.debugLine="lblRegEmailIcon.VerticalCenter = RegEmailAnchor.Height / 2"[Login/General script]
views.get("lblregemailicon").vw.setTop((int)((views.get("regemailanchor").vw.getHeight())/2d - (views.get("lblregemailicon").vw.getHeight() / 2)));
//BA.debugLineNum = 67;BA.debugLine="txtRegEmail.SetLeftAndRight(lblLoginEmail.Right, RegEmailAnchor.Width - 3%x)"[Login/General script]
views.get("txtregemail").vw.setLeft((int)((views.get("lblloginemail").vw.getLeft() + views.get("lblloginemail").vw.getWidth())));
views.get("txtregemail").vw.setWidth((int)((views.get("regemailanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("lblloginemail").vw.getLeft() + views.get("lblloginemail").vw.getWidth()))));
//BA.debugLineNum = 68;BA.debugLine="txtRegEmail.SetTopAndBottom(0.25%y, RegEmailAnchor.Height - 0.25%y)"[Login/General script]
views.get("txtregemail").vw.setTop((int)((0.25d / 100 * height)));
views.get("txtregemail").vw.setHeight((int)((views.get("regemailanchor").vw.getHeight())-(0.25d / 100 * height) - ((0.25d / 100 * height))));
//BA.debugLineNum = 70;BA.debugLine="RegFullNameAnchor.Height = RegEmailAnchor.Height"[Login/General script]
views.get("regfullnameanchor").vw.setHeight((int)((views.get("regemailanchor").vw.getHeight())));
//BA.debugLineNum = 71;BA.debugLine="RegFullNameAnchor.Top = RegEmailAnchor.Bottom + 8dip"[Login/General script]
views.get("regfullnameanchor").vw.setTop((int)((views.get("regemailanchor").vw.getTop() + views.get("regemailanchor").vw.getHeight())+(8d * scale)));
//BA.debugLineNum = 72;BA.debugLine="RegFullNameAnchor.SetLeftAndRight(5%x, pnlRegister.Width - 5%x)"[Login/General script]
views.get("regfullnameanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("regfullnameanchor").vw.setWidth((int)((views.get("pnlregister").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 73;BA.debugLine="lblRegFullNameIcon.Left = 2%x"[Login/General script]
views.get("lblregfullnameicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 74;BA.debugLine="lblRegFullNameIcon.VerticalCenter = RegFullNameAnchor.Height / 2"[Login/General script]
views.get("lblregfullnameicon").vw.setTop((int)((views.get("regfullnameanchor").vw.getHeight())/2d - (views.get("lblregfullnameicon").vw.getHeight() / 2)));
//BA.debugLineNum = 75;BA.debugLine="txtRegFullName.SetLeftAndRight(lblRegFullNameIcon.Right, RegFullNameAnchor.Width - 3%x)"[Login/General script]
views.get("txtregfullname").vw.setLeft((int)((views.get("lblregfullnameicon").vw.getLeft() + views.get("lblregfullnameicon").vw.getWidth())));
views.get("txtregfullname").vw.setWidth((int)((views.get("regfullnameanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("lblregfullnameicon").vw.getLeft() + views.get("lblregfullnameicon").vw.getWidth()))));
//BA.debugLineNum = 76;BA.debugLine="txtRegFullName.SetTopAndBottom(0.25%y, RegFullNameAnchor.Height - 0.25%y)"[Login/General script]
views.get("txtregfullname").vw.setTop((int)((0.25d / 100 * height)));
views.get("txtregfullname").vw.setHeight((int)((views.get("regfullnameanchor").vw.getHeight())-(0.25d / 100 * height) - ((0.25d / 100 * height))));
//BA.debugLineNum = 78;BA.debugLine="RegPasswordAnchor.Height = RegFullNameAnchor.Height"[Login/General script]
views.get("regpasswordanchor").vw.setHeight((int)((views.get("regfullnameanchor").vw.getHeight())));
//BA.debugLineNum = 79;BA.debugLine="RegPasswordAnchor.Top = RegFullNameAnchor.Bottom + 8dip"[Login/General script]
views.get("regpasswordanchor").vw.setTop((int)((views.get("regfullnameanchor").vw.getTop() + views.get("regfullnameanchor").vw.getHeight())+(8d * scale)));
//BA.debugLineNum = 80;BA.debugLine="RegPasswordAnchor.SetLeftAndRight(5%x, pnlRegister.Width - 5%x)"[Login/General script]
views.get("regpasswordanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("regpasswordanchor").vw.setWidth((int)((views.get("pnlregister").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 81;BA.debugLine="lblRegPasswordIcon.Left = 2%x"[Login/General script]
views.get("lblregpasswordicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 82;BA.debugLine="lblRegPasswordIcon.VerticalCenter = RegPasswordAnchor.Height / 2"[Login/General script]
views.get("lblregpasswordicon").vw.setTop((int)((views.get("regpasswordanchor").vw.getHeight())/2d - (views.get("lblregpasswordicon").vw.getHeight() / 2)));
//BA.debugLineNum = 83;BA.debugLine="txtRegPassword.SetLeftAndRight(lblRegPasswordIcon.Right, RegPasswordAnchor.Width - 3%x)"[Login/General script]
views.get("txtregpassword").vw.setLeft((int)((views.get("lblregpasswordicon").vw.getLeft() + views.get("lblregpasswordicon").vw.getWidth())));
views.get("txtregpassword").vw.setWidth((int)((views.get("regpasswordanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("lblregpasswordicon").vw.getLeft() + views.get("lblregpasswordicon").vw.getWidth()))));
//BA.debugLineNum = 84;BA.debugLine="txtRegPassword.SetTopAndBottom(0.25%y, RegPasswordAnchor.Height - 0.25%y)"[Login/General script]
views.get("txtregpassword").vw.setTop((int)((0.25d / 100 * height)));
views.get("txtregpassword").vw.setHeight((int)((views.get("regpasswordanchor").vw.getHeight())-(0.25d / 100 * height) - ((0.25d / 100 * height))));
//BA.debugLineNum = 86;BA.debugLine="RegConfirmPasswordAnchor.Height = RegPasswordAnchor.Height"[Login/General script]
views.get("regconfirmpasswordanchor").vw.setHeight((int)((views.get("regpasswordanchor").vw.getHeight())));
//BA.debugLineNum = 87;BA.debugLine="RegConfirmPasswordAnchor.Top = RegPasswordAnchor.Bottom + 8dip"[Login/General script]
views.get("regconfirmpasswordanchor").vw.setTop((int)((views.get("regpasswordanchor").vw.getTop() + views.get("regpasswordanchor").vw.getHeight())+(8d * scale)));
//BA.debugLineNum = 88;BA.debugLine="RegConfirmPasswordAnchor.SetLeftAndRight(5%x, pnlRegister.Width - 5%x)"[Login/General script]
views.get("regconfirmpasswordanchor").vw.setLeft((int)((5d / 100 * width)));
views.get("regconfirmpasswordanchor").vw.setWidth((int)((views.get("pnlregister").vw.getWidth())-(5d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 89;BA.debugLine="lblRegConfirmPasswordIcon.Left = 2%x"[Login/General script]
views.get("lblregconfirmpasswordicon").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 90;BA.debugLine="lblRegConfirmPasswordIcon.VerticalCenter = RegConfirmPasswordAnchor.Height / 2"[Login/General script]
views.get("lblregconfirmpasswordicon").vw.setTop((int)((views.get("regconfirmpasswordanchor").vw.getHeight())/2d - (views.get("lblregconfirmpasswordicon").vw.getHeight() / 2)));
//BA.debugLineNum = 91;BA.debugLine="txtRegConfirmPassword.SetLeftAndRight(lblRegConfirmPasswordIcon.Right, RegConfirmPasswordAnchor.Width - 3%x)"[Login/General script]
views.get("txtregconfirmpassword").vw.setLeft((int)((views.get("lblregconfirmpasswordicon").vw.getLeft() + views.get("lblregconfirmpasswordicon").vw.getWidth())));
views.get("txtregconfirmpassword").vw.setWidth((int)((views.get("regconfirmpasswordanchor").vw.getWidth())-(3d / 100 * width) - ((views.get("lblregconfirmpasswordicon").vw.getLeft() + views.get("lblregconfirmpasswordicon").vw.getWidth()))));
//BA.debugLineNum = 92;BA.debugLine="txtRegConfirmPassword.SetTopAndBottom(0.25%y, RegConfirmPasswordAnchor.Height - 0.25%y)"[Login/General script]
views.get("txtregconfirmpassword").vw.setTop((int)((0.25d / 100 * height)));
views.get("txtregconfirmpassword").vw.setHeight((int)((views.get("regconfirmpasswordanchor").vw.getHeight())-(0.25d / 100 * height) - ((0.25d / 100 * height))));

}
}