B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
'Author: Alexander Stolte
'Version: 1.6

'Custom View class 
#DesignerProperty: Key: TypeOfMenu, DisplayName: Menu Type, FieldType: String, DefaultValue: 4 Icon Tabs, List: 4 Icon Tabs|2 Icon Tabs

#DesignerProperty: Key: MiddleButtonVisible, DisplayName: Middle Button Visible, FieldType: Boolean, DefaultValue: True, Description: Hide or Show the middle Button.

#DesignerProperty: Key: EnableMiddleButtonAsPage, DisplayName: Enable Middle Button As Page, FieldType: Boolean, DefaultValue: False, Description: If True the Middle Button is hidden and a 5. Page is Visible at the middle.


#DesignerProperty: Key: SliderColor1, DisplayName: Slider Color 1, FieldType: Color, DefaultValue: 0xFF3498DB, Description: The Color of the Slider 1. The number stands for the page.
#DesignerProperty: Key: SliderColor2, DisplayName: Slider Color 2, FieldType: Color, DefaultValue: 0xFFFF9908, Description: The Color of the Slider 2. The number stands for the page.
#DesignerProperty: Key: SliderColor3, DisplayName: Slider Color 3, FieldType: Color, DefaultValue: 0xFF2ECC71, Description: The Color of the Slider 3. The number stands for the page.
#DesignerProperty: Key: SliderColor4, DisplayName: Slider Color 4, FieldType: Color, DefaultValue: 0xFFFF1493, Description: The Color of the Slider 4. The number stands for the page.

#DesignerProperty: Key: SliderColor5, DisplayName: Slider Color 5, FieldType, FieldType: Color, DefaultValue: 0xFFE74C3C, Description: The Color of the Slider 5. The number stands for the page.

#DesignerProperty: Key: BackgroundColor, DisplayName: Background Color, FieldType: Color, DefaultValue: 0xFF2F343A, Description: The Color of the Background.

#DesignerProperty: Key: PartingLine, DisplayName: Parting Line, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: The Color of the Parting Line on top of the View.

#DesignerProperty: Key: MiddleBackgroundColor, DisplayName: Middle Button Background Color, FieldType: Color, DefaultValue: 0xFF2D8879, Description: The Background Color of the Middle Button.

#DesignerProperty: Key: EnableBadgetColor1, DisplayName: Enable Badget 1, FieldType: Boolean, DefaultValue: False, Description: Enables the Badget.
#DesignerProperty: Key: BadgetColor1, DisplayName: Badget Color 1, FieldType: Color, DefaultValue: 0xFF000000, Description: The Background Color of the 1 Badget. The number stands for the page.
#DesignerProperty: Key: EnableBadgetColor2, DisplayName: Enable Badget 2, FieldType: Boolean, DefaultValue: False, Description: Enables the Badget.
#DesignerProperty: Key: BadgetColor2, DisplayName: Badget Color 2, FieldType: Color, DefaultValue: 0xFF8E44AD, Description: The Background Color of the 2 Badget. The number stands for the page.
#DesignerProperty: Key: EnableBadgetColor3, DisplayName: Enable Badget 3, FieldType: Boolean, DefaultValue: False, Description: Enables the Badget.
#DesignerProperty: Key: BadgetColor3, DisplayName: Badget Color 3, FieldType: Color, DefaultValue: 0xFF4862A3, Description: The Background Color of the 3 Badget. The number stands for the page.
#DesignerProperty: Key: EnableBadgetColor4, DisplayName: Enable Badget 4, FieldType: Boolean, DefaultValue: False, Description: Enables the Badget.
#DesignerProperty: Key: BadgetColor4, DisplayName: Badget Color 4, FieldType: Color, DefaultValue: 0xFF48A34E, Description: The Background Color of the 4 Badget. The number stands for the page.

#DesignerProperty: Key: EnableBadgetColor5, DisplayName: Enable Badget 5, FieldType: Boolean, DefaultValue: False, Description: Enables the Badget.
#DesignerProperty: Key: BadgetColor5, DisplayName: Badget Color 5, FieldType: Color, DefaultValue: 0xFF48A34E, Description: The Background Color of the 5 Badget. The number stands for the page.


#DesignerProperty: Key: PageClickColor, DisplayName: Page Click Color, FieldType: Color, DefaultValue: 0xFF7F8C8D, Description: The Color of Halo Effect during Page Click.

#DesignerProperty: Key: EnableSelectedPageColor, DisplayName: Enable Selected Page Color, FieldType: Boolean, DefaultValue: True, Description: If True then the Icon will change the Color on the current Page.
#DesignerProperty: Key: SelectedPageColor, DisplayName: Selected Page Color, FieldType: Color, DefaultValue: 0xFF27AE61, Description: The Color of the Icon of the current Page.

#DesignerProperty: Key: PartingLinesColor, DisplayName: Parting Lines Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: The Color of Parting Lines.

#DesignerProperty: Key: EnableText, DisplayName: Enable Tab Text, FieldType: Boolean, DefaultValue: False, Description: Enable Tab Names under the icons, the number stands for the Tab number.
#DesignerProperty: Key: TextColor, DisplayName: Text Color, FieldType: Color, DefaultValue: 0xFFFFFFFF, Description: Change the Text Color
#DesignerProperty: Key: Text1, DisplayName: Tab Text 1, FieldType: String, DefaultValue: Home
#DesignerProperty: Key: Text2, DisplayName: Tab Text 2, FieldType: String, DefaultValue: Chats
#DesignerProperty: Key: Text3, DisplayName: Tab Text 3, FieldType: String, DefaultValue: Groups
#DesignerProperty: Key: Text4, DisplayName: Tab Text 4, FieldType: String, DefaultValue: News
#DesignerProperty: Key: Text5, DisplayName: Tab Text 5, FieldType: String, DefaultValue: Settings

#Event: Page1Click
#Event: Page2Click
#Event: Page3Click
#Event: Page4Click
#Event: Page5Click

#Event: MiddleButtonClick
#Event: MiddleButtonLongClick

'noch Hide middle Button Hinzufügen

Sub Class_Globals
	
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As B4XView
	'Private mLbl As B4XView
	Private Const DefaultColorConstant As Int = -984833 'ignore
	
Private currentpage As Int = 1
	
	Private xui As XUI

	Private asbm_page_1,asbm_page_2,asbm_page_3,asbm_page_4,asbm_page_5 As B4XView
	Private asbm_icon_1,asbm_icon_2,asbm_icon_3,asbm_icon_4,asbm_icon_5 As ImageView
	Private asbm_badget_1,asbm_badget_2,asbm_badget_3,asbm_badget_4,asbm_badget_5 As B4XView
	Private asbm_slider As B4XView
	
	Private asbm_text_1,asbm_text_2,asbm_text_3,asbm_text_4,asbm_text_5 As B4XView
	
	Private asbm_partinglines1,asbm_partinglines2,asbm_partinglines3,asbm_partinglines4,asbm_partinglines5 As B4XView
	
	Private asbm_add_background As B4XView
	
	Private asbm_parting_line As B4XView
	
	Private asbm_page_background As B4XView
	
	Private s_Color1 As Int
	Private s_Color2 As Int
	Private s_Color3 As Int
	Private s_Color4 As Int
	Private s_Color5 As Int
	
	Private b_Color As Int	
	
	Private p_Line As Int
	
	Private m_BackgroundColor As Int
	
	Private e_BadgetColor1 As Boolean
	Private e_BadgetColor2 As Boolean
	Private e_BadgetColor3 As Boolean
	Private e_BadgetColor4 As Boolean
	Private e_BadgetColor5 As Boolean
	
	Private b_color1 As Int
	Private b_color2 As Int
	Private b_color3 As Int
	Private b_color4 As Int
	Private b_color5 As Int
	
	Private p_ClickColor As Int
	
	Private p_Lines_Color As Int
	
	Private e_SelectedPageColor As Boolean
	
	Private s_PageColor As Int
	
	Private MiddleButtonVisible As Boolean
	
	Private pnl_asbm_add_icon As ImageView
	
	Private icon1 As B4XBitmap
	Private icon2 As B4XBitmap
	Private icon3 As B4XBitmap
	Private icon4 As B4XBitmap
	Private icon5 As B4XBitmap
	
	Private EnableMiddleButtonAsPage As Boolean
	
	Private middleicon As B4XBitmap
	
	Private TypeOfMenu As String = "4 Icon Tabs"
	
	Private Mode As Int = 1
	
	Private e_text As Boolean
	Private t_color As Int
	Private text_1 As String
	Private text_2 As String
	Private text_3 As String
	Private text_4 As String
	Private text_5 As String
	
End Sub

Private Sub IconTabs4(Props As Map)
	
	EnableMiddleButtonAsPage = Props.Get("EnableMiddleButtonAsPage")
	
	#If B4A or B4I
	Dim pnl_asbm_page_background As Panel
Dim pnl_asbm_parting_line As Panel
	Dim pnl_asbm_add_background As Panel
	#Else If B4J
	Dim pnl_asbm_page_background As Pane
	Dim pnl_asbm_parting_line As Pane
	Dim pnl_asbm_add_background As Pane
	
	#End If
	
	
	
	pnl_asbm_page_background.Initialize("asbm_page_background")
	asbm_page_background = pnl_asbm_page_background
	
	
	
	pnl_asbm_parting_line.Initialize("asbm_parting_line")
	asbm_parting_line = pnl_asbm_parting_line
	
	
	pnl_asbm_add_background.Initialize("asbm_add_background")
	asbm_add_background = pnl_asbm_add_background
	
	
	asbm_add_background.Height = mBase.Height/1.2
	asbm_add_background.Width = mBase.Height/1.2
	
	
	pnl_asbm_add_icon.Initialize("asbm_icon_4")
	
	
	
	#if B4A
		
	pnl_asbm_add_icon.Gravity = Gravity.FILL
	
	#Else If B4I
	
	pnl_asbm_add_icon.ContentMode = pnl_asbm_add_icon.MODE_FILL
	
	
	
	
	#End If
	

	#If B4A or B4I
	
Dim pnl_asbm_page_1 As Panel
	Dim pnl_asbm_page_2 As Panel
	Dim pnl_asbm_page_3 As Panel
		Dim pnl_asbm_page_4 As Panel
	
		Dim pnl_asbm_partinglines1 As Panel
	Dim pnl_asbm_partinglines2 As Panel
	Dim pnl_asbm_partinglines3 As Panel
	Dim pnl_asbm_partinglines4 As Panel
	Dim pnl_asbm_partinglines5 As Panel
	
		If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_page_5 As Panel
		
	End If
	
	#Else If B4J
	Dim pnl_asbm_page_1 As Pane
	Dim pnl_asbm_page_2 As Pane
	Dim pnl_asbm_page_3 As Pane
	Dim pnl_asbm_page_4 As Pane
	
	Dim pnl_asbm_partinglines1 As Pane
	Dim pnl_asbm_partinglines2 As Pane
	Dim pnl_asbm_partinglines3 As Pane
	Dim pnl_asbm_partinglines4 As Pane
	Dim pnl_asbm_partinglines5 As Pane
	
	If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_page_5 As Pane
		
	End If
	
	#End If
	
	Dim lbl_asbm_text_1 As Label
	Dim lbl_asbm_text_2 As Label
	Dim lbl_asbm_text_3 As Label
	Dim lbl_asbm_text_4 As Label
	
	If EnableMiddleButtonAsPage = True Then
		
		Dim lbl_asbm_text_5 As Label
		
	End If
	
	
	pnl_asbm_page_1.Initialize("asbm_page_1")
	asbm_page_1 = pnl_asbm_page_1
	
	lbl_asbm_text_1.Initialize("")
	asbm_text_1 = lbl_asbm_text_1
	
	pnl_asbm_page_2.Initialize("asbm_page_2")
	asbm_page_2 = pnl_asbm_page_2
	
	lbl_asbm_text_2.Initialize("")
	asbm_text_2 = lbl_asbm_text_2
	
	pnl_asbm_page_3.Initialize("asbm_page_3")
	asbm_page_3 = pnl_asbm_page_3
	
	lbl_asbm_text_3.Initialize("")
	asbm_text_3 = lbl_asbm_text_3

	pnl_asbm_page_4.Initialize("asbm_page_4")
	asbm_page_4 = pnl_asbm_page_4
	
	lbl_asbm_text_4.Initialize("")
	asbm_text_4 = lbl_asbm_text_4

	pnl_asbm_partinglines1.Initialize("")
	asbm_partinglines1 = pnl_asbm_partinglines1
	
	pnl_asbm_partinglines2.Initialize("")
	asbm_partinglines2 = pnl_asbm_partinglines2
	
	pnl_asbm_partinglines3.Initialize("")
	asbm_partinglines3 = pnl_asbm_partinglines3
	
	pnl_asbm_partinglines4.Initialize("")
	asbm_partinglines4 = pnl_asbm_partinglines4
	
	pnl_asbm_partinglines5.Initialize("")
	asbm_partinglines5 = pnl_asbm_partinglines5


	If EnableMiddleButtonAsPage = True Then
		
		pnl_asbm_page_5.Initialize("asbm_page_5")
		asbm_page_5 = pnl_asbm_page_5
		
		lbl_asbm_text_5.Initialize("")
		asbm_text_5 = lbl_asbm_text_5
		
	End If


	asbm_icon_1.Initialize("asbm_icon_1")
	
	
	
	#if B4A
		
	asbm_icon_1.Gravity = Gravity.FILL
	
	#Else If B4I
	
	asbm_icon_1.ContentMode = asbm_icon_1.MODE_FILL
	
	#End If
	
	
	asbm_icon_2.Initialize("asbm_icon_2")

		#if B4A
		
	asbm_icon_2.Gravity = Gravity.FILL
	
	#Else If B4I
	
	asbm_icon_2.ContentMode = asbm_icon_2.MODE_FILL
	
	#End If
	
	asbm_icon_3.Initialize("asbm_icon_3")
	
		#if B4A
		
	asbm_icon_3.Gravity = Gravity.FILL
	
	#Else If B4I
	
	asbm_icon_3.ContentMode = asbm_icon_3.MODE_FILL
	
	#End If
	
	
	Dim pnl_asbm_icon_4 As ImageView
	pnl_asbm_icon_4.Initialize("asbm_icon_4")
	
	
	#if B4A
		
	pnl_asbm_icon_4.Gravity = Gravity.FILL
	
	#Else If B4I
	
	pnl_asbm_icon_4.ContentMode = pnl_asbm_icon_4.MODE_FILL
	
	#End If
	
	asbm_icon_4 = pnl_asbm_icon_4

	If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_icon_5 As ImageView
		pnl_asbm_icon_5.Initialize("asbm_icon_5")
	
	
	#if B4A
		
	pnl_asbm_icon_5.Gravity = Gravity.FILL
	
	#Else If B4I
	
	pnl_asbm_icon_5.ContentMode = pnl_asbm_icon_5.MODE_FILL
	
	#End If
	
		asbm_icon_5 = pnl_asbm_icon_5
		
	End If


