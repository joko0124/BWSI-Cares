B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
End Sub

Sub Globals
	Private Back As Label
	Private PanelSelection,Panel1 As Panel
	Private btnAccount As ImageView
	Private btnBranches As ImageView
	Private btnCallUs As ImageView
	Private btnHome As ImageView
	Private btnServices As ImageView
	Private ServicesView As BBCodeView
	Private TextEngine As BCTextEngine
	Private xui As XUI
	Private ImageView1 As B4XImageView
	Private picbmp As Bitmap
End Sub

Sub Activity_Create(FirstTime As Boolean)
	SetStatusBarAndNavigationColor(GlobalVariables.PriColor1)
	Activity.LoadLayout("ServicesDetails")
	TextEngine.Initialize(Activity)
	ServicesView.TextEngine = TextEngine
	ServicesView.Text = ""
	picbmp = LoadBitmap(File.DirAssets, "services.jpg")
	ImageView1.CornersRadius = 20dip
	ImageView1.Bitmap = picbmp
	LoadHistory
	PanelSelection.Initialize("PanelSelection")
	Panel_Selection_Attr(btnServices)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub Back_Click
	Activity.Finish
End Sub

''Change Icon Colors
Sub ChangeColorBasedOnAlphaLevel(bmp As B4XBitmap, NewColor As Int) As B4XBitmap
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

Public Sub SetBitmapWithFitOrFill (vTargetView As B4XView, bmp As B4XBitmap)
	vTargetView.SetBitmap(bmp)
   #if B4A
	'B4XView.SetBitmap sets the gravity in B4A to CENTER. This will prevent the bitmap from being scaled as needed so
	'we switch to FILL
	Dim iv As ImageView = vTargetView
	iv.Gravity = Gravity.FILL
   #End If
End Sub

''Set Bacground and Corner Radius 
Sub BackgroundAndCornerRadius(View As View , CornerRadius As Int)
	Dim cdw1 As ColorDrawable
	cdw1.Initialize(Colors.White, CornerRadius)
	View.Background = cdw1
End Sub

Sub SetStatusBarAndNavigationColor(clr As Int)
	Try
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setStatusBarColor", Array(clr))
		Dim jo2 As JavaObject
		jo2.InitializeContext
		jo2.RunMethodJO("getWindow", Null).RunMethod("setNavigationBarColor", Array(clr))
	Catch
		ToastMessageShow("Some error with your android version ( <5 )",True)
	End Try
End Sub

''Probably the worst way to implement Bottom Navigation :)
Sub Panel_Selection_Attr(Selection As ImageView)
	'PanelSelection.Initialize("PanelSelection")
	btnHome.Bitmap = LoadBitmap(File.DirAssets,"Home.png")
	btnAccount.Bitmap = LoadBitmap(File.DirAssets,"User.png")
	btnCallUs.Bitmap = LoadBitmap(File.DirAssets,"callus.png")
	btnBranches.Bitmap = LoadBitmap(File.DirAssets,"house-flood.png")
	btnServices.Bitmap =  LoadBitmap(File.DirAssets,"services.png")
	Select Selection
		Case btnHome
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"Home.png")
		Case btnAccount
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"User.png")
		Case btnCallUs
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"callus.png")
		Case btnBranches
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"house-flood.png")
		Case btnServices
			Dim bmp As B4XBitmap = LoadBitmap(File.DirAssets,"services.png")
	End Select
	BackgroundAndCornerRadius(PanelSelection,15dip)
	PanelSelection.Color = GlobalVariables.PriColor1
	Dim Left As Int
	Left = Selection.Left - 5%x
	Activity.AddView(PanelSelection,Left,91%y,16%x,8%y)
	SetBitmapWithFitOrFill(Selection, ChangeColorBasedOnAlphaLevel(bmp,Colors.White))
	'PanelSelection.SendToBack
	PanelSelection.SendToBack
End Sub


Private Sub btnHome_Click
	Activity.Finish
End Sub

Private Sub btnCallUs_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnCallUs)
End Sub

Private Sub btnBranches_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnBranches)
End Sub

Private Sub btnAccount_Click
	PanelSelection.RemoveView
	Panel_Selection_Attr(btnAccount)
End Sub

Sub LoadHistory
	Dim pnl As B4XView = xui.CreatePanel("")
	pnl.SetLayoutAnimated(0, 0, 0, 200dip, 120dip)
'	HistoryView.Views.Put("btn", btn)

	ServicesView.Text = _
$"[list][TextSize=16][color=#2A91C3][b]
[*]Sourcing of underground water reservoirs

[*]Installation of pumps And motors

[*]Laying of mainline distribution pipes

[*]Chlorination of water sources

[*]Filtration of surface water sources

[*]Connection of households & businesses To mainlines

[*]Meter reading, billing & payment collection

[*]After Sales Services (Repairs of leaks & broken meters)

