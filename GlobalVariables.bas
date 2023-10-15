B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=12.2
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	Public RTP As RuntimePermissions
	Public PriColor1 = 0xFF1E4369 As Double
	Public PriColor2 = 0xFF2A91C3 As Double
	Public PriColor3 = 0xFFF3FDFF As Double
End Sub

Public Sub SetSmallDisplay
	Dim r As Reflector
	r.Target = r.RunStaticMethod("android.util.DisplayMetrics", "getSystem", Null, Null)
	r.RunMethod("setToDefaults")
	r.RunMethod2("setDensity", 480, "java.lang.float")
	r.RunMethod2("setScaledDensity", 480 / 160, "java.lang.float")
	r.RunMethod2("setDensityDpi", 480, "java.lang.int")
End Sub

Public Sub FontBit (icon As String, font_size As Float, color As Int, awesome As Boolean) As Bitmap
	'''''''''''''''''''''''''''''''''''Fontawesome to bitmap
	If color = 0 Then color = Colors.White
	Dim typ As Typeface = Typeface.MATERIALICONS
	If awesome Then typ = Typeface.FONTAWESOME
	Dim bmp As Bitmap
	bmp.InitializeMutable(32dip, 32dip)
	Dim cvs As Canvas
	cvs.Initialize2(bmp)
	Dim h As Double
	If Not(awesome) Then
		h = cvs.MeasureStringHeight(icon, typ, font_size) + 10dip
	Else
		h = cvs.MeasureStringHeight(icon, typ, font_size)
	End If
	cvs.DrawText(icon, bmp.Width / 2, bmp.Height / 2 + h / 2, typ, font_size, color, "CENTER")
	Return bmp
End Sub