#If B4A or B4I

	Dim pnl_asbm_slider As Panel
	

#Else If B4J
	Dim pnl_asbm_slider As Pane
#End If


	pnl_asbm_slider.Initialize("asbm_slider")
	asbm_slider = pnl_asbm_slider


	Dim pnl_asbm_badget_1 As Label
	pnl_asbm_badget_1.Initialize("asbm_badget_1")
	asbm_badget_1 = pnl_asbm_badget_1
	asbm_badget_1.Font = xui.CreateDefaultBoldFont(10)
	asbm_badget_1.TextColor = xui.Color_White
	asbm_badget_1.SetTextAlignment("CENTER","CENTER")
	
	
	Dim pnl_asbm_badget_2 As Label
	pnl_asbm_badget_2.Initialize("asbm_badget_2")
	asbm_badget_2 = pnl_asbm_badget_2
	asbm_badget_2.Font = xui.CreateDefaultBoldFont(10)
	asbm_badget_2.TextColor = xui.Color_White
	asbm_badget_2.SetTextAlignment("CENTER","CENTER")
	
	Dim pnl_asbm_badget_3 As Label
	pnl_asbm_badget_3.Initialize("asbm_badget_3")
	asbm_badget_3 = pnl_asbm_badget_3
	asbm_badget_3.Font = xui.CreateDefaultBoldFont(10)
	asbm_badget_3.TextColor = xui.Color_White
	asbm_badget_3.SetTextAlignment("CENTER","CENTER")
	
	Dim pnl_asbm_badget_4 As Label
	pnl_asbm_badget_4.Initialize("asbm_badget_4")
	asbm_badget_4 = pnl_asbm_badget_4
	asbm_badget_4.Font = xui.CreateDefaultBoldFont(10)
	asbm_badget_4.TextColor = xui.Color_White
	asbm_badget_4.SetTextAlignment("CENTER","CENTER")
	
	If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_badget_5 As Label
		pnl_asbm_badget_5.Initialize("asbm_badget_5")
		asbm_badget_5 = pnl_asbm_badget_5
		asbm_badget_5.Font = xui.CreateDefaultBoldFont(10)
		asbm_badget_5.TextColor = xui.Color_White
		asbm_badget_5.SetTextAlignment("CENTER","CENTER")
		
	End If


	s_Color1 = xui.PaintOrColorToColor(Props.Get("SliderColor1"))
	s_Color2 = xui.PaintOrColorToColor(Props.Get("SliderColor2"))
	s_Color3 = xui.PaintOrColorToColor(Props.Get("SliderColor3"))
	s_Color4 = xui.PaintOrColorToColor(Props.Get("SliderColor4"))
	s_Color5 = xui.PaintOrColorToColor(Props.Get("SliderColor5"))
	
	b_Color = xui.PaintOrColorToColor(Props.Get("BackgroundColor"))
	
	p_Line = xui.PaintOrColorToColor(Props.Get("PartingLine"))
	
	m_BackgroundColor = xui.PaintOrColorToColor(Props.Get("MiddleBackgroundColor"))
	
	e_BadgetColor1 = Props.Get("EnableBadgetColor1")
	e_BadgetColor2 = Props.Get("EnableBadgetColor2")
	e_BadgetColor3 = Props.Get("EnableBadgetColor3")
	e_BadgetColor4 = Props.Get("EnableBadgetColor4")
	e_BadgetColor5 = Props.Get("EnableBadgetColor5")
	
	b_color1 = xui.PaintOrColorToColor(Props.Get("BadgetColor1"))
	b_color2 = xui.PaintOrColorToColor(Props.Get("BadgetColor2"))
	b_color3 = xui.PaintOrColorToColor(Props.Get("BadgetColor3"))
	b_color4 = xui.PaintOrColorToColor(Props.Get("BadgetColor4"))
	b_color5 = xui.PaintOrColorToColor(Props.Get("BadgetColor5"))
	
	p_ClickColor = xui.PaintOrColorToColor(Props.Get("PageClickColor"))
	
	p_Lines_Color = xui.PaintOrColorToColor(Props.Get("PartingLinesColor"))
	
	e_SelectedPageColor = Props.Get("EnableSelectedPageColor")
	
	s_PageColor = xui.PaintOrColorToColor(Props.Get("SelectedPageColor"))
	
	MiddleButtonVisible = Props.Get("MiddleButtonVisible")
	

	
	e_text =  Props.Get("EnableText")
	t_color = xui.PaintOrColorToColor(Props.Get("TextColor"))
	text_1 = Props.Get("Text1")
	text_2 = Props.Get("Text2")
	text_3 = Props.Get("Text3")
	text_4 = Props.Get("Text4")
	text_5 = Props.Get("Text5")
	
	
	If EnableMiddleButtonAsPage = True Then
		
		MiddleButtonVisible = False
		
	End If
	
	'Pages
	asbm_page_1.Color = xui.Color_Transparent
	asbm_page_2.Color = xui.Color_Transparent
	asbm_page_3.Color = xui.Color_Transparent
	asbm_page_4.Color = xui.Color_Transparent
	
	If EnableMiddleButtonAsPage = True Then
		
		asbm_page_5.Color = xui.Color_Transparent
		
	End If

	'Slider
	asbm_slider.Height = 2dip
	asbm_slider.Width = 40dip
	asbm_slider.SetColorAndBorder(s_Color1,0,xui.Color_Transparent,asbm_slider.Height/2)

	'Parting Line
	asbm_parting_line.Height = 3dip
	asbm_parting_line.Color = p_Line
	
	'Badget
	asbm_badget_1.Width = 18dip
	asbm_badget_1.Height = 18dip
	asbm_badget_1.SetColorAndBorder(b_color1,0dip,xui.Color_White,asbm_badget_1.Height/2)
	asbm_badget_1.Text = 0
	asbm_badget_1.TextSize = 13
	
	
	asbm_badget_2.Width = 18dip
	asbm_badget_2.Height = 18dip
	asbm_badget_2.SetColorAndBorder(b_color2,0dip,xui.Color_White,asbm_badget_2.Height/2)
	asbm_badget_2.Text = 0
	asbm_badget_2.TextSize = 13
	
	asbm_badget_3.Width = 18dip
	asbm_badget_3.Height = 18dip
	asbm_badget_3.SetColorAndBorder(b_color3,0dip,xui.Color_White,asbm_badget_3.Height/2)
	asbm_badget_3.Text = 0
	asbm_badget_3.TextSize = 13
	
	asbm_badget_4.Width = 18dip
	asbm_badget_4.Height = 18dip
	asbm_badget_4.SetColorAndBorder(b_color4,0dip,xui.Color_White,asbm_badget_4.Height/2)
	asbm_badget_4.Text = 0
	asbm_badget_4.TextSize = 13
	
	'Text
	asbm_text_1.TextColor = t_color
	asbm_text_2.TextColor = t_color
	asbm_text_3.TextColor = t_color
	asbm_text_4.TextColor = t_color
	asbm_text_1.Text = text_1
	asbm_text_2.Text = text_2
	asbm_text_3.Text = text_3
	asbm_text_4.Text = text_4
	
	asbm_text_1.Font = xui.CreateDefaultBoldFont(10)
	asbm_text_2.Font = xui.CreateDefaultBoldFont(10)
	asbm_text_3.Font = xui.CreateDefaultBoldFont(10)
	asbm_text_4.Font = xui.CreateDefaultBoldFont(10)
	asbm_text_1.SetTextAlignment("CENTER","CENTER")
	asbm_text_2.SetTextAlignment("CENTER","CENTER")
	asbm_text_3.SetTextAlignment("CENTER","CENTER")
	asbm_text_4.SetTextAlignment("CENTER","CENTER")
	
	If EnableMiddleButtonAsPage = True Then
		
		asbm_badget_5.Width = 18dip
		asbm_badget_5.Height = 18dip
		asbm_badget_5.SetColorAndBorder(b_color5,0dip,xui.Color_White,asbm_badget_5.Height/2)
		asbm_badget_5.Text = 0
		asbm_badget_5.TextSize = 14
		
		asbm_text_5.Text = text_5
		asbm_text_5.TextColor = t_color
		asbm_text_5.Font = xui.CreateDefaultBoldFont(10)
		asbm_text_5.SetTextAlignment("CENTER","CENTER")
	End If
	
End Sub


Private Sub IconTabs2(Props As Map)
	
	EnableMiddleButtonAsPage = Props.Get("EnableMiddleButtonAsPage")
	
	#If B4A or B4I
	Dim pnl_asbm_page_background As Panel
	Dim pnl_asbm_parting_line As Panel
		Dim pnl_asbm_add_background As Panel
	#Else If B4J
	Dim pnl_asbm_page_background As Pane
	Dim pnl_asbm_parting_line As Pane
	Dim pnl_asbm_add_background As Pane
	
	
	#End If
	
	
	pnl_asbm_page_background.Initialize("asbm_page_background")
	asbm_page_background = pnl_asbm_page_background
	

	pnl_asbm_parting_line.Initialize("asbm_parting_line")
	asbm_parting_line = pnl_asbm_parting_line

	pnl_asbm_add_background.Initialize("asbm_add_background")
	asbm_add_background = pnl_asbm_add_background
	asbm_add_background.Height = mBase.Height/1.2
	asbm_add_background.Width = mBase.Height/1.2
	
	Dim pnl_asbm_add_icon As ImageView
	pnl_asbm_add_icon.Initialize("asbm_icon_4")
	
	
	#if B4A
		
	pnl_asbm_add_icon.Gravity = Gravity.FILL
	
	#Else If B4I
	
	pnl_asbm_add_icon.ContentMode = pnl_asbm_add_icon.MODE_FILL
	
	#End If
	

	#If B4J
	
	Dim pnl_asbm_page_1 As Pane
	Dim pnl_asbm_page_2 As Pane
	
	Dim pnl_asbm_partinglines1 As Pane
	Dim pnl_asbm_partinglines2 As Pane
	Dim pnl_asbm_partinglines3 As Pane
	Dim pnl_asbm_partinglines4 As Pane
	Dim pnl_asbm_partinglines5 As Pane
	
	If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_page_5 As Pane
		
	End If
	
	#Else
	
	Dim pnl_asbm_page_1 As Panel
	Dim pnl_asbm_page_2 As Panel
	
	Dim pnl_asbm_partinglines1 As Panel
	Dim pnl_asbm_partinglines2 As Panel
	Dim pnl_asbm_partinglines3 As Panel
	Dim pnl_asbm_partinglines4 As Panel
	Dim pnl_asbm_partinglines5 As Panel
	
	
	If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_page_5 As Panel
		
	End If
	
	#End If
	
	Dim lbl_asbm_text_1 As Label
	Dim lbl_asbm_text_2 As Label
	
	
	If EnableMiddleButtonAsPage = True Then
		
		Dim lbl_asbm_text_5 As Label
		
	End If
	
	pnl_asbm_page_1.Initialize("asbm_page_1")
	asbm_page_1 = pnl_asbm_page_1	
	
	lbl_asbm_text_1.Initialize("")
	asbm_text_1 = lbl_asbm_text_1
	
	pnl_asbm_page_2.Initialize("asbm_page_2")
	asbm_page_2 = pnl_asbm_page_2
	
	lbl_asbm_text_2.Initialize("")
	asbm_text_2 = lbl_asbm_text_2

	If EnableMiddleButtonAsPage = True Then
		
		pnl_asbm_page_5.Initialize("asbm_page_5")
		asbm_page_5 = pnl_asbm_page_5
		
		lbl_asbm_text_5.Initialize("")
		asbm_text_5 = lbl_asbm_text_5
		
	End If


	pnl_asbm_partinglines1.Initialize("")
	asbm_partinglines1 = pnl_asbm_partinglines1
	
	pnl_asbm_partinglines2.Initialize("")
	asbm_partinglines2 = pnl_asbm_partinglines2
	
	pnl_asbm_partinglines3.Initialize("")
	asbm_partinglines3 = pnl_asbm_partinglines3
	
	pnl_asbm_partinglines4.Initialize("")
	asbm_partinglines4 = pnl_asbm_partinglines4
	
	pnl_asbm_partinglines5.Initialize("")
	asbm_partinglines5 = pnl_asbm_partinglines5

	asbm_partinglines1.Color = p_Lines_Color
	asbm_partinglines2.Color = p_Lines_Color
	asbm_partinglines3.Color = p_Lines_Color
	asbm_partinglines4.Color = p_Lines_Color
	asbm_partinglines5.Color = p_Lines_Color


	asbm_icon_1.Initialize("asbm_icon_1")
	
		#if B4A
		
	asbm_icon_1.Gravity = Gravity.FILL
	
	#Else If B4I
	
	asbm_icon_1.ContentMode = asbm_icon_1.MODE_FILL
	
	#End If

	asbm_icon_2.Initialize("asbm_icon_2")
	
	#if B4A
	
	asbm_icon_2.Gravity = Gravity.FILL
	
	#Else If B4I
	
	asbm_icon_2.ContentMode = asbm_icon_2.MODE_FILL
	
	#End If
	
	asbm_icon_5.Initialize("asbm_icon_5")
	
		#if B4A
	
	asbm_icon_5.Gravity = Gravity.FILL
	
	#Else If B4I
	
	asbm_icon_5.ContentMode = asbm_icon_5.MODE_FILL
	
	#End If

