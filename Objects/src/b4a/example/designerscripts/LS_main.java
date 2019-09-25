package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Main/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="LabelStart.HorizontalCenter=50%x"[Main/General script]
views.get("labelstart").vw.setLeft((int)((50d / 100 * width) - (views.get("labelstart").vw.getWidth() / 2)));
//BA.debugLineNum = 4;BA.debugLine="LabelStart.VerticalCenter=50%y"[Main/General script]
views.get("labelstart").vw.setTop((int)((50d / 100 * height) - (views.get("labelstart").vw.getHeight() / 2)));

}
}