[*]Reduction of non-revenue water[/b][/color][/TextSize][/list]
"$
'$"
'[color=#1E4369][Alignment=Left][TextSize=24][b]HUMBLE BEGINNINGS[/b][/TextSize][/Alignment][/color]
'
'[TextSize=15][INDENT=1][b]Balibago Waterworks System, Inc. (BWSI)[/b][/INDENT][Alignment=justify] Is a privately owned company established in May 20, 1958 by the Santos family of Porac, led by [b]Mr. Eladio Santos[/b] Or [b]“Apung Adiong”[/b] To the old-timers of BWSI. Its primary purpose was To acquire, establish, develop, manage And operate an effective waterworks utility system within its franchise area of 900 hectares composed of Barangay Balibago in Angeles City And Barangay Dau in the town of Mabalacat. The corporation started operations in 1958 at its present site in Balibago, Angeles City. On June 22, 1963, the Congress of the Philippines granted BWSI a [b]Congressional Franchise For 50 years[/b] As embodied in [b]Republic Act. No. 3647[/b] To operate exclusively within designated areas a waterworks system. It was also granted a [b]Certificate of Public Convenience (CPC)[/b] in the same year.
'[/Alignment][/TextSize]
'[Alignment=center][img dir="${File.DirAssets}" FileName="1.jpg" width=220 height=125/][/Alignment]
'
'[color=#1E4369][Alignment=Left][TextSize=24][b]TURN OF EVENTS[/b][/TextSize][/Alignment][/color]
'
'[TextSize=15][INDENT=1]For 40 years, the Santos family managed [/INDENT][Alignment=justify]and operated BWSI serving the residents And business establishments of [b]Barangays Balibago, Santol, Amsic, Malabanas, Pulung Maragul, Pampang, Diamond Subdivision And, Pulong Bato[/b] in Angeles City And part of [b]Barangay Dau[/b] in Mabalacat, Pampanga. In 1998, the Santos family sold their shareholdings in BWSI To a new group of investors led by [b]Michael L. Escaler And Cristino L. Panlilio.[/b] Under the new management, BWSI continued To expand its pipe-network coverage And improve its service To its customers. Today, BWSI Main Branch serves more than 15,000 households in its franchise area within Angeles City And Mabalacat. When the investment group of Messrs. Escaler And Panlilio took over BWSI from the Santos family, they saw a wealth of opportunity And possibility that lay before the company. Under their guidance, BWSI expanded in the last 14 years To serve other areas in different forms.
'[/Alignment][/TextSize]
'[Alignment=center][img dir="${File.DirAssets}" FileName="2.jpg" width=200 height=125/][/Alignment]
'
'[color=#1E4369][Alignment=Left][TextSize=24][b]FURTHER GROWTH[/b][/TextSize][/Alignment][/color]
'
'[TextSize=15][INDENT=1]Aside from serving its franchise area, BWSI [/INDENT][Alignment=justify]was awarded exclusive rights And franchises To serve the [b]Dapdap Resettlement Site[/b] together with the [b]Municipalities of Bamban And Capas[/b], all in Tarlac. BWSI was also approached To run And operate the water system in [b]Essel Park; an exclusive subdivision in San Fernando, Pampanga.[/b] It also maintains a bulk water operation in [b]Meycauayan, Bulacan.[/b] Furthermore, BWSI has been granted franchises To operate And manage waterworks systems in the [b]Municipalities of Guiguinto, Balagtas, Panginay And Malis[/b] in Bulacan; [b]Sto. Tomas, Magalang, Minalin, Porac, San Simon, Arayat, Sta. Rita, Apalit, Sta. Ana And San Luis[/b] in Pampanga; [b]Victoria And Sta. Rosa (Garden Villas Subdivision)[/b] in Laguna; [b]Sto. Domingo, Llanera And Zaragoza[/b] in Nueva Ecija; [b]Sta. Barbara, Laoac And San Jacinto[/b] in Pangasinan; [b]Aritao, Alfonso Castaneda, Bagabag And Bayombong[/b] in Nueva Vizcaya; [b]Maria Aurora[/b] in Aurora Province; [b]Laurel And Talisay[/b] in Batangas; And, [b]Passi City And Bingawan[/b] in Iloilo. BWSI Is also currently expanding its operations in [b]Tuba, Benguet.[/b] This brings To 38 the number of water utilities under the umbrella of the company.
'[/Alignment][/TextSize]
'[Alignment=center][img dir="${File.DirAssets}" FileName="3.jpg" width=200 height=140/][/Alignment]
'
'[color=#1E4369][Alignment=Left][TextSize=24][b]TODAY[/b][/TextSize][/Alignment][/color]
'
'[TextSize=15][INDENT=1]Today, BWSI provides running water To more [/INDENT][Alignment=justify]than [b]200,000 households[/b] throughout its franchise areas. BWSI works closely with the [b]National Water Resources Board (NWRB)[/b] in the pursuit of improving potable water supply in the countryside which Is likewise one of the priority goals of the national government. After 60 years in Public service, the [b]National Water Resources Board (NWRB) considers BWSI the largest And most efficiently operated provincial privately owned waterworks system in the country.[/b] The awarding And granting of franchises were made possible by BWSI’s outstanding reputation of being able To deliver the best water service possible.
'[/Alignment][/TextSize]
'[Alignment=center][img dir="${File.DirAssets}" FileName="4.jpg" width=220 height=125/][/Alignment]
'"$
End Sub