#If B4J
	Dim pnl_asbm_slider As Pane

#Else

Dim pnl_asbm_slider As Panel

#End If

	
	pnl_asbm_slider.Initialize("asbm_slider")
	asbm_slider = pnl_asbm_slider

	Dim pnl_asbm_badget_1 As Label
	pnl_asbm_badget_1.Initialize("asbm_badget_1")
	asbm_badget_1 = pnl_asbm_badget_1
	asbm_badget_1.Font = xui.CreateDefaultBoldFont(10)
	asbm_badget_1.TextColor = xui.Color_White
	asbm_badget_1.SetTextAlignment("CENTER","CENTER")
	

	If EnableMiddleButtonAsPage = True Then
		
		Dim pnl_asbm_badget_5 As Label
		pnl_asbm_badget_5.Initialize("asbm_badget_5")
		asbm_badget_5 = pnl_asbm_badget_5
		asbm_badget_5.Font = xui.CreateDefaultBoldFont(10)
		asbm_badget_5.TextColor = xui.Color_White
		asbm_badget_5.SetTextAlignment("CENTER","CENTER")
		
		
	End If

	Dim pnl_asbm_badget_2 As Label
	pnl_asbm_badget_2.Initialize("asbm_badget_2")
	asbm_badget_2 = pnl_asbm_badget_2
	asbm_badget_2.Font = xui.CreateDefaultBoldFont(10)
	asbm_badget_2.TextColor = xui.Color_White
	asbm_badget_2.SetTextAlignment("CENTER","CENTER")
	

	
	s_Color1 = xui.PaintOrColorToColor(Props.Get("SliderColor1"))
	s_Color2 = xui.PaintOrColorToColor(Props.Get("SliderColor2"))

	s_Color5 = xui.PaintOrColorToColor(Props.Get("SliderColor5"))
	
	b_Color = xui.PaintOrColorToColor(Props.Get("BackgroundColor"))
	
	p_Line = xui.PaintOrColorToColor(Props.Get("PartingLine"))
	
	m_BackgroundColor = xui.PaintOrColorToColor(Props.Get("MiddleBackgroundColor"))
	
	e_BadgetColor1 = Props.Get("EnableBadgetColor1")
	e_BadgetColor2 = Props.Get("EnableBadgetColor2")
	
	e_BadgetColor5 = Props.Get("EnableBadgetColor5")
	
	
	b_color1 = xui.PaintOrColorToColor(Props.Get("BadgetColor1"))
	b_color2 = xui.PaintOrColorToColor(Props.Get("BadgetColor2"))
	
	b_color5 = xui.PaintOrColorToColor(Props.Get("BadgetColor5"))
	
	
	p_ClickColor = xui.PaintOrColorToColor(Props.Get("PageClickColor"))
	
	p_Lines_Color = xui.PaintOrColorToColor(Props.Get("PartingLinesColor"))
	
	e_SelectedPageColor = Props.Get("EnableSelectedPageColor")
	
	s_PageColor = xui.PaintOrColorToColor(Props.Get("SelectedPageColor"))
	
	MiddleButtonVisible = Props.Get("MiddleButtonVisible")
	
	e_text =  Props.Get("EnableText")
	t_color = xui.PaintOrColorToColor(Props.Get("TextColor"))
	text_1 = Props.Get("Text1")
	text_2 = Props.Get("Text2")
	text_3 = Props.Get("Text3")
	text_4 = Props.Get("Text4")
	text_5 = Props.Get("Text5")
	
	If EnableMiddleButtonAsPage = True Then
		
		MiddleButtonVisible = False
		
	End If
	
	
	'Pages
	asbm_page_1.Color = xui.Color_Transparent
	asbm_page_2.Color = xui.Color_Transparent
		
	If EnableMiddleButtonAsPage = True Then
		
		asbm_page_5.Color = xui.Color_Transparent
		
	End If

	'Slider
	asbm_slider.Height = 2dip
	asbm_slider.Width = 40dip
	asbm_slider.SetColorAndBorder(s_Color1,0,xui.Color_Transparent,asbm_slider.Height/2)
	
	
	
	'Parting Line
	asbm_parting_line.Height = 3dip
	asbm_parting_line.Color = p_Line
	

	'Badget
	asbm_badget_1.Width = 18dip
	asbm_badget_1.Height = 18dip
	asbm_badget_1.SetColorAndBorder(b_color1,0dip,xui.Color_White,asbm_badget_1.Height/2)
	asbm_badget_1.Text = 0
	asbm_badget_1.TextSize = 13
	
	'Text
	asbm_text_1.TextColor = t_color
	asbm_text_2.TextColor = t_color
	asbm_text_1.Text = text_1
	asbm_text_2.Text = text_2
	
	asbm_text_1.Font = xui.CreateDefaultBoldFont(10)
	asbm_text_2.Font = xui.CreateDefaultBoldFont(10)
	asbm_text_1.SetTextAlignment("CENTER","CENTER")
	asbm_text_2.SetTextAlignment("CENTER","CENTER")
	
	If EnableMiddleButtonAsPage = True Then
		
		asbm_badget_5.Width = 18dip
		asbm_badget_5.Height = 18dip
		asbm_badget_5.SetColorAndBorder(b_color5,0dip,xui.Color_White,asbm_badget_5.Height/2)
		asbm_badget_5.Text = 0
		asbm_badget_5.TextSize = 13
		asbm_text_5.Text = text_5
		asbm_text_5.Font = xui.CreateDefaultBoldFont(10)
		asbm_text_5.SetTextAlignment("CENTER","CENTER")
		asbm_text_5.TextColor = t_color
	End If
	
	asbm_badget_2.Width = 18dip
	asbm_badget_2.Height = 18dip
	asbm_badget_2.SetColorAndBorder(b_color2,0dip,xui.Color_White,asbm_badget_2.Height/2)
	asbm_badget_2.Text = 0
	asbm_badget_2.TextSize = 13
	
	
End Sub

#Region BaseResize



Private Sub Base_Resize (Width As Double, Height As Double)
	asbm_page_background.Width = Width
	asbm_parting_line.Width = Width
	
	
	asbm_add_background.Left = asbm_page_background.Width / 2 - asbm_add_background.Width /2
	
	

	
	
	If TypeOfMenu = "4 Icon Tabs" Then
		
		If MiddleButtonVisible = True Then
			
			
				asbm_page_1.Width = asbm_add_background.left/2
			
		
		
		Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_1.Width = asbm_page_background.Width/5
				Else
				asbm_page_1.Width = asbm_page_background.Width/4
			End If
		
		
		End If
	
		asbm_page_1.Left = 0
		
		If MiddleButtonVisible = True Then
			
				asbm_page_2.Width = asbm_add_background.left/2
			
			
		Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_2.Width = asbm_page_background.Width/5
				Else
				asbm_page_2.Width = asbm_page_background.Width/4
				
			End If
		
		End If
	
		asbm_page_2.Left = asbm_page_1.Left +	asbm_page_1.Width
	
		If EnableMiddleButtonAsPage = True Then
			
			
				
			asbm_page_5.Width = asbm_page_background.Width/5
				
			asbm_page_5.Left =	asbm_page_2.Left + asbm_page_2.Width
			
			End If
	
	
	
		If MiddleButtonVisible = True Then
			
				asbm_page_3.Width = asbm_add_background.left/2
			asbm_page_3.Left = asbm_add_background.left + asbm_add_background.Width
		
		Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_3.Width = asbm_page_background.Width/5
				
				asbm_page_3.Left = asbm_page_5.left + asbm_page_5.Width
				
				Else
					
				asbm_page_3.Width = asbm_page_background.Width/4
				
				asbm_page_3.Left = asbm_page_2.left + asbm_page_2.Width
				
			End If
			
			
		End If
		

		
		
		
	
		
		
		
		If MiddleButtonVisible = True Then
			
				asbm_page_4.Width = asbm_add_background.left/2
			
			
		Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_4.Width = asbm_page_background.Width/5
				Else
				asbm_page_4.Width = asbm_page_background.Width/4
			End If
			
		End If
	
	
	
			asbm_page_4.Left =	asbm_page_3.Left + asbm_page_3.Width
		

		
		
	else If TypeOfMenu = "2 Icon Tabs" Then
		
		If MiddleButtonVisible = True Then
			
		
			asbm_page_1.Width = asbm_add_background.left
		Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_1.Width = asbm_page_background.Width/3
				Else
				asbm_page_1.Width = asbm_page_background.Width/2
			End If
		
		
		End If
	
	
		If EnableMiddleButtonAsPage = True Then
			
					asbm_page_5.Width = asbm_page_background.Width/3
	
			asbm_page_5.Left = asbm_page_1.left + asbm_page_1.Width
	
		End If
	
	
		If MiddleButtonVisible = True Then
		
			asbm_page_2.Width = asbm_add_background.left
		Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_2.Width = asbm_page_background.Width/3
				Else
				asbm_page_2.Width = asbm_page_background.Width/2
			End If
		
		End If
	
		
		
		If MiddleButtonVisible = True Then
			
			asbm_page_2.Left =	asbm_add_background.left + asbm_add_background.Width
		Else
			
			If EnableMiddleButtonAsPage = True Then
				asbm_page_2.Left =	asbm_page_5.left + asbm_page_5.Width
				Else
				asbm_page_2.Left =  asbm_page_1.Left + asbm_page_1.Width
			End If
			
		
			
		End If
		
		
	
		
	End If
	
	
	asbm_partinglines1.Width = 1dip
	asbm_partinglines1.Color = xui.Color_White
	asbm_partinglines1.Height = asbm_page_background.Height/2
	
	asbm_partinglines2.Width = 1dip
	asbm_partinglines2.Color = xui.Color_White
	asbm_partinglines2.Height = asbm_page_background.Height/2
	
	asbm_partinglines3.Width = 1dip
	asbm_partinglines3.Color = xui.Color_White
	asbm_partinglines3.Height = asbm_page_background.Height/2
	
	asbm_partinglines4.Width = 1dip
	asbm_partinglines4.Color = xui.Color_White
	asbm_partinglines4.Height = asbm_page_background.Height/2
	
	asbm_partinglines5.Width = 1dip
	asbm_partinglines5.Color = xui.Color_White
	asbm_partinglines5.Height = asbm_page_background.Height/2
	
	
	
		
		
		

		

	
	
	
	
	If TypeOfMenu = "4 Icon Tabs" Then
	
		asbm_partinglines1.Left = asbm_page_1.Left + asbm_page_1.Width
		asbm_partinglines1.Top = asbm_page_background.Height / 2 - asbm_partinglines1.Height / 2
			
		asbm_partinglines2.Left = asbm_page_2.Left + asbm_page_2.Width
		asbm_partinglines2.Top = asbm_page_background.Height / 2 - asbm_partinglines2.Height / 2
			
		asbm_partinglines3.Left = asbm_page_3.Left + asbm_page_3.Width
		asbm_partinglines3.Top = asbm_page_background.Height / 2 - asbm_partinglines3.Height / 2
	
		asbm_partinglines4.Left = asbm_page_4.Left + asbm_page_4.Width
		asbm_partinglines4.Top = asbm_page_background.Height / 2 - asbm_partinglines4.Height / 2
		
	

	Dim cx,cy As Int
	cx = asbm_page_1.Left + asbm_page_1.Width/2
	cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
	
	
	
	
		

		
		
	
		asbm_icon_1.Height = asbm_page_background.Height/2.5
		asbm_icon_1.Width = asbm_page_background.Height/2.5
	
		asbm_icon_1.Left = cx - asbm_icon_1.Width/2
		asbm_icon_1.Top = cy - asbm_icon_1.Height/2
	
	
asbm_icon_2.Height = asbm_page_background.Height/2.5
		asbm_icon_2.Width = asbm_page_background.Height/2.5'asbm_icon_2.Height

		asbm_icon_2.Left = cx - asbm_icon_2.Width/2
		asbm_icon_2.Top = cy - asbm_icon_2.Height/2
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_partinglines5.Left = asbm_page_5.Left + asbm_page_5.Width
			asbm_partinglines5.Top = asbm_page_background.Height / 2 - asbm_partinglines5.Height / 2
			
			asbm_icon_5.Height = asbm_page_background.Height/2.5
			asbm_icon_5.Width = asbm_page_background.Height/2.5
	
			asbm_icon_5.Left = cx - asbm_icon_5.Width/2
			asbm_icon_5.Top = cy - asbm_icon_5.Height/2
			
		End If
		
		
		asbm_icon_3.Height = asbm_page_background.Height/2.5
		asbm_icon_3.Width = asbm_page_background.Height/2.5
	
		asbm_icon_3.Left = cx - asbm_icon_3.Width/2
		asbm_icon_3.Top = cy - asbm_icon_3.Height/2
	
	

	
		asbm_icon_4.Left = cx - asbm_icon_4.Width/2
		asbm_icon_4.Top = cy - asbm_icon_4.Height/2
		
		asbm_icon_4.Height = asbm_page_background.Height/2.5
		asbm_icon_4.Width = asbm_page_background.Height/2.5
		
		'text
		
		If e_text = True Then
			
			asbm_icon_1.Top = asbm_icon_1.Top - 5dip
			asbm_icon_2.Top = asbm_icon_2.Top - 5dip
			asbm_icon_3.Top = asbm_icon_3.Top - 5dip
			asbm_icon_4.Top = asbm_icon_4.Top - 5dip
			
			asbm_text_1.Left = 2dip
			asbm_text_1.Width = asbm_page_1.Width - 2dip
			asbm_text_1.Height = asbm_icon_1.Height/2
			
			asbm_text_1.Top = asbm_icon_1.Top + asbm_icon_1.Height
			
			asbm_text_2.Left = 2dip
			asbm_text_2.Width = asbm_page_2.Width - 2dip
			asbm_text_2.Height = asbm_icon_2.Height/2
			
'			asbm_text_2.Top = asbm_slider.Top - asbm_text_2.Height/2 'asbm_icon_2.Top + asbm_icon_2.Height
			
			asbm_text_3.Left = 2dip
			asbm_text_3.Width = asbm_page_3.Width - 2dip
			asbm_text_3.Height = asbm_icon_3.Height/2
			
			asbm_text_3.Top = asbm_icon_3.Top + asbm_icon_3.Height
			
			asbm_text_4.Left = 2dip
			asbm_text_4.Width = asbm_page_4.Width - 2dip
			asbm_text_4.Height = asbm_icon_4.Height/2
			
			asbm_text_4.Top = asbm_icon_4.Top + asbm_icon_4.Height
			
			If EnableMiddleButtonAsPage = True Then
				asbm_icon_5.Top = asbm_icon_5.Top - 5dip
				
				asbm_text_5.Left = 2dip
				asbm_text_5.Width = asbm_page_5.Width - 2dip
				asbm_text_5.Height = asbm_icon_5.Height/2
				
				asbm_text_5.Top = asbm_icon_5.Top + asbm_icon_5.Height
				
			End If
			
			asbm_slider.Top = asbm_text_1.Top + asbm_text_1.Height + 5dip
			
			asbm_icon_1.top = cy - asbm_icon_1.Height/2
			asbm_icon_2.top = cy - asbm_icon_2.Height/2
			asbm_icon_3.top = cy - asbm_icon_3.Height/2
			asbm_icon_4.top = cy - asbm_icon_4.Height/2
			
			
			asbm_text_1.Top = asbm_slider.Top - asbm_text_1.Height/1.4
			asbm_text_2.Top = asbm_slider.Top - asbm_text_2.Height/1.4
			asbm_text_3.Top = asbm_slider.Top - asbm_text_3.Height/1.4
			asbm_text_4.Top = asbm_slider.Top - asbm_text_4.Height/1.4
			
			If EnableMiddleButtonAsPage = True Then
				asbm_icon_5.top = cy - asbm_icon_5.Height/2
				asbm_text_5.Top = asbm_slider.Top - asbm_text_5.Height/1.4
				
			End If
			
			If currentpage = 1 Then
				
				asbm_icon_1.top = cy - asbm_icon_1.Height/2 - 5dip
				
				asbm_text_1.top = asbm_icon_1.Top + asbm_icon_1.Height
				Else If currentpage = 2 Then
				asbm_icon_2.top = cy - asbm_icon_2.Height/2 - 5dip
				asbm_text_2.top = asbm_icon_2.Top + asbm_icon_2.Height
			Else If currentpage = 3 Then
				asbm_icon_3.top = cy - asbm_icon_3.Height/2 - 5dip
				asbm_text_3.top = asbm_icon_3.Top + asbm_icon_3.Height
			Else If currentpage = 4 Then
				asbm_icon_4.top = cy - asbm_icon_4.Height/2 - 5dip
				asbm_text_4.top = asbm_icon_4.Top + asbm_icon_4.Height
			Else If currentpage = 5 Then
				asbm_icon_5.top = cy - asbm_icon_5.Height/2 - 5dip
				asbm_text_5.top = asbm_icon_5.Top + asbm_icon_5.Height
			End If
			
		Else
				
			asbm_slider.Top = asbm_icon_1.Top + asbm_icon_1.Height + 5dip
			
			'asbm_text_2.Top = asbm_slider.Top '- asbm_text_2.Height/2 'asbm_icon_2.Top + asbm_icon_2.Height
			
		End If
		
	else If TypeOfMenu = "2 Icon Tabs" Then
	
		Dim cx,cy As Int
		cx = asbm_page_1.Left + asbm_page_1.Width/2
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
		asbm_partinglines1.Left = asbm_page_1.Left + asbm_page_1.Width
		asbm_partinglines1.Top = asbm_page_background.Height / 2 - asbm_partinglines1.Height / 2
			
		asbm_partinglines2.Left = asbm_page_2.Left + asbm_page_2.Width
		asbm_partinglines2.Top = asbm_page_background.Height / 2 - asbm_partinglines2.Height / 2
			
		
		
		
	
		asbm_icon_1.Height = asbm_page_background.Height/2.5
		asbm_icon_1.Width = asbm_page_background.Height/2.5
	
		asbm_icon_1.Left = cx - asbm_icon_1.Width/2
		asbm_icon_1.Top = cy - asbm_icon_1.Height/2
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_partinglines5.Left = asbm_page_5.Left + asbm_page_5.Width
			asbm_partinglines5.Top = asbm_page_background.Height / 2 - asbm_partinglines5.Height / 2
			
			asbm_icon_5.Height = asbm_page_background.Height/2.5
			asbm_icon_5.Width = asbm_page_background.Height/2.5'asbm_icon_2.Height

			asbm_icon_5.Left = cx - asbm_icon_5.Width/2
			asbm_icon_5.Top = cy - asbm_icon_5.Height/2
			
		End If
	
		asbm_icon_2.Height = asbm_page_background.Height/2.5
		asbm_icon_2.Width = asbm_page_background.Height/2.5'asbm_icon_2.Height

		asbm_icon_2.Left = cx - asbm_icon_2.Width/2
		asbm_icon_2.Top = cy - asbm_icon_2.Height/2
	
	
		'text
		
		If e_text = True Then
			
			asbm_icon_1.Top = asbm_icon_1.Top - 5dip
			asbm_icon_2.Top = asbm_icon_2.Top - 5dip
			
			asbm_text_1.Left = 2dip
			asbm_text_1.Width = asbm_page_1.Width - 2dip
			asbm_text_1.Height = asbm_icon_1.Height/2
			
			asbm_text_1.Top = asbm_icon_1.Top + asbm_icon_1.Height
			
			asbm_text_2.Left = 2dip
			asbm_text_2.Width = asbm_page_2.Width - 2dip
			asbm_text_2.Height = asbm_icon_2.Height/2
			
			asbm_text_2.Top = asbm_icon_2.Top + asbm_icon_2.Height
			
			
			If EnableMiddleButtonAsPage = True Then
				asbm_icon_5.Top = asbm_icon_5.Top - 5dip
				
				asbm_text_5.Left = 2dip
				asbm_text_5.Width = asbm_page_5.Width - 2dip
				asbm_text_5.Height = asbm_icon_5.Height/2
				
				asbm_text_5.Top = asbm_icon_5.Top + asbm_icon_5.Height
				
			End If
			
			asbm_slider.Top = asbm_text_1.Top + asbm_text_1.Height + 5dip
			
			asbm_icon_1.top = cy - asbm_icon_1.Height/2
			asbm_icon_2.top = cy - asbm_icon_2.Height/2
		
			
			
			asbm_text_1.Top = asbm_slider.Top - asbm_text_1.Height/1.4
			asbm_text_2.Top = asbm_slider.Top - asbm_text_2.Height/1.4
			
			
			If EnableMiddleButtonAsPage = True Then
				asbm_icon_5.top = cy - asbm_icon_5.Height/2
				asbm_text_5.Top = asbm_slider.Top - asbm_text_5.Height/1.4
				
			End If
			
			If currentpage = 1 Then
				
				asbm_icon_1.top = cy - asbm_icon_1.Height/2 - 5dip
				
				asbm_text_1.top = asbm_icon_1.Top + asbm_icon_1.Height
			Else If currentpage = 2 Then
				asbm_icon_2.top = cy - asbm_icon_2.Height/2 - 5dip
				asbm_text_2.top = asbm_icon_2.Top + asbm_icon_2.Height
		
			Else If currentpage = 5 Then
				asbm_icon_5.top = cy - asbm_icon_5.Height/2 - 5dip
				asbm_text_5.top = asbm_icon_5.Top + asbm_icon_5.Height
			End If
			
		Else
				
			asbm_slider.Top = asbm_icon_1.Top + asbm_icon_1.Height + 5dip
			
			'asbm_text_2.Top = asbm_slider.Top '- asbm_text_2.Height/2 'asbm_icon_2.Top + asbm_icon_2.Height
			
		End If
	
	End If
	
	If currentpage = 1 Then
		
		
		Dim cx As Int = asbm_page_1.Left + asbm_page_1.Width/2
	
		
		asbm_slider.Left = cx - asbm_slider.Width/2
		
		
	Else If currentpage = 2 Then
		
		Dim cx As Int = asbm_page_2.Left + asbm_page_2.Width/2
		
		asbm_slider.Left =	cx - asbm_slider.Width/2
		
	Else If currentpage = 3 Then
		
		
		Dim cx As Int = asbm_page_3.Left + asbm_page_3.Width/2
	
		
		asbm_slider.Left = cx - asbm_slider.Width/2
		
	Else If currentpage = 4 Then
		
		Dim cx As Int = asbm_page_4.Left + asbm_page_4.Width/2
	
		
		asbm_slider.Left = cx - asbm_slider.Width/2
		
		Else If currentpage = 5 Then
			
		Dim cx As Int = asbm_page_5.Left + asbm_page_5.Width/2
	
		
		asbm_slider.Left = cx - asbm_slider.Width/2
		
		
	End If
	
	
 If TypeOfMenu = "4 Icon Tabs" Then
	
	asbm_badget_1.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
	asbm_badget_2.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
	asbm_badget_3.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
	asbm_badget_4.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
	
	If EnableMiddleButtonAsPage = True Then
		
			asbm_badget_5.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
		
		End If
	
else If TypeOfMenu = "2 Icon Tabs" Then
	
		asbm_badget_1.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
		asbm_badget_2.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_badget_5.Left = asbm_icon_1.Left + asbm_icon_1.Width +1dip
		End If
	
	End If
	
	
End Sub

#End Region

Public Sub Initialize (CallBack As Object, EventName As String)
	mEventName = EventName
	mCallBack = CallBack
End Sub

Public Sub DesignerCreateView (Base As Object, Lbl As Label, Props As Map)
	mBase = Base
	'mLbl = Lbl

		mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,  mBase.Width,  mBase.Height)
	
	
	mBase.Color = xui.Color_Transparent
	
	

	TypeOfMenu =  Props.Get("TypeOfMenu")
	
	If TypeOfMenu = "4 Icon Tabs" Then
		
		Mode = 1
		
		IconTabs4(Props)
	
	
		asbm_page_background.Color = b_Color
	
		mBase.AddView(asbm_page_background,0,mBase.Height/2.5,mBase.Width,mBase.Height)
	
		asbm_page_background.Top = mBase.Height/2.5 'mBase.Height/2.3
		asbm_page_background.Height = mBase.Height - asbm_page_background.Top
	
		mBase.AddView(asbm_parting_line,0,mBase.Height/2.5,mBase.Width,asbm_parting_line.Height)
	
		mBase.AddView(asbm_add_background,mBase.Width / 2 - asbm_add_background.Width /2,0,mBase.Height/1.2,mBase.Height/1.2)
	
	
		asbm_add_background.SetColorAndBorder(m_BackgroundColor,3dip,xui.Color_White,asbm_add_background.Height/2)
	
	
	
		asbm_add_background.AddView(pnl_asbm_add_icon,10dip,10dip,asbm_add_background.Width /2.5,asbm_add_background.Height /2.5)

		pnl_asbm_add_icon.Left = asbm_add_background.Width / 2 - pnl_asbm_add_icon.Width /2
		pnl_asbm_add_icon.Top = asbm_add_background.Height / 2 - pnl_asbm_add_icon.Height / 2

	
		If MiddleButtonVisible = True Then
			
			asbm_page_background.AddView(asbm_page_1,0,3dip,asbm_add_background.left/2,asbm_page_background.Height)
			
			Else
				
			asbm_page_background.AddView(asbm_page_1,0,3dip,asbm_page_background.Width/4,asbm_page_background.Height)
				
		End If
	
		
		
		If MiddleButtonVisible = True Then
		asbm_page_background.AddView(asbm_page_2,asbm_page_1.Width,3dip,asbm_add_background.left/2,asbm_page_background.Height)
	Else
			
			If EnableMiddleButtonAsPage = True Then
				asbm_page_background.AddView(asbm_page_2,asbm_page_1.Width,3dip,asbm_page_background.Width/5,asbm_page_background.Height)
				Else
				asbm_page_background.AddView(asbm_page_2,asbm_page_1.Width,3dip,asbm_page_background.Width/4,asbm_page_background.Height)
			End If
		End If
	
		
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_background.AddView(asbm_page_5,asbm_page_5.Width,3dip,asbm_page_background.Width/5,asbm_page_background.Height)
			
		End If
	
	
		asbm_page_4.Width = asbm_page_background.Height + 5dip
	
		
	
		asbm_page_3.Width = asbm_page_background.Height + 5dip
	
		If MiddleButtonVisible = True Then
		asbm_page_background.AddView(asbm_page_3,asbm_add_background.left + asbm_add_background.Width,3dip,asbm_add_background.left/2,asbm_page_background.Height)
		Else
			
			
			If EnableMiddleButtonAsPage = True Then
				asbm_page_background.AddView(asbm_page_3,asbm_page_5.left + asbm_page_5.Width,3dip,asbm_page_background.Width/4,asbm_page_background.Height)
				Else
				asbm_page_background.AddView(asbm_page_3,asbm_page_2.left + asbm_page_2.Width,3dip,asbm_page_background.Width/4,asbm_page_background.Height)
				End If
			
			End If
		
		If MiddleButtonVisible = True Then
		asbm_page_background.AddView(asbm_page_4,asbm_page_3.Left + asbm_page_3.Width,3dip,asbm_add_background.left/2,asbm_page_background.Height)
		Else
			
			If EnableMiddleButtonAsPage = True Then
				asbm_page_background.AddView(asbm_page_4,asbm_page_3.Left + asbm_page_3.Width,3dip,asbm_page_background.Width/5,asbm_page_background.Height)
			
			Else
				asbm_page_background.AddView(asbm_page_4,asbm_page_3.Left + asbm_page_3.Width,3dip,asbm_page_background.Width/4,asbm_page_background.Height)
				End If
				
			End If
	
		asbm_icon_1.Height = asbm_page_background.Height/2.5
		asbm_icon_1.Width = asbm_page_background.Height/2.5
		
	
		asbm_icon_2.Height = asbm_page_background.Height/2.5
		asbm_icon_2.Width = asbm_page_background.Height/2.5'asbm_icon_2.Height
		
		If EnableMiddleButtonAsPage = True Then
			
			asbm_icon_5.Height = asbm_page_background.Height/2.5
			asbm_icon_5.Width = asbm_page_background.Height/2.5
			
		End If
	
		asbm_icon_3.Height = asbm_page_background.Height/2.5
		asbm_icon_3.Width = asbm_page_background.Height/2.5
	
		asbm_icon_4.Height = asbm_page_background.Height/2.5
		asbm_icon_4.Width = asbm_page_background.Height/2.5
	
	
		Dim cx,cy As Int
		cx = asbm_page_1.Left + asbm_page_1.Width/2
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
		asbm_page_1.AddView(asbm_icon_1,5dip,asbm_page_1.Height / 2 - asbm_icon_1.Height / 2,asbm_icon_1.Height,asbm_icon_1.Height)
	
		asbm_icon_1.Left = cx - asbm_icon_1.Width/2
		asbm_icon_1.Top = cy - asbm_icon_1.Height/2
	
	
		asbm_page_2.AddView(asbm_icon_2,5dip,asbm_page_2.Height / 2 - asbm_icon_2.Height / 2,asbm_icon_2.Height,asbm_icon_2.Height)

		asbm_icon_2.Left = cx - asbm_icon_2.Width/2
		asbm_icon_2.Top = cy - asbm_icon_2.Height/2
	
	If EnableMiddleButtonAsPage = True Then
		
			asbm_page_5.AddView(asbm_icon_5,5dip,asbm_page_5.Height / 2 - asbm_icon_5.Height / 2,asbm_icon_5.Height,asbm_icon_5.Height)
	
			asbm_icon_5.Left = cx - asbm_icon_5.Width/2
			asbm_icon_5.Top = cy - asbm_icon_5.Height/2
		
		End If
	
		asbm_page_3.AddView(asbm_icon_3,5dip,asbm_page_3.Height / 2 - asbm_icon_3.Height / 2,asbm_icon_3.Height,asbm_icon_3.Height)
	
		asbm_icon_3.Left = cx - asbm_icon_3.Width/2
		asbm_icon_3.Top = cy - asbm_icon_3.Height/2
	
	
		asbm_page_4.AddView(asbm_icon_4,5dip,asbm_page_4.Height / 2 - asbm_icon_4.Height / 2,asbm_icon_4.Height,asbm_icon_4.Height)
	
		asbm_icon_4.Left = cx - asbm_icon_4.Width/2
		asbm_icon_4.Top = cy - asbm_icon_4.Height/2

	
		asbm_page_background.AddView(asbm_slider,asbm_page_1.Width / 2 - asbm_slider.Width /2,asbm_icon_1.top + asbm_icon_1.Height + 7,asbm_slider.Width,asbm_slider.Height)
	
		asbm_page_1.AddView(asbm_badget_1,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_1.Top - asbm_badget_1.Height/2,asbm_badget_1.Width,asbm_badget_1.Height)
	
		asbm_page_2.AddView(asbm_badget_2,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_2.Top - asbm_badget_2.Height/2,asbm_badget_2.Width,asbm_badget_2.Height)
	
	If EnableMiddleButtonAsPage = True Then
		
			asbm_page_5.AddView(asbm_badget_5,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_5.Top - asbm_badget_3.Height/2,asbm_badget_5.Width,asbm_badget_5.Height)
		
		End If
	
	
		asbm_page_3.AddView(asbm_badget_3,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_3.Top - asbm_badget_3.Height/2,asbm_badget_3.Width,asbm_badget_3.Height)
	
		asbm_page_4.AddView(asbm_badget_4,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_4.Top - asbm_badget_4.Height/2,asbm_badget_4.Width,asbm_badget_4.Height)
	
	
	
		asbm_badget_1.Visible = e_BadgetColor1
		asbm_badget_2.Visible = e_BadgetColor2
		
		If EnableMiddleButtonAsPage = True Then
			
			asbm_badget_5.Visible = e_BadgetColor5
			
		End If
		
		asbm_badget_3.Visible = e_BadgetColor3
		asbm_badget_4.Visible = e_BadgetColor4
	
	
	If MiddleButtonVisible = True Then
			asbm_add_background.Visible = True
			asbm_add_background.Enabled = True
		
		Else
			asbm_add_background.Visible = False
			asbm_add_background.Enabled = False
		End If
		
		'text
		
		asbm_page_1.AddView(asbm_text_1,0,0,0,0)
		asbm_page_2.AddView(asbm_text_2,0,0,0,0)
		asbm_page_3.AddView(asbm_text_3,0,0,0,0)
		asbm_page_4.AddView(asbm_text_4,0,0,0,0)
		
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_5.AddView(asbm_text_5,0,0,0,0)
			
		End If
	
	else If TypeOfMenu = "2 Icon Tabs" Then
		
		Mode = 2
		
		IconTabs2(Props)
	
	
		asbm_page_background.Color = b_Color
	
		mBase.AddView(asbm_page_background,0,mBase.Height/2.5,mBase.Width,mBase.Height)
	
		asbm_page_background.Top = mBase.Height/2.5 'mBase.Height/2.3
		asbm_page_background.Height = mBase.Height - asbm_page_background.Top
	
		mBase.AddView(asbm_parting_line,0,mBase.Height/2.5,mBase.Width,asbm_parting_line.Height)
	
		mBase.AddView(asbm_add_background,mBase.Width / 2 - asbm_add_background.Width /2,0,mBase.Height/1.2,mBase.Height/1.2)
	
	
		asbm_add_background.SetColorAndBorder(m_BackgroundColor,3dip,xui.Color_White,asbm_add_background.Height/2)
	
	
	
		asbm_add_background.AddView(pnl_asbm_add_icon,10dip,10dip,asbm_add_background.Width /2.5,asbm_add_background.Height /2.5)

		pnl_asbm_add_icon.Left = asbm_add_background.Width / 2 - pnl_asbm_add_icon.Width /2
		pnl_asbm_add_icon.Top = asbm_add_background.Height / 2 - pnl_asbm_add_icon.Height / 2

		If MiddleButtonVisible = True Then
		asbm_page_background.AddView(asbm_page_1,0,3dip,asbm_add_background.left,asbm_page_background.Height)
		Else
			
			asbm_page_background.AddView(asbm_page_1,0,3dip,asbm_page_background.Width/2,asbm_page_background.Height)
		
		End If
		
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_background.AddView(asbm_page_5,asbm_page_1.left + asbm_page_1.Width,3dip,asbm_add_background.Width/2,asbm_page_background.Height)
			
			
		End If
		
		
		If MiddleButtonVisible = True Then
		asbm_page_background.AddView(asbm_page_2,asbm_add_background.left + asbm_add_background.Width,3dip,asbm_add_background.left,asbm_page_background.Height)
	Else
			If EnableMiddleButtonAsPage = True Then
				asbm_page_background.AddView(asbm_page_2,asbm_page_5.left + asbm_page_5.Width,3dip,asbm_add_background.Width/2,asbm_page_background.Height)
				Else
				asbm_page_background.AddView(asbm_page_2,asbm_page_1.left + asbm_page_1.Width,3dip,asbm_add_background.Width/2,asbm_page_background.Height)
			End If
		
		End If
	
		asbm_icon_1.Height = asbm_page_background.Height/2.2
		asbm_icon_1.Width = asbm_icon_1.Height
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_icon_5.Height = asbm_page_background.Height/2.2
			asbm_icon_5.Width = asbm_icon_5.Height
			
		End If
	
		asbm_icon_2.Height = asbm_page_background.Height/2.2
		asbm_icon_2.Width = asbm_icon_2.Height
	

		Dim cx,cy As Int
		cx = asbm_page_1.Left + asbm_page_1.Width/2
		cy = asbm_page_1.Top + asbm_page_1.Height/2.3
	
		asbm_page_1.AddView(asbm_icon_1,5dip,asbm_page_1.Height / 2 - asbm_icon_1.Height / 2,asbm_icon_1.Height,asbm_icon_1.Height)
	
		asbm_icon_1.Left = cx - asbm_icon_1.Width/2
		asbm_icon_1.Top = cy - asbm_icon_1.Height/2
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_5.AddView(asbm_icon_5,5dip,asbm_page_5.Height / 2 - asbm_icon_5.Height / 2,asbm_icon_5.Height,asbm_icon_5.Height)

			asbm_icon_5.Left = cx - asbm_icon_5.Width/2
			asbm_icon_5.Top = cy - asbm_icon_5.Height/2
			
		End If
	
		asbm_page_2.AddView(asbm_icon_2,5dip,asbm_page_2.Height / 2 - asbm_icon_2.Height / 2,asbm_icon_2.Height,asbm_icon_2.Height)

		asbm_icon_2.Left = cx - asbm_icon_2.Width/2
		asbm_icon_2.Top = cy - asbm_icon_2.Height/2
	
	
		
		asbm_page_background.AddView(asbm_slider,asbm_page_1.Width / 2 - asbm_slider.Width /2,asbm_icon_1.top + asbm_icon_1.Height + 7,asbm_slider.Width,asbm_slider.Height)
	
		asbm_page_1.AddView(asbm_badget_1,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_1.Top - asbm_badget_1.Height/2,asbm_badget_1.Width,asbm_badget_1.Height)
	
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_5.AddView(asbm_badget_5,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_5.Top - asbm_badget_5.Height/2,asbm_badget_5.Width,asbm_badget_5.Height)
			
		End If
	
		If EnableMiddleButtonAsPage = True Then
			asbm_page_2.AddView(asbm_badget_2,asbm_icon_5.Left + asbm_icon_5.Width +1dip,asbm_icon_2.Top - asbm_badget_2.Height/2,asbm_badget_2.Width,asbm_badget_2.Height)
			Else
			asbm_page_2.AddView(asbm_badget_2,asbm_icon_1.Left + asbm_icon_1.Width +1dip,asbm_icon_2.Top - asbm_badget_2.Height/2,asbm_badget_2.Width,asbm_badget_2.Height)
		End If
	
		
	
	
		asbm_badget_1.Visible = e_BadgetColor1
		
		If EnableMiddleButtonAsPage = True Then
			asbm_badget_5.Visible = e_BadgetColor5
			
		End If
		
		asbm_badget_2.Visible = e_BadgetColor2
		
	
		If MiddleButtonVisible = True Then
			asbm_add_background.Visible = True
			asbm_add_background.Enabled = True
		
		Else
			asbm_add_background.Visible = False
			asbm_add_background.Enabled = False
		End If
	
	
		'text
		
		asbm_page_1.AddView(asbm_text_1,0,0,0,0)
		asbm_page_2.AddView(asbm_text_2,0,0,0,0)
		
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_5.AddView(asbm_text_5,0,0,0,0)
			
		End If
	
	End If

	asbm_page_background.AddView(asbm_partinglines1,asbm_page_background.Left + asbm_page_background.Width,0,2dip,2dip)
	asbm_page_background.AddView(asbm_partinglines2,asbm_page_background.Left + asbm_page_background.Width,0,2dip,2dip)
	asbm_page_background.AddView(asbm_partinglines3,asbm_page_background.Left + asbm_page_background.Width,0,2dip,2dip)
	asbm_page_background.AddView(asbm_partinglines4,asbm_page_background.Left + asbm_page_background.Width,0,2dip,2dip)
	asbm_page_background.AddView(asbm_partinglines5,asbm_page_background.Left + asbm_page_background.Width,0,2dip,2dip)
	asbm_partinglines1.Visible = False
	asbm_partinglines2.Visible = False
	asbm_partinglines3.Visible = False
	asbm_partinglines4.Visible = False
	asbm_partinglines5.Visible = False

#if B4A

	Base_Resize(mBase.Width,mBase.Height)
	
	#End If
	
End Sub
	
	








Public Sub GetBase As B4XView
	Return mBase
End Sub

#If B4J

Sub BringToFront(n As Node)
	Dim parent As Pane = n.Parent
	n.RemoveNodeFromParent
	parent.AddNode(n, n.Left, n.Top, n.PrefWidth, n.PrefHeight)
End Sub

#End If

#If B4J

Private Sub asbm_page_1_MouseClicked (EventData As MouseEvent)
	
	asbm_page_1_handler(Sender)
	
End Sub

#Else

Private Sub asbm_page_1_Click
	
	asbm_page_1_handler(Sender)
	
End Sub

#End If

private Sub asbm_page_1_handler(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_Page1Click",0) Then
		CallSub(mCallBack, mEventName & "_Page1Click")
	End If
	currentpage = 1
		
	Dim cx As Int = asbm_page_1.Left + asbm_page_1.Width/2
	
	If e_text = True Then
		
		Dim cy As Int
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
		asbm_icon_1.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2 - 5dip,asbm_icon_1.Width,asbm_icon_1.Height)
		asbm_text_1.SetLayoutAnimated(250,asbm_text_1.Left,asbm_icon_1.Top + asbm_icon_1.Height,asbm_text_1.Width,asbm_text_1.Height)
			
		asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Left,asbm_slider.Top - asbm_text_2.Height/1.4,asbm_text_2.Width,asbm_text_2.Height)
		
		
		If Mode = 1 Then
			asbm_icon_3.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_icon_4.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_text_3.SetLayoutAnimated(250,asbm_text_3.Left,asbm_slider.Top - asbm_text_3.Height/1.4,asbm_text_3.Width,asbm_text_3.Height)
			asbm_text_4.SetLayoutAnimated(250,asbm_text_4.Left,asbm_slider.Top - asbm_text_4.Height/1.4,asbm_text_4.Width,asbm_text_4.Height)
			
		End If
		
		If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_text_5.SetLayoutAnimated(250,asbm_text_5.Left,asbm_slider.Top - asbm_text_5.Height/1.4,asbm_text_5.Width,asbm_text_5.Height)
			
		End If
		
	End If
	
	asbm_slider.SetLayoutAnimated(500,cx - asbm_slider.Width/2 ,asbm_slider.Top,asbm_slider.Width,asbm_slider.Height)
	asbm_slider.SetColorAnimated(0,asbm_slider.Color,s_Color1)

#If B4J
	If e_SelectedPageColor = True Then

		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,xui.Color_White))

		If Mode = 1 Then
	
			asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,xui.Color_White))
			asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,xui.Color_White))

		End If
		
		If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,xui.Color_White))
			
		End If

		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,s_PageColor))

	End If
	
	CreateHaloEffect(asbm_page_1, asbm_page_1.Width/2, asbm_page_1.Height/2, p_ClickColor)

	BringToFront(asbm_icon_1)

#Else
If e_SelectedPageColor = True Then

	asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,xui.Color_White)

		If Mode = 1 Then
	
				asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,xui.Color_White)
			asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,xui.Color_White)

End If

If EnableMiddleButtonAsPage = True Then
asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,xui.Color_White)
End If

asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,s_PageColor)

	End If
	
	CreateHaloEffect(asbm_page_1, asbm_page_1.Width/2, asbm_page_1.Height/2, p_ClickColor)

	asbm_icon_1.BringToFront
#End If


	

	asbm_slider.BringToFront
	
End Sub
	

#If B4J

Private Sub asbm_page_2_MouseClicked (EventData As MouseEvent)
	
	asbm_page_2_handler(Sender)
	
End Sub

#Else

Private Sub asbm_page_2_Click
	
	asbm_page_2_handler(Sender)
	
End Sub

#End If

Private Sub asbm_page_2_handler(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_Page2Click",0) Then
		CallSub(mCallBack, mEventName & "_Page2Click")
	End If
	currentpage = 2
	Dim cx As Int = asbm_page_2.Left + asbm_page_2.Width/2
	
	asbm_slider.SetLayoutAnimated(500,cx - asbm_slider.Width/2,asbm_slider.Top,asbm_slider.Width,asbm_slider.Height)
	asbm_slider.SetColorAnimated(0,asbm_slider.Color,s_Color2)
	
	If e_text = True Then
		Dim cy As Int
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
		
		asbm_icon_1.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2	,asbm_icon_1.Width,asbm_icon_1.Height)
		asbm_text_1.SetLayoutAnimated(250,asbm_text_1.Left,asbm_slider.Top - asbm_text_1.Height/1.4,asbm_text_1.Width,asbm_text_1.Height)
		
		asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2 - 5dip,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Left,asbm_icon_2.Top + asbm_icon_2.Height,asbm_text_2.Width,asbm_text_2.Height)
		
		
		If Mode = 1 Then
			asbm_icon_3.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2	,asbm_icon_1.Width,asbm_icon_1.Height)
			asbm_icon_4.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2	,asbm_icon_1.Width,asbm_icon_1.Height)
			asbm_text_3.SetLayoutAnimated(250,asbm_text_3.Left,asbm_slider.Top - asbm_text_3.Height/1.4,asbm_text_3.Width,asbm_text_3.Height)
			asbm_text_4.SetLayoutAnimated(250,asbm_text_4.Left,asbm_slider.Top - asbm_text_4.Height/1.4,asbm_text_4.Width,asbm_text_4.Height)
			
		End If
		
		If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2	,asbm_icon_1.Width,asbm_icon_1.Height)
			asbm_text_5.SetLayoutAnimated(250,asbm_text_5.Left,asbm_slider.Top - asbm_text_5.Height/1.4,asbm_text_5.Width,asbm_text_5.Height)
			
		End If
		
	End If
	
	#If B4J
	
	If e_SelectedPageColor = True Then
	
		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,xui.Color_White))
	
		If Mode = 1 Then
	
			asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,xui.Color_White))
			asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,xui.Color_White))
	
		End If
	
	If EnableMiddleButtonAsPage = True Then
		
			asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,xui.Color_White))
		
		End If
	
		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,s_PageColor))
	
	End If
	
	CreateHaloEffect(asbm_page_2, asbm_page_2.Width/2, asbm_page_2.Height/2, p_ClickColor)
	BringToFront(asbm_icon_2)
	#Else
		If e_SelectedPageColor = True Then
	
	asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,Colors.White)
	
		If Mode = 1 Then
	
	asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,Colors.White)
	asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,Colors.White)
	
	End If
	
	If EnableMiddleButtonAsPage = True Then
	
	asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,Colors.White)
	
	End If
	
	asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,s_PageColor)
	
	End If
	
	CreateHaloEffect(asbm_page_2, asbm_page_2.Width/2, asbm_page_2.Height/2, p_ClickColor)
	asbm_icon_2.BringToFront
	
	#End If
	

	asbm_slider.BringToFront
	
	
	
End Sub


#If B4J

Private Sub asbm_page_5_MouseClicked (EventData As MouseEvent)
	
	If EnableMiddleButtonAsPage = True Then
	
	asbm_page_5_handler(Sender)
	
	End If
	
End Sub

#Else

Private Sub asbm_page_5_Click
	
		If EnableMiddleButtonAsPage = True Then
	
	asbm_page_5_handler(Sender)
	
	End If
	
End Sub

#End If

Private Sub asbm_page_5_handler(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_Page5Click",0) Then
		CallSub(mCallBack, mEventName & "_Page5Click")
	End If
	currentpage = 5
	
	Dim cx As Int = asbm_page_5.Left + asbm_page_5.Width/2
	
	asbm_slider.SetLayoutAnimated(500,cx - asbm_slider.Width/2,asbm_slider.Top,asbm_slider.Width,asbm_slider.Height)
	asbm_slider.SetColorAnimated(0,asbm_slider.Color,s_Color5)
	
	If e_text = True Then
		
		Dim cy As Int
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
		asbm_icon_5.SetLayoutAnimated(250,asbm_icon_5.Left,cy - asbm_icon_1.Height/2 - 5dip,asbm_icon_5.Width,asbm_icon_5.Height)
		asbm_text_5.SetLayoutAnimated(250,asbm_text_5.Left,asbm_icon_5.Top + asbm_icon_5.Height,asbm_text_5.Width,asbm_text_5.Height)
			
		asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Left,asbm_slider.Top - asbm_text_2.Height/1.4,asbm_text_2.Width,asbm_text_2.Height)
		
		
		If Mode = 1 Then
			asbm_icon_3.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_icon_4.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_text_3.SetLayoutAnimated(250,asbm_text_3.Left,asbm_slider.Top - asbm_text_3.Height/1.4,asbm_text_3.Width,asbm_text_3.Height)
			asbm_text_4.SetLayoutAnimated(250,asbm_text_4.Left,asbm_slider.Top - asbm_text_4.Height/1.4,asbm_text_4.Width,asbm_text_4.Height)
			
		End If
		
		
		asbm_icon_1.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2,asbm_icon_1.Width,asbm_icon_1.Height)
		asbm_text_1.SetLayoutAnimated(250,asbm_text_1.Left,asbm_slider.Top - asbm_text_1.Height/1.4,asbm_text_1.Width,asbm_text_1.Height)
			
		
		
	End If
	
	#If B4J
	
	If e_SelectedPageColor = True Then
	
		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,xui.Color_White))
		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,xui.Color_White))
		
		If Mode = 1 Then
		
		asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,xui.Color_White))
		asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,xui.Color_White))
	
	End If
	
		asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,s_PageColor))
	
	End If
	
	CreateHaloEffect(asbm_page_5, asbm_page_5.Width/2, asbm_page_5.Height/2, p_ClickColor)
	BringToFront(asbm_icon_5)
	#Else
	
		If e_SelectedPageColor = True Then
	
	asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,Colors.White)
	asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,Colors.White)
	
	If Mode = 1 Then
	
	asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,Colors.White)
	asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,Colors.White)
	
	End If
	
	asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,s_PageColor)
	
	End If
	
	CreateHaloEffect(asbm_page_5, asbm_page_5.Width/2, asbm_page_5.Height/2, p_ClickColor)
	asbm_icon_5.BringToFront
	
	#End If
	
	

	asbm_slider.BringToFront
	

End Sub


#If B4J

Private Sub asbm_page_3_MouseClicked (EventData As MouseEvent)
	
	If Mode = 1 Then
	asbm_page_3_handler(Sender)
	End If
End Sub

#Else

Private Sub asbm_page_3_Click
	
	If Mode = 1 Then
	
	asbm_page_3_handler(Sender)
	
	End If
	
End Sub

#End If

Private Sub asbm_page_3_handler(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_Page3Click",0) Then
		CallSub(mCallBack, mEventName & "_Page3Click")
	End If
	currentpage = 3
	
	Dim cx As Int = asbm_page_3.Left + asbm_page_3.Width/2
	
	asbm_slider.SetLayoutAnimated(500,cx - asbm_slider.Width/2,asbm_slider.Top,asbm_slider.Width,asbm_slider.Height)
	asbm_slider.SetColorAnimated(0,asbm_slider.Color,s_Color3)
	
	If e_text = True Then
		
		Dim cy As Int
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
		asbm_icon_3.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2 - 5dip,asbm_icon_1.Width,asbm_icon_1.Height)
		asbm_text_3.SetLayoutAnimated(250,asbm_text_1.Left,asbm_icon_3.Top + asbm_icon_3.Height,asbm_text_1.Width,asbm_text_1.Height)
			
		asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Left,asbm_slider.Top - asbm_text_2.Height/1.4,asbm_text_2.Width,asbm_text_2.Height)
		
		asbm_icon_1.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_1.SetLayoutAnimated(250,asbm_text_2.Left,asbm_slider.Top - asbm_text_2.Height/1.4,asbm_text_2.Width,asbm_text_2.Height)
		
	
			
			asbm_icon_4.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		
			asbm_text_4.SetLayoutAnimated(250,asbm_text_4.Left,asbm_slider.Top - asbm_text_4.Height/1.4,asbm_text_4.Width,asbm_text_4.Height)
			
	
		
		If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_text_5.SetLayoutAnimated(250,asbm_text_5.Left,asbm_slider.Top - asbm_text_5.Height/1.4,asbm_text_5.Width,asbm_text_5.Height)
			
		End If
		
	End If
	
	#If B4J
	
	If e_SelectedPageColor = True Then
	
		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,xui.Color_White))
		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,xui.Color_White))
		asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,xui.Color_White))
	
	If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,xui.Color_White))
		
		End If
	
		asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,s_PageColor))
	
	End If
	
	CreateHaloEffect(asbm_page_3, asbm_page_3.Width/2, asbm_page_3.Height/2, p_ClickColor)
	BringToFront(asbm_icon_3)
	#Else
	
		If e_SelectedPageColor = True Then
	
	asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,Colors.White)
	asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,Colors.White)
	asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,Colors.White)
	
	If EnableMiddleButtonAsPage = True Then
	asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,Colors.White)
	
	End If
	
	asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,s_PageColor)
	
	End If
	
	CreateHaloEffect(asbm_page_3, asbm_page_3.Width/2, asbm_page_3.Height/2, p_ClickColor)
	asbm_icon_3.BringToFront
	
	#End If
	
	

	asbm_slider.BringToFront
	

End Sub



#If B4J

Private Sub asbm_page_4_MouseClicked (EventData As MouseEvent)
	If Mode = 1 Then
	asbm_page_4_handler(Sender)
	End If
End Sub

#Else

Private Sub asbm_page_4_Click
	
	If Mode = 1 Then
	
	asbm_page_4_handler(Sender)
	
	End If
	
End Sub

#End If


Private Sub asbm_page_4_handler(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_Page4Click",0) Then
		CallSub(mCallBack, mEventName & "_Page4Click")
	End If
	currentpage = 4

	Dim cx As Int = asbm_page_4.Left + asbm_page_4.Width/2
	
	asbm_slider.SetLayoutAnimated(500,cx - asbm_slider.Width/2,asbm_slider.Top,asbm_slider.Width,asbm_slider.Height)
	asbm_slider.SetColorAnimated(0,asbm_slider.Color,s_Color4)
	
	If e_text = True Then
		
		Dim cy As Int
		cy = asbm_page_1.Top + asbm_page_1.Height/2.5
	
		asbm_icon_4.SetLayoutAnimated(250,asbm_icon_1.Left,cy - asbm_icon_1.Height/2 - 5dip,asbm_icon_1.Width,asbm_icon_1.Height)
		asbm_text_4.SetLayoutAnimated(250,asbm_text_1.Left,asbm_icon_4.Top + asbm_icon_4.Height,asbm_text_1.Width,asbm_text_1.Height)
			
		asbm_icon_2.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_2.SetLayoutAnimated(250,asbm_text_2.Left,asbm_slider.Top - asbm_text_2.Height/1.4,asbm_text_2.Width,asbm_text_2.Height)
		
		asbm_icon_1.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
		asbm_text_1.SetLayoutAnimated(250,asbm_text_2.Left,asbm_slider.Top - asbm_text_2.Height/1.4,asbm_text_2.Width,asbm_text_2.Height)
		
		
			asbm_icon_3.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			
			asbm_text_3.SetLayoutAnimated(250,asbm_text_3.Left,asbm_slider.Top - asbm_text_3.Height/1.4,asbm_text_3.Width,asbm_text_3.Height)
			
			
		
		
		If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetLayoutAnimated(250,asbm_icon_2.Left,cy - asbm_icon_1.Height/2,asbm_icon_2.Width,asbm_icon_2.Height)
			asbm_text_5.SetLayoutAnimated(250,asbm_text_5.Left,asbm_slider.Top - asbm_text_5.Height/1.4,asbm_text_5.Width,asbm_text_5.Height)
			
		End If
		
	End If
	
	#If B4J
	
	If e_SelectedPageColor = True Then
	
		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,xui.Color_White))
		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,xui.Color_White))
		asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,xui.Color_White))
	
	If EnableMiddleButtonAsPage = True Then
			asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,xui.Color_White))
		End If
	
		asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,s_PageColor))
	
	End If
	
	CreateHaloEffect(asbm_page_4, asbm_page_4.Width/2, asbm_page_4.Height/2, p_ClickColor)

	BringToFront(asbm_icon_4)
	#Else
	
	If e_SelectedPageColor = True Then
	
	asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,Colors.White)
	asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,Colors.White)
	asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,Colors.White)
	
		If EnableMiddleButtonAsPage = True Then
		
			asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,Colors.White)
		
		End If
	
	asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,s_PageColor)
	
	End If
	
	CreateHaloEffect(asbm_page_4, asbm_page_4.Width/2, asbm_page_4.Height/2, p_ClickColor)

	asbm_icon_4.BringToFront
	
	#End If
	
	
	
	asbm_slider.BringToFront

End Sub


Private Sub asbm_add_background_Click

	asbm_add_background_handler(Sender)

End Sub

Private Sub asbm_add_background_LongClick
	
	asbm_add_background_handler_long(Sender)
	
End Sub

Private Sub asbm_add_background_handler(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_MiddleButtonClick",0) Then
		CallSub(mCallBack, mEventName & "_MiddleButtonClick")
	End If
	
	
End Sub

Private Sub asbm_add_background_handler_long(SenderPanel As B4XView)
	
	If xui.SubExists(mCallBack, mEventName & "_MiddleButtonLongClick",0) Then
		CallSub(mCallBack, mEventName & "_MiddleButtonLongClick")
	End If
	
	
End Sub

'Public Subs

'If True, the Badget is Visible, if not, the Badget is hidden.
Public Sub EnableBadget1(Enable As Boolean)
	
	e_BadgetColor1 = Enable
	asbm_badget_1.Visible = e_BadgetColor1
End Sub

'If True, the Badget is Visible, if not, the Badget is hidden.
Public Sub EnableBadget2(Enable As Boolean)
	
	e_BadgetColor2 = Enable
	asbm_badget_2.Visible = e_BadgetColor2
End Sub

'If True, the Badget is Visible, if not, the Badget is hidden.
Public Sub EnableBadget3(Enable As Boolean)
	
	If Mode = 1 Then
	
	e_BadgetColor3 = Enable
	asbm_badget_3.Visible = e_BadgetColor3
	
	End If
	
End Sub

'If True, the Badget is Visible, if not, the Badget is hidden.
Public Sub EnableBadget4(Enable As Boolean)
	
	If Mode = 1 Then
		
	
	e_BadgetColor4 = Enable
	asbm_badget_4.Visible = e_BadgetColor4
	
	End If
	
End Sub

'If True, the Badget is Visible, if not, the Badget is hidden.
Public Sub EnableBadget5(Enable As Boolean)
	
	If EnableMiddleButtonAsPage = True Then
		
	
	e_BadgetColor5 = Enable
	asbm_badget_5.Visible = e_BadgetColor5
	
	End If
	
End Sub

'Set the Background Color of the 1. Badget
Public Sub SetBadgetColor1(color As Int)
	
	b_color1 = color
	asbm_badget_1.Color = b_color1
End Sub

'Set the Background Color of the 2. Badget
Public Sub SetBadgetColor2(color As Int)
	
	b_color2 = color
	asbm_badget_2.Color = b_color2
End Sub

'Set the Background Color of the 3. Badget
Public Sub SetBadgetColor3(color As Int)
	
	If Mode = 1 Then
		
	b_color3 = color
	asbm_badget_3.Color = b_color3
	
	End If
	
End Sub

'Set the Background Color of the 4. Badget
Public Sub SetBadgetColor4(color As Int)
	
	If Mode = 1 Then
	
	b_color4 = color
	asbm_badget_4.Color = b_color4
	
	End If
	
End Sub

'Set the Background Color of the 5. Badget
Public Sub SetBadgetColor5(color As Int)
	
	If EnableMiddleButtonAsPage = True Then
	
	b_color5 = color
	asbm_badget_5.Color = b_color5
	
	End If
	
End Sub

'Set the Background color behind the Buttons.
Public Sub SetMenuBackgroundColor(color As Int)
	
	b_Color = color
	asbm_page_background.Color = b_Color
End Sub

'If True then the Icon will change the Color on the current Page.
Public Sub EnableSelectedPageColor(enable As Boolean)
	
	e_SelectedPageColor = enable
	
End Sub

'Set the color of the icon which is selected
Public Sub SetSelectedPageColor(color As Int)
		
	s_PageColor = color
	
End Sub

'The Color of Halo Effect during Page Click.
Public Sub SetPageClickColor(color As Int)
	
	p_ClickColor = color
	
End Sub

'Set the Middle Button Background Color
Public Sub SetMiddleButtonBackgroundColor(color As Int)
	
	
	m_BackgroundColor = color
	asbm_add_background.Color = m_BackgroundColor
	
End Sub

'Set the Color of the Line over the Buttons.
Public Sub SetPartingLineColor(color As Int)
	
	p_Line = color
	asbm_parting_line.Color = p_Line
	
End Sub

'Set the slider Color, if the slider slides to the 1. button.
Public Sub SetSlider1Color(color As Int)
	
	s_Color1 = color
	
End Sub

'Set the slider Color, if the slider slides to the 2. button.
Public Sub SetSlider2Color(color As Int)
	
	s_Color2 = color
	
End Sub

'Set the slider Color, if the slider slides to the 3. button.
Public Sub SetSlider3Color(color As Int)
	
	If Mode = 1 Then
	
	s_Color3 = color
	
	End If
	
End Sub

'Set the slider Color, if the slider slides to the 4. button.
Public Sub SetSlider4Color(color As Int)
	
	If Mode = 1 Then
	
	s_Color4 = color
	
	End If
	
End Sub

'Set the slider Color, if the slider slides to the 4. button.
Public Sub SetSlider5Color(color As Int)
	
	If EnableMiddleButtonAsPage = True Then
	
	s_Color5 = color
	
	End If
	
End Sub

'Set on the 1. Badge the Value. Bigger then 9, a "9+" is Displayed
Public Sub SetBadgetValue1(value As Int)
	
	If value > 9 Then
		
		asbm_badget_1.Text = "+" & 9
		asbm_badget_1.TextSize = FitTextSize(asbm_badget_1)
		
		Else if value < 0 Then
			
		asbm_badget_1.Text = 0
		asbm_badget_1.TextSize = 13
			
			Else
				
				
		asbm_badget_1.Text = value
		asbm_badget_1.TextSize = 13
		
	End If
	
End Sub

'Set on the 2. Badge the Value. Bigger then 9, a "9+" is Displayed
Public Sub SetBadgetValue2(value As Int)
	
	If value > 9 Then
		
		asbm_badget_2.Text = "+" & 9
		asbm_badget_2.TextSize = FitTextSize(asbm_badget_2)
	Else if value < 0 Then
			
		asbm_badget_2.Text = 0
		asbm_badget_2.TextSize = 13
	Else
				
				
		asbm_badget_2.Text = value
		asbm_badget_2.TextSize = 13
	End If
	
End Sub

'Set on the 3. Badge the Value. Bigger then 9, a "9+" is Displayed
Public Sub SetBadgetValue3(value As Int)
	
	If Mode = 1 Then
	
	If value > 9 Then
		
		asbm_badget_3.Text = "+" & 9
			asbm_badget_3.TextSize = FitTextSize(asbm_badget_3)
	Else if value < 0 Then
			
		asbm_badget_3.Text =  0
			asbm_badget_3.TextSize = 13
	Else
				
				
		asbm_badget_3.Text = value
			asbm_badget_3.TextSize = 13
		
	End If
	
	End If
	
End Sub

'Set on the 4. Badge the Value. Bigger then 9, a "9+" is Displayed
Public Sub SetBadgetValue4(value As Int)
	
	If Mode = 1 Then
	
	If value > 9 Then
		
		asbm_badget_4.Text = "+" & 9
			asbm_badget_4.TextSize = FitTextSize(asbm_badget_4)
	Else if value < 0 Then
			
		asbm_badget_4.Text = 0
			asbm_badget_4.TextSize = 13
	Else
				
				
		asbm_badget_4.Text = value
			asbm_badget_4.TextSize = 13
		End If
	
	End If
	
End Sub

'Set on the 5. Badge the Value. Bigger then 9, a "9+" is Displayed
Public Sub SetBadgetValue5(value As Int)
	
	If EnableMiddleButtonAsPage = True Then
	
	If value > 9 Then
		
		asbm_badget_5.Text = "+" & 9
			asbm_badget_5.TextSize = FitTextSize(asbm_badget_5)
	Else if value < 0 Then
			
		asbm_badget_5.Text = 0
			asbm_badget_5.TextSize = 13
	Else
				
				
		asbm_badget_5.Text = value
			asbm_badget_5.TextSize = 13
	End If
	
	End If
	
End Sub

Public Sub SetIcon1(icon As B4XBitmap)
	
	icon1 = icon
	
	#If B4J
	asbm_icon_1.SetImage(icon1)
	
	If currentpage = 1 Then
		
		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,s_PageColor))
		
		Else
		asbm_icon_1.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_1.GetImage,xui.Color_White))
	End If
	#Else
	asbm_icon_1.Bitmap = icon1
	
	If currentpage = 1 Then
		
		asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,s_PageColor)
		
		Else
		asbm_icon_1.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_1.Bitmap,xui.Color_White)
		
	End If
	
	#End If

End Sub

Public Sub SetIcon2(icon As B4XBitmap)
	
	icon2 = icon
	
	#If B4J
	asbm_icon_2.SetImage(icon2)
	
	If currentpage = 2 Then
		
		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,s_PageColor))
		Else
		asbm_icon_2.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_2.GetImage,xui.Color_White))
	End If
	#Else
	
	asbm_icon_2.Bitmap = icon2
	
	If currentpage = 2 Then
		
		asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,s_PageColor)
		else
		asbm_icon_2.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_2.Bitmap,xui.Color_White)
	End If
	
	#End If
	
	
	
	
End Sub

Public Sub SetIcon3(icon As B4XBitmap)
	
	If Mode = 1 Then
	
	icon3 = icon
	
	#If B4J
	asbm_icon_3.SetImage(icon3)
	
	If currentpage = 3 Then
		
		asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,s_PageColor))
		Else
			asbm_icon_3.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_3.GetImage,xui.Color_White))
	End If
	
	#Else
	
	asbm_icon_3.Bitmap = icon3
	
	If currentpage = 3 Then
		
		asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,s_PageColor)
		else
		asbm_icon_3.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_3.Bitmap,xui.Color_White)
	End If
	#End If
	
	End If
	
End Sub


Public Sub SetIcon4(icon As B4XBitmap)
	
	If Mode = 1 Then
	
	icon4 = icon
	
	#If B4J
	asbm_icon_4.SetImage(icon4)
	
	If currentpage = 4 Then
		
		asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,s_PageColor))
		Else
			asbm_icon_4.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_4.GetImage,xui.Color_White))
	End If
	#Else
	
	asbm_icon_4.Bitmap = icon4
	
	If currentpage = 4 Then
		
		asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,s_PageColor)
		else
		asbm_icon_4.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_4.Bitmap,xui.Color_White)
		
	End If
	#End If
	
	End If
	
End Sub


Public Sub SetIcon5(icon As B4XBitmap)
	
	If EnableMiddleButtonAsPage = True Then
	
	icon5 = icon
	
	#If B4J
	asbm_icon_5.SetImage(icon5)
	
	If currentpage = 5 Then
		
		asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,s_PageColor))
		Else
			asbm_icon_5.SetImage(ChangeColorBasedOnAlphaLevel(asbm_icon_5.GetImage,xui.Color_White))
	End If
	#Else
	
	asbm_icon_5.Bitmap = icon5
	
	If currentpage = 5 Then
		
		asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,s_PageColor)
		Else
		asbm_icon_5.Bitmap = ChangeColorBasedOnAlphaLevel(asbm_icon_5.Bitmap,xui.Color_White)
	End If
	#End If
	
	End If
	
End Sub

'Set the Icon of the Middle Button
Public Sub SetMiddleButtonIcon(icon As B4XBitmap)
	
	middleicon = icon
	
	#if B4J
	
	pnl_asbm_add_icon.SetImage(middleicon)
	#ELSE
	
	pnl_asbm_add_icon.Bitmap = middleicon
	#End If
	
	
	
	
End Sub

'Set the current Page 1-4
Public Sub SetCurrentPage(page As Int)
	
	If page = 1 Then
		
		asbm_page_1_handler(asbm_page_1)
		
		Else If page = 2 Then
			
		asbm_page_2_handler(asbm_page_2)
			
	Else If page = 3 Then
		
		If Mode = 1 Then
		
		asbm_page_3_handler(asbm_page_3)
		
		End If
		
	Else If page = 4 Then
			
		If Mode = 1 Then
			
		asbm_page_4_handler(asbm_page_4)
		
		End If
		
	Else If page = 5 Then
			
		If EnableMiddleButtonAsPage = True Then
			
			asbm_page_5_handler(asbm_page_5)
		
		End If
			
			Else
				
				Log("Page number not valid")
		asbm_page_1_handler(asbm_page_1)
		
	End If
	
End Sub

'If True only the badget color is display without value inside. badget as int = 1-4 allowed.
Public Sub HideBadgetValue(badget As Int,Hide As Boolean)
	
	If badget = 1 Then
		
		If Hide = True Then
			
			asbm_badget_1.TextColor = asbm_badget_1.Color
			
			Else
				
			asbm_badget_1.TextColor = b_color1
			
		End If
		
	Else If badget = 2 Then
			
		If Hide = True Then
			
			asbm_badget_2.TextColor = asbm_badget_2.Color
			
		Else
				
			asbm_badget_2.TextColor = b_color2
			
		End If
			
			Else If badget = 3 Then
				
				If Mode = 1 Then
					
			If Hide = True Then
			
				asbm_badget_3.TextColor = asbm_badget_3.Color
			
			Else
				
				asbm_badget_3.TextColor = b_color3
			
			End If
					
					
				End If
				
				Else If badget = 4 Then
		
		If Mode = 1 Then
					
			If Hide = True Then
			
				asbm_badget_4.TextColor = asbm_badget_4.Color
			
			Else
				
				asbm_badget_4.TextColor = b_color4
			
			End If
					
		End If
		
	Else If badget = 5 Then
		
		If EnableMiddleButtonAsPage = True Then
					
			If Hide = True Then
			
				asbm_badget_5.TextColor = asbm_badget_5.Color
			
			Else
				
				asbm_badget_5.TextColor = b_color5
			
			End If
					
		End If
		
	End If
	
End Sub

'Standard Value are the height of the view/1.2. Standard BorderWidth are 3dip.
Public Sub ChangeMiddleButtonSize(size As Double, BorderWidth As Double)
	
	asbm_add_background.Height = size
	asbm_add_background.Width = size
	
	asbm_add_background.SetColorAndBorder(m_BackgroundColor,BorderWidth,xui.Color_White,asbm_add_background.Height/2)
	
	asbm_add_background.Top = asbm_parting_line.Top - asbm_add_background.Height/2

	asbm_add_background.Left = asbm_page_background.Width / 2 - asbm_add_background.Width /2

	pnl_asbm_add_icon.Width = asbm_add_background.Width /2.5
	pnl_asbm_add_icon.Height = asbm_add_background.Height /2.5
	
	pnl_asbm_add_icon.Left = asbm_add_background.Width / 2 - pnl_asbm_add_icon.Width /2
	pnl_asbm_add_icon.Top = asbm_add_background.Height / 2 - pnl_asbm_add_icon.Height / 2
	
	
End Sub

'Set the Tab Parting Lines Visible. This lines are right or left on the tab vertical.
Public Sub SetTabPartingLinesVisible(Visible As Boolean)
	
	If Visible = True Then
		
		
	
	
	If TypeOfMenu = "4 Icon Tabs" Then
		
	If MiddleButtonVisible = True Then
		
			asbm_partinglines1.Visible = True
			asbm_partinglines3.Visible = True
		
		Else
			
			asbm_partinglines1.Visible = True
			asbm_partinglines2.Visible = True
			asbm_partinglines3.Visible = True
		
		If EnableMiddleButtonAsPage = True Then
				asbm_partinglines5.Visible = True
			End If
		
		End If
	
	else If TypeOfMenu = "2 Icon Tabs" Then
	
		If MiddleButtonVisible = True Then
		
			
		
		Else
			
			asbm_partinglines1.Visible = True
			
			
		
			If EnableMiddleButtonAsPage = True Then
				asbm_partinglines5.Visible = True
				End If
		
			End If
	
		End If

	Else

		If TypeOfMenu = "4 Icon Tabs" Then
		
			If MiddleButtonVisible = True Then
		
				asbm_partinglines1.Visible = False
				asbm_partinglines3.Visible = False
		
			Else
			
				asbm_partinglines1.Visible = False
				asbm_partinglines2.Visible = False
				asbm_partinglines3.Visible = False
		
				If EnableMiddleButtonAsPage = True Then
					asbm_partinglines5.Visible = False
				End If
		
			End If
	
		else If TypeOfMenu = "2 Icon Tabs" Then
	
			If MiddleButtonVisible = True Then
		
			
		
			Else
			
				asbm_partinglines1.Visible = False
			
			
		
				If EnableMiddleButtonAsPage = True Then
					asbm_partinglines5.Visible = False
				End If
		
			End If
	
		End If

	End If
	
	
End Sub

'Change The Parting Lines Color
Public Sub SetPartingLinesColor(Color As Int)
	
	p_Lines_Color = Color
	
	asbm_partinglines1.Color = p_Lines_Color
	asbm_partinglines2.Color = p_Lines_Color
	asbm_partinglines3.Color = p_Lines_Color
	asbm_partinglines4.Color = p_Lines_Color
	asbm_partinglines5.Color = p_Lines_Color
	
End Sub

Public Sub SetMiddleButtonVisible(Visble As Boolean)
	
	MiddleButtonVisible = Visble
	asbm_add_background.Visible = Visble
	Base_Resize(mBase.Width,mBase.Height)
	
End Sub

'Text Properties

Public Sub EnableText(Enable As Boolean)
	
	e_text = Enable
	Base_Resize(mBase.Width,mBase.Height)
	
End Sub

Public Sub SetTextColor(Color As Int)
	
	t_color = Color
	Base_Resize(mBase.Width,mBase.Height)
	
End Sub

Public Sub SetText1(text As String)
	
	text_1 = text
	asbm_text_1.Text = text
	
End Sub

Public Sub SetText2(text As String)
	
	text_2 = text
	asbm_text_2.Text = text
	
End Sub

Public Sub SetText3(text As String)
	
	If Mode = 1 Then
	
	text_3 = text
	asbm_text_3.Text = text
	
	End If
	
End Sub

Public Sub SetText4(text As String)
	
	If Mode = 1 Then
	
	text_4 = text
	asbm_text_4.Text = text
	
	End If
	
End Sub

Public Sub SetText5(text As String)
	
	If EnableMiddleButtonAsPage = True Then
	
	text_5 = text
	asbm_text_5.Text = text
	
	End If
	
End Sub

#Region UsedFunctions

'https://www.b4x.com/android/forum/threads/b4x-xui-simple-halo-animation.80267/#content
Private Sub CreateHaloEffect (Parent As B4XView, x As Int, y As Int, clr As Int)
	Dim cvs As B4XCanvas
	Dim p As B4XView = xui.CreatePanel("")
	Dim radius As Int = 150dip
	p.SetLayoutAnimated(0, 0, 0, radius * 2, radius * 2)
	cvs.Initialize(p)
	cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.TargetRect.CenterY, cvs.TargetRect.Width / 2, clr, True, 0)
	Dim bmp As B4XBitmap = cvs.CreateBitmap
	For i = 1 To 1
		CreateHaloEffectHelper(Parent,bmp, x, y, clr, radius)
		Sleep(800)
	Next
End Sub

Private Sub CreateHaloEffectHelper (Parent As B4XView,bmp As B4XBitmap, x As Int, y As Int, clr As Int, radius As Int)
	Dim iv As ImageView
	iv.Initialize("")
	Dim p As B4XView = iv
	p.SetBitmap(bmp)
	Parent.AddView(p, x, y, 0, 0)
	Dim duration As Int = 1000
	p.SetLayoutAnimated(duration, x - radius, y - radius, 2 * radius, 2 * radius)
	p.SetVisibleAnimated(duration, False)
	Sleep(duration)
	p.RemoveViewFromParent
End Sub

'https://www.b4x.com/android/forum/threads/b4x-bitmapcreator-change-color-of-bitmap.95518/#post-603416
Private Sub ChangeColorBasedOnAlphaLevel(bmp As B4XBitmap, NewColor As Int) As B4XBitmap
	Dim bc As BitmapCreator
	bc.Initialize(bmp.Width, bmp.Height)
	bc.CopyPixelsFromBitmap(bmp)
	Dim a1, a2 As ARGBColor
	bc.ColorToARGB(NewColor, a1)
	For y = 0 To bc.mHeight - 1
		For x = 0 To bc.mWidth - 1
			bc.GetARGB(x, y, a2)
			If a2.a > 0 Then
				a2.r = a1.r
				a2.g = a1.g
				a2.b = a1.b
				bc.SetARGB(x, y, a2)
			End If
		Next
	Next
	Return bc.Bitmap
End Sub

Private Sub FitTextSize(v As B4XView) As Float
	
	
	Dim size As Float
	For size = 2 To 80
		If CheckSize(v,size) Then Exit
	Next
	size = size - 0.5
	If CheckSize(v,size) Then size = size - 0.5
	Return size -3
End Sub

'returns true if the size is too large
Private Sub CheckSize(v As B4XView ,size As Float) As Boolean
	v.TextSize = size
'	If MultipleLines Then
'		Return su.MeasureMultilineTextHeight(v, v.Text) > v.Height
'	Else
		
			Return MeasureTextWidth(v.Text, v.Font) > v.Width Or _
			MeasureTextHeight(v.Text, v.Font) > v.Height
'	End If
End Sub

Private Sub MeasureTextWidth(Text As String, Font1 As B4XFont) As Int
#If B4A
    Private bmp As Bitmap
    bmp.InitializeMutable(2dip, 2dip)
    Private cvs As Canvas
    cvs.Initialize2(bmp)
    Return cvs.MeasureStringWidth(Text, Font1.ToNativeFont, Font1.Size)
#Else If B4i
    Return Text.MeasureWidth(Font1.ToNativeFont)
#Else If B4J
	Dim jo As JavaObject
	jo.InitializeNewInstance("javafx.scene.text.Text", Array(Text))
	jo.RunMethod("setFont",Array(Font1.ToNativeFont))
	jo.RunMethod("setLineSpacing",Array(0.0))
	jo.RunMethod("setWrappingWidth",Array(0.0))
	Dim Bounds As JavaObject = jo.RunMethod("getLayoutBounds",Null)
	Return Bounds.RunMethod("getWidth",Null)
#End If
End Sub

Private Sub MeasureTextHeight(Text As String, Font1 As B4XFont) As Int
#If B4A     
    Private bmp As Bitmap
    bmp.InitializeMutable(2dip, 2dip)
    Private cvs As Canvas
    cvs.Initialize2(bmp)
    Return cvs.MeasureStringHeight(Text, Font1.ToNativeFont, Font1.Size)
#Else If B4i
    Return Text.MeasureHeight(Font1.ToNativeFont)
#Else If B4J
	Dim jo As JavaObject
	jo.InitializeNewInstance("javafx.scene.text.Text", Array(Text))
	jo.RunMethod("setFont",Array(Font1.ToNativeFont))
	jo.RunMethod("setLineSpacing",Array(0.0))
	jo.RunMethod("setWrappingWidth",Array(0.0))
	Dim Bounds As JavaObject = jo.RunMethod("getLayoutBounds",Null)
	Return Bounds.RunMethod("getHeight",Null)
#End If
End Sub

#End Region

'Maybe Comming Soon

'Public Sub HideOrShowMiddleButton(show As Boolean)
'	
'	If show = True Then
'		
'		If Mode = 1 Then
'			
'		
'			asbm_page_1.Left = 0
'			asbm_page_1.Width = asbm_add_background.left/2
'			
'			asbm_page_2.Left = asbm_page_1.Width
'			asbm_page_2.Width = asbm_add_background.left/2
'			
'			asbm_page_3.Left = asbm_page_2.left + asbm_page_2.Width
'			asbm_page_3.Width = asbm_page_background.Width/4
'		
'			asbm_page_4.Left = asbm_page_3.Left + asbm_page_3.Width
'			asbm_page_4.Width = asbm_add_background.left/2
'			
'		
'			
'			
'		Else
'				
'			asbm_page_1.Left = 0
'			asbm_page_1.Width = asbm_add_background.left
'			
'			asbm_page_2.Left = asbm_add_background.left + asbm_add_background.Width
'			asbm_page_2.Width = asbm_add_background.left
'				
'			
'			Dim cx,cy As Int
'			cx = asbm_page_1.Left + asbm_page_1.Width/2
'			cy = asbm_page_1.Top + asbm_page_1.Height/2.3
'		
'			
'				
'				
'		End If
'		
'		MiddleButtonVisible = True
'		asbm_add_background.Visible = True
'		asbm_add_background.Enabled = True
'		
'		Else
'			
'		If Mode = 1 Then
'			
'			
'			asbm_page_1.Left = 0
'			asbm_page_1.Width = asbm_page_background.Width/4
'			
'			asbm_page_2.Left = asbm_page_1.Width
'			asbm_page_2.Width = asbm_page_background.Width/4
'			
'			asbm_page_3.Left = asbm_page_2.left + asbm_page_2.Width
'			asbm_page_3.Width = asbm_page_background.Width/4
'			
'			asbm_page_4.Left = asbm_page_3.Left + asbm_page_3.Width
'			asbm_page_4.Width = asbm_page_background.Width/4
'			
'			
'			Else
'			
'			asbm_page_1.Left = 0
'			asbm_page_1.Width = asbm_page_background.Width/2
'			
'			asbm_page_2.Left = asbm_page_1.left + asbm_page_1.Width
'			asbm_page_2.Width = asbm_add_background.Width/2
'			
'		End If
'			
'			
'		MiddleButtonVisible = False
'		asbm_add_background.Visible = False
'		asbm_add_background.Enabled = False
'		
'	End If
'	
'End Sub
